package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recepciondeensayocliente_wcexportcsv_impl extends GXWebProcedure
{
   public recepciondeensayocliente_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S181 ();
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
      S191 ();
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
      AV11Filename = "./PrivateTempStorage/" + "RecepciondeEnsayoCliente_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rb", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Opcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Envio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Recepcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      if ( AV104IsAuthorizedLb_ProvDef )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "P_D", "") : "") ;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Obs", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV30FilterFullText ;
      AV121Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV37TFLb_numero ;
      AV122Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV38TFLb_numero_To ;
      AV123Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV90TFCliCod ;
      AV124Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV91TFCliCod_To ;
      AV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV92TFLb_ArtCod ;
      AV126Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV93TFLb_ArtCod_Sel ;
      AV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV94TFLb_ColNomC ;
      AV128Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV95TFLb_ColNomC_Sel ;
      AV129Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV115TFLb_ColNum ;
      AV130Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV116TFLb_ColNum_To ;
      AV131Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV96TFLb_Rb ;
      AV132Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV97TFLb_Rb_To ;
      AV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV41TFLb_opcion ;
      AV134Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV42TFLb_opcion_Sel ;
      AV135Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV55TFLb_numop ;
      AV136Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV56TFLb_numop_To ;
      AV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV98TFLb_Cartaz ;
      AV138Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV99TFLb_Cartaz_Sel ;
      AV139Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV100TFLb_FechaE ;
      AV140Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV43TFLb_FechaEn ;
      AV141Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV47TFLb_FechaR ;
      AV142Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV103TFLb_Estado_Sels ;
      AV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV77TFLb_ObsCR ;
      AV144Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV78TFLb_ObsCR_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV142Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                           AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV123Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV124Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) ,
                                           AV126Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                           AV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                           AV128Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                           AV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV129Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV130Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) ,
                                           AV131Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                           AV132Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                           AV134Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                           AV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                           Byte.valueOf(AV135Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) ,
                                           Byte.valueOf(AV136Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) ,
                                           AV138Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                           AV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                           AV139Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                           AV140Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                           AV141Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                           Integer.valueOf(AV142Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels.size()) ,
                                           AV144Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                           AV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                           Integer.valueOf(AV82Clicod) ,
                                           AV83Lb_Cartaz ,
                                           AV84Lb_ColNom ,
                                           Integer.valueOf(AV85Lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A5536Lb_ColNom ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A6461Lb_FecNoa1 ,
                                           Byte.valueOf(AV86Lb_estado) ,
                                           AV81Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod), 16, "%") ;
      lV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc), 13, "%") ;
      lV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = GXutil.padr( GXutil.rtrim( AV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion), 1, "%") ;
      lV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz), 20, "%") ;
      lV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = GXutil.concat( GXutil.rtrim( AV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr), "%", "") ;
      lV83Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV83Lb_Cartaz), 20, "%") ;
      lV84Lb_ColNom = GXutil.padr( GXutil.rtrim( AV84Lb_ColNom), 13, "%") ;
      /* Using cursor P09NT2 */
      pr_default.execute(0, new Object[] {AV81Emprcod, Byte.valueOf(AV86Lb_estado), Byte.valueOf(AV86Lb_estado), lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, Integer.valueOf(AV121Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero), Integer.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to), Integer.valueOf(AV123Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod), Integer.valueOf(AV124Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to), lV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod, AV126Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel, lV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc, AV128Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV129Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum), Integer.valueOf(AV130Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to), AV131Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb, AV132Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to, lV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion, AV134Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel, Byte.valueOf(AV135Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop), Byte.valueOf(AV136Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to), lV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz, AV138Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel, AV139Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae, AV140Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen, AV141Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar, lV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr, AV144Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel, Integer.valueOf(AV82Clicod), lV83Lb_Cartaz, lV84Lb_ColNom, Integer.valueOf(AV85Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6461Lb_FecNoa1 = P09NT2_A6461Lb_FecNoa1[0] ;
         A5569Lb_EstEns = P09NT2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NT2_A5536Lb_ColNom[0] ;
         A396EmprCod = P09NT2_A396EmprCod[0] ;
         A10822Lb_ObsCR = P09NT2_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09NT2_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NT2_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NT2_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NT2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NT2_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09NT2_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09NT2_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09NT2_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NT2_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NT2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NT2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NT2_A252CliCod[0] ;
         A5532Lb_numero = P09NT2_A5532Lb_numero[0] ;
         A5597Lb_TipRec = P09NT2_A5597Lb_TipRec[0] ;
         A6631Lb_ProvDef = P09NT2_A6631Lb_ProvDef[0] ;
         A5569Lb_EstEns = P09NT2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NT2_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09NT2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NT2_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09NT2_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NT2_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NT2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NT2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NT2_A252CliCod[0] ;
         A5597Lb_TipRec = P09NT2_A5597Lb_TipRec[0] ;
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
            AV14TextFileLine += GXutil.booltostr( AV88Seleccionar) ;
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
            recepciondeensayocliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5538Lb_ColNomC, ";", ","), GXv_char3) ;
            recepciondeensayocliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV14TextFileLine += GXutil.str( A5547Lb_Rb, 7, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5555Lb_opcion, ";", ","), GXv_char3) ;
            recepciondeensayocliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV110Lb_TipRec = A5597Lb_TipRec ;
            AV14TextFileLine += ";" ;
            if ( AV110Lb_TipRec == 1 )
            {
               AV14TextFileLine += httpContext.getMessage( "Receta", "") ;
            }
            else if ( AV110Lb_TipRec == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "Añadida", "") ;
            }
            else if ( AV110Lb_TipRec == 3 )
            {
               AV14TextFileLine += httpContext.getMessage( "Conf.", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5718Lb_numop, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5540Lb_Cartaz, ";", ","), GXv_char3) ;
            recepciondeensayocliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5541Lb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5567Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5563Lb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.booltostr( AV89SeleccionarEliminar) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV111Lb_ProvDef = A6631Lb_ProvDef ;
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( AV111Lb_ProvDef), "D") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "D", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV111Lb_ProvDef), "P") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "P", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV31NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A10822Lb_ObsCR, ";", ","), AV31NewLine, " "), GXv_char3) ;
            recepciondeensayocliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      GXt_int4 = (byte)(0) ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV81Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int5) ;
      recepciondeensayocliente_wcexportcsv_impl.this.GXt_int4 = GXv_int5[0] ;
      AV104IsAuthorizedLb_ProvDef = (boolean)(((GXt_int4==1))) ;
   }

   public void S191( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=RecepciondeEnsayoCliente_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Seleccionar", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_ColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_Rb", "", "Rb", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_opcion", "", "Opcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Lb_TipRec", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_numop", "", "Nº", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_FechaE", "Fecha", "Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_FechaEn", "Fecha", "Envio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_FechaR", "Fecha", "Recepcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_Estado", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&SeleccionarEliminar", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( AV81Emprcod, httpContext.getMessage( "MODA21", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Lb_ProvDef", "", "P_D", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_ObsCR", "", "Obs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.RecepciondeEnsayoCliente_WCColumnsSelector", GXv_char3) ;
      recepciondeensayocliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.RecepciondeEnsayoCliente_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV145GXV1 = 1 ;
      while ( AV145GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV145GXV1));
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
            AV90TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV91TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV92TFLb_ArtCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV93TFLb_ArtCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV94TFLb_ColNomC = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV95TFLb_ColNomC_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV115TFLb_ColNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV116TFLb_ColNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV96TFLb_Rb = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV97TFLb_Rb_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
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
            AV98TFLb_Cartaz = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV99TFLb_Cartaz_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV100TFLb_FechaE = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV43TFLb_FechaEn = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV47TFLb_FechaR = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV102TFLb_Estado_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV103TFLb_Estado_Sels.fromJSonString(AV102TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR") == 0 )
         {
            AV77TFLb_ObsCR = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR_SEL") == 0 )
         {
            AV78TFLb_ObsCR_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV81Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV82Clicod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZ") == 0 )
         {
            AV83Lb_Cartaz = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOM") == 0 )
         {
            AV84Lb_ColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV85Lb_numero = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAR") == 0 )
         {
            AV87Lb_fechaR = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ESTADO") == 0 )
         {
            AV86Lb_estado = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV145GXV1 = (int)(AV145GXV1+1) ;
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
      A5563Lb_FechaR = GXutil.nullDate() ;
      A6631Lb_ProvDef = "" ;
      A10822Lb_ObsCR = "" ;
      AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = "" ;
      AV92TFLb_ArtCod = "" ;
      AV126Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = "" ;
      AV93TFLb_ArtCod_Sel = "" ;
      AV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = "" ;
      AV94TFLb_ColNomC = "" ;
      AV128Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = "" ;
      AV95TFLb_ColNomC_Sel = "" ;
      AV131Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = DecimalUtil.ZERO ;
      AV96TFLb_Rb = DecimalUtil.ZERO ;
      AV132Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = DecimalUtil.ZERO ;
      AV97TFLb_Rb_To = DecimalUtil.ZERO ;
      AV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = "" ;
      AV41TFLb_opcion = "" ;
      AV134Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = "" ;
      AV42TFLb_opcion_Sel = "" ;
      AV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = "" ;
      AV98TFLb_Cartaz = "" ;
      AV138Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = "" ;
      AV99TFLb_Cartaz_Sel = "" ;
      AV139Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = GXutil.nullDate() ;
      AV100TFLb_FechaE = GXutil.nullDate() ;
      AV140Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = GXutil.nullDate() ;
      AV43TFLb_FechaEn = GXutil.nullDate() ;
      AV141Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = GXutil.nullDate() ;
      AV47TFLb_FechaR = GXutil.nullDate() ;
      AV142Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV103TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = "" ;
      AV77TFLb_ObsCR = "" ;
      AV144Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = "" ;
      AV78TFLb_ObsCR_Sel = "" ;
      scmdbuf = "" ;
      lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = "" ;
      lV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = "" ;
      lV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = "" ;
      lV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = "" ;
      lV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = "" ;
      lV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = "" ;
      lV83Lb_Cartaz = "" ;
      lV84Lb_ColNom = "" ;
      AV83Lb_Cartaz = "" ;
      AV84Lb_ColNom = "" ;
      A5536Lb_ColNom = "" ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      AV81Emprcod = "" ;
      A396EmprCod = "" ;
      P09NT2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09NT2_A5569Lb_EstEns = new byte[1] ;
      P09NT2_A5536Lb_ColNom = new String[] {""} ;
      P09NT2_A396EmprCod = new String[] {""} ;
      P09NT2_A10822Lb_ObsCR = new String[] {""} ;
      P09NT2_A5566Lb_Estado = new byte[1] ;
      P09NT2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NT2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NT2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NT2_A5540Lb_Cartaz = new String[] {""} ;
      P09NT2_A5718Lb_numop = new byte[1] ;
      P09NT2_A5555Lb_opcion = new String[] {""} ;
      P09NT2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NT2_A5537Lb_ColNum = new int[1] ;
      P09NT2_A5538Lb_ColNomC = new String[] {""} ;
      P09NT2_A5533Lb_ArtCod = new String[] {""} ;
      P09NT2_A252CliCod = new int[1] ;
      P09NT2_A5532Lb_numero = new int[1] ;
      P09NT2_A5597Lb_TipRec = new byte[1] ;
      P09NT2_A6631Lb_ProvDef = new String[] {""} ;
      AV111Lb_ProvDef = "" ;
      AV31NewLine = "" ;
      GXv_int5 = new byte[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV102TFLb_Estado_SelsJson = "" ;
      AV87Lb_fechaR = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.recepciondeensayocliente_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09NT2_A6461Lb_FecNoa1, P09NT2_A5569Lb_EstEns, P09NT2_A5536Lb_ColNom, P09NT2_A396EmprCod, P09NT2_A10822Lb_ObsCR, P09NT2_A5566Lb_Estado, P09NT2_A5563Lb_FechaR, P09NT2_A5567Lb_FechaEn, P09NT2_A5541Lb_FechaE, P09NT2_A5540Lb_Cartaz,
            P09NT2_A5718Lb_numop, P09NT2_A5555Lb_opcion, P09NT2_A5547Lb_Rb, P09NT2_A5537Lb_ColNum, P09NT2_A5538Lb_ColNomC, P09NT2_A5533Lb_ArtCod, P09NT2_A252CliCod, P09NT2_A5532Lb_numero, P09NT2_A5597Lb_TipRec, P09NT2_A6631Lb_ProvDef
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5597Lb_TipRec ;
   private byte A5718Lb_numop ;
   private byte A5566Lb_Estado ;
   private byte AV135Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ;
   private byte AV55TFLb_numop ;
   private byte AV136Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ;
   private byte AV56TFLb_numop_To ;
   private byte A5569Lb_EstEns ;
   private byte AV86Lb_estado ;
   private byte AV110Lb_TipRec ;
   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV121Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ;
   private int AV37TFLb_numero ;
   private int AV122Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ;
   private int AV38TFLb_numero_To ;
   private int AV123Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ;
   private int AV90TFCliCod ;
   private int AV124Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ;
   private int AV91TFCliCod_To ;
   private int AV129Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ;
   private int AV115TFLb_ColNum ;
   private int AV130Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ;
   private int AV116TFLb_ColNum_To ;
   private int AV142Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ;
   private int AV82Clicod ;
   private int AV85Lb_numero ;
   private int AV145GXV1 ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV131Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ;
   private java.math.BigDecimal AV96TFLb_Rb ;
   private java.math.BigDecimal AV132Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ;
   private java.math.BigDecimal AV97TFLb_Rb_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5555Lb_opcion ;
   private String A5540Lb_Cartaz ;
   private String A6631Lb_ProvDef ;
   private String AV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ;
   private String AV92TFLb_ArtCod ;
   private String AV126Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ;
   private String AV93TFLb_ArtCod_Sel ;
   private String AV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ;
   private String AV94TFLb_ColNomC ;
   private String AV128Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ;
   private String AV95TFLb_ColNomC_Sel ;
   private String AV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ;
   private String AV41TFLb_opcion ;
   private String AV134Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ;
   private String AV42TFLb_opcion_Sel ;
   private String AV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ;
   private String AV98TFLb_Cartaz ;
   private String AV138Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ;
   private String AV99TFLb_Cartaz_Sel ;
   private String scmdbuf ;
   private String lV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ;
   private String lV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ;
   private String lV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ;
   private String lV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ;
   private String lV83Lb_Cartaz ;
   private String lV84Lb_ColNom ;
   private String AV83Lb_Cartaz ;
   private String AV84Lb_ColNom ;
   private String A5536Lb_ColNom ;
   private String AV81Emprcod ;
   private String A396EmprCod ;
   private String AV111Lb_ProvDef ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date AV139Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ;
   private java.util.Date AV100TFLb_FechaE ;
   private java.util.Date AV140Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ;
   private java.util.Date AV43TFLb_FechaEn ;
   private java.util.Date AV141Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ;
   private java.util.Date AV47TFLb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date AV87Lb_fechaR ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV104IsAuthorizedLb_ProvDef ;
   private boolean AV29OrderedDsc ;
   private boolean AV88Seleccionar ;
   private boolean AV89SeleccionarEliminar ;
   private boolean Cond_result ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV102TFLb_Estado_SelsJson ;
   private String AV11Filename ;
   private String A10822Lb_ObsCR ;
   private String AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ;
   private String AV77TFLb_ObsCR ;
   private String AV144Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ;
   private String AV78TFLb_ObsCR_Sel ;
   private String lV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ;
   private String lV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ;
   private String AV31NewLine ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV142Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ;
   private GXSimpleCollection<Byte> AV103TFLb_Estado_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P09NT2_A6461Lb_FecNoa1 ;
   private byte[] P09NT2_A5569Lb_EstEns ;
   private String[] P09NT2_A5536Lb_ColNom ;
   private String[] P09NT2_A396EmprCod ;
   private String[] P09NT2_A10822Lb_ObsCR ;
   private byte[] P09NT2_A5566Lb_Estado ;
   private java.util.Date[] P09NT2_A5563Lb_FechaR ;
   private java.util.Date[] P09NT2_A5567Lb_FechaEn ;
   private java.util.Date[] P09NT2_A5541Lb_FechaE ;
   private String[] P09NT2_A5540Lb_Cartaz ;
   private byte[] P09NT2_A5718Lb_numop ;
   private String[] P09NT2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09NT2_A5547Lb_Rb ;
   private int[] P09NT2_A5537Lb_ColNum ;
   private String[] P09NT2_A5538Lb_ColNomC ;
   private String[] P09NT2_A5533Lb_ArtCod ;
   private int[] P09NT2_A252CliCod ;
   private int[] P09NT2_A5532Lb_numero ;
   private byte[] P09NT2_A5597Lb_TipRec ;
   private String[] P09NT2_A6631Lb_ProvDef ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class recepciondeensayocliente_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09NT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV142Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                          String AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                          int AV121Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ,
                                          int AV122Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ,
                                          int AV123Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ,
                                          int AV124Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ,
                                          String AV126Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                          String AV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                          String AV128Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                          String AV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                          int AV129Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ,
                                          int AV130Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ,
                                          java.math.BigDecimal AV131Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                          java.math.BigDecimal AV132Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                          String AV134Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                          String AV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                          byte AV135Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ,
                                          byte AV136Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ,
                                          String AV138Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                          String AV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                          java.util.Date AV139Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                          java.util.Date AV140Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                          java.util.Date AV141Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                          int AV142Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ,
                                          String AV144Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                          String AV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                          int AV82Clicod ,
                                          String AV83Lb_Cartaz ,
                                          String AV84Lb_ColNom ,
                                          int AV85Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A5536Lb_ColNom ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          byte AV86Lb_estado ,
                                          String AV81Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[41];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.Lb_FecNoa1, T2.Lb_EstEns, T2.Lb_ColNom, T1.EmprCod, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop, T1.Lb_opcion," ;
      scmdbuf += " T2.Lb_Rb, T2.Lb_ColNum, T2.Lb_ColNomC, T2.Lb_ArtCod, T2.CliCod, T1.Lb_numero, T2.Lb_TipRec, T1.Lb_ProvDef FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "((T1.Lb_FecNoa1 = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(Not (T1.Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.Lb_Estado = ? or ? = 0 and T1.Lb_Estado <> 3)");
      if ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV121Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV122Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV123Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV124Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV125Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV127Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV129Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV130Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV133Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV135Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV136Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV137Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV139Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV140Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV141Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( AV142Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV142Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV144Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV143Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV82Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV85Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T2.Lb_ColNum" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Rb" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Rb DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numop" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numop DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_FechaE" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_FechaE DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ObsCR" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ObsCR DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09NT2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , ((Number) dynConstraints[47]).byteValue() , (java.util.Date)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09NT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
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
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
      }
   }

}

