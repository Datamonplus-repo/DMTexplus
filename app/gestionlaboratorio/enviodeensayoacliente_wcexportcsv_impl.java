package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class enviodeensayoacliente_wcexportcsv_impl extends GXWebProcedure
{
   public enviodeensayoacliente_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "EnviodeEnsayoaCliente_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.EnviodeEnsayoaCliente_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.EnviodeEnsayoaCliente_WCColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = AV30FilterFullText ;
      AV111Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero = AV37TFLb_numero ;
      AV112Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to = AV38TFLb_numero_To ;
      AV113Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod = AV104TFCliCod ;
      AV114Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to = AV105TFCliCod_To ;
      AV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = AV81TFLb_ArtCod ;
      AV116Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel = AV82TFLb_ArtCod_Sel ;
      AV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = AV83TFLb_ColNomC ;
      AV118Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel = AV84TFLb_ColNomC_Sel ;
      AV119Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb = AV85TFLb_Rb ;
      AV120Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to = AV86TFLb_Rb_To ;
      AV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = AV41TFLb_opcion ;
      AV122Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel = AV42TFLb_opcion_Sel ;
      AV123Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop = AV55TFLb_numop ;
      AV124Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to = AV56TFLb_numop_To ;
      AV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = AV87TFLb_Cartaz ;
      AV126Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel = AV88TFLb_Cartaz_Sel ;
      AV127Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae = AV89TFLb_FechaE ;
      AV128Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen = AV43TFLb_FechaEn ;
      AV129Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels = AV103TFLb_Estado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV129Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels ,
                                           AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV111Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV112Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV113Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV114Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to) ,
                                           AV116Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel ,
                                           AV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod ,
                                           AV118Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel ,
                                           AV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc ,
                                           AV119Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb ,
                                           AV120Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to ,
                                           AV122Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel ,
                                           AV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion ,
                                           Byte.valueOf(AV123Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop) ,
                                           Byte.valueOf(AV124Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to) ,
                                           AV126Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel ,
                                           AV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz ,
                                           AV127Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae ,
                                           AV128Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen ,
                                           Integer.valueOf(AV129Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels.size()) ,
                                           Integer.valueOf(AV93Clicod) ,
                                           AV94Lb_Cartaz ,
                                           AV95Lb_ColNom ,
                                           Integer.valueOf(AV96Lb_numero) ,
                                           AV97Lb_FechaEfrom ,
                                           AV98Lb_FechaEto ,
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
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Short.valueOf(AV106Carvema) ,
                                           Byte.valueOf(AV101Lb_estado) ,
                                           AV92Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext), "%", "") ;
      lV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod), 16, "%") ;
      lV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc), 13, "%") ;
      lV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = GXutil.padr( GXutil.rtrim( AV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion), 1, "%") ;
      lV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz), 20, "%") ;
      lV94Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV94Lb_Cartaz), 20, "%") ;
      lV95Lb_ColNom = GXutil.padr( GXutil.rtrim( AV95Lb_ColNom), 13, "%") ;
      /* Using cursor P09NQ2 */
      pr_default.execute(0, new Object[] {AV92Emprcod, Short.valueOf(AV106Carvema), Byte.valueOf(AV101Lb_estado), Byte.valueOf(AV101Lb_estado), Byte.valueOf(AV101Lb_estado), lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext, Integer.valueOf(AV111Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero), Integer.valueOf(AV112Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to), Integer.valueOf(AV113Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod), Integer.valueOf(AV114Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to), lV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod, AV116Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel, lV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc, AV118Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel, AV119Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb, AV120Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to, lV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion, AV122Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel, Byte.valueOf(AV123Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop), Byte.valueOf(AV124Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to), lV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz, AV126Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel, AV127Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae, AV128Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen, Integer.valueOf(AV93Clicod), lV94Lb_Cartaz, lV95Lb_ColNom, Integer.valueOf(AV96Lb_numero), AV97Lb_FechaEfrom, AV98Lb_FechaEto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5569Lb_EstEns = P09NQ2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NQ2_A5536Lb_ColNom[0] ;
         A396EmprCod = P09NQ2_A396EmprCod[0] ;
         A5566Lb_Estado = P09NQ2_A5566Lb_Estado[0] ;
         A5567Lb_FechaEn = P09NQ2_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NQ2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NQ2_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09NQ2_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09NQ2_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09NQ2_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09NQ2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NQ2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NQ2_A252CliCod[0] ;
         A5532Lb_numero = P09NQ2_A5532Lb_numero[0] ;
         A5569Lb_EstEns = P09NQ2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NQ2_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09NQ2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NQ2_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09NQ2_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09NQ2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NQ2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NQ2_A252CliCod[0] ;
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
            AV14TextFileLine += GXutil.booltostr( AV91Seleccionar) ;
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
            enviodeensayoacliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5538Lb_ColNomC, ";", ","), GXv_char3) ;
            enviodeensayoacliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            enviodeensayoacliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            enviodeensayoacliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.booltostr( AV100SeleccionarEliminar) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=EnviodeEnsayoaCliente_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&SeleccionarEliminar", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EnviodeEnsayoaCliente_WCColumnsSelector", GXv_char3) ;
      enviodeensayoacliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.EnviodeEnsayoaCliente_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EnviodeEnsayoaCliente_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("GestionLaboratorio.EnviodeEnsayoaCliente_WCGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV130GXV1 = 1 ;
      while ( AV130GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV130GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV37TFLb_numero = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFLb_numero_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV104TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV105TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV81TFLb_ArtCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV82TFLb_ArtCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV83TFLb_ColNomC = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV84TFLb_ColNomC_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV85TFLb_Rb = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV86TFLb_Rb_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV41TFLb_opcion = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV42TFLb_opcion_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV55TFLb_numop = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFLb_numop_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV87TFLb_Cartaz = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV88TFLb_Cartaz_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV89TFLb_FechaE = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV43TFLb_FechaEn = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV102TFLb_Estado_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV103TFLb_Estado_Sels.fromJSonString(AV102TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV92Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV93Clicod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZ") == 0 )
         {
            AV94Lb_Cartaz = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOM") == 0 )
         {
            AV95Lb_ColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV96Lb_numero = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV97Lb_FechaEfrom = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV98Lb_FechaEto = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEN") == 0 )
         {
            AV99Lb_fechaEn = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ESTADO") == 0 )
         {
            AV101Lb_estado = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV130GXV1 = (int)(AV130GXV1+1) ;
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
      AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = "" ;
      AV81TFLb_ArtCod = "" ;
      AV116Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel = "" ;
      AV82TFLb_ArtCod_Sel = "" ;
      AV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = "" ;
      AV83TFLb_ColNomC = "" ;
      AV118Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel = "" ;
      AV84TFLb_ColNomC_Sel = "" ;
      AV119Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb = DecimalUtil.ZERO ;
      AV85TFLb_Rb = DecimalUtil.ZERO ;
      AV120Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to = DecimalUtil.ZERO ;
      AV86TFLb_Rb_To = DecimalUtil.ZERO ;
      AV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = "" ;
      AV41TFLb_opcion = "" ;
      AV122Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel = "" ;
      AV42TFLb_opcion_Sel = "" ;
      AV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = "" ;
      AV87TFLb_Cartaz = "" ;
      AV126Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel = "" ;
      AV88TFLb_Cartaz_Sel = "" ;
      AV127Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae = GXutil.nullDate() ;
      AV89TFLb_FechaE = GXutil.nullDate() ;
      AV128Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen = GXutil.nullDate() ;
      AV43TFLb_FechaEn = GXutil.nullDate() ;
      AV129Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV103TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext = "" ;
      lV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod = "" ;
      lV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc = "" ;
      lV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion = "" ;
      lV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz = "" ;
      lV94Lb_Cartaz = "" ;
      lV95Lb_ColNom = "" ;
      AV94Lb_Cartaz = "" ;
      AV95Lb_ColNom = "" ;
      AV97Lb_FechaEfrom = GXutil.nullDate() ;
      AV98Lb_FechaEto = GXutil.nullDate() ;
      A5536Lb_ColNom = "" ;
      AV92Emprcod = "" ;
      A396EmprCod = "" ;
      P09NQ2_A5569Lb_EstEns = new byte[1] ;
      P09NQ2_A5536Lb_ColNom = new String[] {""} ;
      P09NQ2_A396EmprCod = new String[] {""} ;
      P09NQ2_A5566Lb_Estado = new byte[1] ;
      P09NQ2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NQ2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NQ2_A5540Lb_Cartaz = new String[] {""} ;
      P09NQ2_A5718Lb_numop = new byte[1] ;
      P09NQ2_A5555Lb_opcion = new String[] {""} ;
      P09NQ2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NQ2_A5538Lb_ColNomC = new String[] {""} ;
      P09NQ2_A5533Lb_ArtCod = new String[] {""} ;
      P09NQ2_A252CliCod = new int[1] ;
      P09NQ2_A5532Lb_numero = new int[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV102TFLb_Estado_SelsJson = "" ;
      AV99Lb_fechaEn = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.enviodeensayoacliente_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09NQ2_A5569Lb_EstEns, P09NQ2_A5536Lb_ColNom, P09NQ2_A396EmprCod, P09NQ2_A5566Lb_Estado, P09NQ2_A5567Lb_FechaEn, P09NQ2_A5541Lb_FechaE, P09NQ2_A5540Lb_Cartaz, P09NQ2_A5718Lb_numop, P09NQ2_A5555Lb_opcion, P09NQ2_A5547Lb_Rb,
            P09NQ2_A5538Lb_ColNomC, P09NQ2_A5533Lb_ArtCod, P09NQ2_A252CliCod, P09NQ2_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5718Lb_numop ;
   private byte A5566Lb_Estado ;
   private byte AV123Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop ;
   private byte AV55TFLb_numop ;
   private byte AV124Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to ;
   private byte AV56TFLb_numop_To ;
   private byte A5569Lb_EstEns ;
   private byte AV101Lb_estado ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short AV106Carvema ;
   private short Gx_err ;
   private int AV13Random ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int AV111Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero ;
   private int AV37TFLb_numero ;
   private int AV112Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to ;
   private int AV38TFLb_numero_To ;
   private int AV113Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod ;
   private int AV104TFCliCod ;
   private int AV114Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to ;
   private int AV105TFCliCod_To ;
   private int AV129Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels_size ;
   private int AV93Clicod ;
   private int AV96Lb_numero ;
   private int AV130GXV1 ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV119Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb ;
   private java.math.BigDecimal AV85TFLb_Rb ;
   private java.math.BigDecimal AV120Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to ;
   private java.math.BigDecimal AV86TFLb_Rb_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5555Lb_opcion ;
   private String A5540Lb_Cartaz ;
   private String AV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod ;
   private String AV81TFLb_ArtCod ;
   private String AV116Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel ;
   private String AV82TFLb_ArtCod_Sel ;
   private String AV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc ;
   private String AV83TFLb_ColNomC ;
   private String AV118Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel ;
   private String AV84TFLb_ColNomC_Sel ;
   private String AV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion ;
   private String AV41TFLb_opcion ;
   private String AV122Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel ;
   private String AV42TFLb_opcion_Sel ;
   private String AV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz ;
   private String AV87TFLb_Cartaz ;
   private String AV126Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel ;
   private String AV88TFLb_Cartaz_Sel ;
   private String scmdbuf ;
   private String lV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod ;
   private String lV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc ;
   private String lV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion ;
   private String lV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz ;
   private String lV94Lb_Cartaz ;
   private String lV95Lb_ColNom ;
   private String AV94Lb_Cartaz ;
   private String AV95Lb_ColNom ;
   private String A5536Lb_ColNom ;
   private String AV92Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV127Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae ;
   private java.util.Date AV89TFLb_FechaE ;
   private java.util.Date AV128Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen ;
   private java.util.Date AV43TFLb_FechaEn ;
   private java.util.Date AV97Lb_FechaEfrom ;
   private java.util.Date AV98Lb_FechaEto ;
   private java.util.Date AV99Lb_fechaEn ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean AV91Seleccionar ;
   private boolean AV100SeleccionarEliminar ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV102TFLb_Estado_SelsJson ;
   private String AV11Filename ;
   private String AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV129Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels ;
   private GXSimpleCollection<Byte> AV103TFLb_Estado_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09NQ2_A5569Lb_EstEns ;
   private String[] P09NQ2_A5536Lb_ColNom ;
   private String[] P09NQ2_A396EmprCod ;
   private byte[] P09NQ2_A5566Lb_Estado ;
   private java.util.Date[] P09NQ2_A5567Lb_FechaEn ;
   private java.util.Date[] P09NQ2_A5541Lb_FechaE ;
   private String[] P09NQ2_A5540Lb_Cartaz ;
   private byte[] P09NQ2_A5718Lb_numop ;
   private String[] P09NQ2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09NQ2_A5547Lb_Rb ;
   private String[] P09NQ2_A5538Lb_ColNomC ;
   private String[] P09NQ2_A5533Lb_ArtCod ;
   private int[] P09NQ2_A252CliCod ;
   private int[] P09NQ2_A5532Lb_numero ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class enviodeensayoacliente_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09NQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV129Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels ,
                                          String AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext ,
                                          int AV111Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero ,
                                          int AV112Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to ,
                                          int AV113Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod ,
                                          int AV114Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to ,
                                          String AV116Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel ,
                                          String AV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod ,
                                          String AV118Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel ,
                                          String AV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc ,
                                          java.math.BigDecimal AV119Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb ,
                                          java.math.BigDecimal AV120Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to ,
                                          String AV122Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel ,
                                          String AV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion ,
                                          byte AV123Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop ,
                                          byte AV124Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to ,
                                          String AV126Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel ,
                                          String AV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz ,
                                          java.util.Date AV127Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae ,
                                          java.util.Date AV128Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen ,
                                          int AV129Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels_size ,
                                          int AV93Clicod ,
                                          String AV94Lb_Cartaz ,
                                          String AV95Lb_ColNom ,
                                          int AV96Lb_numero ,
                                          java.util.Date AV97Lb_FechaEfrom ,
                                          java.util.Date AV98Lb_FechaEto ,
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
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          short AV106Carvema ,
                                          byte AV101Lb_estado ,
                                          String AV92Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[38];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.Lb_EstEns, T2.Lb_ColNom, T1.EmprCod, T1.Lb_Estado, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop, T1.Lb_opcion, T2.Lb_Rb, T2.Lb_ColNomC, T2.Lb_ArtCod," ;
      scmdbuf += " T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "(T1.Lb_Estado >= 0 and T1.Lb_Estado <= 1)");
      addWhere(sWhereString, "(( ( ? = 0 and ( ( T1.Lb_Estado = 1 and ? = 1) or ( T1.Lb_Estado = 0 and ? = 0) or ( ? = 2)))))");
      if ( ! (GXutil.strcmp("", AV110Gestionlaboratorio_enviodeensayoacliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_enviodeensayoacliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV112Gestionlaboratorio_enviodeensayoacliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV113Gestionlaboratorio_enviodeensayoacliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV114Gestionlaboratorio_enviodeensayoacliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV115Gestionlaboratorio_enviodeensayoacliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Gestionlaboratorio_enviodeensayoacliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV117Gestionlaboratorio_enviodeensayoacliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_enviodeensayoacliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Gestionlaboratorio_enviodeensayoacliente_wcds_10_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Gestionlaboratorio_enviodeensayoacliente_wcds_11_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_enviodeensayoacliente_wcds_12_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Gestionlaboratorio_enviodeensayoacliente_wcds_13_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV123Gestionlaboratorio_enviodeensayoacliente_wcds_14_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV124Gestionlaboratorio_enviodeensayoacliente_wcds_15_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV125Gestionlaboratorio_enviodeensayoacliente_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Gestionlaboratorio_enviodeensayoacliente_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Gestionlaboratorio_enviodeensayoacliente_wcds_18_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128Gestionlaboratorio_enviodeensayoacliente_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( AV129Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV129Gestionlaboratorio_enviodeensayoacliente_wcds_20_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV93Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV96Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T2.CliCod, T1.Lb_numero, T1.Lb_opcion" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ArtCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNomC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNomC DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Rb" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Rb DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numop" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numop DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_FechaE" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_FechaE DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
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
                  return conditional_P09NQ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09NQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               return;
      }
   }

}

