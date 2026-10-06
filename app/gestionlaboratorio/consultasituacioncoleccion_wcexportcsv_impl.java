package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultasituacioncoleccion_wcexportcsv_impl extends GXWebProcedure
{
   public consultasituacioncoleccion_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultaSituacionColeccion_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº de Ensayo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Opcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Localizacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Envio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( " Recepcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "No aceptacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rb", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Obs", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV30FilterFullText ;
      AV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV34TFCliNom ;
      AV87Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV35TFCliNom_Sel ;
      AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV36TFLb_Cartaz ;
      AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV37TFLb_Cartaz_Sel ;
      AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV38TFLb_ArtCod ;
      AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV39TFLb_ArtCod_Sel ;
      AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV40TFLb_ColNomC ;
      AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV41TFLb_ColNomC_Sel ;
      AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV45TFLb_ColNom ;
      AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV46TFLb_ColNom_Sel ;
      AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV47TFLb_ColNum ;
      AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV48TFLb_ColNum_To ;
      AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV49TFLb_numero ;
      AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV50TFLb_numero_To ;
      AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV69TFLb_Tipo ;
      AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV70TFLb_Tipo_Sel ;
      AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV76TFLb_EstEns_Sels ;
      AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV73TFLb_Local ;
      AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV74TFLb_Local_Sel ;
      AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV80TFLb_FechaE ;
      AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV71TFLb_Rb ;
      AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV72TFLb_Rb_To ;
      AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV78TFLb_obsLb ;
      AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV79TFLb_obsLb_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV87Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV54Clicod) ,
                                           Integer.valueOf(AV56Lb_numero) ,
                                           AV61Lb_cartazffrom ,
                                           AV62Lb_cartazfto ,
                                           AV58Lb_FechaEfrom ,
                                           AV59Lb_FechaEto ,
                                           Integer.valueOf(AV64Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV60Lb_Cartaz ,
                                           AV55Lb_Artcod ,
                                           AV65Lb_ColNomC ,
                                           AV63Lb_ColNom ,
                                           Byte.valueOf(AV66Lb_EstEns) ,
                                           AV68Lb_Tipo ,
                                           AV53Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV60Lb_Cartaz), 20, "%") ;
      lV55Lb_Artcod = GXutil.padr( GXutil.rtrim( AV55Lb_Artcod), 16, "%") ;
      lV65Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV65Lb_ColNomC), 13, "%") ;
      lV63Lb_ColNom = GXutil.padr( GXutil.rtrim( AV63Lb_ColNom), 13, "%") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor P09ON2 */
      pr_default.execute(0, new Object[] {AV53Emprcod, lV60Lb_Cartaz, AV60Lb_Cartaz, lV55Lb_Artcod, AV55Lb_Artcod, lV65Lb_ColNomC, AV65Lb_ColNomC, lV63Lb_ColNom, AV63Lb_ColNom, Byte.valueOf(AV66Lb_EstEns), Byte.valueOf(AV66Lb_EstEns), AV68Lb_Tipo, AV68Lb_Tipo, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV87Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV54Clicod), Integer.valueOf(AV56Lb_numero), AV61Lb_cartazffrom, AV62Lb_cartazfto, AV58Lb_FechaEfrom, AV59Lb_FechaEto, Integer.valueOf(AV64Lb_ColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P09ON2_A5532Lb_numero[0] ;
         A396EmprCod = P09ON2_A396EmprCod[0] ;
         A5594Lb_cartazf = P09ON2_A5594Lb_cartazf[0] ;
         A252CliCod = P09ON2_A252CliCod[0] ;
         A10883Lb_obsLb = P09ON2_A10883Lb_obsLb[0] ;
         A5547Lb_Rb = P09ON2_A5547Lb_Rb[0] ;
         A5541Lb_FechaE = P09ON2_A5541Lb_FechaE[0] ;
         A5701Lb_Local = P09ON2_A5701Lb_Local[0] ;
         A5569Lb_EstEns = P09ON2_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09ON2_A5570Lb_Tipo[0] ;
         A5537Lb_ColNum = P09ON2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09ON2_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09ON2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09ON2_A5533Lb_ArtCod[0] ;
         A5540Lb_Cartaz = P09ON2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09ON2_A279CliNom[0] ;
         A279CliNom = P09ON2_A279CliNom[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            consultasituacioncoleccion_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5540Lb_Cartaz, ";", ","), GXv_char3) ;
            consultasituacioncoleccion_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5533Lb_ArtCod, ";", ","), GXv_char3) ;
            consultasituacioncoleccion_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5538Lb_ColNomC, ";", ","), GXv_char3) ;
            consultasituacioncoleccion_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5536Lb_ColNom, ";", ","), GXv_char3) ;
            consultasituacioncoleccion_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5537Lb_ColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5532Lb_numero, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5570Lb_Tipo, ";", ","), GXv_char3) ;
            consultasituacioncoleccion_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A5569Lb_EstEns == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Pdte. Act. Prod.", "") ;
            }
            else if ( A5569Lb_EstEns == 1 )
            {
               AV14TextFileLine += httpContext.getMessage( "Act. Prod.", "") ;
            }
            else if ( A5569Lb_EstEns == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "Cerrado", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV43Lb_FechaR = GXutil.nullDate() ;
            AV67Lb_opcion = "" ;
            /* Using cursor P09ON3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A5563Lb_FechaR = P09ON3_A5563Lb_FechaR[0] ;
               A5555Lb_opcion = P09ON3_A5555Lb_opcion[0] ;
               if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) )
               {
                  AV43Lb_FechaR = A5563Lb_FechaR ;
                  AV67Lb_opcion = A5555Lb_opcion ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV67Lb_opcion, ";", ","), GXv_char3) ;
            consultasituacioncoleccion_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5701Lb_Local, ";", ","), GXv_char3) ;
            consultasituacioncoleccion_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5541Lb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV42Lb_FechaEn = GXutil.nullDate() ;
            /* Using cursor P09ON4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5567Lb_FechaEn = P09ON4_A5567Lb_FechaEn[0] ;
               A5555Lb_opcion = P09ON4_A5555Lb_opcion[0] ;
               AV42Lb_FechaEn = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) ? A5567Lb_FechaEn : AV42Lb_FechaEn) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( AV42Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV43Lb_FechaR = GXutil.nullDate() ;
            /* Using cursor P09ON5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A5563Lb_FechaR = P09ON5_A5563Lb_FechaR[0] ;
               A5555Lb_opcion = P09ON5_A5555Lb_opcion[0] ;
               AV43Lb_FechaR = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) ? A5563Lb_FechaR : AV43Lb_FechaR) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( AV43Lb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV44Lb_FecNoa1 = GXutil.nullDate() ;
            /* Using cursor P09ON6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A6461Lb_FecNoa1 = P09ON6_A6461Lb_FecNoa1[0] ;
               A5555Lb_opcion = P09ON6_A5555Lb_opcion[0] ;
               AV44Lb_FecNoa1 = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) ? A6461Lb_FecNoa1 : AV44Lb_FecNoa1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( AV44Lb_FecNoa1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5547Lb_Rb, 7, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV77NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10883Lb_obsLb, ";", ","), AV77NewLine, " "), GXv_char3) ;
            consultasituacioncoleccion_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultaSituacionColeccion_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Tipo", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_EstEns", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Lb_opcion", "", "Opcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Local", "", "Localizacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_FechaE", "Fecha", "Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Lb_FechaEn", "Fecha", "Envio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Lb_FechaR", "Fecha", " Recepcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Lb_FecNoa1", "Fecha", "No aceptacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Rb", "", "Rb", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_obsLb", "", "Obs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.ConsultaSituacionColeccion_WCColumnsSelector", GXv_char3) ;
      consultasituacioncoleccion_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.ConsultaSituacionColeccion_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV34TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV35TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV36TFLb_Cartaz = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV37TFLb_Cartaz_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV38TFLb_ArtCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV39TFLb_ArtCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV40TFLb_ColNomC = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV41TFLb_ColNomC_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV45TFLb_ColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV46TFLb_ColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV47TFLb_ColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFLb_ColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV49TFLb_numero = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFLb_numero_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV69TFLb_Tipo = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV70TFLb_Tipo_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTENS_SEL") == 0 )
         {
            AV75TFLb_EstEns_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV76TFLb_EstEns_Sels.fromJSonString(AV75TFLb_EstEns_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LOCAL") == 0 )
         {
            AV73TFLb_Local = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LOCAL_SEL") == 0 )
         {
            AV74TFLb_Local_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV80TFLb_FechaE = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV71TFLb_Rb = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV72TFLb_Rb_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSLB") == 0 )
         {
            AV78TFLb_obsLb = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSLB_SEL") == 0 )
         {
            AV79TFLb_obsLb_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV53Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV54Clicod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ARTCOD") == 0 )
         {
            AV55Lb_Artcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV56Lb_numero = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ESTENS") == 0 )
         {
            AV66Lb_EstEns = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV58Lb_FechaEfrom = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV59Lb_FechaEto = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZ") == 0 )
         {
            AV60Lb_Cartaz = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZFFROM") == 0 )
         {
            AV61Lb_cartazffrom = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZFTO") == 0 )
         {
            AV62Lb_cartazfto = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOM") == 0 )
         {
            AV63Lb_ColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNUM") == 0 )
         {
            AV64Lb_ColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOMC") == 0 )
         {
            AV65Lb_ColNomC = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_TIPO") == 0 )
         {
            AV68Lb_Tipo = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV114GXV1 = (int)(AV114GXV1+1) ;
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
      A5540Lb_Cartaz = "" ;
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5570Lb_Tipo = "" ;
      A5701Lb_Local = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A10883Lb_obsLb = "" ;
      AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = "" ;
      AV34TFCliNom = "" ;
      AV87Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = "" ;
      AV35TFCliNom_Sel = "" ;
      AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = "" ;
      AV36TFLb_Cartaz = "" ;
      AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = "" ;
      AV37TFLb_Cartaz_Sel = "" ;
      AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = "" ;
      AV38TFLb_ArtCod = "" ;
      AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = "" ;
      AV39TFLb_ArtCod_Sel = "" ;
      AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = "" ;
      AV40TFLb_ColNomC = "" ;
      AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = "" ;
      AV41TFLb_ColNomC_Sel = "" ;
      AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = "" ;
      AV45TFLb_ColNom = "" ;
      AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = "" ;
      AV46TFLb_ColNom_Sel = "" ;
      AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = "" ;
      AV69TFLb_Tipo = "" ;
      AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = "" ;
      AV70TFLb_Tipo_Sel = "" ;
      AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV76TFLb_EstEns_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = "" ;
      AV73TFLb_Local = "" ;
      AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = "" ;
      AV74TFLb_Local_Sel = "" ;
      AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = GXutil.nullDate() ;
      AV80TFLb_FechaE = GXutil.nullDate() ;
      AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = DecimalUtil.ZERO ;
      AV71TFLb_Rb = DecimalUtil.ZERO ;
      AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = DecimalUtil.ZERO ;
      AV72TFLb_Rb_To = DecimalUtil.ZERO ;
      AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = "" ;
      AV78TFLb_obsLb = "" ;
      AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = "" ;
      AV79TFLb_obsLb_Sel = "" ;
      lV60Lb_Cartaz = "" ;
      lV55Lb_Artcod = "" ;
      lV65Lb_ColNomC = "" ;
      lV63Lb_ColNom = "" ;
      scmdbuf = "" ;
      lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = "" ;
      lV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = "" ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = "" ;
      lV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = "" ;
      lV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = "" ;
      lV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = "" ;
      lV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = "" ;
      lV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = "" ;
      lV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = "" ;
      AV61Lb_cartazffrom = GXutil.nullDate() ;
      AV62Lb_cartazfto = GXutil.nullDate() ;
      AV58Lb_FechaEfrom = GXutil.nullDate() ;
      AV59Lb_FechaEto = GXutil.nullDate() ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      AV60Lb_Cartaz = "" ;
      AV55Lb_Artcod = "" ;
      AV65Lb_ColNomC = "" ;
      AV63Lb_ColNom = "" ;
      AV68Lb_Tipo = "" ;
      AV53Emprcod = "" ;
      A396EmprCod = "" ;
      P09ON2_A5532Lb_numero = new int[1] ;
      P09ON2_A396EmprCod = new String[] {""} ;
      P09ON2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09ON2_A252CliCod = new int[1] ;
      P09ON2_A10883Lb_obsLb = new String[] {""} ;
      P09ON2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ON2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09ON2_A5701Lb_Local = new String[] {""} ;
      P09ON2_A5569Lb_EstEns = new byte[1] ;
      P09ON2_A5570Lb_Tipo = new String[] {""} ;
      P09ON2_A5537Lb_ColNum = new int[1] ;
      P09ON2_A5536Lb_ColNom = new String[] {""} ;
      P09ON2_A5538Lb_ColNomC = new String[] {""} ;
      P09ON2_A5533Lb_ArtCod = new String[] {""} ;
      P09ON2_A5540Lb_Cartaz = new String[] {""} ;
      P09ON2_A279CliNom = new String[] {""} ;
      AV43Lb_FechaR = GXutil.nullDate() ;
      AV67Lb_opcion = "" ;
      P09ON3_A396EmprCod = new String[] {""} ;
      P09ON3_A5532Lb_numero = new int[1] ;
      P09ON3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09ON3_A5555Lb_opcion = new String[] {""} ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      AV42Lb_FechaEn = GXutil.nullDate() ;
      P09ON4_A396EmprCod = new String[] {""} ;
      P09ON4_A5532Lb_numero = new int[1] ;
      P09ON4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09ON4_A5555Lb_opcion = new String[] {""} ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      P09ON5_A396EmprCod = new String[] {""} ;
      P09ON5_A5532Lb_numero = new int[1] ;
      P09ON5_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09ON5_A5555Lb_opcion = new String[] {""} ;
      AV44Lb_FecNoa1 = GXutil.nullDate() ;
      P09ON6_A396EmprCod = new String[] {""} ;
      P09ON6_A5532Lb_numero = new int[1] ;
      P09ON6_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09ON6_A5555Lb_opcion = new String[] {""} ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      AV77NewLine = "" ;
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
      AV75TFLb_EstEns_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.consultasituacioncoleccion_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09ON2_A5532Lb_numero, P09ON2_A396EmprCod, P09ON2_A5594Lb_cartazf, P09ON2_A252CliCod, P09ON2_A10883Lb_obsLb, P09ON2_A5547Lb_Rb, P09ON2_A5541Lb_FechaE, P09ON2_A5701Lb_Local, P09ON2_A5569Lb_EstEns, P09ON2_A5570Lb_Tipo,
            P09ON2_A5537Lb_ColNum, P09ON2_A5536Lb_ColNom, P09ON2_A5538Lb_ColNomC, P09ON2_A5533Lb_ArtCod, P09ON2_A5540Lb_Cartaz, P09ON2_A279CliNom
            }
            , new Object[] {
            P09ON3_A396EmprCod, P09ON3_A5532Lb_numero, P09ON3_A5563Lb_FechaR, P09ON3_A5555Lb_opcion
            }
            , new Object[] {
            P09ON4_A396EmprCod, P09ON4_A5532Lb_numero, P09ON4_A5567Lb_FechaEn, P09ON4_A5555Lb_opcion
            }
            , new Object[] {
            P09ON5_A396EmprCod, P09ON5_A5532Lb_numero, P09ON5_A5563Lb_FechaR, P09ON5_A5555Lb_opcion
            }
            , new Object[] {
            P09ON6_A396EmprCod, P09ON6_A5532Lb_numero, P09ON6_A6461Lb_FecNoa1, P09ON6_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5569Lb_EstEns ;
   private byte AV66Lb_EstEns ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private int AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ;
   private int AV47TFLb_ColNum ;
   private int AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ;
   private int AV48TFLb_ColNum_To ;
   private int AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ;
   private int AV49TFLb_numero ;
   private int AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ;
   private int AV50TFLb_numero_To ;
   private int AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ;
   private int AV54Clicod ;
   private int AV56Lb_numero ;
   private int AV64Lb_ColNum ;
   private int A252CliCod ;
   private int AV114GXV1 ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ;
   private java.math.BigDecimal AV71TFLb_Rb ;
   private java.math.BigDecimal AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ;
   private java.math.BigDecimal AV72TFLb_Rb_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A5570Lb_Tipo ;
   private String A5701Lb_Local ;
   private String AV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ;
   private String AV34TFCliNom ;
   private String AV87Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ;
   private String AV35TFCliNom_Sel ;
   private String AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ;
   private String AV36TFLb_Cartaz ;
   private String AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ;
   private String AV37TFLb_Cartaz_Sel ;
   private String AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ;
   private String AV38TFLb_ArtCod ;
   private String AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ;
   private String AV39TFLb_ArtCod_Sel ;
   private String AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ;
   private String AV40TFLb_ColNomC ;
   private String AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ;
   private String AV41TFLb_ColNomC_Sel ;
   private String AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ;
   private String AV45TFLb_ColNom ;
   private String AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ;
   private String AV46TFLb_ColNom_Sel ;
   private String AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ;
   private String AV69TFLb_Tipo ;
   private String AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ;
   private String AV70TFLb_Tipo_Sel ;
   private String AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ;
   private String AV73TFLb_Local ;
   private String AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ;
   private String AV74TFLb_Local_Sel ;
   private String lV60Lb_Cartaz ;
   private String lV55Lb_Artcod ;
   private String lV65Lb_ColNomC ;
   private String lV63Lb_ColNom ;
   private String scmdbuf ;
   private String lV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ;
   private String lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ;
   private String lV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ;
   private String lV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ;
   private String lV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ;
   private String lV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ;
   private String lV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ;
   private String AV60Lb_Cartaz ;
   private String AV55Lb_Artcod ;
   private String AV65Lb_ColNomC ;
   private String AV63Lb_ColNom ;
   private String AV68Lb_Tipo ;
   private String AV53Emprcod ;
   private String A396EmprCod ;
   private String AV67Lb_opcion ;
   private String A5555Lb_opcion ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ;
   private java.util.Date AV80TFLb_FechaE ;
   private java.util.Date AV61Lb_cartazffrom ;
   private java.util.Date AV62Lb_cartazfto ;
   private java.util.Date AV58Lb_FechaEfrom ;
   private java.util.Date AV59Lb_FechaEto ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date AV43Lb_FechaR ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date AV42Lb_FechaEn ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV44Lb_FecNoa1 ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV75TFLb_EstEns_SelsJson ;
   private String AV11Filename ;
   private String A10883Lb_obsLb ;
   private String AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ;
   private String AV78TFLb_obsLb ;
   private String AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ;
   private String AV79TFLb_obsLb_Sel ;
   private String lV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ;
   private String lV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ;
   private String AV77NewLine ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ;
   private GXSimpleCollection<Byte> AV76TFLb_EstEns_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P09ON2_A5532Lb_numero ;
   private String[] P09ON2_A396EmprCod ;
   private java.util.Date[] P09ON2_A5594Lb_cartazf ;
   private int[] P09ON2_A252CliCod ;
   private String[] P09ON2_A10883Lb_obsLb ;
   private java.math.BigDecimal[] P09ON2_A5547Lb_Rb ;
   private java.util.Date[] P09ON2_A5541Lb_FechaE ;
   private String[] P09ON2_A5701Lb_Local ;
   private byte[] P09ON2_A5569Lb_EstEns ;
   private String[] P09ON2_A5570Lb_Tipo ;
   private int[] P09ON2_A5537Lb_ColNum ;
   private String[] P09ON2_A5536Lb_ColNom ;
   private String[] P09ON2_A5538Lb_ColNomC ;
   private String[] P09ON2_A5533Lb_ArtCod ;
   private String[] P09ON2_A5540Lb_Cartaz ;
   private String[] P09ON2_A279CliNom ;
   private String[] P09ON3_A396EmprCod ;
   private int[] P09ON3_A5532Lb_numero ;
   private java.util.Date[] P09ON3_A5563Lb_FechaR ;
   private String[] P09ON3_A5555Lb_opcion ;
   private String[] P09ON4_A396EmprCod ;
   private int[] P09ON4_A5532Lb_numero ;
   private java.util.Date[] P09ON4_A5567Lb_FechaEn ;
   private String[] P09ON4_A5555Lb_opcion ;
   private String[] P09ON5_A396EmprCod ;
   private int[] P09ON5_A5532Lb_numero ;
   private java.util.Date[] P09ON5_A5563Lb_FechaR ;
   private String[] P09ON5_A5555Lb_opcion ;
   private String[] P09ON6_A396EmprCod ;
   private int[] P09ON6_A5532Lb_numero ;
   private java.util.Date[] P09ON6_A6461Lb_FecNoa1 ;
   private String[] P09ON6_A5555Lb_opcion ;
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

final  class consultasituacioncoleccion_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09ON2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV87Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV54Clicod ,
                                          int AV56Lb_numero ,
                                          java.util.Date AV61Lb_cartazffrom ,
                                          java.util.Date AV62Lb_cartazfto ,
                                          java.util.Date AV58Lb_FechaEfrom ,
                                          java.util.Date AV59Lb_FechaEto ,
                                          int AV64Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV60Lb_Cartaz ,
                                          String AV55Lb_Artcod ,
                                          String AV65Lb_ColNomC ,
                                          String AV63Lb_ColNom ,
                                          byte AV66Lb_EstEns ,
                                          String AV68Lb_Tipo ,
                                          String AV53Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[55];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.EmprCod, T1.Lb_cartazf, T1.CliCod, T1.Lb_obsLb, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_Local, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_ColNum, T1.Lb_ColNom," ;
      scmdbuf += " T1.Lb_ColNomC, T1.Lb_ArtCod, T1.Lb_Cartaz, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      if ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
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
         GXv_int6[22] = (byte)(1) ;
         GXv_int6[23] = (byte)(1) ;
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (0==AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (0==AV54Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV56Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (0==AV64Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( AV28OrderedBy == 2 )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_EstEns" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_EstEns DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Local" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Local DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Rb" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Rb DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_obsLb" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_obsLb DESC" ;
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
                  return conditional_P09ON2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ON2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ON3", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ON4", "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ON5", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ON6", "SELECT EmprCod, Lb_numero, Lb_FecNoa1, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 16);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

