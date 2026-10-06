package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impresionlabdipenviados_y_o_aceptados_wcexportcsv_impl extends GXWebProcedure
{
   public impresionlabdipenviados_y_o_aceptados_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ImpresionLabDipEnviados_y_o_Aceptados_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº de Ensayo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rb", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Opcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Envio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = AV39FilterFullText ;
      AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero = AV45TFLb_numero ;
      AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to = AV46TFLb_numero_To ;
      AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod = AV47TFCliCod ;
      AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to = AV48TFCliCod_To ;
      AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = AV49TFLb_ArtCod ;
      AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel = AV50TFLb_ArtCod_Sel ;
      AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = AV51TFLb_ColNomC ;
      AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel = AV52TFLb_ColNomC_Sel ;
      AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb = AV53TFLb_Rb ;
      AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to = AV54TFLb_Rb_To ;
      AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = AV55TFLb_opcion ;
      AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel = AV56TFLb_opcion_Sel ;
      AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop = AV57TFLb_numop ;
      AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to = AV58TFLb_numop_To ;
      AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = AV59TFLb_Cartaz ;
      AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel = AV60TFLb_Cartaz_Sel ;
      AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae = AV61TFLb_FechaE ;
      AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen = AV63TFLb_FechaEn ;
      AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels = AV66TFLb_Estado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                           AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) ,
                                           AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                           AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                           AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                           AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                           AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                           AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                           AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                           AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                           Byte.valueOf(AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) ,
                                           Byte.valueOf(AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) ,
                                           AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                           AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                           AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                           AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                           Integer.valueOf(AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels.size()) ,
                                           Integer.valueOf(AV29Clicod) ,
                                           AV30Lb_Cartaz ,
                                           AV31Lb_ColNom ,
                                           Integer.valueOf(AV32Lb_numero) ,
                                           AV33Lb_FechaEfrom ,
                                           AV34Lb_FechaEto ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5536Lb_ColNom ,
                                           Short.valueOf(AV37OrderedBy) ,
                                           Boolean.valueOf(AV38OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV28Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod), 16, "%") ;
      lV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc), 13, "%") ;
      lV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = GXutil.padr( GXutil.rtrim( AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion), 1, "%") ;
      lV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz), 20, "%") ;
      lV30Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV30Lb_Cartaz), 20, "%") ;
      lV31Lb_ColNom = GXutil.padr( GXutil.rtrim( AV31Lb_ColNom), 13, "%") ;
      /* Using cursor P09UO2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, Integer.valueOf(AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero), Integer.valueOf(AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to), Integer.valueOf(AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod), Integer.valueOf(AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to), lV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod, AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel, lV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc, AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel, AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb, AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to, lV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion, AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel, Byte.valueOf(AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop), Byte.valueOf(AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to), lV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz, AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel, AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae, AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen, Integer.valueOf(AV29Clicod), lV30Lb_Cartaz, lV31Lb_ColNom, Integer.valueOf(AV32Lb_numero), AV33Lb_FechaEfrom, AV34Lb_FechaEto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5569Lb_EstEns = P09UO2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UO2_A5536Lb_ColNom[0] ;
         A396EmprCod = P09UO2_A396EmprCod[0] ;
         A5566Lb_Estado = P09UO2_A5566Lb_Estado[0] ;
         A5567Lb_FechaEn = P09UO2_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09UO2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09UO2_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09UO2_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09UO2_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09UO2_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09UO2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09UO2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09UO2_A252CliCod[0] ;
         A5532Lb_numero = P09UO2_A5532Lb_numero[0] ;
         A5569Lb_EstEns = P09UO2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UO2_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09UO2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09UO2_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09UO2_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09UO2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09UO2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09UO2_A252CliCod[0] ;
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
            AV14TextFileLine += GXutil.booltostr( AV40Seleccionar) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5532Lb_numero, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5533Lb_ArtCod, ";", ","), GXv_char3) ;
            impresionlabdipenviados_y_o_aceptados_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5538Lb_ColNomC, ";", ","), GXv_char3) ;
            impresionlabdipenviados_y_o_aceptados_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5547Lb_Rb, 7, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5555Lb_opcion, ";", ","), GXv_char3) ;
            impresionlabdipenviados_y_o_aceptados_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5718Lb_numop, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5540Lb_Cartaz, ";", ","), GXv_char3) ;
            impresionlabdipenviados_y_o_aceptados_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5541Lb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5567Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A5566Lb_Estado == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "NO Enviado", "") ;
            }
            else if ( A5566Lb_Estado == 1 )
            {
               AV14TextFileLine += httpContext.getMessage( "Enviado", "") ;
            }
            else if ( A5566Lb_Estado == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "Recepcionado", "") ;
            }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ImpresionLabDipEnviados_y_o_Aceptados_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Seleccionar", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Rb", "", "Rb", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_opcion", "", "Opcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_numop", "", "Nº", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_FechaE", "", "Fecha Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_FechaEn", "", "Fecha Envio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Estado", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCColumnsSelector", GXv_char3) ;
      impresionlabdipenviados_y_o_aceptados_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV19Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCGridState"), null, null);
      }
      AV37OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV38OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV92GXV1 = 1 ;
      while ( AV92GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV39FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV45TFLb_numero = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFLb_numero_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV47TFCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFCliCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV49TFLb_ArtCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV50TFLb_ArtCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV51TFLb_ColNomC = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV52TFLb_ColNomC_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV53TFLb_Rb = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFLb_Rb_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV55TFLb_opcion = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV56TFLb_opcion_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV57TFLb_numop = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFLb_numop_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV59TFLb_Cartaz = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV60TFLb_Cartaz_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV61TFLb_FechaE = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV63TFLb_FechaEn = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV65TFLb_Estado_SelsJson = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV66TFLb_Estado_Sels.fromJSonString(AV65TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV29Clicod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZ") == 0 )
         {
            AV30Lb_Cartaz = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOM") == 0 )
         {
            AV31Lb_ColNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV32Lb_numero = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV33Lb_FechaEfrom = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV34Lb_FechaEto = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEN") == 0 )
         {
            AV35Lb_fechaEn = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ESTADO") == 0 )
         {
            AV36Lb_estado = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      A5540Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = "" ;
      AV39FilterFullText = "" ;
      AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = "" ;
      AV49TFLb_ArtCod = "" ;
      AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel = "" ;
      AV50TFLb_ArtCod_Sel = "" ;
      AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = "" ;
      AV51TFLb_ColNomC = "" ;
      AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel = "" ;
      AV52TFLb_ColNomC_Sel = "" ;
      AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb = DecimalUtil.ZERO ;
      AV53TFLb_Rb = DecimalUtil.ZERO ;
      AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to = DecimalUtil.ZERO ;
      AV54TFLb_Rb_To = DecimalUtil.ZERO ;
      AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = "" ;
      AV55TFLb_opcion = "" ;
      AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel = "" ;
      AV56TFLb_opcion_Sel = "" ;
      AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = "" ;
      AV59TFLb_Cartaz = "" ;
      AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel = "" ;
      AV60TFLb_Cartaz_Sel = "" ;
      AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae = GXutil.nullDate() ;
      AV61TFLb_FechaE = GXutil.nullDate() ;
      AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen = GXutil.nullDate() ;
      AV63TFLb_FechaEn = GXutil.nullDate() ;
      AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV66TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = "" ;
      lV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = "" ;
      lV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = "" ;
      lV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = "" ;
      lV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = "" ;
      lV30Lb_Cartaz = "" ;
      lV31Lb_ColNom = "" ;
      AV30Lb_Cartaz = "" ;
      AV31Lb_ColNom = "" ;
      AV33Lb_FechaEfrom = GXutil.nullDate() ;
      AV34Lb_FechaEto = GXutil.nullDate() ;
      A5536Lb_ColNom = "" ;
      AV28Emprcod = "" ;
      A396EmprCod = "" ;
      P09UO2_A5569Lb_EstEns = new byte[1] ;
      P09UO2_A5536Lb_ColNom = new String[] {""} ;
      P09UO2_A396EmprCod = new String[] {""} ;
      P09UO2_A5566Lb_Estado = new byte[1] ;
      P09UO2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09UO2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09UO2_A5540Lb_Cartaz = new String[] {""} ;
      P09UO2_A5718Lb_numop = new byte[1] ;
      P09UO2_A5555Lb_opcion = new String[] {""} ;
      P09UO2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UO2_A5538Lb_ColNomC = new String[] {""} ;
      P09UO2_A5533Lb_ArtCod = new String[] {""} ;
      P09UO2_A252CliCod = new int[1] ;
      P09UO2_A5532Lb_numero = new int[1] ;
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
      AV65TFLb_Estado_SelsJson = "" ;
      AV35Lb_fechaEn = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09UO2_A5569Lb_EstEns, P09UO2_A5536Lb_ColNom, P09UO2_A396EmprCod, P09UO2_A5566Lb_Estado, P09UO2_A5567Lb_FechaEn, P09UO2_A5541Lb_FechaE, P09UO2_A5540Lb_Cartaz, P09UO2_A5718Lb_numop, P09UO2_A5555Lb_opcion, P09UO2_A5547Lb_Rb,
            P09UO2_A5538Lb_ColNomC, P09UO2_A5533Lb_ArtCod, P09UO2_A252CliCod, P09UO2_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5718Lb_numop ;
   private byte A5566Lb_Estado ;
   private byte AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop ;
   private byte AV57TFLb_numop ;
   private byte AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to ;
   private byte AV58TFLb_numop_To ;
   private byte A5569Lb_EstEns ;
   private byte AV36Lb_estado ;
   private short gxcookieaux ;
   private short AV37OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero ;
   private int AV45TFLb_numero ;
   private int AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to ;
   private int AV46TFLb_numero_To ;
   private int AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod ;
   private int AV47TFCliCod ;
   private int AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to ;
   private int AV48TFCliCod_To ;
   private int AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size ;
   private int AV29Clicod ;
   private int AV32Lb_numero ;
   private int AV92GXV1 ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ;
   private java.math.BigDecimal AV53TFLb_Rb ;
   private java.math.BigDecimal AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ;
   private java.math.BigDecimal AV54TFLb_Rb_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5555Lb_opcion ;
   private String A5540Lb_Cartaz ;
   private String AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ;
   private String AV49TFLb_ArtCod ;
   private String AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ;
   private String AV50TFLb_ArtCod_Sel ;
   private String AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ;
   private String AV51TFLb_ColNomC ;
   private String AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ;
   private String AV52TFLb_ColNomC_Sel ;
   private String AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ;
   private String AV55TFLb_opcion ;
   private String AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ;
   private String AV56TFLb_opcion_Sel ;
   private String AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ;
   private String AV59TFLb_Cartaz ;
   private String AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ;
   private String AV60TFLb_Cartaz_Sel ;
   private String scmdbuf ;
   private String lV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ;
   private String lV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ;
   private String lV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ;
   private String lV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ;
   private String lV30Lb_Cartaz ;
   private String lV31Lb_ColNom ;
   private String AV30Lb_Cartaz ;
   private String AV31Lb_ColNom ;
   private String A5536Lb_ColNom ;
   private String AV28Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ;
   private java.util.Date AV61TFLb_FechaE ;
   private java.util.Date AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ;
   private java.util.Date AV63TFLb_FechaEn ;
   private java.util.Date AV33Lb_FechaEfrom ;
   private java.util.Date AV34Lb_FechaEto ;
   private java.util.Date AV35Lb_fechaEn ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV38OrderedDsc ;
   private boolean AV40Seleccionar ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV65TFLb_Estado_SelsJson ;
   private String AV11Filename ;
   private String AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ;
   private String AV39FilterFullText ;
   private String lV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ;
   private GXSimpleCollection<Byte> AV66TFLb_Estado_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09UO2_A5569Lb_EstEns ;
   private String[] P09UO2_A5536Lb_ColNom ;
   private String[] P09UO2_A396EmprCod ;
   private byte[] P09UO2_A5566Lb_Estado ;
   private java.util.Date[] P09UO2_A5567Lb_FechaEn ;
   private java.util.Date[] P09UO2_A5541Lb_FechaE ;
   private String[] P09UO2_A5540Lb_Cartaz ;
   private byte[] P09UO2_A5718Lb_numop ;
   private String[] P09UO2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09UO2_A5547Lb_Rb ;
   private String[] P09UO2_A5538Lb_ColNomC ;
   private String[] P09UO2_A5533Lb_ArtCod ;
   private int[] P09UO2_A252CliCod ;
   private int[] P09UO2_A5532Lb_numero ;
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

final  class impresionlabdipenviados_y_o_aceptados_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                          String AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                          int AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero ,
                                          int AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to ,
                                          int AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod ,
                                          int AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to ,
                                          String AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                          String AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                          String AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                          String AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                          java.math.BigDecimal AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                          java.math.BigDecimal AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                          String AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                          String AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                          byte AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop ,
                                          byte AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to ,
                                          String AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                          String AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                          java.util.Date AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                          java.util.Date AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                          int AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size ,
                                          int AV29Clicod ,
                                          String AV30Lb_Cartaz ,
                                          String AV31Lb_ColNom ,
                                          int AV32Lb_numero ,
                                          java.util.Date AV33Lb_FechaEfrom ,
                                          java.util.Date AV34Lb_FechaEto ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A5536Lb_ColNom ,
                                          short AV37OrderedBy ,
                                          boolean AV38OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          String AV28Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[34];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.Lb_EstEns, T2.Lb_ColNom, T1.EmprCod, T1.Lb_Estado, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop, T1.Lb_opcion, T2.Lb_Rb, T2.Lb_ColNomC, T2.Lb_ArtCod," ;
      scmdbuf += " T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "(T1.Lb_Estado <= 2)");
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
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
      }
      if ( ! (0==AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV29Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV32Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV37OrderedBy == 1 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV37OrderedBy == 1 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ArtCod" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ArtCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNomC" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNomC DESC" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Rb" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Rb DESC" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numop" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numop DESC" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_FechaE" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_FechaE DESC" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ! AV38OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ( AV38OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado DESC" ;
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
                  return conditional_P09UO2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               return;
      }
   }

}

