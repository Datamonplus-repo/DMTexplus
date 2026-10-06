package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ensayospendientes_wcexportcsv_impl extends GXWebProcedure
{
   public ensayospendientes_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      GXv_SdtWWPContext1[0] = AV61WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV61WWPContext = GXv_SdtWWPContext1[0] ;
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
      AV31Random = (int)(GXutil.random( )*10000) ;
      AV19Filename = "./PrivateTempStorage/" + "EnsayosPendientes_WCExportCSV-" + GXutil.trim( GXutil.str( AV31Random, 8, 0)) + ".csv" ;
      AV33TextFile.setSource( AV19Filename );
      AV33TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV33TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV34TextFileLine = "" ;
      if ( GXutil.strcmp(AV32Session.getValue("GestionLaboratorio.EnsayosPendientes_WCColumnsSelector"), "") != 0 )
      {
         AV13ColumnsSelectorXML = AV32Session.getValue("GestionLaboratorio.EnsayosPendientes_WCColumnsSelector") ;
         AV10ColumnsSelector.fromxml(AV13ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Entrada", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Ensayo", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV34TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dias", "") : "") ;
      if ( GXutil.len( AV34TextFileLine) > 0 )
      {
         AV33TextFile.writeLine(GXutil.substring( AV34TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = AV20FilterFullText ;
      AV68Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod = AV35TFCliCod ;
      AV69Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to = AV36TFCliCod_To ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = AV37TFCliNom ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = AV38TFCliNom_Sel ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = AV43TFLb_Cartaz ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = AV44TFLb_Cartaz_Sel ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = AV45TFLb_cartazf ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = AV53TFLb_FechaE ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = AV39TFLb_ArtCod ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = AV40TFLb_ArtCod_Sel ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = AV41TFLb_ArtDsc ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = AV42TFLb_ArtDsc_Sel ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = AV47TFLb_ColNom ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = AV48TFLb_ColNom_Sel ;
      AV82Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum = AV51TFLb_ColNum ;
      AV83Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to = AV52TFLb_ColNum_To ;
      AV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = AV49TFLb_ColNomC ;
      AV85Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = AV50TFLb_ColNomC_Sel ;
      AV86Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero = AV55TFLb_numero ;
      AV87Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to = AV56TFLb_numero_To ;
      AV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = AV57TFLb_Tipo ;
      AV89Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = AV58TFLb_Tipo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV68Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV69Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) ,
                                           AV71Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                           AV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                           AV73Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                           AV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                           AV74Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                           AV75Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                           AV77Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                           AV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                           AV79Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                           AV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                           AV81Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                           AV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                           Integer.valueOf(AV82Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) ,
                                           Integer.valueOf(AV83Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) ,
                                           AV85Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                           AV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                           Integer.valueOf(AV86Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) ,
                                           Integer.valueOf(AV87Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) ,
                                           AV89Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                           AV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                           Integer.valueOf(AV8Clicod) ,
                                           AV26Lb_FechaEfrom ,
                                           AV27Lb_FechaEto ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Short.valueOf(AV29OrderedBy) ,
                                           Boolean.valueOf(AV30OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV17Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext), "%", "") ;
      lV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom), 30, "%") ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz), 20, "%") ;
      lV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = GXutil.padr( GXutil.rtrim( AV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod), 16, "%") ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc), 26, "%") ;
      lV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom), 13, "%") ;
      lV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc), 13, "%") ;
      lV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = GXutil.padr( GXutil.rtrim( AV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo), 1, "%") ;
      /* Using cursor P09O82 */
      pr_default.execute(0, new Object[] {AV17Emprcod, lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext, Integer.valueOf(AV68Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod), Integer.valueOf(AV69Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to), lV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom, AV71Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel, lV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz, AV73Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel, AV74Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf, AV75Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae, lV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod, AV77Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel, lV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc, AV79Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel, lV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom, AV81Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel, Integer.valueOf(AV82Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum), Integer.valueOf(AV83Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to), lV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc, AV85Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel, Integer.valueOf(AV86Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero), Integer.valueOf(AV87Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to), lV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo, AV89Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel, Integer.valueOf(AV8Clicod), AV26Lb_FechaEfrom, AV27Lb_FechaEto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P09O82_A5532Lb_numero[0] ;
         A396EmprCod = P09O82_A396EmprCod[0] ;
         A5569Lb_EstEns = P09O82_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09O82_A5570Lb_Tipo[0] ;
         A5538Lb_ColNomC = P09O82_A5538Lb_ColNomC[0] ;
         A5537Lb_ColNum = P09O82_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09O82_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09O82_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09O82_A5533Lb_ArtCod[0] ;
         A5541Lb_FechaE = P09O82_A5541Lb_FechaE[0] ;
         A5594Lb_cartazf = P09O82_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09O82_A5540Lb_Cartaz[0] ;
         A279CliNom = P09O82_A279CliNom[0] ;
         A252CliCod = P09O82_A252CliCod[0] ;
         A279CliNom = P09O82_A279CliNom[0] ;
         AV34TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            AV34TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            GXt_char2 = AV34TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            ensayospendientes_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV34TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            GXt_char2 = AV34TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5540Lb_Cartaz, ";", ","), GXv_char3) ;
            ensayospendientes_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV34TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            AV34TextFileLine += localUtil.dtoc( A5594Lb_cartazf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            AV34TextFileLine += localUtil.dtoc( A5541Lb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            GXt_char2 = AV34TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5533Lb_ArtCod, ";", ","), GXv_char3) ;
            ensayospendientes_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV34TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            GXt_char2 = AV34TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5534Lb_ArtDsc, ";", ","), GXv_char3) ;
            ensayospendientes_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV34TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            GXt_char2 = AV34TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5536Lb_ColNom, ";", ","), GXv_char3) ;
            ensayospendientes_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV34TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            AV34TextFileLine += GXutil.str( A5537Lb_ColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            GXt_char2 = AV34TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5538Lb_ColNomC, ";", ","), GXv_char3) ;
            ensayospendientes_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV34TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            AV34TextFileLine += GXutil.str( A5532Lb_numero, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34TextFileLine += ";" ;
            GXt_char2 = AV34TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5570Lb_Tipo, ";", ","), GXv_char3) ;
            ensayospendientes_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV34TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV62N_opc = (short)(0) ;
            /* Optimized group. */
            /* Using cursor P09O83 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            cV62N_opc = P09O83_AV62N_opc[0] ;
            pr_default.close(1);
            AV62N_opc = (short)(AV62N_opc+cV62N_opc*1) ;
            /* End optimized group. */
            AV34TextFileLine += ";" ;
            AV34TextFileLine += GXutil.str( AV62N_opc, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV63Dias = (short)(GXutil.ddiff(Gx_date,A5541Lb_FechaE)) ;
            AV34TextFileLine += ";" ;
            AV34TextFileLine += GXutil.str( AV63Dias, 4, 0) ;
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
         if ( GXutil.len( AV34TextFileLine) > 0 )
         {
            AV33TextFile.writeLine(GXutil.substring( AV34TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV33TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV33TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV24HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV24HttpResponse.addHeader("Content-Disposition", "attachment;filename=EnsayosPendientes_WCExportCSV.csv");
         }
         AV24HttpResponse.addFile(AV33TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV33TextFile.getErrCode() != 0 )
      {
         AV19Filename = "" ;
         AV18ErrorMessage = AV33TextFile.getErrDescription() ;
         AV33TextFile.close();
         AV24HttpResponse.addString(AV18ErrorMessage);
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
      AV10ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_cartazf", "Fecha", "Coleccion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_FechaE", "Fecha", "Entrada", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ArtDsc", "", "Descripcion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNom", "", "Color", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNum", "", "Numero", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_numero", "", "Nº Ensayo", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Tipo", "", "Tipo", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&N_opc", "", "#", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Dias", "", "Dias", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV59UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EnsayosPendientes_WCColumnsSelector", GXv_char3) ;
      ensayospendientes_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV59UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV59UserCustomValue)==0) ) )
      {
         AV12ColumnsSelectorAux.fromxml(AV59UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV12ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV10ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV12ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV10ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue("GestionLaboratorio.EnsayosPendientes_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EnsayosPendientes_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV32Session.getValue("GestionLaboratorio.EnsayosPendientes_WCGridState"), null, null);
      }
      AV29OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV30OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV92GXV1 = 1 ;
      while ( AV92GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV37TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV38TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV43TFLb_Cartaz = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV44TFLb_Cartaz_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV45TFLb_cartazf = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV53TFLb_FechaE = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV39TFLb_ArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV40TFLb_ArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV41TFLb_ArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV42TFLb_ArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV47TFLb_ColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV48TFLb_ColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV51TFLb_ColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFLb_ColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV49TFLb_ColNomC = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV50TFLb_ColNomC_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV55TFLb_numero = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFLb_numero_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV57TFLb_Tipo = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV58TFLb_Tipo_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV17Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV8Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV26Lb_FechaEfrom = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV27Lb_FechaEto = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV92GXV1 = (int)(AV92GXV1+1) ;
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
      AV61WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Filename = "" ;
      AV33TextFile = new com.genexus.util.GXFile();
      AV34TextFileLine = "" ;
      AV32Session = httpContext.getWebSession();
      AV13ColumnsSelectorXML = "" ;
      AV10ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5570Lb_Tipo = "" ;
      AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = "" ;
      AV20FilterFullText = "" ;
      AV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = "" ;
      AV37TFCliNom = "" ;
      AV71Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel = "" ;
      AV38TFCliNom_Sel = "" ;
      AV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = "" ;
      AV43TFLb_Cartaz = "" ;
      AV73Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel = "" ;
      AV44TFLb_Cartaz_Sel = "" ;
      AV74Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf = GXutil.nullDate() ;
      AV45TFLb_cartazf = GXutil.nullDate() ;
      AV75Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae = GXutil.nullDate() ;
      AV53TFLb_FechaE = GXutil.nullDate() ;
      AV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = "" ;
      AV39TFLb_ArtCod = "" ;
      AV77Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel = "" ;
      AV40TFLb_ArtCod_Sel = "" ;
      AV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = "" ;
      AV41TFLb_ArtDsc = "" ;
      AV79Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel = "" ;
      AV42TFLb_ArtDsc_Sel = "" ;
      AV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = "" ;
      AV47TFLb_ColNom = "" ;
      AV81Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel = "" ;
      AV48TFLb_ColNom_Sel = "" ;
      AV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = "" ;
      AV49TFLb_ColNomC = "" ;
      AV85Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel = "" ;
      AV50TFLb_ColNomC_Sel = "" ;
      AV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = "" ;
      AV57TFLb_Tipo = "" ;
      AV89Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel = "" ;
      AV58TFLb_Tipo_Sel = "" ;
      scmdbuf = "" ;
      lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext = "" ;
      lV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom = "" ;
      lV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz = "" ;
      lV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod = "" ;
      lV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc = "" ;
      lV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom = "" ;
      lV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc = "" ;
      lV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo = "" ;
      AV26Lb_FechaEfrom = GXutil.nullDate() ;
      AV27Lb_FechaEto = GXutil.nullDate() ;
      AV17Emprcod = "" ;
      A396EmprCod = "" ;
      P09O82_A5532Lb_numero = new int[1] ;
      P09O82_A396EmprCod = new String[] {""} ;
      P09O82_A5569Lb_EstEns = new byte[1] ;
      P09O82_A5570Lb_Tipo = new String[] {""} ;
      P09O82_A5538Lb_ColNomC = new String[] {""} ;
      P09O82_A5537Lb_ColNum = new int[1] ;
      P09O82_A5536Lb_ColNom = new String[] {""} ;
      P09O82_A5534Lb_ArtDsc = new String[] {""} ;
      P09O82_A5533Lb_ArtCod = new String[] {""} ;
      P09O82_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09O82_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09O82_A5540Lb_Cartaz = new String[] {""} ;
      P09O82_A279CliNom = new String[] {""} ;
      P09O82_A252CliCod = new int[1] ;
      P09O83_AV62N_opc = new short[1] ;
      Gx_date = GXutil.nullDate() ;
      AV24HttpResponse = httpContext.getHttpResponse();
      AV18ErrorMessage = "" ;
      AV59UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV12ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.ensayospendientes_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09O82_A5532Lb_numero, P09O82_A396EmprCod, P09O82_A5569Lb_EstEns, P09O82_A5570Lb_Tipo, P09O82_A5538Lb_ColNomC, P09O82_A5537Lb_ColNum, P09O82_A5536Lb_ColNom, P09O82_A5534Lb_ArtDsc, P09O82_A5533Lb_ArtCod, P09O82_A5541Lb_FechaE,
            P09O82_A5594Lb_cartazf, P09O82_A5540Lb_Cartaz, P09O82_A279CliNom, P09O82_A252CliCod
            }
            , new Object[] {
            P09O83_AV62N_opc
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A5569Lb_EstEns ;
   private short gxcookieaux ;
   private short AV29OrderedBy ;
   private short AV62N_opc ;
   private short cV62N_opc ;
   private short AV63Dias ;
   private short Gx_err ;
   private int AV31Random ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private int AV68Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ;
   private int AV35TFCliCod ;
   private int AV69Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ;
   private int AV36TFCliCod_To ;
   private int AV82Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ;
   private int AV51TFLb_ColNum ;
   private int AV83Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ;
   private int AV52TFLb_ColNum_To ;
   private int AV86Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ;
   private int AV55TFLb_numero ;
   private int AV87Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ;
   private int AV56TFLb_numero_To ;
   private int AV8Clicod ;
   private int AV92GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5536Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5570Lb_Tipo ;
   private String AV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ;
   private String AV37TFCliNom ;
   private String AV71Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ;
   private String AV38TFCliNom_Sel ;
   private String AV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ;
   private String AV43TFLb_Cartaz ;
   private String AV73Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ;
   private String AV44TFLb_Cartaz_Sel ;
   private String AV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ;
   private String AV39TFLb_ArtCod ;
   private String AV77Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ;
   private String AV40TFLb_ArtCod_Sel ;
   private String AV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ;
   private String AV41TFLb_ArtDsc ;
   private String AV79Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ;
   private String AV42TFLb_ArtDsc_Sel ;
   private String AV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ;
   private String AV47TFLb_ColNom ;
   private String AV81Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ;
   private String AV48TFLb_ColNom_Sel ;
   private String AV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ;
   private String AV49TFLb_ColNomC ;
   private String AV85Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ;
   private String AV50TFLb_ColNomC_Sel ;
   private String AV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ;
   private String AV57TFLb_Tipo ;
   private String AV89Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ;
   private String AV58TFLb_Tipo_Sel ;
   private String scmdbuf ;
   private String lV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ;
   private String lV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ;
   private String lV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ;
   private String lV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ;
   private String lV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ;
   private String lV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ;
   private String lV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ;
   private String AV17Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV74Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ;
   private java.util.Date AV45TFLb_cartazf ;
   private java.util.Date AV75Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ;
   private java.util.Date AV53TFLb_FechaE ;
   private java.util.Date AV26Lb_FechaEfrom ;
   private java.util.Date AV27Lb_FechaEto ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV30OrderedDsc ;
   private String AV34TextFileLine ;
   private String AV13ColumnsSelectorXML ;
   private String AV59UserCustomValue ;
   private String AV19Filename ;
   private String AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ;
   private String AV20FilterFullText ;
   private String lV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ;
   private String AV18ErrorMessage ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private com.genexus.util.GXFile AV33TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P09O82_A5532Lb_numero ;
   private String[] P09O82_A396EmprCod ;
   private byte[] P09O82_A5569Lb_EstEns ;
   private String[] P09O82_A5570Lb_Tipo ;
   private String[] P09O82_A5538Lb_ColNomC ;
   private int[] P09O82_A5537Lb_ColNum ;
   private String[] P09O82_A5536Lb_ColNom ;
   private String[] P09O82_A5534Lb_ArtDsc ;
   private String[] P09O82_A5533Lb_ArtCod ;
   private java.util.Date[] P09O82_A5541Lb_FechaE ;
   private java.util.Date[] P09O82_A5594Lb_cartazf ;
   private String[] P09O82_A5540Lb_Cartaz ;
   private String[] P09O82_A279CliNom ;
   private int[] P09O82_A252CliCod ;
   private short[] P09O83_AV62N_opc ;
   private com.genexus.internet.HttpResponse AV24HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV12ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV61WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class ensayospendientes_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09O82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext ,
                                          int AV68Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod ,
                                          int AV69Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to ,
                                          String AV71Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel ,
                                          String AV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom ,
                                          String AV73Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel ,
                                          String AV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz ,
                                          java.util.Date AV74Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf ,
                                          java.util.Date AV75Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae ,
                                          String AV77Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel ,
                                          String AV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod ,
                                          String AV79Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc ,
                                          String AV81Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom ,
                                          int AV82Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum ,
                                          int AV83Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to ,
                                          String AV85Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel ,
                                          String AV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc ,
                                          int AV86Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero ,
                                          int AV87Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to ,
                                          String AV89Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel ,
                                          String AV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo ,
                                          int AV8Clicod ,
                                          java.util.Date AV26Lb_FechaEfrom ,
                                          java.util.Date AV27Lb_FechaEto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5538Lb_ColNomC ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          short AV29OrderedBy ,
                                          boolean AV30OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          String AV17Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[36];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.EmprCod, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_ColNomC, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_cartazf, T1.Lb_Cartaz," ;
      scmdbuf += " T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientes_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
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
      }
      if ( ! (0==AV68Gestionlaboratorio_ensayospendientes_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Gestionlaboratorio_ensayospendientes_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientes_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientes_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientes_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_ensayospendientes_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Gestionlaboratorio_ensayospendientes_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Gestionlaboratorio_ensayospendientes_wcds_9_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientes_wcds_10_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_ensayospendientes_wcds_11_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientes_wcds_12_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientes_wcds_13_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientes_wcds_14_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientes_wcds_15_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV82Gestionlaboratorio_ensayospendientes_wcds_16_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV83Gestionlaboratorio_ensayospendientes_wcds_17_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_ensayospendientes_wcds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_ensayospendientes_wcds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_ensayospendientes_wcds_20_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV87Gestionlaboratorio_ensayospendientes_wcds_21_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_ensayospendientes_wcds_22_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_ensayospendientes_wcds_23_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV8Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV29OrderedBy == 1 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV29OrderedBy == 1 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( ( AV29OrderedBy == 2 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV29OrderedBy == 2 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV29OrderedBy == 3 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV29OrderedBy == 3 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV29OrderedBy == 4 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV29OrderedBy == 4 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV29OrderedBy == 5 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf" ;
      }
      else if ( ( AV29OrderedBy == 5 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf DESC" ;
      }
      else if ( ( AV29OrderedBy == 6 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV29OrderedBy == 6 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV29OrderedBy == 7 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV29OrderedBy == 7 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV29OrderedBy == 8 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV29OrderedBy == 8 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV29OrderedBy == 9 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV29OrderedBy == 9 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV29OrderedBy == 10 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV29OrderedBy == 10 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV29OrderedBy == 11 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV29OrderedBy == 11 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV29OrderedBy == 12 ) && ! AV30OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      }
      else if ( ( AV29OrderedBy == 12 ) && ( AV30OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo DESC" ;
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
                  return conditional_P09O82(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09O82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O83", "SELECT COUNT(*) FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

