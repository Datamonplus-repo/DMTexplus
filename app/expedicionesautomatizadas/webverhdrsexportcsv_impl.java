package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webverhdrsexportcsv_impl extends GXWebProcedure
{
   public webverhdrsexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebVerhdrsExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Barcada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Reoperado Barcada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Particion Barcada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "HisProKgr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "HisProMtr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Turno", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo+Descripcion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV33FilterFullText ;
      AV75Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV34HisProDTF ;
      AV76Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV35HisProDTF_To ;
      AV77Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV36MaqCod ;
      AV78Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV43TFBarCod ;
      AV79Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV44TFBarCod_To ;
      AV80Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV45TFBarCodReo ;
      AV81Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV46TFBarCodReo_To ;
      AV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV47TFBarCodPar ;
      AV83Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV48TFBarCodPar_Sel ;
      AV84Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV49TFCliCod ;
      AV85Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV50TFCliCod_To ;
      AV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV51TFCliNom ;
      AV87Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV52TFCliNom_Sel ;
      AV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV53TFBarSer ;
      AV89Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV54TFBarSer_Sel ;
      AV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV55TFBarSerDsc ;
      AV91Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV56TFBarSerDsc_Sel ;
      AV92Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV57TFHisProKgr ;
      AV93Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV58TFHisProKgr_To ;
      AV94Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV59TFHisProMtr ;
      AV95Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV60TFHisProMtr_To ;
      AV96Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV61TFHisProDTF ;
      AV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV63TFBarColNom ;
      AV98Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV64TFBarColNom_Sel ;
      AV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV65TFHisProCod ;
      AV100Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV66TFHisProCod_Sel ;
      AV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV67TFMaqCod ;
      AV102Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV68TFMaqCod_Sel ;
      AV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV69TFMaqCDsc ;
      AV104Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV70TFMaqCDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV75Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV76Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV77Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV79Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV80Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV81Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV83Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV84Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV85Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV87Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV98Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV100Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV102Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV104Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV32OrderedDsc) ,
                                           AV28EmprCod ,
                                           AV29Maqcod1 ,
                                           A396EmprCod ,
                                           AV30Maqcod2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV77Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV77Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P097A2 */
      pr_default.execute(0, new Object[] {AV28EmprCod, AV29Maqcod1, AV30Maqcod2, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV75Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV76Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV77Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV78Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV79Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV80Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV81Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV83Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV84Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV85Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV87Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV89Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV91Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV92Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV93Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV94Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV95Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV96Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV98Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV100Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV102Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV104Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P097A2_A396EmprCod[0] ;
         A2504HisProCod = P097A2_A2504HisProCod[0] ;
         A135BarColNom = P097A2_A135BarColNom[0] ;
         A1526HisProMtr = P097A2_A1526HisProMtr[0] ;
         A1525HisProKgr = P097A2_A1525HisProKgr[0] ;
         A1652BarSerDsc = P097A2_A1652BarSerDsc[0] ;
         A212BarSer = P097A2_A212BarSer[0] ;
         A279CliNom = P097A2_A279CliNom[0] ;
         A252CliCod = P097A2_A252CliCod[0] ;
         n252CliCod = P097A2_n252CliCod[0] ;
         A130BarCodPar = P097A2_A130BarCodPar[0] ;
         A132BarCodReo = P097A2_A132BarCodReo[0] ;
         A129BarCod = P097A2_A129BarCod[0] ;
         A4441HisProDTF = P097A2_A4441HisProDTF[0] ;
         n4441HisProDTF = P097A2_n4441HisProDTF[0] ;
         A606MaqDsc = P097A2_A606MaqDsc[0] ;
         n606MaqDsc = P097A2_n606MaqDsc[0] ;
         A602MaqCod = P097A2_A602MaqCod[0] ;
         A558HisProFec = P097A2_A558HisProFec[0] ;
         A561HisProLin = P097A2_A561HisProLin[0] ;
         A135BarColNom = P097A2_A135BarColNom[0] ;
         A1652BarSerDsc = P097A2_A1652BarSerDsc[0] ;
         A212BarSer = P097A2_A212BarSer[0] ;
         A252CliCod = P097A2_A252CliCod[0] ;
         n252CliCod = P097A2_n252CliCod[0] ;
         A279CliNom = P097A2_A279CliNom[0] ;
         A606MaqDsc = P097A2_A606MaqDsc[0] ;
         n606MaqDsc = P097A2_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
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
            AV14TextFileLine += GXutil.str( A129BarCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A132BarCodReo, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A130BarCodPar, ";", ","), GXv_char3) ;
            webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
            webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
            webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV37TipArtDsc, ";", ","), GXv_char3) ;
            webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV38FasDsc, ";", ","), GXv_char3) ;
            webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1525HisProKgr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1526HisProMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4441HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char3) ;
            webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV39Turno, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2504HisProCod, ";", ","), GXv_char3) ;
            webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char3) ;
            webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13734MaqCDsc, ";", ","), GXv_char3) ;
            webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebVerhdrsExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarCod", "", "Codigo Barcada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarCodReo", "", "Codigo Reoperado Barcada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarCodPar", "", "Codigo Particion Barcada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSer", "", "Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&TipArtDsc", "", "Tipo Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&FasDsc", "", "Descripcion ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProKgr", "", "HisProKgr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProMtr", "", "HisProMtr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTF", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarColNom", "", "Nombre Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Turno", "", "Turno", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProCod", "", "Codigo Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCod", "", "Código Máquina", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCDsc", "", "Codigo+Descripcion", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebVerhdrsColumnsSelector", GXv_char3) ;
      webverhdrsexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebVerhdrsGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV19Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsGridState"), null, null);
      }
      AV31OrderedBy = AV41GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV32OrderedDsc = AV41GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV105GXV1 = 1 ;
      while ( AV105GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV33FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "HISPRODTF") == 0 )
         {
            AV34HisProDTF = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV35HisProDTF_To = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "MAQCOD") == 0 )
         {
            AV36MaqCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV43TFBarCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFBarCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV45TFBarCodReo = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFBarCodReo_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV47TFBarCodPar = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV48TFBarCodPar_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV49TFCliCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFCliCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV51TFCliNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV52TFCliNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV53TFBarSer = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV54TFBarSer_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV55TFBarSerDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV56TFBarSerDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV57TFHisProKgr = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFHisProKgr_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV59TFHisProMtr = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFHisProMtr_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV61TFHisProDTF = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV63TFBarColNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV64TFBarColNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROCOD") == 0 )
         {
            AV65TFHisProCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROCOD_SEL") == 0 )
         {
            AV66TFHisProCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV67TFMaqCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV68TFMaqCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCDSC") == 0 )
         {
            AV69TFMaqCDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCDSC_SEL") == 0 )
         {
            AV70TFMaqCDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28EmprCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD1") == 0 )
         {
            AV29Maqcod1 = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD2") == 0 )
         {
            AV30Maqcod2 = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV105GXV1 = (int)(AV105GXV1+1) ;
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
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A135BarColNom = "" ;
      A2504HisProCod = "" ;
      A602MaqCod = "" ;
      A13734MaqCDsc = "" ;
      AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = "" ;
      AV33FilterFullText = "" ;
      AV75Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV34HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV76Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = GXutil.resetTime( GXutil.nullDate() );
      AV35HisProDTF_To = GXutil.resetTime( GXutil.nullDate() );
      AV77Expedicionesautomatizadas_webverhdrsds_4_maqcod = "" ;
      AV36MaqCod = "" ;
      AV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = "" ;
      AV47TFBarCodPar = "" ;
      AV83Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = "" ;
      AV48TFBarCodPar_Sel = "" ;
      AV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom = "" ;
      AV51TFCliNom = "" ;
      AV87Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = "" ;
      AV52TFCliNom_Sel = "" ;
      AV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser = "" ;
      AV53TFBarSer = "" ;
      AV89Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = "" ;
      AV54TFBarSer_Sel = "" ;
      AV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = "" ;
      AV55TFBarSerDsc = "" ;
      AV91Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = "" ;
      AV56TFBarSerDsc_Sel = "" ;
      AV92Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV57TFHisProKgr = DecimalUtil.ZERO ;
      AV93Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV58TFHisProKgr_To = DecimalUtil.ZERO ;
      AV94Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV59TFHisProMtr = DecimalUtil.ZERO ;
      AV95Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV60TFHisProMtr_To = DecimalUtil.ZERO ;
      AV96Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV61TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = "" ;
      AV63TFBarColNom = "" ;
      AV98Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = "" ;
      AV64TFBarColNom_Sel = "" ;
      AV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = "" ;
      AV65TFHisProCod = "" ;
      AV100Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = "" ;
      AV66TFHisProCod_Sel = "" ;
      AV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = "" ;
      AV67TFMaqCod = "" ;
      AV102Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = "" ;
      AV68TFMaqCod_Sel = "" ;
      AV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = "" ;
      AV69TFMaqCDsc = "" ;
      AV104Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = "" ;
      AV70TFMaqCDsc_Sel = "" ;
      scmdbuf = "" ;
      lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = "" ;
      lV77Expedicionesautomatizadas_webverhdrsds_4_maqcod = "" ;
      lV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = "" ;
      lV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom = "" ;
      lV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser = "" ;
      lV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = "" ;
      lV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = "" ;
      lV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = "" ;
      lV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = "" ;
      lV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = "" ;
      A606MaqDsc = "" ;
      AV28EmprCod = "" ;
      AV29Maqcod1 = "" ;
      A396EmprCod = "" ;
      AV30Maqcod2 = "" ;
      P097A2_A396EmprCod = new String[] {""} ;
      P097A2_A2504HisProCod = new String[] {""} ;
      P097A2_A135BarColNom = new String[] {""} ;
      P097A2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097A2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097A2_A1652BarSerDsc = new String[] {""} ;
      P097A2_A212BarSer = new String[] {""} ;
      P097A2_A279CliNom = new String[] {""} ;
      P097A2_A252CliCod = new int[1] ;
      P097A2_n252CliCod = new boolean[] {false} ;
      P097A2_A130BarCodPar = new String[] {""} ;
      P097A2_A132BarCodReo = new byte[1] ;
      P097A2_A129BarCod = new int[1] ;
      P097A2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P097A2_n4441HisProDTF = new boolean[] {false} ;
      P097A2_A606MaqDsc = new String[] {""} ;
      P097A2_n606MaqDsc = new boolean[] {false} ;
      P097A2_A602MaqCod = new String[] {""} ;
      P097A2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P097A2_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      AV37TipArtDsc = "" ;
      AV38FasDsc = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webverhdrsexportcsv__default(),
         new Object[] {
             new Object[] {
            P097A2_A396EmprCod, P097A2_A2504HisProCod, P097A2_A135BarColNom, P097A2_A1526HisProMtr, P097A2_A1525HisProKgr, P097A2_A1652BarSerDsc, P097A2_A212BarSer, P097A2_A279CliNom, P097A2_A252CliCod, P097A2_n252CliCod,
            P097A2_A130BarCodPar, P097A2_A132BarCodReo, P097A2_A129BarCod, P097A2_A4441HisProDTF, P097A2_n4441HisProDTF, P097A2_A606MaqDsc, P097A2_n606MaqDsc, P097A2_A602MaqCod, P097A2_A558HisProFec, P097A2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV80Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ;
   private byte AV45TFBarCodReo ;
   private byte AV81Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ;
   private byte AV46TFBarCodReo_To ;
   private byte AV39Turno ;
   private short gxcookieaux ;
   private short AV31OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV78Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ;
   private int AV43TFBarCod ;
   private int AV79Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ;
   private int AV44TFBarCod_To ;
   private int AV84Expedicionesautomatizadas_webverhdrsds_11_tfclicod ;
   private int AV49TFCliCod ;
   private int AV85Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ;
   private int AV50TFCliCod_To ;
   private int A561HisProLin ;
   private int AV105GXV1 ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV92Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ;
   private java.math.BigDecimal AV57TFHisProKgr ;
   private java.math.BigDecimal AV93Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV58TFHisProKgr_To ;
   private java.math.BigDecimal AV94Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ;
   private java.math.BigDecimal AV59TFHisProMtr ;
   private java.math.BigDecimal AV95Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ;
   private java.math.BigDecimal AV60TFHisProMtr_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A2504HisProCod ;
   private String A602MaqCod ;
   private String AV77Expedicionesautomatizadas_webverhdrsds_4_maqcod ;
   private String AV36MaqCod ;
   private String AV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ;
   private String AV47TFBarCodPar ;
   private String AV83Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ;
   private String AV48TFBarCodPar_Sel ;
   private String AV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom ;
   private String AV51TFCliNom ;
   private String AV87Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ;
   private String AV52TFCliNom_Sel ;
   private String AV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser ;
   private String AV53TFBarSer ;
   private String AV89Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ;
   private String AV54TFBarSer_Sel ;
   private String AV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ;
   private String AV55TFBarSerDsc ;
   private String AV91Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ;
   private String AV56TFBarSerDsc_Sel ;
   private String AV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ;
   private String AV63TFBarColNom ;
   private String AV98Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ;
   private String AV64TFBarColNom_Sel ;
   private String AV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ;
   private String AV65TFHisProCod ;
   private String AV100Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ;
   private String AV66TFHisProCod_Sel ;
   private String AV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ;
   private String AV67TFMaqCod ;
   private String AV102Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ;
   private String AV68TFMaqCod_Sel ;
   private String scmdbuf ;
   private String lV77Expedicionesautomatizadas_webverhdrsds_4_maqcod ;
   private String lV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ;
   private String lV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom ;
   private String lV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser ;
   private String lV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ;
   private String lV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ;
   private String lV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ;
   private String lV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ;
   private String A606MaqDsc ;
   private String AV28EmprCod ;
   private String AV29Maqcod1 ;
   private String A396EmprCod ;
   private String AV30Maqcod2 ;
   private String AV37TipArtDsc ;
   private String AV38FasDsc ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV75Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ;
   private java.util.Date AV34HisProDTF ;
   private java.util.Date AV76Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ;
   private java.util.Date AV35HisProDTF_To ;
   private java.util.Date AV96Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ;
   private java.util.Date AV61TFHisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV32OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n4441HisProDTF ;
   private boolean n606MaqDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String A13734MaqCDsc ;
   private String AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ;
   private String AV33FilterFullText ;
   private String AV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ;
   private String AV69TFMaqCDsc ;
   private String AV104Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ;
   private String AV70TFMaqCDsc_Sel ;
   private String lV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ;
   private String lV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P097A2_A396EmprCod ;
   private String[] P097A2_A2504HisProCod ;
   private String[] P097A2_A135BarColNom ;
   private java.math.BigDecimal[] P097A2_A1526HisProMtr ;
   private java.math.BigDecimal[] P097A2_A1525HisProKgr ;
   private String[] P097A2_A1652BarSerDsc ;
   private String[] P097A2_A212BarSer ;
   private String[] P097A2_A279CliNom ;
   private int[] P097A2_A252CliCod ;
   private boolean[] P097A2_n252CliCod ;
   private String[] P097A2_A130BarCodPar ;
   private byte[] P097A2_A132BarCodReo ;
   private int[] P097A2_A129BarCod ;
   private java.util.Date[] P097A2_A4441HisProDTF ;
   private boolean[] P097A2_n4441HisProDTF ;
   private String[] P097A2_A606MaqDsc ;
   private boolean[] P097A2_n606MaqDsc ;
   private String[] P097A2_A602MaqCod ;
   private java.util.Date[] P097A2_A558HisProFec ;
   private int[] P097A2_A561HisProLin ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class webverhdrsexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV75Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV76Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV77Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV78Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV79Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV80Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV81Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV83Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV84Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV85Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV87Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV89Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV91Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV92Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV93Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV94Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV95Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV96Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV98Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV100Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV102Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV104Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV31OrderedBy ,
                                          boolean AV32OrderedDsc ,
                                          String AV28EmprCod ,
                                          String AV29Maqcod1 ,
                                          String A396EmprCod ,
                                          String AV30Maqcod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[46];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (GXutil.strcmp("", AV74Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
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
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV76Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV78Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV79Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV80Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV81Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV82Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV84Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV85Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV88Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV97Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV99Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV101Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV31OrderedBy == 1 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV31OrderedBy == 11 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV31OrderedBy == 11 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV31OrderedBy == 12 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProCod" ;
      }
      else if ( ( AV31OrderedBy == 12 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 13 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV31OrderedBy == 13 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
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
                  return conditional_P097A2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
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
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
      }
   }

}

