package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aprobacioninternaensayo_wcexportcsv_impl extends GXWebProcedure
{
   public aprobacioninternaensayo_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "AprobacionInternaEnsayo_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Op", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº de Ensayo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Opcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Cole.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Env.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Recep.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Observaciones", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Procesos?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV30FilterFullText ;
      AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV61TFLb_numero ;
      AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV62TFLb_numero_To ;
      AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV35TFLb_opcion ;
      AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV36TFLb_opcion_Sel ;
      AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV37TFLb_ColNom ;
      AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV38TFLb_ColNom_Sel ;
      AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV39TFLb_ColNum ;
      AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV40TFLb_ColNum_To ;
      AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV41TFLb_TipRec ;
      AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV42TFLb_TipRec_To ;
      AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV43TFCliCod ;
      AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV44TFCliCod_To ;
      AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV45TFCliNom ;
      AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV46TFCliNom_Sel ;
      AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV47TFLb_Cartaz ;
      AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV48TFLb_Cartaz_Sel ;
      AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV49TFLb_cartazf ;
      AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV51TFLb_FechaEn ;
      AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV53TFLb_FechaR ;
      AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV68TFLb_Estado_Sels ;
      AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV57TFLb_ObsCR ;
      AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV58TFLb_ObsCR_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                           AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) ,
                                           AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                           AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                           AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                           AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) ,
                                           Byte.valueOf(AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) ,
                                           Byte.valueOf(AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) ,
                                           Integer.valueOf(AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) ,
                                           Integer.valueOf(AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) ,
                                           AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                           AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                           AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                           AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                           AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                           AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                           AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                           Integer.valueOf(AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels.size()) ,
                                           AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                           AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A5597Lb_TipRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV63Emprcod ,
                                           Integer.valueOf(AV64Lb_Numero) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING
                                           }
      });
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom), 30, "%") ;
      lV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz), 20, "%") ;
      lV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = GXutil.concat( GXutil.rtrim( AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr), "%", "") ;
      /* Using cursor P09OB2 */
      pr_default.execute(0, new Object[] {AV63Emprcod, Integer.valueOf(AV64Lb_Numero), lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, Integer.valueOf(AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero), Integer.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to), lV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion, AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel, lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom, AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum), Integer.valueOf(AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to), Byte.valueOf(AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec), Byte.valueOf(AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to), Integer.valueOf(AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod), Integer.valueOf(AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to), lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom, AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel, lV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz, AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel, AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf, AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen, AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar, lV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr, AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P09OB2_A5532Lb_numero[0] ;
         A396EmprCod = P09OB2_A396EmprCod[0] ;
         A10822Lb_ObsCR = P09OB2_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09OB2_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09OB2_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OB2_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OB2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OB2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OB2_A279CliNom[0] ;
         A252CliCod = P09OB2_A252CliCod[0] ;
         A5597Lb_TipRec = P09OB2_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OB2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OB2_A5536Lb_ColNom[0] ;
         A5555Lb_opcion = P09OB2_A5555Lb_opcion[0] ;
         A5594Lb_cartazf = P09OB2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OB2_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OB2_A252CliCod[0] ;
         A5597Lb_TipRec = P09OB2_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OB2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OB2_A5536Lb_ColNom[0] ;
         A279CliNom = P09OB2_A279CliNom[0] ;
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
            AV14TextFileLine += GXutil.booltostr( AV59Seleccionar) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5532Lb_numero, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5555Lb_opcion, ";", ","), GXv_char3) ;
            aprobacioninternaensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5536Lb_ColNom, ";", ","), GXv_char3) ;
            aprobacioninternaensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5537Lb_ColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5597Lb_TipRec, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            aprobacioninternaensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5540Lb_Cartaz, ";", ","), GXv_char3) ;
            aprobacioninternaensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5594Lb_cartazf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5567Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5563Lb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A5566Lb_Estado == 3 )
            {
               AV14TextFileLine += httpContext.getMessage( "Aprob. INterna", "") ;
            }
            else if ( A5566Lb_Estado == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "Recepcionado", "") ;
            }
            else if ( A5566Lb_Estado == 1 )
            {
               AV14TextFileLine += httpContext.getMessage( "Enviado", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV31NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10822Lb_ObsCR, ";", ","), AV31NewLine, " "), GXv_char3) ;
            aprobacioninternaensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.booltostr( AV60SeleccionarEliminar) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV66HayProcesos = "N" ;
            /* Using cursor P09OB3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A5551Lb_lineaPq = P09OB3_A5551Lb_lineaPq[0] ;
               AV66HayProcesos = "S" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV66HayProcesos, ";", ","), GXv_char3) ;
            aprobacioninternaensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=AprobacionInternaEnsayo_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Seleccionar", "", "Op", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_opcion", "", "Opcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_TipRec", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_cartazf", "", "Fecha Cole.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_FechaEn", "", "Fecha Env.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_FechaR", "", "Fecha Recep.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Estado", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ObsCR", "", "Observaciones", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&SeleccionarEliminar", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HayProcesos", "", "Procesos?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.AprobacionInternaEnsayo_WCColumnsSelector", GXv_char3) ;
      aprobacioninternaensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.AprobacionInternaEnsayo_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV96GXV1 = 1 ;
      while ( AV96GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV96GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV61TFLb_numero = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFLb_numero_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV35TFLb_opcion = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV36TFLb_opcion_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV37TFLb_ColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV38TFLb_ColNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV39TFLb_ColNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFLb_ColNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPREC") == 0 )
         {
            AV41TFLb_TipRec = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFLb_TipRec_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV43TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV45TFCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV46TFCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV47TFLb_Cartaz = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV48TFLb_Cartaz_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV49TFLb_cartazf = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV51TFLb_FechaEn = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV53TFLb_FechaR = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV67TFLb_Estado_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV68TFLb_Estado_Sels.fromJSonString(AV67TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR") == 0 )
         {
            AV57TFLb_ObsCR = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR_SEL") == 0 )
         {
            AV58TFLb_ObsCR_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV63Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV64Lb_Numero = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAR") == 0 )
         {
            AV65Lb_fechaR = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV96GXV1 = (int)(AV96GXV1+1) ;
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
      A5555Lb_opcion = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A10822Lb_ObsCR = "" ;
      AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = "" ;
      AV35TFLb_opcion = "" ;
      AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = "" ;
      AV36TFLb_opcion_Sel = "" ;
      AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = "" ;
      AV37TFLb_ColNom = "" ;
      AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = "" ;
      AV38TFLb_ColNom_Sel = "" ;
      AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = "" ;
      AV45TFCliNom = "" ;
      AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = "" ;
      AV46TFCliNom_Sel = "" ;
      AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = "" ;
      AV47TFLb_Cartaz = "" ;
      AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = "" ;
      AV48TFLb_Cartaz_Sel = "" ;
      AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = GXutil.nullDate() ;
      AV49TFLb_cartazf = GXutil.nullDate() ;
      AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = GXutil.nullDate() ;
      AV51TFLb_FechaEn = GXutil.nullDate() ;
      AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = GXutil.nullDate() ;
      AV53TFLb_FechaR = GXutil.nullDate() ;
      AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV68TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = "" ;
      AV57TFLb_ObsCR = "" ;
      AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = "" ;
      AV58TFLb_ObsCR_Sel = "" ;
      scmdbuf = "" ;
      lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = "" ;
      lV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = "" ;
      lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = "" ;
      lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = "" ;
      lV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = "" ;
      lV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = "" ;
      AV63Emprcod = "" ;
      A396EmprCod = "" ;
      P09OB2_A5532Lb_numero = new int[1] ;
      P09OB2_A396EmprCod = new String[] {""} ;
      P09OB2_A10822Lb_ObsCR = new String[] {""} ;
      P09OB2_A5566Lb_Estado = new byte[1] ;
      P09OB2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OB2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OB2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OB2_A5540Lb_Cartaz = new String[] {""} ;
      P09OB2_A279CliNom = new String[] {""} ;
      P09OB2_A252CliCod = new int[1] ;
      P09OB2_A5597Lb_TipRec = new byte[1] ;
      P09OB2_A5537Lb_ColNum = new int[1] ;
      P09OB2_A5536Lb_ColNom = new String[] {""} ;
      P09OB2_A5555Lb_opcion = new String[] {""} ;
      AV31NewLine = "" ;
      AV66HayProcesos = "" ;
      P09OB3_A396EmprCod = new String[] {""} ;
      P09OB3_A5532Lb_numero = new int[1] ;
      P09OB3_A5551Lb_lineaPq = new short[1] ;
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
      AV67TFLb_Estado_SelsJson = "" ;
      AV65Lb_fechaR = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.aprobacioninternaensayo_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09OB2_A5532Lb_numero, P09OB2_A396EmprCod, P09OB2_A10822Lb_ObsCR, P09OB2_A5566Lb_Estado, P09OB2_A5563Lb_FechaR, P09OB2_A5567Lb_FechaEn, P09OB2_A5594Lb_cartazf, P09OB2_A5540Lb_Cartaz, P09OB2_A279CliNom, P09OB2_A252CliCod,
            P09OB2_A5597Lb_TipRec, P09OB2_A5537Lb_ColNum, P09OB2_A5536Lb_ColNom, P09OB2_A5555Lb_opcion
            }
            , new Object[] {
            P09OB3_A396EmprCod, P09OB3_A5532Lb_numero, P09OB3_A5551Lb_lineaPq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5597Lb_TipRec ;
   private byte A5566Lb_Estado ;
   private byte AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ;
   private byte AV41TFLb_TipRec ;
   private byte AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ;
   private byte AV42TFLb_TipRec_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short A5551Lb_lineaPq ;
   private short Gx_err ;
   private int AV13Random ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ;
   private int AV61TFLb_numero ;
   private int AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ;
   private int AV62TFLb_numero_To ;
   private int AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ;
   private int AV39TFLb_ColNum ;
   private int AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ;
   private int AV40TFLb_ColNum_To ;
   private int AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ;
   private int AV43TFCliCod ;
   private int AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ;
   private int AV44TFCliCod_To ;
   private int AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ;
   private int AV64Lb_Numero ;
   private int AV96GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A5555Lb_opcion ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ;
   private String AV35TFLb_opcion ;
   private String AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ;
   private String AV36TFLb_opcion_Sel ;
   private String AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ;
   private String AV37TFLb_ColNom ;
   private String AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ;
   private String AV38TFLb_ColNom_Sel ;
   private String AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ;
   private String AV45TFCliNom ;
   private String AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ;
   private String AV46TFCliNom_Sel ;
   private String AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ;
   private String AV47TFLb_Cartaz ;
   private String AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ;
   private String AV48TFLb_Cartaz_Sel ;
   private String scmdbuf ;
   private String lV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ;
   private String lV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ;
   private String lV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ;
   private String lV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ;
   private String AV63Emprcod ;
   private String A396EmprCod ;
   private String AV66HayProcesos ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ;
   private java.util.Date AV49TFLb_cartazf ;
   private java.util.Date AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ;
   private java.util.Date AV51TFLb_FechaEn ;
   private java.util.Date AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ;
   private java.util.Date AV53TFLb_FechaR ;
   private java.util.Date AV65Lb_fechaR ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean AV59Seleccionar ;
   private boolean AV60SeleccionarEliminar ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV67TFLb_Estado_SelsJson ;
   private String AV11Filename ;
   private String A10822Lb_ObsCR ;
   private String AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ;
   private String AV57TFLb_ObsCR ;
   private String AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ;
   private String AV58TFLb_ObsCR_Sel ;
   private String lV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ;
   private String lV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ;
   private String AV31NewLine ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ;
   private GXSimpleCollection<Byte> AV68TFLb_Estado_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P09OB2_A5532Lb_numero ;
   private String[] P09OB2_A396EmprCod ;
   private String[] P09OB2_A10822Lb_ObsCR ;
   private byte[] P09OB2_A5566Lb_Estado ;
   private java.util.Date[] P09OB2_A5563Lb_FechaR ;
   private java.util.Date[] P09OB2_A5567Lb_FechaEn ;
   private java.util.Date[] P09OB2_A5594Lb_cartazf ;
   private String[] P09OB2_A5540Lb_Cartaz ;
   private String[] P09OB2_A279CliNom ;
   private int[] P09OB2_A252CliCod ;
   private byte[] P09OB2_A5597Lb_TipRec ;
   private int[] P09OB2_A5537Lb_ColNum ;
   private String[] P09OB2_A5536Lb_ColNom ;
   private String[] P09OB2_A5555Lb_opcion ;
   private String[] P09OB3_A396EmprCod ;
   private int[] P09OB3_A5532Lb_numero ;
   private short[] P09OB3_A5551Lb_lineaPq ;
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

final  class aprobacioninternaensayo_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                          String AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                          int AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ,
                                          int AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ,
                                          String AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                          String AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                          String AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                          String AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                          int AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ,
                                          int AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ,
                                          byte AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ,
                                          byte AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ,
                                          int AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ,
                                          int AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ,
                                          String AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                          String AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                          String AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                          String AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                          java.util.Date AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                          java.util.Date AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                          java.util.Date AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                          int AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ,
                                          String AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                          String AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A5597Lb_TipRec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV63Emprcod ,
                                          int AV64Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.EmprCod, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod, T2.Lb_TipRec, T2.Lb_ColNum," ;
      scmdbuf += " T2.Lb_ColNom, T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_TipRec,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_TipRec" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_TipRec DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_cartazf" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_cartazf DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ObsCR" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ObsCR DESC" ;
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
                  return conditional_P09OB2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Boolean) dynConstraints[38]).booleanValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OB3", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 300);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

