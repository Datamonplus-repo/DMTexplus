package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwnwdp02exportcsv_impl extends GXWebProcedure
{
   public webwnwdp02exportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebWNwDP02ExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebWNwDP02ColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WebWNwDP02ColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Disposicion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dibujo del Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dibujo Interno", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Máxima Observación", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reclamaciones", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV76Webwnwdp02ds_1_filterfulltext = AV30FilterFullText ;
      AV77Webwnwdp02ds_2_tfdiscod = AV38TFDisCod ;
      AV78Webwnwdp02ds_3_tfdiscod_to = AV39TFDisCod_To ;
      AV79Webwnwdp02ds_4_tfclicod = AV40TFCliCod ;
      AV80Webwnwdp02ds_5_tfclicod_to = AV41TFCliCod_To ;
      AV81Webwnwdp02ds_6_tfdisfec = AV42TFDisFec ;
      AV82Webwnwdp02ds_7_tfdisartcod = AV44TFDisArtCod ;
      AV83Webwnwdp02ds_8_tfdisartcod_sel = AV45TFDisArtCod_Sel ;
      AV84Webwnwdp02ds_9_tfdisartdsc = AV46TFDisArtDsc ;
      AV85Webwnwdp02ds_10_tfdisartdsc_sel = AV47TFDisArtDsc_Sel ;
      AV86Webwnwdp02ds_11_tfdiscolnom = AV48TFDisColNom ;
      AV87Webwnwdp02ds_12_tfdiscolnom_sel = AV49TFDisColNom_Sel ;
      AV88Webwnwdp02ds_13_tfdisnomcli = AV50TFDisNomCli ;
      AV89Webwnwdp02ds_14_tfdisnomcli_sel = AV51TFDisNomCli_Sel ;
      AV90Webwnwdp02ds_15_tfdiscolnum = AV52TFDisColNum ;
      AV91Webwnwdp02ds_16_tfdiscolnum_to = AV53TFDisColNum_To ;
      AV92Webwnwdp02ds_17_tfdibcli = AV54TFDibCli ;
      AV93Webwnwdp02ds_18_tfdibcli_sel = AV55TFDibCli_Sel ;
      AV94Webwnwdp02ds_19_tfdibint = AV56TFDibInt ;
      AV95Webwnwdp02ds_20_tfdibint_to = AV57TFDibInt_To ;
      AV96Webwnwdp02ds_21_tfdismaxobslin = AV69TFDisMaxObsLin ;
      AV97Webwnwdp02ds_22_tfdismaxobslin_to = AV70TFDisMaxObsLin_To ;
      AV98Webwnwdp02ds_23_tfdiscanrec = AV71TFDisCanRec ;
      AV99Webwnwdp02ds_24_tfdiscanrec_to = AV72TFDisCanRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV77Webwnwdp02ds_2_tfdiscod) ,
                                           Integer.valueOf(AV78Webwnwdp02ds_3_tfdiscod_to) ,
                                           Integer.valueOf(AV79Webwnwdp02ds_4_tfclicod) ,
                                           Integer.valueOf(AV80Webwnwdp02ds_5_tfclicod_to) ,
                                           AV81Webwnwdp02ds_6_tfdisfec ,
                                           AV83Webwnwdp02ds_8_tfdisartcod_sel ,
                                           AV82Webwnwdp02ds_7_tfdisartcod ,
                                           AV85Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           AV84Webwnwdp02ds_9_tfdisartdsc ,
                                           AV87Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           AV86Webwnwdp02ds_11_tfdiscolnom ,
                                           AV89Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           AV88Webwnwdp02ds_13_tfdisnomcli ,
                                           Integer.valueOf(AV90Webwnwdp02ds_15_tfdiscolnum) ,
                                           Integer.valueOf(AV91Webwnwdp02ds_16_tfdiscolnum_to) ,
                                           AV93Webwnwdp02ds_18_tfdibcli_sel ,
                                           AV92Webwnwdp02ds_17_tfdibcli ,
                                           Integer.valueOf(AV94Webwnwdp02ds_19_tfdibint) ,
                                           Integer.valueOf(AV95Webwnwdp02ds_20_tfdibint_to) ,
                                           Integer.valueOf(AV68Discodp) ,
                                           Integer.valueOf(AV61CliCod) ,
                                           AV62DisCliNum ,
                                           AV63DisArtCod ,
                                           AV64Disartdsc ,
                                           AV65DisColNom ,
                                           AV66Disnomcli ,
                                           AV67DisUsrcod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A369DisFec ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A363DisColNum) ,
                                           A1013DibCli ,
                                           Integer.valueOf(A1014DibInt) ,
                                           A360DisCliNum ,
                                           A4348DisUsrCod ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV76Webwnwdp02ds_1_filterfulltext ,
                                           Short.valueOf(A13737DisMaxObsL) ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV96Webwnwdp02ds_21_tfdismaxobslin) ,
                                           Short.valueOf(AV97Webwnwdp02ds_22_tfdismaxobslin_to) ,
                                           Short.valueOf(AV98Webwnwdp02ds_23_tfdiscanrec) ,
                                           Short.valueOf(AV99Webwnwdp02ds_24_tfdiscanrec_to) ,
                                           A757PriCod ,
                                           AV60pricod ,
                                           AV59Disfec ,
                                           AV58EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV76Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV82Webwnwdp02ds_7_tfdisartcod = GXutil.padr( GXutil.rtrim( AV82Webwnwdp02ds_7_tfdisartcod), 16, "%") ;
      lV84Webwnwdp02ds_9_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV84Webwnwdp02ds_9_tfdisartdsc), 26, "%") ;
      lV86Webwnwdp02ds_11_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV86Webwnwdp02ds_11_tfdiscolnom), 13, "%") ;
      lV88Webwnwdp02ds_13_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV88Webwnwdp02ds_13_tfdisnomcli), 13, "%") ;
      lV92Webwnwdp02ds_17_tfdibcli = GXutil.padr( GXutil.rtrim( AV92Webwnwdp02ds_17_tfdibcli), 16, "%") ;
      lV62DisCliNum = GXutil.padr( GXutil.rtrim( AV62DisCliNum), 8, "%") ;
      lV63DisArtCod = GXutil.padr( GXutil.rtrim( AV63DisArtCod), 16, "%") ;
      lV64Disartdsc = GXutil.padr( GXutil.rtrim( AV64Disartdsc), 26, "%") ;
      lV65DisColNom = GXutil.padr( GXutil.rtrim( AV65DisColNom), 13, "%") ;
      lV66Disnomcli = GXutil.padr( GXutil.rtrim( AV66Disnomcli), 13, "%") ;
      /* Using cursor P08EP4 */
      pr_default.execute(0, new Object[] {AV58EmprCod, AV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, lV76Webwnwdp02ds_1_filterfulltext, Short.valueOf(AV96Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV96Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV97Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV97Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV98Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV98Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV99Webwnwdp02ds_24_tfdiscanrec_to), Short.valueOf(AV99Webwnwdp02ds_24_tfdiscanrec_to), AV60pricod, AV60pricod, AV59Disfec, Integer.valueOf(AV77Webwnwdp02ds_2_tfdiscod), Integer.valueOf(AV78Webwnwdp02ds_3_tfdiscod_to), Integer.valueOf(AV79Webwnwdp02ds_4_tfclicod), Integer.valueOf(AV80Webwnwdp02ds_5_tfclicod_to), AV81Webwnwdp02ds_6_tfdisfec, lV82Webwnwdp02ds_7_tfdisartcod, AV83Webwnwdp02ds_8_tfdisartcod_sel, lV84Webwnwdp02ds_9_tfdisartdsc, AV85Webwnwdp02ds_10_tfdisartdsc_sel, lV86Webwnwdp02ds_11_tfdiscolnom, AV87Webwnwdp02ds_12_tfdiscolnom_sel, lV88Webwnwdp02ds_13_tfdisnomcli, AV89Webwnwdp02ds_14_tfdisnomcli_sel, Integer.valueOf(AV90Webwnwdp02ds_15_tfdiscolnum), Integer.valueOf(AV91Webwnwdp02ds_16_tfdiscolnum_to), lV92Webwnwdp02ds_17_tfdibcli, AV93Webwnwdp02ds_18_tfdibcli_sel, Integer.valueOf(AV94Webwnwdp02ds_19_tfdibint), Integer.valueOf(AV95Webwnwdp02ds_20_tfdibint_to), Integer.valueOf(AV68Discodp), Integer.valueOf(AV61CliCod), lV62DisCliNum, lV63DisArtCod, lV64Disartdsc, lV65DisColNom, lV66Disnomcli, AV67DisUsrcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4348DisUsrCod = P08EP4_A4348DisUsrCod[0] ;
         A360DisCliNum = P08EP4_A360DisCliNum[0] ;
         A757PriCod = P08EP4_A757PriCod[0] ;
         A396EmprCod = P08EP4_A396EmprCod[0] ;
         A1014DibInt = P08EP4_A1014DibInt[0] ;
         n1014DibInt = P08EP4_n1014DibInt[0] ;
         A1013DibCli = P08EP4_A1013DibCli[0] ;
         n1013DibCli = P08EP4_n1013DibCli[0] ;
         A363DisColNum = P08EP4_A363DisColNum[0] ;
         n363DisColNum = P08EP4_n363DisColNum[0] ;
         A1195DisNomCli = P08EP4_A1195DisNomCli[0] ;
         A362DisColNom = P08EP4_A362DisColNom[0] ;
         n362DisColNom = P08EP4_n362DisColNom[0] ;
         A337DisArtDsc = P08EP4_A337DisArtDsc[0] ;
         A335DisArtCod = P08EP4_A335DisArtCod[0] ;
         A369DisFec = P08EP4_A369DisFec[0] ;
         A252CliCod = P08EP4_A252CliCod[0] ;
         A361DisCod = P08EP4_A361DisCod[0] ;
         A367DisEst = P08EP4_A367DisEst[0] ;
         A13732DisCanRec = P08EP4_A13732DisCanRec[0] ;
         n13732DisCanRec = P08EP4_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08EP4_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08EP4_n13737DisMaxObsL[0] ;
         A13732DisCanRec = P08EP4_A13732DisCanRec[0] ;
         n13732DisCanRec = P08EP4_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08EP4_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08EP4_n13737DisMaxObsL[0] ;
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
            AV14TextFileLine += GXutil.str( A361DisCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A369DisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A335DisArtCod, ";", ","), GXv_char3) ;
            webwnwdp02exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A337DisArtDsc, ";", ","), GXv_char3) ;
            webwnwdp02exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A362DisColNom, ";", ","), GXv_char3) ;
            webwnwdp02exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1195DisNomCli, ";", ","), GXv_char3) ;
            webwnwdp02exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A363DisColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1013DibCli, ";", ","), GXv_char3) ;
            webwnwdp02exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1014DibInt, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13737DisMaxObsL, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13732DisCanRec, 4, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebWNwDP02ExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisCod", "", "Codigo Disposicion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisFec", "", "Fecha Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisArtCod", "", "Código Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisArtDsc", "", "Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisColNom", "", "Nombre Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisNomCli", "", "Nombre Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisColNum", "", "Numero Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DibCli", "", "Dibujo del Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DibInt", "", "Dibujo Interno", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisMaxObsLin", "", "Máxima Observación", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DisCanRec", "", "Reclamaciones", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWNwDP02ColumnsSelector", GXv_char3) ;
      webwnwdp02exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebWNwDP02GridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWNwDP02GridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("WebWNwDP02GridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV38TFDisCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFDisCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV40TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV42TFDisFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV44TFDisArtCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV45TFDisArtCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV46TFDisArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV47TFDisArtDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV48TFDisColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV49TFDisColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV50TFDisNomCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV51TFDisNomCli_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV52TFDisColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFDisColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBCLI") == 0 )
         {
            AV54TFDibCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBCLI_SEL") == 0 )
         {
            AV55TFDibCli_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBINT") == 0 )
         {
            AV56TFDibInt = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFDibInt_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISMAXOBSLIN") == 0 )
         {
            AV69TFDisMaxObsLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFDisMaxObsLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCANREC") == 0 )
         {
            AV71TFDisCanRec = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFDisCanRec_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV100GXV1 = (int)(AV100GXV1+1) ;
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
      A369DisFec = GXutil.nullDate() ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1013DibCli = "" ;
      AV76Webwnwdp02ds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV81Webwnwdp02ds_6_tfdisfec = GXutil.nullDate() ;
      AV42TFDisFec = GXutil.nullDate() ;
      AV82Webwnwdp02ds_7_tfdisartcod = "" ;
      AV44TFDisArtCod = "" ;
      AV83Webwnwdp02ds_8_tfdisartcod_sel = "" ;
      AV45TFDisArtCod_Sel = "" ;
      AV84Webwnwdp02ds_9_tfdisartdsc = "" ;
      AV46TFDisArtDsc = "" ;
      AV85Webwnwdp02ds_10_tfdisartdsc_sel = "" ;
      AV47TFDisArtDsc_Sel = "" ;
      AV86Webwnwdp02ds_11_tfdiscolnom = "" ;
      AV48TFDisColNom = "" ;
      AV87Webwnwdp02ds_12_tfdiscolnom_sel = "" ;
      AV49TFDisColNom_Sel = "" ;
      AV88Webwnwdp02ds_13_tfdisnomcli = "" ;
      AV50TFDisNomCli = "" ;
      AV89Webwnwdp02ds_14_tfdisnomcli_sel = "" ;
      AV51TFDisNomCli_Sel = "" ;
      AV92Webwnwdp02ds_17_tfdibcli = "" ;
      AV54TFDibCli = "" ;
      AV93Webwnwdp02ds_18_tfdibcli_sel = "" ;
      AV55TFDibCli_Sel = "" ;
      lV76Webwnwdp02ds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV82Webwnwdp02ds_7_tfdisartcod = "" ;
      lV84Webwnwdp02ds_9_tfdisartdsc = "" ;
      lV86Webwnwdp02ds_11_tfdiscolnom = "" ;
      lV88Webwnwdp02ds_13_tfdisnomcli = "" ;
      lV92Webwnwdp02ds_17_tfdibcli = "" ;
      lV62DisCliNum = "" ;
      lV63DisArtCod = "" ;
      lV64Disartdsc = "" ;
      lV65DisColNom = "" ;
      lV66Disnomcli = "" ;
      AV62DisCliNum = "" ;
      AV63DisArtCod = "" ;
      AV64Disartdsc = "" ;
      AV65DisColNom = "" ;
      AV66Disnomcli = "" ;
      AV67DisUsrcod = "" ;
      A360DisCliNum = "" ;
      A4348DisUsrCod = "" ;
      A757PriCod = "" ;
      AV60pricod = "" ;
      AV59Disfec = GXutil.nullDate() ;
      AV58EmprCod = "" ;
      A396EmprCod = "" ;
      P08EP4_A4348DisUsrCod = new String[] {""} ;
      P08EP4_A360DisCliNum = new String[] {""} ;
      P08EP4_A757PriCod = new String[] {""} ;
      P08EP4_A396EmprCod = new String[] {""} ;
      P08EP4_A1014DibInt = new int[1] ;
      P08EP4_n1014DibInt = new boolean[] {false} ;
      P08EP4_A1013DibCli = new String[] {""} ;
      P08EP4_n1013DibCli = new boolean[] {false} ;
      P08EP4_A363DisColNum = new int[1] ;
      P08EP4_n363DisColNum = new boolean[] {false} ;
      P08EP4_A1195DisNomCli = new String[] {""} ;
      P08EP4_A362DisColNom = new String[] {""} ;
      P08EP4_n362DisColNom = new boolean[] {false} ;
      P08EP4_A337DisArtDsc = new String[] {""} ;
      P08EP4_A335DisArtCod = new String[] {""} ;
      P08EP4_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08EP4_A252CliCod = new int[1] ;
      P08EP4_A361DisCod = new int[1] ;
      P08EP4_A367DisEst = new byte[1] ;
      P08EP4_A13732DisCanRec = new short[1] ;
      P08EP4_n13732DisCanRec = new boolean[] {false} ;
      P08EP4_A13737DisMaxObsL = new short[1] ;
      P08EP4_n13737DisMaxObsL = new boolean[] {false} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwnwdp02exportcsv__default(),
         new Object[] {
             new Object[] {
            P08EP4_A4348DisUsrCod, P08EP4_A360DisCliNum, P08EP4_A757PriCod, P08EP4_A396EmprCod, P08EP4_A1014DibInt, P08EP4_n1014DibInt, P08EP4_A1013DibCli, P08EP4_n1013DibCli, P08EP4_A363DisColNum, P08EP4_n363DisColNum,
            P08EP4_A1195DisNomCli, P08EP4_A362DisColNom, P08EP4_n362DisColNom, P08EP4_A337DisArtDsc, P08EP4_A335DisArtCod, P08EP4_A369DisFec, P08EP4_A252CliCod, P08EP4_A361DisCod, P08EP4_A367DisEst, P08EP4_A13732DisCanRec,
            P08EP4_n13732DisCanRec, P08EP4_A13737DisMaxObsL, P08EP4_n13737DisMaxObsL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A367DisEst ;
   private short gxcookieaux ;
   private short A13737DisMaxObsL ;
   private short A13732DisCanRec ;
   private short AV96Webwnwdp02ds_21_tfdismaxobslin ;
   private short AV69TFDisMaxObsLin ;
   private short AV97Webwnwdp02ds_22_tfdismaxobslin_to ;
   private short AV70TFDisMaxObsLin_To ;
   private short AV98Webwnwdp02ds_23_tfdiscanrec ;
   private short AV71TFDisCanRec ;
   private short AV99Webwnwdp02ds_24_tfdiscanrec_to ;
   private short AV72TFDisCanRec_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1014DibInt ;
   private int AV77Webwnwdp02ds_2_tfdiscod ;
   private int AV38TFDisCod ;
   private int AV78Webwnwdp02ds_3_tfdiscod_to ;
   private int AV39TFDisCod_To ;
   private int AV79Webwnwdp02ds_4_tfclicod ;
   private int AV40TFCliCod ;
   private int AV80Webwnwdp02ds_5_tfclicod_to ;
   private int AV41TFCliCod_To ;
   private int AV90Webwnwdp02ds_15_tfdiscolnum ;
   private int AV52TFDisColNum ;
   private int AV91Webwnwdp02ds_16_tfdiscolnum_to ;
   private int AV53TFDisColNum_To ;
   private int AV94Webwnwdp02ds_19_tfdibint ;
   private int AV56TFDibInt ;
   private int AV95Webwnwdp02ds_20_tfdibint_to ;
   private int AV57TFDibInt_To ;
   private int AV68Discodp ;
   private int AV61CliCod ;
   private int AV100GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A1013DibCli ;
   private String AV82Webwnwdp02ds_7_tfdisartcod ;
   private String AV44TFDisArtCod ;
   private String AV83Webwnwdp02ds_8_tfdisartcod_sel ;
   private String AV45TFDisArtCod_Sel ;
   private String AV84Webwnwdp02ds_9_tfdisartdsc ;
   private String AV46TFDisArtDsc ;
   private String AV85Webwnwdp02ds_10_tfdisartdsc_sel ;
   private String AV47TFDisArtDsc_Sel ;
   private String AV86Webwnwdp02ds_11_tfdiscolnom ;
   private String AV48TFDisColNom ;
   private String AV87Webwnwdp02ds_12_tfdiscolnom_sel ;
   private String AV49TFDisColNom_Sel ;
   private String AV88Webwnwdp02ds_13_tfdisnomcli ;
   private String AV50TFDisNomCli ;
   private String AV89Webwnwdp02ds_14_tfdisnomcli_sel ;
   private String AV51TFDisNomCli_Sel ;
   private String AV92Webwnwdp02ds_17_tfdibcli ;
   private String AV54TFDibCli ;
   private String AV93Webwnwdp02ds_18_tfdibcli_sel ;
   private String AV55TFDibCli_Sel ;
   private String scmdbuf ;
   private String lV82Webwnwdp02ds_7_tfdisartcod ;
   private String lV84Webwnwdp02ds_9_tfdisartdsc ;
   private String lV86Webwnwdp02ds_11_tfdiscolnom ;
   private String lV88Webwnwdp02ds_13_tfdisnomcli ;
   private String lV92Webwnwdp02ds_17_tfdibcli ;
   private String lV62DisCliNum ;
   private String lV63DisArtCod ;
   private String lV64Disartdsc ;
   private String lV65DisColNom ;
   private String lV66Disnomcli ;
   private String AV62DisCliNum ;
   private String AV63DisArtCod ;
   private String AV64Disartdsc ;
   private String AV65DisColNom ;
   private String AV66Disnomcli ;
   private String AV67DisUsrcod ;
   private String A360DisCliNum ;
   private String A4348DisUsrCod ;
   private String A757PriCod ;
   private String AV60pricod ;
   private String AV58EmprCod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV81Webwnwdp02ds_6_tfdisfec ;
   private java.util.Date AV42TFDisFec ;
   private java.util.Date AV59Disfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n13732DisCanRec ;
   private boolean n13737DisMaxObsL ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV76Webwnwdp02ds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV76Webwnwdp02ds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08EP4_A4348DisUsrCod ;
   private String[] P08EP4_A360DisCliNum ;
   private String[] P08EP4_A757PriCod ;
   private String[] P08EP4_A396EmprCod ;
   private int[] P08EP4_A1014DibInt ;
   private boolean[] P08EP4_n1014DibInt ;
   private String[] P08EP4_A1013DibCli ;
   private boolean[] P08EP4_n1013DibCli ;
   private int[] P08EP4_A363DisColNum ;
   private boolean[] P08EP4_n363DisColNum ;
   private String[] P08EP4_A1195DisNomCli ;
   private String[] P08EP4_A362DisColNom ;
   private boolean[] P08EP4_n362DisColNom ;
   private String[] P08EP4_A337DisArtDsc ;
   private String[] P08EP4_A335DisArtCod ;
   private java.util.Date[] P08EP4_A369DisFec ;
   private int[] P08EP4_A252CliCod ;
   private int[] P08EP4_A361DisCod ;
   private byte[] P08EP4_A367DisEst ;
   private short[] P08EP4_A13732DisCanRec ;
   private boolean[] P08EP4_n13732DisCanRec ;
   private short[] P08EP4_A13737DisMaxObsL ;
   private boolean[] P08EP4_n13737DisMaxObsL ;
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

final  class webwnwdp02exportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EP4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV77Webwnwdp02ds_2_tfdiscod ,
                                          int AV78Webwnwdp02ds_3_tfdiscod_to ,
                                          int AV79Webwnwdp02ds_4_tfclicod ,
                                          int AV80Webwnwdp02ds_5_tfclicod_to ,
                                          java.util.Date AV81Webwnwdp02ds_6_tfdisfec ,
                                          String AV83Webwnwdp02ds_8_tfdisartcod_sel ,
                                          String AV82Webwnwdp02ds_7_tfdisartcod ,
                                          String AV85Webwnwdp02ds_10_tfdisartdsc_sel ,
                                          String AV84Webwnwdp02ds_9_tfdisartdsc ,
                                          String AV87Webwnwdp02ds_12_tfdiscolnom_sel ,
                                          String AV86Webwnwdp02ds_11_tfdiscolnom ,
                                          String AV89Webwnwdp02ds_14_tfdisnomcli_sel ,
                                          String AV88Webwnwdp02ds_13_tfdisnomcli ,
                                          int AV90Webwnwdp02ds_15_tfdiscolnum ,
                                          int AV91Webwnwdp02ds_16_tfdiscolnum_to ,
                                          String AV93Webwnwdp02ds_18_tfdibcli_sel ,
                                          String AV92Webwnwdp02ds_17_tfdibcli ,
                                          int AV94Webwnwdp02ds_19_tfdibint ,
                                          int AV95Webwnwdp02ds_20_tfdibint_to ,
                                          int AV68Discodp ,
                                          int AV61CliCod ,
                                          String AV62DisCliNum ,
                                          String AV63DisArtCod ,
                                          String AV64Disartdsc ,
                                          String AV65DisColNom ,
                                          String AV66Disnomcli ,
                                          String AV67DisUsrcod ,
                                          int A361DisCod ,
                                          int A252CliCod ,
                                          java.util.Date A369DisFec ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          String A1195DisNomCli ,
                                          int A363DisColNum ,
                                          String A1013DibCli ,
                                          int A1014DibInt ,
                                          String A360DisCliNum ,
                                          String A4348DisUsrCod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV76Webwnwdp02ds_1_filterfulltext ,
                                          short A13737DisMaxObsL ,
                                          short A13732DisCanRec ,
                                          short AV96Webwnwdp02ds_21_tfdismaxobslin ,
                                          short AV97Webwnwdp02ds_22_tfdismaxobslin_to ,
                                          short AV98Webwnwdp02ds_23_tfdiscanrec ,
                                          short AV99Webwnwdp02ds_24_tfdiscanrec_to ,
                                          String A757PriCod ,
                                          String AV60pricod ,
                                          java.util.Date AV59Disfec ,
                                          String AV58EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[51];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.DisUsrCod, T1.DisCliNum, T1.PriCod, T1.EmprCod, T1.DibInt, T1.DibCli, T1.DisColNum, T1.DisNomCli, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.DisFec," ;
      scmdbuf += " T1.CliCod, T1.DisCod, T1.DisEst, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisMaxObsL, 0) AS DisMaxObsL FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*)" ;
      scmdbuf += " AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI'" ;
      scmdbuf += " GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT MAX(DisObsLin) AS DisMaxObsL, EmprCod, DisCod FROM TXPOBSERV" ;
      scmdbuf += " GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.DisArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.DisColNom) like '%' || UPPER(?)) or ( UPPER(T1.DisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.DibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DibInt,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisMaxObsL, 0),'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      addWhere(sWhereString, "(T1.PriCod = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.DisFec = ?)");
      if ( ! (0==AV77Webwnwdp02ds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV78Webwnwdp02ds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV79Webwnwdp02ds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV80Webwnwdp02ds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Webwnwdp02ds_6_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwnwdp02ds_8_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwnwdp02ds_7_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwnwdp02ds_8_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwnwdp02ds_10_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwnwdp02ds_9_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwnwdp02ds_10_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwnwdp02ds_12_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwnwdp02ds_11_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwnwdp02ds_12_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwnwdp02ds_14_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwnwdp02ds_13_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwnwdp02ds_14_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwnwdp02ds_15_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV91Webwnwdp02ds_16_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Webwnwdp02ds_18_tfdibcli_sel)==0) && ( ! (GXutil.strcmp("", AV92Webwnwdp02ds_17_tfdibcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Webwnwdp02ds_18_tfdibcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DibCli = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwnwdp02ds_19_tfdibint) )
      {
         addWhere(sWhereString, "(T1.DibInt >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (0==AV95Webwnwdp02ds_20_tfdibint_to) )
      {
         addWhere(sWhereString, "(T1.DibInt <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (0==AV68Discodp) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (0==AV61CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62DisCliNum)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum like ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63DisArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod like ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Disartdsc)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc like ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65DisColNom)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom like ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Disnomcli)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli like ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67DisUsrcod)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibCli" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibInt" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibInt DESC" ;
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
                  return conditional_P08EP4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EP4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((short[]) buf[19])[0] = rslt.getShort(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(17);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               return;
      }
   }

}

