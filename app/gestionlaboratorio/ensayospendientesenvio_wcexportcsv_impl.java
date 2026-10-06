package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ensayospendientesenvio_wcexportcsv_impl extends GXWebProcedure
{
   public ensayospendientesenvio_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "EnsayosPendientesEnvio_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº de Ensayo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coleccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dias", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV30FilterFullText ;
      AV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV34TFCliNom ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV35TFCliNom_Sel ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV36TFLb_numero ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV37TFLb_numero_To ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV38TFLb_Cartaz ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV39TFLb_Cartaz_Sel ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV40TFLb_cartazf ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV42TFLb_ArtCod ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV43TFLb_ArtCod_Sel ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV44TFLb_ArtDsc ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV45TFLb_ArtDsc_Sel ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV46TFLb_ColNomC ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV47TFLb_ColNomC_Sel ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV48TFLb_ColNom ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV49TFLb_ColNom_Sel ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV50TFLb_ColNum ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV51TFLb_ColNum_To ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV52TFLb_FechaE ;
      AV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV61TFLb_Tipo ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV62TFLb_Tipo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                           AV68Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                           AV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                           Integer.valueOf(AV69Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                           Integer.valueOf(AV70Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                           AV72Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                           AV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                           AV73Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                           AV75Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                           AV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                           AV77Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                           AV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                           AV79Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                           AV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                           AV81Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                           AV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                           Integer.valueOf(AV82Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                           Integer.valueOf(AV83Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                           AV84Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                           AV86Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                           AV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                           Integer.valueOf(AV57Clicod) ,
                                           AV58lb_fechaefrom ,
                                           AV59lb_fechaeto ,
                                           A279CliNom ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Byte.valueOf(A14098Lb_Enviado) ,
                                           AV56Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
      lV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
      lV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
      lV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
      lV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
      lV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
      /* Using cursor P09PN2 */
      pr_default.execute(0, new Object[] {AV56Emprcod, lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV68Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV69Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV70Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV72Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV73Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV75Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV77Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV79Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV81Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV82Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV83Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV84Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV86Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV57Clicod), AV58lb_fechaefrom, AV59lb_fechaeto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5569Lb_EstEns = P09PN2_A5569Lb_EstEns[0] ;
         A252CliCod = P09PN2_A252CliCod[0] ;
         A5570Lb_Tipo = P09PN2_A5570Lb_Tipo[0] ;
         A5541Lb_FechaE = P09PN2_A5541Lb_FechaE[0] ;
         A5537Lb_ColNum = P09PN2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09PN2_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09PN2_A5538Lb_ColNomC[0] ;
         A5534Lb_ArtDsc = P09PN2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09PN2_A5533Lb_ArtCod[0] ;
         A5594Lb_cartazf = P09PN2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09PN2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09PN2_A279CliNom[0] ;
         A5532Lb_numero = P09PN2_A5532Lb_numero[0] ;
         A396EmprCod = P09PN2_A396EmprCod[0] ;
         A279CliNom = P09PN2_A279CliNom[0] ;
         GXt_int2 = A14098Lb_Enviado ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5532Lb_numero ;
         GXv_int5[0] = GXt_int2 ;
         new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5) ;
         ensayospendientesenvio_wcexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
         ensayospendientesenvio_wcexportcsv_impl.this.A5532Lb_numero = GXv_int4[0] ;
         ensayospendientesenvio_wcexportcsv_impl.this.GXt_int2 = GXv_int5[0] ;
         A14098Lb_Enviado = GXt_int2 ;
         if ( A14098Lb_Enviado == 0 )
         {
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
               GXt_char6 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char6 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
               ensayospendientesenvio_wcexportcsv_impl.this.GXt_char6 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char6 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A5532Lb_numero, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char6 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char6 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5540Lb_Cartaz, ";", ","), GXv_char3) ;
               ensayospendientesenvio_wcexportcsv_impl.this.GXt_char6 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char6 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A5594Lb_cartazf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char6 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char6 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5533Lb_ArtCod, ";", ","), GXv_char3) ;
               ensayospendientesenvio_wcexportcsv_impl.this.GXt_char6 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char6 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char6 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char6 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5534Lb_ArtDsc, ";", ","), GXv_char3) ;
               ensayospendientesenvio_wcexportcsv_impl.this.GXt_char6 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char6 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char6 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char6 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5538Lb_ColNomC, ";", ","), GXv_char3) ;
               ensayospendientesenvio_wcexportcsv_impl.this.GXt_char6 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char6 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char6 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char6 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5536Lb_ColNom, ";", ","), GXv_char3) ;
               ensayospendientesenvio_wcexportcsv_impl.this.GXt_char6 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char6 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A5537Lb_ColNum, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A5541Lb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char6 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char6 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5570Lb_Tipo, ";", ","), GXv_char3) ;
               ensayospendientesenvio_wcexportcsv_impl.this.GXt_char6 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char6 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV60Dias = (short)((GXutil.ddiff(Gx_date,A5541Lb_FechaE))) ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV60Dias, 4, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=EnsayosPendientesEnvio_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_cartazf", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ArtDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaE", "", "Fecha Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Tipo", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Dias", "", "Dias", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char6 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char6 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EnsayosPendientesEnvio_WCColumnsSelector", GXv_char3) ;
      ensayospendientesenvio_wcexportcsv_impl.this.GXt_char6 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char6 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EnsayosPendientesEnvio_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV88GXV1 = 1 ;
      while ( AV88GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV1));
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
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV36TFLb_numero = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFLb_numero_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV38TFLb_Cartaz = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV39TFLb_Cartaz_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV40TFLb_cartazf = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV42TFLb_ArtCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV43TFLb_ArtCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV44TFLb_ArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV45TFLb_ArtDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV46TFLb_ColNomC = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV47TFLb_ColNomC_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV52TFLb_FechaE = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV61TFLb_Tipo = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV62TFLb_Tipo_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV56Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV57Clicod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV58lb_fechaefrom = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV59lb_fechaeto = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV88GXV1 = (int)(AV88GXV1+1) ;
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
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5570Lb_Tipo = "" ;
      AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = "" ;
      AV34TFCliNom = "" ;
      AV68Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = "" ;
      AV35TFCliNom_Sel = "" ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = "" ;
      AV38TFLb_Cartaz = "" ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = "" ;
      AV39TFLb_Cartaz_Sel = "" ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = GXutil.nullDate() ;
      AV40TFLb_cartazf = GXutil.nullDate() ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = "" ;
      AV42TFLb_ArtCod = "" ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = "" ;
      AV43TFLb_ArtCod_Sel = "" ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = "" ;
      AV44TFLb_ArtDsc = "" ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = "" ;
      AV45TFLb_ArtDsc_Sel = "" ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = "" ;
      AV46TFLb_ColNomC = "" ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = "" ;
      AV47TFLb_ColNomC_Sel = "" ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = "" ;
      AV48TFLb_ColNom = "" ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = "" ;
      AV49TFLb_ColNom_Sel = "" ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = GXutil.nullDate() ;
      AV52TFLb_FechaE = GXutil.nullDate() ;
      AV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = "" ;
      AV61TFLb_Tipo = "" ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = "" ;
      AV62TFLb_Tipo_Sel = "" ;
      scmdbuf = "" ;
      lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = "" ;
      lV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = "" ;
      lV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = "" ;
      lV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = "" ;
      lV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = "" ;
      lV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = "" ;
      lV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = "" ;
      lV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = "" ;
      AV58lb_fechaefrom = GXutil.nullDate() ;
      AV59lb_fechaeto = GXutil.nullDate() ;
      AV56Emprcod = "" ;
      A396EmprCod = "" ;
      P09PN2_A5569Lb_EstEns = new byte[1] ;
      P09PN2_A252CliCod = new int[1] ;
      P09PN2_A5570Lb_Tipo = new String[] {""} ;
      P09PN2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09PN2_A5537Lb_ColNum = new int[1] ;
      P09PN2_A5536Lb_ColNom = new String[] {""} ;
      P09PN2_A5538Lb_ColNomC = new String[] {""} ;
      P09PN2_A5534Lb_ArtDsc = new String[] {""} ;
      P09PN2_A5533Lb_ArtCod = new String[] {""} ;
      P09PN2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09PN2_A5540Lb_Cartaz = new String[] {""} ;
      P09PN2_A279CliNom = new String[] {""} ;
      P09PN2_A5532Lb_numero = new int[1] ;
      P09PN2_A396EmprCod = new String[] {""} ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      Gx_date = GXutil.nullDate() ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char6 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.ensayospendientesenvio_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09PN2_A5569Lb_EstEns, P09PN2_A252CliCod, P09PN2_A5570Lb_Tipo, P09PN2_A5541Lb_FechaE, P09PN2_A5537Lb_ColNum, P09PN2_A5536Lb_ColNom, P09PN2_A5538Lb_ColNomC, P09PN2_A5534Lb_ArtDsc, P09PN2_A5533Lb_ArtCod, P09PN2_A5594Lb_cartazf,
            P09PN2_A5540Lb_Cartaz, P09PN2_A279CliNom, P09PN2_A5532Lb_numero, P09PN2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A5569Lb_EstEns ;
   private byte A14098Lb_Enviado ;
   private byte GXt_int2 ;
   private byte GXv_int5[] ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short AV60Dias ;
   private short Gx_err ;
   private int AV13Random ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int AV69Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ;
   private int AV36TFLb_numero ;
   private int AV70Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ;
   private int AV37TFLb_numero_To ;
   private int AV82Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ;
   private int AV50TFLb_ColNum ;
   private int AV83Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ;
   private int AV51TFLb_ColNum_To ;
   private int AV57Clicod ;
   private int A252CliCod ;
   private int GXv_int4[] ;
   private int AV88GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A5570Lb_Tipo ;
   private String AV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ;
   private String AV34TFCliNom ;
   private String AV68Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ;
   private String AV35TFCliNom_Sel ;
   private String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ;
   private String AV38TFLb_Cartaz ;
   private String AV72Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ;
   private String AV39TFLb_Cartaz_Sel ;
   private String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ;
   private String AV42TFLb_ArtCod ;
   private String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ;
   private String AV43TFLb_ArtCod_Sel ;
   private String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ;
   private String AV44TFLb_ArtDsc ;
   private String AV77Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ;
   private String AV45TFLb_ArtDsc_Sel ;
   private String AV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ;
   private String AV46TFLb_ColNomC ;
   private String AV79Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ;
   private String AV47TFLb_ColNomC_Sel ;
   private String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ;
   private String AV48TFLb_ColNom ;
   private String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ;
   private String AV49TFLb_ColNom_Sel ;
   private String AV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ;
   private String AV61TFLb_Tipo ;
   private String AV86Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ;
   private String AV62TFLb_Tipo_Sel ;
   private String scmdbuf ;
   private String lV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ;
   private String lV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ;
   private String lV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ;
   private String lV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ;
   private String lV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ;
   private String lV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ;
   private String lV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ;
   private String AV56Emprcod ;
   private String A396EmprCod ;
   private String GXt_char6 ;
   private String GXv_char3[] ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV73Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ;
   private java.util.Date AV40TFLb_cartazf ;
   private java.util.Date AV84Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ;
   private java.util.Date AV52TFLb_FechaE ;
   private java.util.Date AV58lb_fechaefrom ;
   private java.util.Date AV59lb_fechaeto ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09PN2_A5569Lb_EstEns ;
   private int[] P09PN2_A252CliCod ;
   private String[] P09PN2_A5570Lb_Tipo ;
   private java.util.Date[] P09PN2_A5541Lb_FechaE ;
   private int[] P09PN2_A5537Lb_ColNum ;
   private String[] P09PN2_A5536Lb_ColNom ;
   private String[] P09PN2_A5538Lb_ColNomC ;
   private String[] P09PN2_A5534Lb_ArtDsc ;
   private String[] P09PN2_A5533Lb_ArtCod ;
   private java.util.Date[] P09PN2_A5594Lb_cartazf ;
   private String[] P09PN2_A5540Lb_Cartaz ;
   private String[] P09PN2_A279CliNom ;
   private int[] P09PN2_A5532Lb_numero ;
   private String[] P09PN2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class ensayospendientesenvio_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09PN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV68Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV69Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV70Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV72Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV73Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV77Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV79Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV82Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV83Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV84Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV86Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV57Clicod ,
                                          java.util.Date AV58lb_fechaefrom ,
                                          java.util.Date AV59lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado ,
                                          String AV56Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[33];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.Lb_EstEns, T1.CliCod, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_cartazf, T1.Lb_Cartaz, T2.CliNom," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV82Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (0==AV83Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV57Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
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
         scmdbuf += " ORDER BY T1.Lb_cartazf" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P09PN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
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
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
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
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
      }
   }

}

