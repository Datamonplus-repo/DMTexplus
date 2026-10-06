package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class noaceptacionensayo_wcexportcsv_impl extends GXWebProcedure
{
   public noaceptacionensayo_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "NoAceptacionEnsayo_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Opcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Cole.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Env.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Recep.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV33FilterFullText ;
      AV78Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV41TFLb_numero ;
      AV79Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV42TFLb_numero_To ;
      AV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV43TFLb_opcion ;
      AV81Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV44TFLb_opcion_Sel ;
      AV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV45TFLb_ColNom ;
      AV83Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV46TFLb_ColNom_Sel ;
      AV84Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV47TFLb_ColNum ;
      AV85Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV48TFLb_ColNum_To ;
      AV86Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV51TFCliCod ;
      AV87Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV52TFCliCod_To ;
      AV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV53TFCliNom ;
      AV89Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV54TFCliNom_Sel ;
      AV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV55TFLb_Cartaz ;
      AV91Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV56TFLb_Cartaz_Sel ;
      AV92Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV57TFLb_cartazf ;
      AV93Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV59TFLb_FechaEn ;
      AV94Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV61TFLb_FechaR ;
      AV95Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV73TFLb_Estado_Sels ;
      AV96Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV67TFLb_FecNoa1 ;
      AV97Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV69TFLb_hhnoa1 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV95Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                           AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV78Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) ,
                                           AV81Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                           AV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                           AV83Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                           AV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV84Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV85Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) ,
                                           Integer.valueOf(AV86Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) ,
                                           Integer.valueOf(AV87Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) ,
                                           AV89Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                           AV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                           AV91Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                           AV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                           AV92Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                           AV93Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                           AV94Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                           Integer.valueOf(AV95Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels.size()) ,
                                           AV96Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                           AV97Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV32OrderedDsc) ,
                                           AV28Emprcod ,
                                           Integer.valueOf(AV29Lb_Numero) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom), 30, "%") ;
      lV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz), 20, "%") ;
      /* Using cursor P09OH2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, Integer.valueOf(AV29Lb_Numero), lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, Integer.valueOf(AV78Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero), Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to), lV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion, AV81Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel, lV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom, AV83Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV84Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum), Integer.valueOf(AV85Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to), Integer.valueOf(AV86Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod), Integer.valueOf(AV87Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to), lV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom, AV89Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel, lV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz, AV91Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel, AV92Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf, AV93Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen, AV94Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar, AV96Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1, AV97Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09OH2_A396EmprCod[0] ;
         A10082Lb_hhnoa1 = P09OH2_A10082Lb_hhnoa1[0] ;
         A6461Lb_FecNoa1 = P09OH2_A6461Lb_FecNoa1[0] ;
         A5566Lb_Estado = P09OH2_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09OH2_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OH2_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OH2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OH2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OH2_A279CliNom[0] ;
         A252CliCod = P09OH2_A252CliCod[0] ;
         A5537Lb_ColNum = P09OH2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OH2_A5536Lb_ColNom[0] ;
         A5555Lb_opcion = P09OH2_A5555Lb_opcion[0] ;
         A5532Lb_numero = P09OH2_A5532Lb_numero[0] ;
         A5594Lb_cartazf = P09OH2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OH2_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OH2_A252CliCod[0] ;
         A5537Lb_ColNum = P09OH2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OH2_A5536Lb_ColNom[0] ;
         A279CliNom = P09OH2_A279CliNom[0] ;
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
            AV14TextFileLine += GXutil.booltostr( AV34Seleccionar) ;
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
            noaceptacionensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5536Lb_ColNom, ";", ","), GXv_char3) ;
            noaceptacionensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            noaceptacionensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5540Lb_Cartaz, ";", ","), GXv_char3) ;
            noaceptacionensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5594Lb_cartazf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5567Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5563Lb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A5566Lb_Estado == 1 )
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
            AV14TextFileLine += localUtil.dtoc( A6461Lb_FecNoa1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A10082Lb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=NoAceptacionEnsayo_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_opcion", "", "Opcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNum", "", "Numero", true, "") ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_FecNoa1", "No Aceptacion", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_hhnoa1", "No Aceptacion", "Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.NoAceptacionEnsayo_WCColumnsSelector", GXv_char3) ;
      noaceptacionensayo_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.NoAceptacionEnsayo_WCGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV19Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCGridState"), null, null);
      }
      AV31OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV32OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV33FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV41TFLb_numero = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFLb_numero_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV43TFLb_opcion = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV44TFLb_opcion_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV45TFLb_ColNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV46TFLb_ColNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV47TFLb_ColNum = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFLb_ColNum_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV51TFCliCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFCliCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV53TFCliNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV54TFCliNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV55TFLb_Cartaz = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV56TFLb_Cartaz_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV57TFLb_cartazf = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV59TFLb_FechaEn = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV61TFLb_FechaR = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV72TFLb_Estado_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV73TFLb_Estado_Sels.fromJSonString(AV72TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECNOA1") == 0 )
         {
            AV67TFLb_FecNoa1 = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HHNOA1") == 0 )
         {
            AV69TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV29Lb_Numero = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAR") == 0 )
         {
            AV30Lb_fechaR = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_OBSCR") == 0 )
         {
            AV71Lb_ObsCR = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
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
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = "" ;
      AV33FilterFullText = "" ;
      AV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = "" ;
      AV43TFLb_opcion = "" ;
      AV81Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = "" ;
      AV44TFLb_opcion_Sel = "" ;
      AV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = "" ;
      AV45TFLb_ColNom = "" ;
      AV83Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = "" ;
      AV46TFLb_ColNom_Sel = "" ;
      AV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = "" ;
      AV53TFCliNom = "" ;
      AV89Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = "" ;
      AV54TFCliNom_Sel = "" ;
      AV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = "" ;
      AV55TFLb_Cartaz = "" ;
      AV91Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = "" ;
      AV56TFLb_Cartaz_Sel = "" ;
      AV92Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = GXutil.nullDate() ;
      AV57TFLb_cartazf = GXutil.nullDate() ;
      AV93Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = GXutil.nullDate() ;
      AV59TFLb_FechaEn = GXutil.nullDate() ;
      AV94Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = GXutil.nullDate() ;
      AV61TFLb_FechaR = GXutil.nullDate() ;
      AV95Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV73TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV96Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = GXutil.nullDate() ;
      AV67TFLb_FecNoa1 = GXutil.nullDate() ;
      AV97Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV69TFLb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = "" ;
      lV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = "" ;
      lV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = "" ;
      lV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = "" ;
      lV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = "" ;
      AV28Emprcod = "" ;
      A396EmprCod = "" ;
      P09OH2_A396EmprCod = new String[] {""} ;
      P09OH2_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OH2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OH2_A5566Lb_Estado = new byte[1] ;
      P09OH2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OH2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OH2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OH2_A5540Lb_Cartaz = new String[] {""} ;
      P09OH2_A279CliNom = new String[] {""} ;
      P09OH2_A252CliCod = new int[1] ;
      P09OH2_A5537Lb_ColNum = new int[1] ;
      P09OH2_A5536Lb_ColNom = new String[] {""} ;
      P09OH2_A5555Lb_opcion = new String[] {""} ;
      P09OH2_A5532Lb_numero = new int[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV72TFLb_Estado_SelsJson = "" ;
      AV30Lb_fechaR = GXutil.nullDate() ;
      AV71Lb_ObsCR = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.noaceptacionensayo_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09OH2_A396EmprCod, P09OH2_A10082Lb_hhnoa1, P09OH2_A6461Lb_FecNoa1, P09OH2_A5566Lb_Estado, P09OH2_A5563Lb_FechaR, P09OH2_A5567Lb_FechaEn, P09OH2_A5594Lb_cartazf, P09OH2_A5540Lb_Cartaz, P09OH2_A279CliNom, P09OH2_A252CliCod,
            P09OH2_A5537Lb_ColNum, P09OH2_A5536Lb_ColNom, P09OH2_A5555Lb_opcion, P09OH2_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5566Lb_Estado ;
   private short gxcookieaux ;
   private short AV31OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV78Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ;
   private int AV41TFLb_numero ;
   private int AV79Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ;
   private int AV42TFLb_numero_To ;
   private int AV84Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ;
   private int AV47TFLb_ColNum ;
   private int AV85Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ;
   private int AV48TFLb_ColNum_To ;
   private int AV86Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ;
   private int AV51TFCliCod ;
   private int AV87Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ;
   private int AV52TFCliCod_To ;
   private int AV95Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ;
   private int AV29Lb_Numero ;
   private int AV98GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A5555Lb_opcion ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String AV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ;
   private String AV43TFLb_opcion ;
   private String AV81Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ;
   private String AV44TFLb_opcion_Sel ;
   private String AV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ;
   private String AV45TFLb_ColNom ;
   private String AV83Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ;
   private String AV46TFLb_ColNom_Sel ;
   private String AV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ;
   private String AV53TFCliNom ;
   private String AV89Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ;
   private String AV54TFCliNom_Sel ;
   private String AV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ;
   private String AV55TFLb_Cartaz ;
   private String AV91Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ;
   private String AV56TFLb_Cartaz_Sel ;
   private String scmdbuf ;
   private String lV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ;
   private String lV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ;
   private String lV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ;
   private String lV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ;
   private String AV28Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date AV97Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ;
   private java.util.Date AV69TFLb_hhnoa1 ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date AV92Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ;
   private java.util.Date AV57TFLb_cartazf ;
   private java.util.Date AV93Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ;
   private java.util.Date AV59TFLb_FechaEn ;
   private java.util.Date AV94Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ;
   private java.util.Date AV61TFLb_FechaR ;
   private java.util.Date AV96Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ;
   private java.util.Date AV67TFLb_FecNoa1 ;
   private java.util.Date AV30Lb_fechaR ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV32OrderedDsc ;
   private boolean AV34Seleccionar ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV72TFLb_Estado_SelsJson ;
   private String AV11Filename ;
   private String AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ;
   private String AV33FilterFullText ;
   private String lV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private String AV71Lb_ObsCR ;
   private GXSimpleCollection<Byte> AV95Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ;
   private GXSimpleCollection<Byte> AV73TFLb_Estado_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09OH2_A396EmprCod ;
   private java.util.Date[] P09OH2_A10082Lb_hhnoa1 ;
   private java.util.Date[] P09OH2_A6461Lb_FecNoa1 ;
   private byte[] P09OH2_A5566Lb_Estado ;
   private java.util.Date[] P09OH2_A5563Lb_FechaR ;
   private java.util.Date[] P09OH2_A5567Lb_FechaEn ;
   private java.util.Date[] P09OH2_A5594Lb_cartazf ;
   private String[] P09OH2_A5540Lb_Cartaz ;
   private String[] P09OH2_A279CliNom ;
   private int[] P09OH2_A252CliCod ;
   private int[] P09OH2_A5537Lb_ColNum ;
   private String[] P09OH2_A5536Lb_ColNom ;
   private String[] P09OH2_A5555Lb_opcion ;
   private int[] P09OH2_A5532Lb_numero ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class noaceptacionensayo_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV95Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                          String AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                          int AV78Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ,
                                          int AV79Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ,
                                          String AV81Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                          String AV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                          String AV83Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                          String AV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                          int AV84Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ,
                                          int AV85Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ,
                                          int AV86Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ,
                                          int AV87Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ,
                                          String AV89Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                          String AV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                          String AV91Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                          String AV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                          java.util.Date AV92Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                          java.util.Date AV93Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                          java.util.Date AV94Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                          int AV95Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ,
                                          java.util.Date AV96Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                          java.util.Date AV97Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          short AV31OrderedBy ,
                                          boolean AV32OrderedDsc ,
                                          String AV28Emprcod ,
                                          int AV29Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[29];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_hhnoa1, T1.Lb_FecNoa1, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod, T2.Lb_ColNum, T2.Lb_ColNom," ;
      scmdbuf += " T1.Lb_opcion, T1.Lb_numero FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_Estado = 1)");
      if ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
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
      }
      if ( ! (0==AV78Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV84Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV90Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( AV95Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV95Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(T1.Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV97Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(T1.Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV31OrderedBy == 1 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNom" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNom DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum DESC" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_cartazf" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_cartazf DESC" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV31OrderedBy == 11 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV31OrderedBy == 11 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( ( AV31OrderedBy == 12 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FecNoa1" ;
      }
      else if ( ( AV31OrderedBy == 12 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FecNoa1 DESC" ;
      }
      else if ( ( AV31OrderedBy == 13 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_hhnoa1" ;
      }
      else if ( ( AV31OrderedBy == 13 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_hhnoa1 DESC" ;
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
                  return conditional_P09OH2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = GXutil.resetDate(rslt.getGXDateTime(2));
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], true);
               }
               return;
      }
   }

}

