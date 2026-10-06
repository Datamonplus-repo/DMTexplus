package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcborradoformulasexportcsv_impl extends GXWebProcedure
{
   public wcborradoformulasexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCBorradoFormulasExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.WCBorradoFormulasColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.WCBorradoFormulasColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Interno", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fec Ult Uti", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV65FilterFullText ;
      AV70Formulaciontinte_wcborradoformulasds_2_tfclicod = AV33TFCliCod ;
      AV71Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV34TFCliCod_To ;
      AV72Formulaciontinte_wcborradoformulasds_4_tfclinom = AV35TFCliNom ;
      AV73Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV36TFCliNom_Sel ;
      AV74Formulaciontinte_wcborradoformulasds_6_tfforser = AV37TFForSer ;
      AV75Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV38TFForSer_Sel ;
      AV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV39TFForSerDsc ;
      AV77Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV40TFForSerDsc_Sel ;
      AV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV41TFForColNom ;
      AV79Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV42TFForColNom_Sel ;
      AV80Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV43TFForColNum ;
      AV81Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV44TFForColNum_To ;
      AV82Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV45TFTipColCod ;
      AV83Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV46TFTipColCod_To ;
      AV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV47TFTipColDsc ;
      AV85Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV48TFTipColDsc_Sel ;
      AV86Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV49TFForNumCol ;
      AV87Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV50TFForNumCol_To ;
      AV88Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV51TFForUltUti ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV70Formulaciontinte_wcborradoformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV71Formulaciontinte_wcborradoformulasds_3_tfclicod_to) ,
                                           AV73Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                           AV72Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                           AV75Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                           AV74Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                           AV77Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                           AV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                           AV79Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                           AV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV80Formulaciontinte_wcborradoformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV81Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV82Formulaciontinte_wcborradoformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV83Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) ,
                                           AV85Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                           AV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(AV86Formulaciontinte_wcborradoformulasds_18_tffornumcol) ,
                                           Integer.valueOf(AV87Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) ,
                                           AV88Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A496ForUltUti ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV56Forser_to ,
                                           AV58Forcolnom_to ,
                                           Integer.valueOf(AV60Forcolnum_to) ,
                                           Byte.valueOf(AV62TipColCod_to) ,
                                           AV64ForUltUti ,
                                           AV63Emprcod ,
                                           Integer.valueOf(AV53Clicod) ,
                                           AV55Forser ,
                                           AV57Forcolnom ,
                                           Integer.valueOf(AV59Forcolnum) ,
                                           Byte.valueOf(AV61TipColCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV54Clicod_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV72Formulaciontinte_wcborradoformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcborradoformulasds_4_tfclinom), 30, "%") ;
      lV74Formulaciontinte_wcborradoformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcborradoformulasds_6_tfforser), 16, "%") ;
      lV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc), 26, "%") ;
      lV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom), 13, "%") ;
      lV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08KY2 */
      pr_default.execute(0, new Object[] {AV63Emprcod, Integer.valueOf(AV53Clicod), AV55Forser, AV57Forcolnom, Integer.valueOf(AV59Forcolnum), Byte.valueOf(AV61TipColCod), AV56Forser_to, AV58Forcolnom_to, Integer.valueOf(AV60Forcolnum_to), Byte.valueOf(AV62TipColCod_to), AV64ForUltUti, AV64ForUltUti, Integer.valueOf(AV54Clicod_to), lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext, Integer.valueOf(AV70Formulaciontinte_wcborradoformulasds_2_tfclicod), Integer.valueOf(AV71Formulaciontinte_wcborradoformulasds_3_tfclicod_to), lV72Formulaciontinte_wcborradoformulasds_4_tfclinom, AV73Formulaciontinte_wcborradoformulasds_5_tfclinom_sel, lV74Formulaciontinte_wcborradoformulasds_6_tfforser, AV75Formulaciontinte_wcborradoformulasds_7_tfforser_sel, lV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc, AV77Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel, lV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom, AV79Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel, Integer.valueOf(AV80Formulaciontinte_wcborradoformulasds_12_tfforcolnum), Integer.valueOf(AV81Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to), Byte.valueOf(AV82Formulaciontinte_wcborradoformulasds_14_tftipcolcod), Byte.valueOf(AV83Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to), lV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc, AV85Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel, Integer.valueOf(AV86Formulaciontinte_wcborradoformulasds_18_tffornumcol), Integer.valueOf(AV87Formulaciontinte_wcborradoformulasds_19_tffornumcol_to), AV88Formulaciontinte_wcborradoformulasds_20_tfforultuti});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08KY2_A396EmprCod[0] ;
         A496ForUltUti = P08KY2_A496ForUltUti[0] ;
         n496ForUltUti = P08KY2_n496ForUltUti[0] ;
         A486ForNumCol = P08KY2_A486ForNumCol[0] ;
         A832TipColDsc = P08KY2_A832TipColDsc[0] ;
         n832TipColDsc = P08KY2_n832TipColDsc[0] ;
         A831TipColCod = P08KY2_A831TipColCod[0] ;
         A483ForColNum = P08KY2_A483ForColNum[0] ;
         A482ForColNom = P08KY2_A482ForColNom[0] ;
         A5742ForSerDsc = P08KY2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08KY2_n5742ForSerDsc[0] ;
         A494ForSer = P08KY2_A494ForSer[0] ;
         A279CliNom = P08KY2_A279CliNom[0] ;
         A252CliCod = P08KY2_A252CliCod[0] ;
         A832TipColDsc = P08KY2_A832TipColDsc[0] ;
         n832TipColDsc = P08KY2_n832TipColDsc[0] ;
         A279CliNom = P08KY2_A279CliNom[0] ;
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
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            wcborradoformulasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A494ForSer, ";", ","), GXv_char3) ;
            wcborradoformulasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5742ForSerDsc, ";", ","), GXv_char3) ;
            wcborradoformulasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A482ForColNom, ";", ","), GXv_char3) ;
            wcborradoformulasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A483ForColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A831TipColCod, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A832TipColDsc, ";", ","), GXv_char3) ;
            wcborradoformulasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A486ForNumCol, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A496ForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCBorradoFormulasExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForSerDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipColCod", "", "Tc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipColDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForNumCol", "", "Nº Interno", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForUltUti", "", "Fec Ult Uti", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCBorradoFormulasColumnsSelector", GXv_char3) ;
      wcborradoformulasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.WCBorradoFormulasGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCBorradoFormulasGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("FormulacionTinte.WCBorradoFormulasGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV65FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV33TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV35TFCliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV36TFCliNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV37TFForSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV38TFForSer_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV39TFForSerDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV40TFForSerDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV41TFForColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV42TFForColNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV43TFForColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFForColNum_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV45TFTipColCod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFTipColCod_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV47TFTipColDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV48TFTipColDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV49TFForNumCol = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFForNumCol_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV51TFForUltUti = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV63Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV53Clicod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV54Clicod_to = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV55Forser = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV56Forser_to = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV57Forcolnom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV58Forcolnom_to = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV59Forcolnum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV60Forcolnum_to = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV61TipColCod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV62TipColCod_to = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORULTUTI") == 0 )
         {
            AV64ForUltUti = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
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
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = "" ;
      AV65FilterFullText = "" ;
      AV72Formulaciontinte_wcborradoformulasds_4_tfclinom = "" ;
      AV35TFCliNom = "" ;
      AV73Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = "" ;
      AV36TFCliNom_Sel = "" ;
      AV74Formulaciontinte_wcborradoformulasds_6_tfforser = "" ;
      AV37TFForSer = "" ;
      AV75Formulaciontinte_wcborradoformulasds_7_tfforser_sel = "" ;
      AV38TFForSer_Sel = "" ;
      AV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc = "" ;
      AV39TFForSerDsc = "" ;
      AV77Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = "" ;
      AV40TFForSerDsc_Sel = "" ;
      AV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom = "" ;
      AV41TFForColNom = "" ;
      AV79Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = "" ;
      AV42TFForColNom_Sel = "" ;
      AV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = "" ;
      AV47TFTipColDsc = "" ;
      AV85Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = "" ;
      AV48TFTipColDsc_Sel = "" ;
      AV88Formulaciontinte_wcborradoformulasds_20_tfforultuti = GXutil.nullDate() ;
      AV51TFForUltUti = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext = "" ;
      lV72Formulaciontinte_wcborradoformulasds_4_tfclinom = "" ;
      lV74Formulaciontinte_wcborradoformulasds_6_tfforser = "" ;
      lV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc = "" ;
      lV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom = "" ;
      lV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = "" ;
      AV56Forser_to = "" ;
      AV58Forcolnom_to = "" ;
      AV64ForUltUti = GXutil.nullDate() ;
      AV63Emprcod = "" ;
      AV55Forser = "" ;
      AV57Forcolnom = "" ;
      A396EmprCod = "" ;
      P08KY2_A396EmprCod = new String[] {""} ;
      P08KY2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08KY2_n496ForUltUti = new boolean[] {false} ;
      P08KY2_A486ForNumCol = new int[1] ;
      P08KY2_A832TipColDsc = new String[] {""} ;
      P08KY2_n832TipColDsc = new boolean[] {false} ;
      P08KY2_A831TipColCod = new byte[1] ;
      P08KY2_A483ForColNum = new int[1] ;
      P08KY2_A482ForColNom = new String[] {""} ;
      P08KY2_A5742ForSerDsc = new String[] {""} ;
      P08KY2_n5742ForSerDsc = new boolean[] {false} ;
      P08KY2_A494ForSer = new String[] {""} ;
      P08KY2_A279CliNom = new String[] {""} ;
      P08KY2_A252CliCod = new int[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcborradoformulasexportcsv__default(),
         new Object[] {
             new Object[] {
            P08KY2_A396EmprCod, P08KY2_A496ForUltUti, P08KY2_n496ForUltUti, P08KY2_A486ForNumCol, P08KY2_A832TipColDsc, P08KY2_n832TipColDsc, P08KY2_A831TipColCod, P08KY2_A483ForColNum, P08KY2_A482ForColNom, P08KY2_A5742ForSerDsc,
            P08KY2_n5742ForSerDsc, P08KY2_A494ForSer, P08KY2_A279CliNom, P08KY2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV82Formulaciontinte_wcborradoformulasds_14_tftipcolcod ;
   private byte AV45TFTipColCod ;
   private byte AV83Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ;
   private byte AV46TFTipColCod_To ;
   private byte AV62TipColCod_to ;
   private byte AV61TipColCod ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV70Formulaciontinte_wcborradoformulasds_2_tfclicod ;
   private int AV33TFCliCod ;
   private int AV71Formulaciontinte_wcborradoformulasds_3_tfclicod_to ;
   private int AV34TFCliCod_To ;
   private int AV80Formulaciontinte_wcborradoformulasds_12_tfforcolnum ;
   private int AV43TFForColNum ;
   private int AV81Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ;
   private int AV44TFForColNum_To ;
   private int AV86Formulaciontinte_wcborradoformulasds_18_tffornumcol ;
   private int AV49TFForNumCol ;
   private int AV87Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ;
   private int AV50TFForNumCol_To ;
   private int AV60Forcolnum_to ;
   private int AV53Clicod ;
   private int AV59Forcolnum ;
   private int AV54Clicod_to ;
   private int AV89GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String AV72Formulaciontinte_wcborradoformulasds_4_tfclinom ;
   private String AV35TFCliNom ;
   private String AV73Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ;
   private String AV36TFCliNom_Sel ;
   private String AV74Formulaciontinte_wcborradoformulasds_6_tfforser ;
   private String AV37TFForSer ;
   private String AV75Formulaciontinte_wcborradoformulasds_7_tfforser_sel ;
   private String AV38TFForSer_Sel ;
   private String AV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc ;
   private String AV39TFForSerDsc ;
   private String AV77Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ;
   private String AV40TFForSerDsc_Sel ;
   private String AV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom ;
   private String AV41TFForColNom ;
   private String AV79Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ;
   private String AV42TFForColNom_Sel ;
   private String AV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ;
   private String AV47TFTipColDsc ;
   private String AV85Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ;
   private String AV48TFTipColDsc_Sel ;
   private String scmdbuf ;
   private String lV72Formulaciontinte_wcborradoformulasds_4_tfclinom ;
   private String lV74Formulaciontinte_wcborradoformulasds_6_tfforser ;
   private String lV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc ;
   private String lV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom ;
   private String lV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ;
   private String AV56Forser_to ;
   private String AV58Forcolnom_to ;
   private String AV63Emprcod ;
   private String AV55Forser ;
   private String AV57Forcolnom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date AV88Formulaciontinte_wcborradoformulasds_20_tfforultuti ;
   private java.util.Date AV51TFForUltUti ;
   private java.util.Date AV64ForUltUti ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n496ForUltUti ;
   private boolean n832TipColDsc ;
   private boolean n5742ForSerDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext ;
   private String AV65FilterFullText ;
   private String lV69Formulaciontinte_wcborradoformulasds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08KY2_A396EmprCod ;
   private java.util.Date[] P08KY2_A496ForUltUti ;
   private boolean[] P08KY2_n496ForUltUti ;
   private int[] P08KY2_A486ForNumCol ;
   private String[] P08KY2_A832TipColDsc ;
   private boolean[] P08KY2_n832TipColDsc ;
   private byte[] P08KY2_A831TipColCod ;
   private int[] P08KY2_A483ForColNum ;
   private String[] P08KY2_A482ForColNom ;
   private String[] P08KY2_A5742ForSerDsc ;
   private boolean[] P08KY2_n5742ForSerDsc ;
   private String[] P08KY2_A494ForSer ;
   private String[] P08KY2_A279CliNom ;
   private int[] P08KY2_A252CliCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcborradoformulasexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08KY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                          int AV70Formulaciontinte_wcborradoformulasds_2_tfclicod ,
                                          int AV71Formulaciontinte_wcborradoformulasds_3_tfclicod_to ,
                                          String AV73Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                          String AV72Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                          String AV75Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                          String AV74Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                          String AV77Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                          String AV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                          String AV79Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                          String AV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                          int AV80Formulaciontinte_wcborradoformulasds_12_tfforcolnum ,
                                          int AV81Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ,
                                          byte AV82Formulaciontinte_wcborradoformulasds_14_tftipcolcod ,
                                          byte AV83Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ,
                                          String AV85Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                          String AV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                          int AV86Formulaciontinte_wcborradoformulasds_18_tffornumcol ,
                                          int AV87Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ,
                                          java.util.Date AV88Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.util.Date A496ForUltUti ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV56Forser_to ,
                                          String AV58Forcolnom_to ,
                                          int AV60Forcolnum_to ,
                                          byte AV62TipColCod_to ,
                                          java.util.Date AV64ForUltUti ,
                                          String AV63Emprcod ,
                                          int AV53Clicod ,
                                          String AV55Forser ,
                                          String AV57Forcolnom ,
                                          int AV59Forcolnum ,
                                          byte AV61TipColCod ,
                                          String A396EmprCod ,
                                          int AV54Clicod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[41];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForUltUti, T1.ForNumCol, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod >= ? and T1.ForSer >= ? and T1.ForColNom >= ? and T1.ForColNum >= ? and T1.TipColCod >= ?)");
      addWhere(sWhereString, "(T1.ForSer <= ?)");
      addWhere(sWhereString, "(T1.ForColNom <= ?)");
      addWhere(sWhereString, "(T1.ForColNum <= ?)");
      addWhere(sWhereString, "(T1.TipColCod <= ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcborradoformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
         GXv_int6[18] = (byte)(1) ;
         GXv_int6[19] = (byte)(1) ;
         GXv_int6[20] = (byte)(1) ;
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_wcborradoformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_wcborradoformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcborradoformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcborradoformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcborradoformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_wcborradoformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_wcborradoformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcborradoformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcborradoformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_wcborradoformulasds_18_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Formulaciontinte_wcborradoformulasds_20_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipColDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltUti DESC" ;
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
                  return conditional_P08KY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08KY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((int[]) buf[13])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               return;
      }
   }

}

