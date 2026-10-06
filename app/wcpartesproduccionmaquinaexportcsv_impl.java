package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcpartesproduccionmaquinaexportcsv_impl extends GXWebProcedure
{
   public wcpartesproduccionmaquinaexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCPartesProduccionMaquinaExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCPartesProduccionMaquinaColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCPartesProduccionMaquinaColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mm", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "HhMm", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV81Wcpartesproduccionmaquinads_1_emprcod = AV68Emprcod ;
      AV82Wcpartesproduccionmaquinads_2_maqcod = AV66MaqCod ;
      AV83Wcpartesproduccionmaquinads_3_maqdsc = AV67MaqDsc ;
      AV84Wcpartesproduccionmaquinads_4_filterfulltext = AV77FilterFullText ;
      AV85Wcpartesproduccionmaquinads_5_hisprofec = AV69HisProFec ;
      AV86Wcpartesproduccionmaquinads_6_hisprofec_to = AV70HisProFec_To ;
      AV87Wcpartesproduccionmaquinads_7_tfhisprofec = AV36TFHisProFec ;
      AV88Wcpartesproduccionmaquinads_8_tfgruopecod = AV38TFGruOpeCod ;
      AV89Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV90Wcpartesproduccionmaquinads_10_tfbarnhdr = AV75TFBarNHdr ;
      AV91Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV76TFBarNHdr_Sel ;
      AV92Wcpartesproduccionmaquinads_12_tfclicod = AV42TFCliCod ;
      AV93Wcpartesproduccionmaquinads_13_tfclicod_to = AV43TFCliCod_To ;
      AV94Wcpartesproduccionmaquinads_14_tfclinom = AV44TFCliNom ;
      AV95Wcpartesproduccionmaquinads_15_tfclinom_sel = AV45TFCliNom_Sel ;
      AV96Wcpartesproduccionmaquinads_16_tfbarser = AV46TFBarSer ;
      AV97Wcpartesproduccionmaquinads_17_tfbarser_sel = AV47TFBarSer_Sel ;
      AV98Wcpartesproduccionmaquinads_18_tfbarserdsc = AV48TFBarSerDsc ;
      AV99Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV49TFBarSerDsc_Sel ;
      AV100Wcpartesproduccionmaquinads_20_tfbarcolnom = AV50TFBarColNom ;
      AV101Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV51TFBarColNom_Sel ;
      AV102Wcpartesproduccionmaquinads_22_tffase = AV52TFFase ;
      AV103Wcpartesproduccionmaquinads_23_tffase_sel = AV53TFFase_Sel ;
      AV104Wcpartesproduccionmaquinads_24_tffasedsc = AV54TFFaseDsc ;
      AV105Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV55TFFaseDsc_Sel ;
      AV106Wcpartesproduccionmaquinads_26_tfhisprokgr = AV56TFHisProKgr ;
      AV107Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV57TFHisProKgr_To ;
      AV108Wcpartesproduccionmaquinads_28_tfhispromtr = AV58TFHisProMtr ;
      AV109Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV59TFHisProMtr_To ;
      AV110Wcpartesproduccionmaquinads_30_tfhisprotur = AV60TFHisProTur ;
      AV111Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV61TFHisProTur_To ;
      AV112Wcpartesproduccionmaquinads_32_tfhisprodti = AV62TFHisProDTI ;
      AV113Wcpartesproduccionmaquinads_33_tfhisprodtf = AV64TFHisProDTF ;
      AV114Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV72TFHisProTr2 ;
      AV115Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV73TFHisProTr2_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV85Wcpartesproduccionmaquinads_5_hisprofec ,
                                           AV86Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                           AV87Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                           Integer.valueOf(AV88Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                           Integer.valueOf(AV89Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                           AV91Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                           AV90Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                           Integer.valueOf(AV92Wcpartesproduccionmaquinads_12_tfclicod) ,
                                           Integer.valueOf(AV93Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                           AV95Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                           AV94Wcpartesproduccionmaquinads_14_tfclinom ,
                                           AV97Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                           AV96Wcpartesproduccionmaquinads_16_tfbarser ,
                                           AV99Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                           AV98Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                           AV101Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                           AV100Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                           AV103Wcpartesproduccionmaquinads_23_tffase_sel ,
                                           AV102Wcpartesproduccionmaquinads_22_tffase ,
                                           AV106Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                           AV107Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                           AV108Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                           AV109Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                           Byte.valueOf(AV110Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                           Byte.valueOf(AV111Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                           AV112Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                           AV113Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                           Short.valueOf(AV114Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                           Short.valueOf(AV115Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                           A558HisProFec ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A461Fase ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV84Wcpartesproduccionmaquinads_4_filterfulltext ,
                                           A13696BarNHdr ,
                                           A7258FaseDsc ,
                                           Short.valueOf(A5605HisProTr2) ,
                                           AV105Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                           AV104Wcpartesproduccionmaquinads_24_tffasedsc ,
                                           A606MaqDsc ,
                                           AV83Wcpartesproduccionmaquinads_3_maqdsc ,
                                           AV81Wcpartesproduccionmaquinads_1_emprcod ,
                                           AV82Wcpartesproduccionmaquinads_2_maqcod ,
                                           A396EmprCod ,
                                           A602MaqCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV104Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV104Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
      /* Using cursor P08DI2 */
      pr_default.execute(0, new Object[] {AV81Wcpartesproduccionmaquinads_1_emprcod, AV82Wcpartesproduccionmaquinads_2_maqcod, AV84Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV84Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV84Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV84Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV84Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV84Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV84Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV84Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV84Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV84Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV84Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV84Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV84Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV84Wcpartesproduccionmaquinads_4_filterfulltext, AV105Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV104Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV104Wcpartesproduccionmaquinads_24_tffasedsc, AV105Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV105Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV83Wcpartesproduccionmaquinads_3_maqdsc, AV85Wcpartesproduccionmaquinads_5_hisprofec, AV86Wcpartesproduccionmaquinads_6_hisprofec_to, AV87Wcpartesproduccionmaquinads_7_tfhisprofec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A558HisProFec = P08DI2_A558HisProFec[0] ;
         A606MaqDsc = P08DI2_A606MaqDsc[0] ;
         n606MaqDsc = P08DI2_n606MaqDsc[0] ;
         A602MaqCod = P08DI2_A602MaqCod[0] ;
         A396EmprCod = P08DI2_A396EmprCod[0] ;
         A606MaqDsc = P08DI2_A606MaqDsc[0] ;
         n606MaqDsc = P08DI2_n606MaqDsc[0] ;
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
            AV14TextFileLine += localUtil.dtoc( A558HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A503GruOpeCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV30OpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char3) ;
            wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV30OpeNom = GXt_char2 ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30OpeNom, ";", ","), GXv_char3) ;
            wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
            wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
            wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char3) ;
            wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A461Fase, ";", ","), GXv_char3) ;
            wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A7258FaseDsc, ";", ","), GXv_char3) ;
            wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1525HisProKgr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1526HisProMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A566HisProTur, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4440HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4441HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5605HisProTr2, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV116Hhmm = (short)(A5605HisProTr2/ (double) (60)) ;
            AV117Horrea = (short)(A5605HisProTr2/ (double) (60)) ;
            AV118Horreaint = DecimalUtil.doubleToDec(GXutil.Int( AV117Horrea)) ;
            AV119Minrea = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A5605HisProTr2).subtract((AV118Horreaint.multiply(DecimalUtil.doubleToDec(60)))))) ;
            AV120Minrea2 = (short)(AV119Minrea/ (double) (100)) ;
            AV74Hm = GXutil.padl( GXutil.trim( GXutil.str( AV118Horreaint, 10, 2)), (short)(2), "0") + ":" + GXutil.padl( GXutil.trim( GXutil.str( AV119Minrea, 4, 0)), (short)(2), "0") ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV74Hm, ";", ","), GXv_char3) ;
            wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCPartesProduccionMaquinaExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GruOpeCod", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&OpeNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNHdr", "", "Hdr", true, "") ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarColNom", "", "Nombre Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Fase", "", "Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FaseDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProKgr", "", "Kgs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProMtr", "", "Mts", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProTur", "", "T", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTI", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTF", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProTr2", "", "Mm", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Hm", "", "HhMm", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCPartesProduccionMaquinaColumnsSelector", GXv_char3) ;
      wcpartesproduccionmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCPartesProduccionMaquinaGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCPartesProduccionMaquinaGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("WCPartesProduccionMaquinaGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV121GXV1 = 1 ;
      while ( AV121GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV121GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV77FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "HISPROFEC") == 0 )
         {
            AV69HisProFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV70HisProFec_To = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV36TFHisProFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV38TFGruOpeCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFGruOpeCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV75TFBarNHdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV76TFBarNHdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV42TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV44TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV45TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV46TFBarSer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV47TFBarSer_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV48TFBarSerDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV49TFBarSerDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV50TFBarColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV51TFBarColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV52TFFase = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV53TFFase_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV54TFFaseDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV55TFFaseDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV56TFHisProKgr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFHisProKgr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV58TFHisProMtr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFHisProMtr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV60TFHisProTur = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFHisProTur_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV62TFHisProDTI = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV64TFHisProDTF = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTR2") == 0 )
         {
            AV72TFHisProTr2 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFHisProTr2_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV68Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV66MaqCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQDSC") == 0 )
         {
            AV67MaqDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV121GXV1 = (int)(AV121GXV1+1) ;
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
      A558HisProFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A461Fase = "" ;
      A7258FaseDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV81Wcpartesproduccionmaquinads_1_emprcod = "" ;
      AV68Emprcod = "" ;
      AV82Wcpartesproduccionmaquinads_2_maqcod = "" ;
      AV66MaqCod = "" ;
      AV83Wcpartesproduccionmaquinads_3_maqdsc = "" ;
      AV67MaqDsc = "" ;
      AV84Wcpartesproduccionmaquinads_4_filterfulltext = "" ;
      AV77FilterFullText = "" ;
      AV85Wcpartesproduccionmaquinads_5_hisprofec = GXutil.nullDate() ;
      AV69HisProFec = GXutil.nullDate() ;
      AV86Wcpartesproduccionmaquinads_6_hisprofec_to = GXutil.nullDate() ;
      AV70HisProFec_To = GXutil.nullDate() ;
      AV87Wcpartesproduccionmaquinads_7_tfhisprofec = GXutil.nullDate() ;
      AV36TFHisProFec = GXutil.nullDate() ;
      AV90Wcpartesproduccionmaquinads_10_tfbarnhdr = "" ;
      AV75TFBarNHdr = "" ;
      AV91Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = "" ;
      AV76TFBarNHdr_Sel = "" ;
      AV94Wcpartesproduccionmaquinads_14_tfclinom = "" ;
      AV44TFCliNom = "" ;
      AV95Wcpartesproduccionmaquinads_15_tfclinom_sel = "" ;
      AV45TFCliNom_Sel = "" ;
      AV96Wcpartesproduccionmaquinads_16_tfbarser = "" ;
      AV46TFBarSer = "" ;
      AV97Wcpartesproduccionmaquinads_17_tfbarser_sel = "" ;
      AV47TFBarSer_Sel = "" ;
      AV98Wcpartesproduccionmaquinads_18_tfbarserdsc = "" ;
      AV48TFBarSerDsc = "" ;
      AV99Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = "" ;
      AV49TFBarSerDsc_Sel = "" ;
      AV100Wcpartesproduccionmaquinads_20_tfbarcolnom = "" ;
      AV50TFBarColNom = "" ;
      AV101Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = "" ;
      AV51TFBarColNom_Sel = "" ;
      AV102Wcpartesproduccionmaquinads_22_tffase = "" ;
      AV52TFFase = "" ;
      AV103Wcpartesproduccionmaquinads_23_tffase_sel = "" ;
      AV53TFFase_Sel = "" ;
      AV104Wcpartesproduccionmaquinads_24_tffasedsc = "" ;
      AV54TFFaseDsc = "" ;
      AV105Wcpartesproduccionmaquinads_25_tffasedsc_sel = "" ;
      AV55TFFaseDsc_Sel = "" ;
      AV106Wcpartesproduccionmaquinads_26_tfhisprokgr = DecimalUtil.ZERO ;
      AV56TFHisProKgr = DecimalUtil.ZERO ;
      AV107Wcpartesproduccionmaquinads_27_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV57TFHisProKgr_To = DecimalUtil.ZERO ;
      AV108Wcpartesproduccionmaquinads_28_tfhispromtr = DecimalUtil.ZERO ;
      AV58TFHisProMtr = DecimalUtil.ZERO ;
      AV109Wcpartesproduccionmaquinads_29_tfhispromtr_to = DecimalUtil.ZERO ;
      AV59TFHisProMtr_To = DecimalUtil.ZERO ;
      AV112Wcpartesproduccionmaquinads_32_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV62TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV113Wcpartesproduccionmaquinads_33_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV64TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      lV84Wcpartesproduccionmaquinads_4_filterfulltext = "" ;
      lV104Wcpartesproduccionmaquinads_24_tffasedsc = "" ;
      scmdbuf = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      P08DI2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DI2_A606MaqDsc = new String[] {""} ;
      P08DI2_n606MaqDsc = new boolean[] {false} ;
      P08DI2_A602MaqCod = new String[] {""} ;
      P08DI2_A396EmprCod = new String[] {""} ;
      AV30OpeNom = "" ;
      AV118Horreaint = DecimalUtil.ZERO ;
      AV74Hm = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcpartesproduccionmaquinaexportcsv__default(),
         new Object[] {
             new Object[] {
            P08DI2_A558HisProFec, P08DI2_A606MaqDsc, P08DI2_n606MaqDsc, P08DI2_A602MaqCod, P08DI2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A566HisProTur ;
   private byte AV110Wcpartesproduccionmaquinads_30_tfhisprotur ;
   private byte AV60TFHisProTur ;
   private byte AV111Wcpartesproduccionmaquinads_31_tfhisprotur_to ;
   private byte AV61TFHisProTur_To ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A5605HisProTr2 ;
   private short AV114Wcpartesproduccionmaquinads_34_tfhisprotr2 ;
   private short AV72TFHisProTr2 ;
   private short AV115Wcpartesproduccionmaquinads_35_tfhisprotr2_to ;
   private short AV73TFHisProTr2_To ;
   private short AV28OrderedBy ;
   private short AV116Hhmm ;
   private short AV117Horrea ;
   private short AV119Minrea ;
   private short AV120Minrea2 ;
   private short Gx_err ;
   private int AV13Random ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int AV88Wcpartesproduccionmaquinads_8_tfgruopecod ;
   private int AV38TFGruOpeCod ;
   private int AV89Wcpartesproduccionmaquinads_9_tfgruopecod_to ;
   private int AV39TFGruOpeCod_To ;
   private int AV92Wcpartesproduccionmaquinads_12_tfclicod ;
   private int AV42TFCliCod ;
   private int AV93Wcpartesproduccionmaquinads_13_tfclicod_to ;
   private int AV43TFCliCod_To ;
   private int A129BarCod ;
   private int AV121GXV1 ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV106Wcpartesproduccionmaquinads_26_tfhisprokgr ;
   private java.math.BigDecimal AV56TFHisProKgr ;
   private java.math.BigDecimal AV107Wcpartesproduccionmaquinads_27_tfhisprokgr_to ;
   private java.math.BigDecimal AV57TFHisProKgr_To ;
   private java.math.BigDecimal AV108Wcpartesproduccionmaquinads_28_tfhispromtr ;
   private java.math.BigDecimal AV58TFHisProMtr ;
   private java.math.BigDecimal AV109Wcpartesproduccionmaquinads_29_tfhispromtr_to ;
   private java.math.BigDecimal AV59TFHisProMtr_To ;
   private java.math.BigDecimal AV118Horreaint ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A461Fase ;
   private String A7258FaseDsc ;
   private String AV81Wcpartesproduccionmaquinads_1_emprcod ;
   private String AV68Emprcod ;
   private String AV82Wcpartesproduccionmaquinads_2_maqcod ;
   private String AV66MaqCod ;
   private String AV83Wcpartesproduccionmaquinads_3_maqdsc ;
   private String AV67MaqDsc ;
   private String AV90Wcpartesproduccionmaquinads_10_tfbarnhdr ;
   private String AV75TFBarNHdr ;
   private String AV91Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ;
   private String AV76TFBarNHdr_Sel ;
   private String AV94Wcpartesproduccionmaquinads_14_tfclinom ;
   private String AV44TFCliNom ;
   private String AV95Wcpartesproduccionmaquinads_15_tfclinom_sel ;
   private String AV45TFCliNom_Sel ;
   private String AV96Wcpartesproduccionmaquinads_16_tfbarser ;
   private String AV46TFBarSer ;
   private String AV97Wcpartesproduccionmaquinads_17_tfbarser_sel ;
   private String AV47TFBarSer_Sel ;
   private String AV98Wcpartesproduccionmaquinads_18_tfbarserdsc ;
   private String AV48TFBarSerDsc ;
   private String AV99Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ;
   private String AV49TFBarSerDsc_Sel ;
   private String AV100Wcpartesproduccionmaquinads_20_tfbarcolnom ;
   private String AV50TFBarColNom ;
   private String AV101Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ;
   private String AV51TFBarColNom_Sel ;
   private String AV102Wcpartesproduccionmaquinads_22_tffase ;
   private String AV52TFFase ;
   private String AV103Wcpartesproduccionmaquinads_23_tffase_sel ;
   private String AV53TFFase_Sel ;
   private String AV104Wcpartesproduccionmaquinads_24_tffasedsc ;
   private String AV54TFFaseDsc ;
   private String AV105Wcpartesproduccionmaquinads_25_tffasedsc_sel ;
   private String AV55TFFaseDsc_Sel ;
   private String lV104Wcpartesproduccionmaquinads_24_tffasedsc ;
   private String scmdbuf ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String AV30OpeNom ;
   private String AV74Hm ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV112Wcpartesproduccionmaquinads_32_tfhisprodti ;
   private java.util.Date AV62TFHisProDTI ;
   private java.util.Date AV113Wcpartesproduccionmaquinads_33_tfhisprodtf ;
   private java.util.Date AV64TFHisProDTF ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV85Wcpartesproduccionmaquinads_5_hisprofec ;
   private java.util.Date AV69HisProFec ;
   private java.util.Date AV86Wcpartesproduccionmaquinads_6_hisprofec_to ;
   private java.util.Date AV70HisProFec_To ;
   private java.util.Date AV87Wcpartesproduccionmaquinads_7_tfhisprofec ;
   private java.util.Date AV36TFHisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n606MaqDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV84Wcpartesproduccionmaquinads_4_filterfulltext ;
   private String AV77FilterFullText ;
   private String lV84Wcpartesproduccionmaquinads_4_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08DI2_A558HisProFec ;
   private String[] P08DI2_A606MaqDsc ;
   private boolean[] P08DI2_n606MaqDsc ;
   private String[] P08DI2_A602MaqCod ;
   private String[] P08DI2_A396EmprCod ;
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

final  class wcpartesproduccionmaquinaexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV85Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV86Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV87Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV88Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV89Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV91Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV90Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV92Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV93Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV95Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV94Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV97Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV96Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV99Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV98Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV101Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV100Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV103Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV102Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV106Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV107Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV108Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV109Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV110Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV111Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV112Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV113Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV114Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV115Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV84Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV105Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV104Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String A606MaqDsc ,
                                          String AV83Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String AV81Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV82Wcpartesproduccionmaquinads_2_maqcod ,
                                          String A396EmprCod ,
                                          String A602MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[40];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.HisProFec, T2.MaqDsc, T1.MaqCod, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(T2.MaqDsc = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
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
                  return conditional_P08DI2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
      }
   }

}

