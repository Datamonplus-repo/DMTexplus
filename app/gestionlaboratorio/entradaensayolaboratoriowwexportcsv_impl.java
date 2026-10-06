package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaensayolaboratoriowwexportcsv_impl extends GXWebProcedure
{
   public entradaensayolaboratoriowwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV84EmprCod = AV91Websession.getValue(httpContext.getMessage( "&EmprCod", "")) ;
      AV85Lb_FechaEfrom = localUtil.ctod( AV91Websession.getValue(httpContext.getMessage( "&Lb_FechaEfrom", "")), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV86Lb_FechaEto = localUtil.ctod( AV91Websession.getValue(httpContext.getMessage( "&Lb_FechaEto", "")), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV91Websession.remove(httpContext.getMessage( "&EmprCod", ""));
      AV91Websession.remove(httpContext.getMessage( "&Lb_FechaEfrom", ""));
      AV91Websession.remove(httpContext.getMessage( "&Lb_FechaEto", ""));
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
      AV11Filename = "./PrivateTempStorage/" + "EntradaEnsayoLaboratorioWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº de Ensayo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "TC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rb", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pantone", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "V/Pedido", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV30FilterFullText ;
      AV97Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV34TFLb_numero ;
      AV98Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV35TFLb_numero_To ;
      AV99Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV36TFCliCod ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV37TFCliCod_To ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV38TFCliNom ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV39TFCliNom_Sel ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV40TFLb_ArtCod ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV41TFLb_ArtCod_Sel ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV42TFLb_ArtDsc ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV43TFLb_ArtDsc_Sel ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV48TFLb_ColNom ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV49TFLb_ColNom_Sel ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV50TFLb_ColNum ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV51TFLb_ColNum_To ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV52TFTipColCod ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV53TFTipColCod_To ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV56TFLb_ColNomC ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV57TFLb_ColNomC_Sel ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV58TFLb_ColNumC ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV59TFLb_ColNumC_To ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV60TFLb_Cartaz ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV61TFLb_Cartaz_Sel ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV64TFLb_HoraE ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV83TFLb_EstEns_Sels ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV74TFLb_Rb ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV75TFLb_Rb_To ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV87TFLb_Pantone ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV88TFLb_Pantone_Sel ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV89TFLb_PedCod ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV90TFLb_PedCod_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV120Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV97Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV98Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV99Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV100Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV102Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV104Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV106Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV108Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV109Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV112Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV114Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV116Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV118Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV119Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV120Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV122Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV124Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV126Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV85Lb_FechaEfrom ,
                                           AV86Lb_FechaEto ,
                                           Integer.valueOf(AV92lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV84EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor P09OK2 */
      pr_default.execute(0, new Object[] {AV84EmprCod, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV97Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV98Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV99Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV100Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV102Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV104Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV106Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV108Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV109Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV112Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV114Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV116Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV118Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV119Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV121Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV122Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV124Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV126Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV85Lb_FechaEfrom, AV86Lb_FechaEto, Integer.valueOf(AV92lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5541Lb_FechaE = P09OK2_A5541Lb_FechaE[0] ;
         A396EmprCod = P09OK2_A396EmprCod[0] ;
         A6618Lb_PedCod = P09OK2_A6618Lb_PedCod[0] ;
         A6546Lb_Pantone = P09OK2_A6546Lb_Pantone[0] ;
         A5547Lb_Rb = P09OK2_A5547Lb_Rb[0] ;
         A5569Lb_EstEns = P09OK2_A5569Lb_EstEns[0] ;
         A5542Lb_HoraE = P09OK2_A5542Lb_HoraE[0] ;
         A5540Lb_Cartaz = P09OK2_A5540Lb_Cartaz[0] ;
         A5539Lb_ColNumC = P09OK2_A5539Lb_ColNumC[0] ;
         A5538Lb_ColNomC = P09OK2_A5538Lb_ColNomC[0] ;
         A831TipColCod = P09OK2_A831TipColCod[0] ;
         n831TipColCod = P09OK2_n831TipColCod[0] ;
         A5537Lb_ColNum = P09OK2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OK2_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09OK2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09OK2_A5533Lb_ArtCod[0] ;
         A279CliNom = P09OK2_A279CliNom[0] ;
         A252CliCod = P09OK2_A252CliCod[0] ;
         A5532Lb_numero = P09OK2_A5532Lb_numero[0] ;
         A279CliNom = P09OK2_A279CliNom[0] ;
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
            AV14TextFileLine += GXutil.str( A5532Lb_numero, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            entradaensayolaboratoriowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5533Lb_ArtCod, ";", ","), GXv_char3) ;
            entradaensayolaboratoriowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5534Lb_ArtDsc, ";", ","), GXv_char3) ;
            entradaensayolaboratoriowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5536Lb_ColNom, ";", ","), GXv_char3) ;
            entradaensayolaboratoriowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5537Lb_ColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A831TipColCod, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5538Lb_ColNomC, ";", ","), GXv_char3) ;
            entradaensayolaboratoriowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5539Lb_ColNumC, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5540Lb_Cartaz, ";", ","), GXv_char3) ;
            entradaensayolaboratoriowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV14TextFileLine += localUtil.ttoc( A5542Lb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A5569Lb_EstEns == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Pdte. Act. Txp", "") ;
            }
            else if ( A5569Lb_EstEns == 1 )
            {
               AV14TextFileLine += httpContext.getMessage( "Act. en Txp", "") ;
            }
            else if ( A5569Lb_EstEns == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "Cerrado", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5547Lb_Rb, 7, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6546Lb_Pantone, ";", ","), GXv_char3) ;
            entradaensayolaboratoriowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6618Lb_PedCod, ";", ","), GXv_char3) ;
            entradaensayolaboratoriowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=EntradaEnsayoLaboratorioWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ArtDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipColCod", "", "TC", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_ColNumC", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_FechaE", "Entrada", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_HoraE", "Entrada", "Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_EstEns", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Rb", "", "Rb", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_Pantone", "", "Pantone", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_PedCod", "", "V/Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EntradaEnsayoLaboratorioWWColumnsSelector", GXv_char3) ;
      entradaensayolaboratoriowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EntradaEnsayoLaboratorioWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV127GXV1 = 1 ;
      while ( AV127GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV127GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV34TFLb_numero = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFLb_numero_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV38TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV39TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV40TFLb_ArtCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV41TFLb_ArtCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV42TFLb_ArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV43TFLb_ArtDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV48TFLb_ColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV49TFLb_ColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV50TFLb_ColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFLb_ColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV52TFTipColCod = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFTipColCod_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV56TFLb_ColNomC = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV57TFLb_ColNomC_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUMC") == 0 )
         {
            AV58TFLb_ColNumC = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFLb_ColNumC_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV60TFLb_Cartaz = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV61TFLb_Cartaz_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAE") == 0 )
         {
            AV64TFLb_HoraE = GXutil.resetDate(localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTENS_SEL") == 0 )
         {
            AV82TFLb_EstEns_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV83TFLb_EstEns_Sels.fromJSonString(AV82TFLb_EstEns_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV74TFLb_Rb = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV75TFLb_Rb_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PANTONE") == 0 )
         {
            AV87TFLb_Pantone = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PANTONE_SEL") == 0 )
         {
            AV88TFLb_Pantone_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PEDCOD") == 0 )
         {
            AV89TFLb_PedCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PEDCOD_SEL") == 0 )
         {
            AV90TFLb_PedCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV127GXV1 = (int)(AV127GXV1+1) ;
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
      AV84EmprCod = "" ;
      AV91Websession = httpContext.getWebSession();
      AV85Lb_FechaEfrom = GXutil.nullDate() ;
      AV86Lb_FechaEto = GXutil.nullDate() ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A279CliNom = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5540Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A6546Lb_Pantone = "" ;
      A6618Lb_PedCod = "" ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = "" ;
      AV38TFCliNom = "" ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = "" ;
      AV39TFCliNom_Sel = "" ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = "" ;
      AV40TFLb_ArtCod = "" ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = "" ;
      AV41TFLb_ArtCod_Sel = "" ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = "" ;
      AV42TFLb_ArtDsc = "" ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = "" ;
      AV43TFLb_ArtDsc_Sel = "" ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = "" ;
      AV48TFLb_ColNom = "" ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = "" ;
      AV49TFLb_ColNom_Sel = "" ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = "" ;
      AV56TFLb_ColNomC = "" ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = "" ;
      AV57TFLb_ColNomC_Sel = "" ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = "" ;
      AV60TFLb_Cartaz = "" ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = "" ;
      AV61TFLb_Cartaz_Sel = "" ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = GXutil.resetTime( GXutil.nullDate() );
      AV64TFLb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV83TFLb_EstEns_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = DecimalUtil.ZERO ;
      AV74TFLb_Rb = DecimalUtil.ZERO ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = DecimalUtil.ZERO ;
      AV75TFLb_Rb_To = DecimalUtil.ZERO ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = "" ;
      AV87TFLb_Pantone = "" ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = "" ;
      AV88TFLb_Pantone_Sel = "" ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = "" ;
      AV89TFLb_PedCod = "" ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = "" ;
      AV90TFLb_PedCod_Sel = "" ;
      scmdbuf = "" ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = "" ;
      lV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = "" ;
      lV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = "" ;
      lV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = "" ;
      lV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = "" ;
      lV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = "" ;
      lV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = "" ;
      lV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = "" ;
      lV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = "" ;
      A396EmprCod = "" ;
      P09OK2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OK2_A396EmprCod = new String[] {""} ;
      P09OK2_A6618Lb_PedCod = new String[] {""} ;
      P09OK2_A6546Lb_Pantone = new String[] {""} ;
      P09OK2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OK2_A5569Lb_EstEns = new byte[1] ;
      P09OK2_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OK2_A5540Lb_Cartaz = new String[] {""} ;
      P09OK2_A5539Lb_ColNumC = new int[1] ;
      P09OK2_A5538Lb_ColNomC = new String[] {""} ;
      P09OK2_A831TipColCod = new byte[1] ;
      P09OK2_n831TipColCod = new boolean[] {false} ;
      P09OK2_A5537Lb_ColNum = new int[1] ;
      P09OK2_A5536Lb_ColNom = new String[] {""} ;
      P09OK2_A5534Lb_ArtDsc = new String[] {""} ;
      P09OK2_A5533Lb_ArtCod = new String[] {""} ;
      P09OK2_A279CliNom = new String[] {""} ;
      P09OK2_A252CliCod = new int[1] ;
      P09OK2_A5532Lb_numero = new int[1] ;
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
      AV82TFLb_EstEns_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratoriowwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09OK2_A5541Lb_FechaE, P09OK2_A396EmprCod, P09OK2_A6618Lb_PedCod, P09OK2_A6546Lb_Pantone, P09OK2_A5547Lb_Rb, P09OK2_A5569Lb_EstEns, P09OK2_A5542Lb_HoraE, P09OK2_A5540Lb_Cartaz, P09OK2_A5539Lb_ColNumC, P09OK2_A5538Lb_ColNomC,
            P09OK2_A831TipColCod, P09OK2_n831TipColCod, P09OK2_A5537Lb_ColNum, P09OK2_A5536Lb_ColNom, P09OK2_A5534Lb_ArtDsc, P09OK2_A5533Lb_ArtCod, P09OK2_A279CliNom, P09OK2_A252CliCod, P09OK2_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte A5569Lb_EstEns ;
   private byte AV111Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ;
   private byte AV52TFTipColCod ;
   private byte AV112Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ;
   private byte AV53TFTipColCod_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int A5539Lb_ColNumC ;
   private int AV97Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ;
   private int AV34TFLb_numero ;
   private int AV98Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ;
   private int AV35TFLb_numero_To ;
   private int AV99Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ;
   private int AV36TFCliCod ;
   private int AV100Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ;
   private int AV37TFCliCod_To ;
   private int AV109Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ;
   private int AV50TFLb_ColNum ;
   private int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ;
   private int AV51TFLb_ColNum_To ;
   private int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ;
   private int AV58TFLb_ColNumC ;
   private int AV116Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ;
   private int AV59TFLb_ColNumC_To ;
   private int AV120Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ;
   private int AV92lb_numero ;
   private int AV127GXV1 ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV121Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ;
   private java.math.BigDecimal AV74TFLb_Rb ;
   private java.math.BigDecimal AV122Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ;
   private java.math.BigDecimal AV75TFLb_Rb_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV84EmprCod ;
   private String A279CliNom ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5536Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5540Lb_Cartaz ;
   private String A6546Lb_Pantone ;
   private String A6618Lb_PedCod ;
   private String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ;
   private String AV38TFCliNom ;
   private String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ;
   private String AV39TFCliNom_Sel ;
   private String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ;
   private String AV40TFLb_ArtCod ;
   private String AV104Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ;
   private String AV41TFLb_ArtCod_Sel ;
   private String AV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ;
   private String AV42TFLb_ArtDsc ;
   private String AV106Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ;
   private String AV43TFLb_ArtDsc_Sel ;
   private String AV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ;
   private String AV48TFLb_ColNom ;
   private String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ;
   private String AV49TFLb_ColNom_Sel ;
   private String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ;
   private String AV56TFLb_ColNomC ;
   private String AV114Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ;
   private String AV57TFLb_ColNomC_Sel ;
   private String AV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ;
   private String AV60TFLb_Cartaz ;
   private String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ;
   private String AV61TFLb_Cartaz_Sel ;
   private String AV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ;
   private String AV87TFLb_Pantone ;
   private String AV124Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ;
   private String AV88TFLb_Pantone_Sel ;
   private String AV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ;
   private String AV89TFLb_PedCod ;
   private String AV126Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ;
   private String AV90TFLb_PedCod_Sel ;
   private String scmdbuf ;
   private String lV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ;
   private String lV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ;
   private String lV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ;
   private String lV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ;
   private String lV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ;
   private String lV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ;
   private String lV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ;
   private String lV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date AV119Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ;
   private java.util.Date AV64TFLb_HoraE ;
   private java.util.Date AV85Lb_FechaEfrom ;
   private java.util.Date AV86Lb_FechaEto ;
   private java.util.Date A5541Lb_FechaE ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n831TipColCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV82TFLb_EstEns_SelsJson ;
   private String AV11Filename ;
   private String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV120Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ;
   private GXSimpleCollection<Byte> AV83TFLb_EstEns_Sels ;
   private com.genexus.webpanels.WebSession AV91Websession ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P09OK2_A5541Lb_FechaE ;
   private String[] P09OK2_A396EmprCod ;
   private String[] P09OK2_A6618Lb_PedCod ;
   private String[] P09OK2_A6546Lb_Pantone ;
   private java.math.BigDecimal[] P09OK2_A5547Lb_Rb ;
   private byte[] P09OK2_A5569Lb_EstEns ;
   private java.util.Date[] P09OK2_A5542Lb_HoraE ;
   private String[] P09OK2_A5540Lb_Cartaz ;
   private int[] P09OK2_A5539Lb_ColNumC ;
   private String[] P09OK2_A5538Lb_ColNomC ;
   private byte[] P09OK2_A831TipColCod ;
   private boolean[] P09OK2_n831TipColCod ;
   private int[] P09OK2_A5537Lb_ColNum ;
   private String[] P09OK2_A5536Lb_ColNom ;
   private String[] P09OK2_A5534Lb_ArtDsc ;
   private String[] P09OK2_A5533Lb_ArtCod ;
   private String[] P09OK2_A279CliNom ;
   private int[] P09OK2_A252CliCod ;
   private int[] P09OK2_A5532Lb_numero ;
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

final  class entradaensayolaboratoriowwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV120Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV97Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV98Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV99Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV100Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV104Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV106Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV109Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV111Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV112Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV114Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV116Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV119Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV120Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV121Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV122Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV124Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV126Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV85Lb_FechaEfrom ,
                                          java.util.Date AV86Lb_FechaEto ,
                                          int AV92lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV84EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[48];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.Lb_FechaE, T1.EmprCod, T1.Lb_PedCod, T1.Lb_Pantone, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T1.TipColCod, T1.Lb_ColNum," ;
      scmdbuf += " T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV96Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
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
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV97Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV98Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV99Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV100Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV109Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV112Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV115Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV117Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV119Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( AV120Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV123Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV125Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (0==AV92lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
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
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNumC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNumC DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_HoraE" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_HoraE DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_EstEns" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_EstEns DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Rb" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Rb DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Pantone" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Pantone DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_PedCod" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_PedCod DESC" ;
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
                  return conditional_P09OK2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , ((Boolean) dynConstraints[53]).booleanValue() , (String)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
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
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
      }
   }

}

