package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnotrecwwexportcsv_impl extends GXWebProcedure
{
   public tnotrecwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TNOTRECWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TNOTRECWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TNOTRECWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reclacacion ID", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Recepcion Id", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Albaran Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Referencia Albaran entrega cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad (K,M)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr Anterior", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reopeado Anterior", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Particion Anterior", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero Albaran Salida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Localizacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario creacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha-Hora entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha entrega", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV96Tnotrecwwds_1_filterfulltext = AV92FilterFullText ;
      AV97Tnotrecwwds_2_tfnr_codigo = AV48TFNr_codigo ;
      AV98Tnotrecwwds_3_tfnr_codigo_to = AV49TFNr_codigo_To ;
      AV99Tnotrecwwds_4_tfnr_albreccod = AV50TFNr_albreccod ;
      AV100Tnotrecwwds_5_tfnr_albreccod_to = AV51TFNr_albreccod_To ;
      AV101Tnotrecwwds_6_tfnr_clicod = AV52TFNr_CliCod ;
      AV102Tnotrecwwds_7_tfnr_clicod_to = AV53TFNr_CliCod_To ;
      AV103Tnotrecwwds_8_tfnr_clinom = AV54TFNr_CliNom ;
      AV104Tnotrecwwds_9_tfnr_clinom_sel = AV55TFNr_CliNom_Sel ;
      AV105Tnotrecwwds_10_tfnr_albent = AV56TFNr_albent ;
      AV106Tnotrecwwds_11_tfnr_albent_sel = AV57TFNr_albent_Sel ;
      AV107Tnotrecwwds_12_tfnr_refcli = AV58TFNr_refcli ;
      AV108Tnotrecwwds_13_tfnr_refcli_sel = AV59TFNr_refcli_Sel ;
      AV109Tnotrecwwds_14_tfnr_artcod = AV60TFNr_artcod ;
      AV110Tnotrecwwds_15_tfnr_artcod_sel = AV61TFNr_artcod_Sel ;
      AV111Tnotrecwwds_16_tfnr_artdsc = AV62TFNr_artdsc ;
      AV112Tnotrecwwds_17_tfnr_artdsc_sel = AV63TFNr_artdsc_Sel ;
      AV113Tnotrecwwds_18_tfnr_colnom = AV64TFNr_colnom ;
      AV114Tnotrecwwds_19_tfnr_colnom_sel = AV65TFNr_colnom_Sel ;
      AV115Tnotrecwwds_20_tfnr_colnum = AV66TFNr_colnum ;
      AV116Tnotrecwwds_21_tfnr_colnum_to = AV67TFNr_colnum_To ;
      AV117Tnotrecwwds_22_tfnr_piezas = AV68TFNr_piezas ;
      AV118Tnotrecwwds_23_tfnr_piezas_to = AV69TFNr_piezas_To ;
      AV119Tnotrecwwds_24_tfnr_unidades = AV70TFNr_unidades ;
      AV120Tnotrecwwds_25_tfnr_unidades_to = AV71TFNr_unidades_To ;
      AV121Tnotrecwwds_26_tfnr_unidad = AV72TFNr_unidad ;
      AV122Tnotrecwwds_27_tfnr_unidad_sel = AV73TFNr_unidad_Sel ;
      AV123Tnotrecwwds_28_tfnr_barcoda = AV74TFNr_barcoda ;
      AV124Tnotrecwwds_29_tfnr_barcoda_to = AV75TFNr_barcoda_To ;
      AV125Tnotrecwwds_30_tfnr_barreoa = AV76TFNr_barreoa ;
      AV126Tnotrecwwds_31_tfnr_barreoa_to = AV77TFNr_barreoa_To ;
      AV127Tnotrecwwds_32_tfnr_barpara = AV78TFNr_barpara ;
      AV128Tnotrecwwds_33_tfnr_barpara_sel = AV79TFNr_barpara_Sel ;
      AV129Tnotrecwwds_34_tfnr_nalb = AV80TFNr_NAlb ;
      AV130Tnotrecwwds_35_tfnr_nalb_to = AV81TFNr_NAlb_To ;
      AV131Tnotrecwwds_36_tfnr_local = AV82TFNr_local ;
      AV132Tnotrecwwds_37_tfnr_local_sel = AV83TFNr_local_Sel ;
      AV133Tnotrecwwds_38_tfnr_user = AV84TFNr_user ;
      AV134Tnotrecwwds_39_tfnr_user_sel = AV85TFNr_user_Sel ;
      AV135Tnotrecwwds_40_tfnr_fecreg = AV86TFNr_fecreg ;
      AV136Tnotrecwwds_41_tfnr_fecent = AV88TFNr_fecent ;
      AV137Tnotrecwwds_42_tfnr_barcod = AV90TFNr_barcod ;
      AV138Tnotrecwwds_43_tfnr_barcod_to = AV91TFNr_barcod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV96Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV97Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV98Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV99Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV100Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV101Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV102Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV104Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV103Tnotrecwwds_8_tfnr_clinom ,
                                           AV106Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV105Tnotrecwwds_10_tfnr_albent ,
                                           AV108Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV107Tnotrecwwds_12_tfnr_refcli ,
                                           AV110Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV109Tnotrecwwds_14_tfnr_artcod ,
                                           AV112Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV111Tnotrecwwds_16_tfnr_artdsc ,
                                           AV114Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV113Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV115Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV116Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV117Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV118Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV119Tnotrecwwds_24_tfnr_unidades ,
                                           AV120Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV122Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV121Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV123Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV124Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV125Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV126Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV128Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV127Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV129Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV130Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV132Tnotrecwwds_37_tfnr_local_sel ,
                                           AV131Tnotrecwwds_36_tfnr_local ,
                                           AV134Tnotrecwwds_39_tfnr_user_sel ,
                                           AV133Tnotrecwwds_38_tfnr_user ,
                                           AV135Tnotrecwwds_40_tfnr_fecreg ,
                                           AV136Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV137Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV138Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV96Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV103Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV103Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV105Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV105Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV107Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV107Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV109Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV109Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV111Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV111Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV113Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV113Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV121Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV121Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV127Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV127Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV131Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV131Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV133Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV133Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P084A2 */
      pr_default.execute(0, new Object[] {lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, lV96Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV97Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV98Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV99Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV100Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV101Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV102Tnotrecwwds_7_tfnr_clicod_to), lV103Tnotrecwwds_8_tfnr_clinom, AV104Tnotrecwwds_9_tfnr_clinom_sel, lV105Tnotrecwwds_10_tfnr_albent, AV106Tnotrecwwds_11_tfnr_albent_sel, lV107Tnotrecwwds_12_tfnr_refcli, AV108Tnotrecwwds_13_tfnr_refcli_sel, lV109Tnotrecwwds_14_tfnr_artcod, AV110Tnotrecwwds_15_tfnr_artcod_sel, lV111Tnotrecwwds_16_tfnr_artdsc, AV112Tnotrecwwds_17_tfnr_artdsc_sel, lV113Tnotrecwwds_18_tfnr_colnom, AV114Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV115Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV116Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV117Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV118Tnotrecwwds_23_tfnr_piezas_to), AV119Tnotrecwwds_24_tfnr_unidades, AV120Tnotrecwwds_25_tfnr_unidades_to, lV121Tnotrecwwds_26_tfnr_unidad, AV122Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV123Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV124Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV125Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV126Tnotrecwwds_31_tfnr_barreoa_to), lV127Tnotrecwwds_32_tfnr_barpara, AV128Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV129Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV130Tnotrecwwds_35_tfnr_nalb_to), lV131Tnotrecwwds_36_tfnr_local, AV132Tnotrecwwds_37_tfnr_local_sel, lV133Tnotrecwwds_38_tfnr_user, AV134Tnotrecwwds_39_tfnr_user_sel, AV135Tnotrecwwds_40_tfnr_fecreg, AV136Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV137Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV138Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5210Nr_barcod = P084A2_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P084A2_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P084A2_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P084A2_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P084A2_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P084A2_n5216Nr_fecreg[0] ;
         A5215Nr_user = P084A2_A5215Nr_user[0] ;
         n5215Nr_user = P084A2_n5215Nr_user[0] ;
         A5214Nr_local = P084A2_A5214Nr_local[0] ;
         n5214Nr_local = P084A2_n5214Nr_local[0] ;
         A12235Nr_NAlb = P084A2_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P084A2_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P084A2_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P084A2_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P084A2_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P084A2_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P084A2_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P084A2_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P084A2_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P084A2_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P084A2_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P084A2_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P084A2_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P084A2_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P084A2_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P084A2_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P084A2_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P084A2_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P084A2_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P084A2_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P084A2_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P084A2_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P084A2_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P084A2_n5200Nr_refcli[0] ;
         A5199Nr_albent = P084A2_A5199Nr_albent[0] ;
         n5199Nr_albent = P084A2_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P084A2_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P084A2_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P084A2_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P084A2_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P084A2_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P084A2_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P084A2_A5198Nr_codigo[0] ;
         A396EmprCod = P084A2_A396EmprCod[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5198Nr_codigo, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5206Nr_albrecc, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5340Nr_CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5341Nr_CliNom, ";", ","), GXv_char3) ;
            tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5199Nr_albent, ";", ","), GXv_char3) ;
            tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5200Nr_refcli, ";", ","), GXv_char3) ;
            tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5201Nr_artcod, ";", ","), GXv_char3) ;
            tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5202Nr_artdsc, ";", ","), GXv_char3) ;
            tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5203Nr_colnom, ";", ","), GXv_char3) ;
            tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5204Nr_colnum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5207Nr_piezas, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5208Nr_unidade, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5209Nr_unidad, ";", ","), GXv_char3) ;
            tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5222Nr_barcoda, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5223Nr_barreoa, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5224Nr_barpara, ";", ","), GXv_char3) ;
            tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A12235Nr_NAlb, 10, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5214Nr_local, ";", ","), GXv_char3) ;
            tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5215Nr_user, ";", ","), GXv_char3) ;
            tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A5216Nr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A5217Nr_fecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5210Nr_barcod, 8, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TNOTRECWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_codigo", "", "Reclacacion ID", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_albreccod", "", "Nº Recepcion Id", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_albent", "", "Nº Albaran Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_refcli", "", "Referencia Albaran entrega cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_artcod", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_artdsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_colnom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_colnum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_piezas", "", "Piezas Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_unidades", "", "Unidades Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_unidad", "", "Unidad (K,M)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_barcoda", "", "Hdr Anterior", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_barreoa", "", "Reopeado Anterior", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_barpara", "", "Particion Anterior", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_NAlb", "", "Numero Albaran Salida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_local", "", "Localizacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_user", "", "Usuario creacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_fecreg", "", "Fecha-Hora entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_fecent", "", "Fecha entrega", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Nr_barcod", "", "Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TNOTRECWWColumnsSelector", GXv_char3) ;
      tnotrecwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TNOTRECWWGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TNOTRECWWGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("TNOTRECWWGridState"), null, null);
      }
      AV28OrderedBy = AV46GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV46GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV139GXV1 = 1 ;
      while ( AV139GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV139GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV92FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CODIGO") == 0 )
         {
            AV48TFNr_codigo = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFNr_codigo_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBRECCOD") == 0 )
         {
            AV50TFNr_albreccod = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFNr_albreccod_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLICOD") == 0 )
         {
            AV52TFNr_CliCod = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFNr_CliCod_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLINOM") == 0 )
         {
            AV54TFNr_CliNom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLINOM_SEL") == 0 )
         {
            AV55TFNr_CliNom_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBENT") == 0 )
         {
            AV56TFNr_albent = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBENT_SEL") == 0 )
         {
            AV57TFNr_albent_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_REFCLI") == 0 )
         {
            AV58TFNr_refcli = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_REFCLI_SEL") == 0 )
         {
            AV59TFNr_refcli_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTCOD") == 0 )
         {
            AV60TFNr_artcod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTCOD_SEL") == 0 )
         {
            AV61TFNr_artcod_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTDSC") == 0 )
         {
            AV62TFNr_artdsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTDSC_SEL") == 0 )
         {
            AV63TFNr_artdsc_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNOM") == 0 )
         {
            AV64TFNr_colnom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNOM_SEL") == 0 )
         {
            AV65TFNr_colnom_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNUM") == 0 )
         {
            AV66TFNr_colnum = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFNr_colnum_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_PIEZAS") == 0 )
         {
            AV68TFNr_piezas = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFNr_piezas_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDADES") == 0 )
         {
            AV70TFNr_unidades = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV71TFNr_unidades_To = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDAD") == 0 )
         {
            AV72TFNr_unidad = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDAD_SEL") == 0 )
         {
            AV73TFNr_unidad_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARCODA") == 0 )
         {
            AV74TFNr_barcoda = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFNr_barcoda_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARREOA") == 0 )
         {
            AV76TFNr_barreoa = (byte)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV77TFNr_barreoa_To = (byte)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARPARA") == 0 )
         {
            AV78TFNr_barpara = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARPARA_SEL") == 0 )
         {
            AV79TFNr_barpara_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_NALB") == 0 )
         {
            AV80TFNr_NAlb = GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV81TFNr_NAlb_To = GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_LOCAL") == 0 )
         {
            AV82TFNr_local = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_LOCAL_SEL") == 0 )
         {
            AV83TFNr_local_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_USER") == 0 )
         {
            AV84TFNr_user = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_USER_SEL") == 0 )
         {
            AV85TFNr_user_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_FECREG") == 0 )
         {
            AV86TFNr_fecreg = localUtil.ctot( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_FECENT") == 0 )
         {
            AV88TFNr_fecent = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARCOD") == 0 )
         {
            AV90TFNr_barcod = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV91TFNr_barcod_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV139GXV1 = (int)(AV139GXV1+1) ;
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
      A5341Nr_CliNom = "" ;
      A5199Nr_albent = "" ;
      A5200Nr_refcli = "" ;
      A5201Nr_artcod = "" ;
      A5202Nr_artdsc = "" ;
      A5203Nr_colnom = "" ;
      A5208Nr_unidade = DecimalUtil.ZERO ;
      A5209Nr_unidad = "" ;
      A5224Nr_barpara = "" ;
      A5214Nr_local = "" ;
      A5215Nr_user = "" ;
      A5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      A5217Nr_fecent = GXutil.nullDate() ;
      AV96Tnotrecwwds_1_filterfulltext = "" ;
      AV92FilterFullText = "" ;
      AV103Tnotrecwwds_8_tfnr_clinom = "" ;
      AV54TFNr_CliNom = "" ;
      AV104Tnotrecwwds_9_tfnr_clinom_sel = "" ;
      AV55TFNr_CliNom_Sel = "" ;
      AV105Tnotrecwwds_10_tfnr_albent = "" ;
      AV56TFNr_albent = "" ;
      AV106Tnotrecwwds_11_tfnr_albent_sel = "" ;
      AV57TFNr_albent_Sel = "" ;
      AV107Tnotrecwwds_12_tfnr_refcli = "" ;
      AV58TFNr_refcli = "" ;
      AV108Tnotrecwwds_13_tfnr_refcli_sel = "" ;
      AV59TFNr_refcli_Sel = "" ;
      AV109Tnotrecwwds_14_tfnr_artcod = "" ;
      AV60TFNr_artcod = "" ;
      AV110Tnotrecwwds_15_tfnr_artcod_sel = "" ;
      AV61TFNr_artcod_Sel = "" ;
      AV111Tnotrecwwds_16_tfnr_artdsc = "" ;
      AV62TFNr_artdsc = "" ;
      AV112Tnotrecwwds_17_tfnr_artdsc_sel = "" ;
      AV63TFNr_artdsc_Sel = "" ;
      AV113Tnotrecwwds_18_tfnr_colnom = "" ;
      AV64TFNr_colnom = "" ;
      AV114Tnotrecwwds_19_tfnr_colnom_sel = "" ;
      AV65TFNr_colnom_Sel = "" ;
      AV119Tnotrecwwds_24_tfnr_unidades = DecimalUtil.ZERO ;
      AV70TFNr_unidades = DecimalUtil.ZERO ;
      AV120Tnotrecwwds_25_tfnr_unidades_to = DecimalUtil.ZERO ;
      AV71TFNr_unidades_To = DecimalUtil.ZERO ;
      AV121Tnotrecwwds_26_tfnr_unidad = "" ;
      AV72TFNr_unidad = "" ;
      AV122Tnotrecwwds_27_tfnr_unidad_sel = "" ;
      AV73TFNr_unidad_Sel = "" ;
      AV127Tnotrecwwds_32_tfnr_barpara = "" ;
      AV78TFNr_barpara = "" ;
      AV128Tnotrecwwds_33_tfnr_barpara_sel = "" ;
      AV79TFNr_barpara_Sel = "" ;
      AV131Tnotrecwwds_36_tfnr_local = "" ;
      AV82TFNr_local = "" ;
      AV132Tnotrecwwds_37_tfnr_local_sel = "" ;
      AV83TFNr_local_Sel = "" ;
      AV133Tnotrecwwds_38_tfnr_user = "" ;
      AV84TFNr_user = "" ;
      AV134Tnotrecwwds_39_tfnr_user_sel = "" ;
      AV85TFNr_user_Sel = "" ;
      AV135Tnotrecwwds_40_tfnr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV86TFNr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV136Tnotrecwwds_41_tfnr_fecent = GXutil.nullDate() ;
      AV88TFNr_fecent = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV96Tnotrecwwds_1_filterfulltext = "" ;
      lV103Tnotrecwwds_8_tfnr_clinom = "" ;
      lV105Tnotrecwwds_10_tfnr_albent = "" ;
      lV107Tnotrecwwds_12_tfnr_refcli = "" ;
      lV109Tnotrecwwds_14_tfnr_artcod = "" ;
      lV111Tnotrecwwds_16_tfnr_artdsc = "" ;
      lV113Tnotrecwwds_18_tfnr_colnom = "" ;
      lV121Tnotrecwwds_26_tfnr_unidad = "" ;
      lV127Tnotrecwwds_32_tfnr_barpara = "" ;
      lV131Tnotrecwwds_36_tfnr_local = "" ;
      lV133Tnotrecwwds_38_tfnr_user = "" ;
      P084A2_A5210Nr_barcod = new int[1] ;
      P084A2_n5210Nr_barcod = new boolean[] {false} ;
      P084A2_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P084A2_n5217Nr_fecent = new boolean[] {false} ;
      P084A2_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P084A2_n5216Nr_fecreg = new boolean[] {false} ;
      P084A2_A5215Nr_user = new String[] {""} ;
      P084A2_n5215Nr_user = new boolean[] {false} ;
      P084A2_A5214Nr_local = new String[] {""} ;
      P084A2_n5214Nr_local = new boolean[] {false} ;
      P084A2_A12235Nr_NAlb = new long[1] ;
      P084A2_n12235Nr_NAlb = new boolean[] {false} ;
      P084A2_A5224Nr_barpara = new String[] {""} ;
      P084A2_n5224Nr_barpara = new boolean[] {false} ;
      P084A2_A5223Nr_barreoa = new byte[1] ;
      P084A2_n5223Nr_barreoa = new boolean[] {false} ;
      P084A2_A5222Nr_barcoda = new int[1] ;
      P084A2_n5222Nr_barcoda = new boolean[] {false} ;
      P084A2_A5209Nr_unidad = new String[] {""} ;
      P084A2_n5209Nr_unidad = new boolean[] {false} ;
      P084A2_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084A2_n5208Nr_unidade = new boolean[] {false} ;
      P084A2_A5207Nr_piezas = new int[1] ;
      P084A2_n5207Nr_piezas = new boolean[] {false} ;
      P084A2_A5204Nr_colnum = new int[1] ;
      P084A2_n5204Nr_colnum = new boolean[] {false} ;
      P084A2_A5203Nr_colnom = new String[] {""} ;
      P084A2_n5203Nr_colnom = new boolean[] {false} ;
      P084A2_A5202Nr_artdsc = new String[] {""} ;
      P084A2_n5202Nr_artdsc = new boolean[] {false} ;
      P084A2_A5201Nr_artcod = new String[] {""} ;
      P084A2_n5201Nr_artcod = new boolean[] {false} ;
      P084A2_A5200Nr_refcli = new String[] {""} ;
      P084A2_n5200Nr_refcli = new boolean[] {false} ;
      P084A2_A5199Nr_albent = new String[] {""} ;
      P084A2_n5199Nr_albent = new boolean[] {false} ;
      P084A2_A5341Nr_CliNom = new String[] {""} ;
      P084A2_n5341Nr_CliNom = new boolean[] {false} ;
      P084A2_A5340Nr_CliCod = new int[1] ;
      P084A2_n5340Nr_CliCod = new boolean[] {false} ;
      P084A2_A5206Nr_albrecc = new int[1] ;
      P084A2_n5206Nr_albrecc = new boolean[] {false} ;
      P084A2_A5198Nr_codigo = new int[1] ;
      P084A2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnotrecwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P084A2_A5210Nr_barcod, P084A2_n5210Nr_barcod, P084A2_A5217Nr_fecent, P084A2_n5217Nr_fecent, P084A2_A5216Nr_fecreg, P084A2_n5216Nr_fecreg, P084A2_A5215Nr_user, P084A2_n5215Nr_user, P084A2_A5214Nr_local, P084A2_n5214Nr_local,
            P084A2_A12235Nr_NAlb, P084A2_n12235Nr_NAlb, P084A2_A5224Nr_barpara, P084A2_n5224Nr_barpara, P084A2_A5223Nr_barreoa, P084A2_n5223Nr_barreoa, P084A2_A5222Nr_barcoda, P084A2_n5222Nr_barcoda, P084A2_A5209Nr_unidad, P084A2_n5209Nr_unidad,
            P084A2_A5208Nr_unidade, P084A2_n5208Nr_unidade, P084A2_A5207Nr_piezas, P084A2_n5207Nr_piezas, P084A2_A5204Nr_colnum, P084A2_n5204Nr_colnum, P084A2_A5203Nr_colnom, P084A2_n5203Nr_colnom, P084A2_A5202Nr_artdsc, P084A2_n5202Nr_artdsc,
            P084A2_A5201Nr_artcod, P084A2_n5201Nr_artcod, P084A2_A5200Nr_refcli, P084A2_n5200Nr_refcli, P084A2_A5199Nr_albent, P084A2_n5199Nr_albent, P084A2_A5341Nr_CliNom, P084A2_n5341Nr_CliNom, P084A2_A5340Nr_CliCod, P084A2_n5340Nr_CliCod,
            P084A2_A5206Nr_albrecc, P084A2_n5206Nr_albrecc, P084A2_A5198Nr_codigo, P084A2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5223Nr_barreoa ;
   private byte AV125Tnotrecwwds_30_tfnr_barreoa ;
   private byte AV76TFNr_barreoa ;
   private byte AV126Tnotrecwwds_31_tfnr_barreoa_to ;
   private byte AV77TFNr_barreoa_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A5198Nr_codigo ;
   private int A5206Nr_albrecc ;
   private int A5340Nr_CliCod ;
   private int A5204Nr_colnum ;
   private int A5207Nr_piezas ;
   private int A5222Nr_barcoda ;
   private int A5210Nr_barcod ;
   private int AV97Tnotrecwwds_2_tfnr_codigo ;
   private int AV48TFNr_codigo ;
   private int AV98Tnotrecwwds_3_tfnr_codigo_to ;
   private int AV49TFNr_codigo_To ;
   private int AV99Tnotrecwwds_4_tfnr_albreccod ;
   private int AV50TFNr_albreccod ;
   private int AV100Tnotrecwwds_5_tfnr_albreccod_to ;
   private int AV51TFNr_albreccod_To ;
   private int AV101Tnotrecwwds_6_tfnr_clicod ;
   private int AV52TFNr_CliCod ;
   private int AV102Tnotrecwwds_7_tfnr_clicod_to ;
   private int AV53TFNr_CliCod_To ;
   private int AV115Tnotrecwwds_20_tfnr_colnum ;
   private int AV66TFNr_colnum ;
   private int AV116Tnotrecwwds_21_tfnr_colnum_to ;
   private int AV67TFNr_colnum_To ;
   private int AV117Tnotrecwwds_22_tfnr_piezas ;
   private int AV68TFNr_piezas ;
   private int AV118Tnotrecwwds_23_tfnr_piezas_to ;
   private int AV69TFNr_piezas_To ;
   private int AV123Tnotrecwwds_28_tfnr_barcoda ;
   private int AV74TFNr_barcoda ;
   private int AV124Tnotrecwwds_29_tfnr_barcoda_to ;
   private int AV75TFNr_barcoda_To ;
   private int AV137Tnotrecwwds_42_tfnr_barcod ;
   private int AV90TFNr_barcod ;
   private int AV138Tnotrecwwds_43_tfnr_barcod_to ;
   private int AV91TFNr_barcod_To ;
   private int AV139GXV1 ;
   private long A12235Nr_NAlb ;
   private long AV129Tnotrecwwds_34_tfnr_nalb ;
   private long AV80TFNr_NAlb ;
   private long AV130Tnotrecwwds_35_tfnr_nalb_to ;
   private long AV81TFNr_NAlb_To ;
   private java.math.BigDecimal A5208Nr_unidade ;
   private java.math.BigDecimal AV119Tnotrecwwds_24_tfnr_unidades ;
   private java.math.BigDecimal AV70TFNr_unidades ;
   private java.math.BigDecimal AV120Tnotrecwwds_25_tfnr_unidades_to ;
   private java.math.BigDecimal AV71TFNr_unidades_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A5341Nr_CliNom ;
   private String A5199Nr_albent ;
   private String A5200Nr_refcli ;
   private String A5201Nr_artcod ;
   private String A5202Nr_artdsc ;
   private String A5203Nr_colnom ;
   private String A5209Nr_unidad ;
   private String A5224Nr_barpara ;
   private String A5214Nr_local ;
   private String A5215Nr_user ;
   private String AV103Tnotrecwwds_8_tfnr_clinom ;
   private String AV54TFNr_CliNom ;
   private String AV104Tnotrecwwds_9_tfnr_clinom_sel ;
   private String AV55TFNr_CliNom_Sel ;
   private String AV105Tnotrecwwds_10_tfnr_albent ;
   private String AV56TFNr_albent ;
   private String AV106Tnotrecwwds_11_tfnr_albent_sel ;
   private String AV57TFNr_albent_Sel ;
   private String AV107Tnotrecwwds_12_tfnr_refcli ;
   private String AV58TFNr_refcli ;
   private String AV108Tnotrecwwds_13_tfnr_refcli_sel ;
   private String AV59TFNr_refcli_Sel ;
   private String AV109Tnotrecwwds_14_tfnr_artcod ;
   private String AV60TFNr_artcod ;
   private String AV110Tnotrecwwds_15_tfnr_artcod_sel ;
   private String AV61TFNr_artcod_Sel ;
   private String AV111Tnotrecwwds_16_tfnr_artdsc ;
   private String AV62TFNr_artdsc ;
   private String AV112Tnotrecwwds_17_tfnr_artdsc_sel ;
   private String AV63TFNr_artdsc_Sel ;
   private String AV113Tnotrecwwds_18_tfnr_colnom ;
   private String AV64TFNr_colnom ;
   private String AV114Tnotrecwwds_19_tfnr_colnom_sel ;
   private String AV65TFNr_colnom_Sel ;
   private String AV121Tnotrecwwds_26_tfnr_unidad ;
   private String AV72TFNr_unidad ;
   private String AV122Tnotrecwwds_27_tfnr_unidad_sel ;
   private String AV73TFNr_unidad_Sel ;
   private String AV127Tnotrecwwds_32_tfnr_barpara ;
   private String AV78TFNr_barpara ;
   private String AV128Tnotrecwwds_33_tfnr_barpara_sel ;
   private String AV79TFNr_barpara_Sel ;
   private String AV131Tnotrecwwds_36_tfnr_local ;
   private String AV82TFNr_local ;
   private String AV132Tnotrecwwds_37_tfnr_local_sel ;
   private String AV83TFNr_local_Sel ;
   private String AV133Tnotrecwwds_38_tfnr_user ;
   private String AV84TFNr_user ;
   private String AV134Tnotrecwwds_39_tfnr_user_sel ;
   private String AV85TFNr_user_Sel ;
   private String scmdbuf ;
   private String lV103Tnotrecwwds_8_tfnr_clinom ;
   private String lV105Tnotrecwwds_10_tfnr_albent ;
   private String lV107Tnotrecwwds_12_tfnr_refcli ;
   private String lV109Tnotrecwwds_14_tfnr_artcod ;
   private String lV111Tnotrecwwds_16_tfnr_artdsc ;
   private String lV113Tnotrecwwds_18_tfnr_colnom ;
   private String lV121Tnotrecwwds_26_tfnr_unidad ;
   private String lV127Tnotrecwwds_32_tfnr_barpara ;
   private String lV131Tnotrecwwds_36_tfnr_local ;
   private String lV133Tnotrecwwds_38_tfnr_user ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A5216Nr_fecreg ;
   private java.util.Date AV135Tnotrecwwds_40_tfnr_fecreg ;
   private java.util.Date AV86TFNr_fecreg ;
   private java.util.Date A5217Nr_fecent ;
   private java.util.Date AV136Tnotrecwwds_41_tfnr_fecent ;
   private java.util.Date AV88TFNr_fecent ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n5210Nr_barcod ;
   private boolean n5217Nr_fecent ;
   private boolean n5216Nr_fecreg ;
   private boolean n5215Nr_user ;
   private boolean n5214Nr_local ;
   private boolean n12235Nr_NAlb ;
   private boolean n5224Nr_barpara ;
   private boolean n5223Nr_barreoa ;
   private boolean n5222Nr_barcoda ;
   private boolean n5209Nr_unidad ;
   private boolean n5208Nr_unidade ;
   private boolean n5207Nr_piezas ;
   private boolean n5204Nr_colnum ;
   private boolean n5203Nr_colnom ;
   private boolean n5202Nr_artdsc ;
   private boolean n5201Nr_artcod ;
   private boolean n5200Nr_refcli ;
   private boolean n5199Nr_albent ;
   private boolean n5341Nr_CliNom ;
   private boolean n5340Nr_CliCod ;
   private boolean n5206Nr_albrecc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV96Tnotrecwwds_1_filterfulltext ;
   private String AV92FilterFullText ;
   private String lV96Tnotrecwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P084A2_A5210Nr_barcod ;
   private boolean[] P084A2_n5210Nr_barcod ;
   private java.util.Date[] P084A2_A5217Nr_fecent ;
   private boolean[] P084A2_n5217Nr_fecent ;
   private java.util.Date[] P084A2_A5216Nr_fecreg ;
   private boolean[] P084A2_n5216Nr_fecreg ;
   private String[] P084A2_A5215Nr_user ;
   private boolean[] P084A2_n5215Nr_user ;
   private String[] P084A2_A5214Nr_local ;
   private boolean[] P084A2_n5214Nr_local ;
   private long[] P084A2_A12235Nr_NAlb ;
   private boolean[] P084A2_n12235Nr_NAlb ;
   private String[] P084A2_A5224Nr_barpara ;
   private boolean[] P084A2_n5224Nr_barpara ;
   private byte[] P084A2_A5223Nr_barreoa ;
   private boolean[] P084A2_n5223Nr_barreoa ;
   private int[] P084A2_A5222Nr_barcoda ;
   private boolean[] P084A2_n5222Nr_barcoda ;
   private String[] P084A2_A5209Nr_unidad ;
   private boolean[] P084A2_n5209Nr_unidad ;
   private java.math.BigDecimal[] P084A2_A5208Nr_unidade ;
   private boolean[] P084A2_n5208Nr_unidade ;
   private int[] P084A2_A5207Nr_piezas ;
   private boolean[] P084A2_n5207Nr_piezas ;
   private int[] P084A2_A5204Nr_colnum ;
   private boolean[] P084A2_n5204Nr_colnum ;
   private String[] P084A2_A5203Nr_colnom ;
   private boolean[] P084A2_n5203Nr_colnom ;
   private String[] P084A2_A5202Nr_artdsc ;
   private boolean[] P084A2_n5202Nr_artdsc ;
   private String[] P084A2_A5201Nr_artcod ;
   private boolean[] P084A2_n5201Nr_artcod ;
   private String[] P084A2_A5200Nr_refcli ;
   private boolean[] P084A2_n5200Nr_refcli ;
   private String[] P084A2_A5199Nr_albent ;
   private boolean[] P084A2_n5199Nr_albent ;
   private String[] P084A2_A5341Nr_CliNom ;
   private boolean[] P084A2_n5341Nr_CliNom ;
   private int[] P084A2_A5340Nr_CliCod ;
   private boolean[] P084A2_n5340Nr_CliCod ;
   private int[] P084A2_A5206Nr_albrecc ;
   private boolean[] P084A2_n5206Nr_albrecc ;
   private int[] P084A2_A5198Nr_codigo ;
   private String[] P084A2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV46GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV47GridStateFilterValue ;
}

final  class tnotrecwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P084A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV96Tnotrecwwds_1_filterfulltext ,
                                          int AV97Tnotrecwwds_2_tfnr_codigo ,
                                          int AV98Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV99Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV100Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV101Tnotrecwwds_6_tfnr_clicod ,
                                          int AV102Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV104Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV103Tnotrecwwds_8_tfnr_clinom ,
                                          String AV106Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV105Tnotrecwwds_10_tfnr_albent ,
                                          String AV108Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV107Tnotrecwwds_12_tfnr_refcli ,
                                          String AV110Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV109Tnotrecwwds_14_tfnr_artcod ,
                                          String AV112Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV111Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV114Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV113Tnotrecwwds_18_tfnr_colnom ,
                                          int AV115Tnotrecwwds_20_tfnr_colnum ,
                                          int AV116Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV117Tnotrecwwds_22_tfnr_piezas ,
                                          int AV118Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV119Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV120Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV122Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV121Tnotrecwwds_26_tfnr_unidad ,
                                          int AV123Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV124Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV125Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV126Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV128Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV127Tnotrecwwds_32_tfnr_barpara ,
                                          long AV129Tnotrecwwds_34_tfnr_nalb ,
                                          long AV130Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV132Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV131Tnotrecwwds_36_tfnr_local ,
                                          String AV134Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV133Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV135Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV136Tnotrecwwds_41_tfnr_fecent ,
                                          int AV137Tnotrecwwds_42_tfnr_barcod ,
                                          int AV138Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[62];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom, Nr_artdsc," ;
      scmdbuf += " Nr_artcod, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV96Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
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
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
         GXv_int6[18] = (byte)(1) ;
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV98Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV99Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV100Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV101Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV102Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV105Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV107Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV109Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV113Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV121Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (0==AV123Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV127Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV131Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV133Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV136Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( ! (0==AV137Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (0==AV138Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_albrecc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_albrecc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_codigo" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_codigo DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_CliCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_CliNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_albent" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_albent DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_refcli" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_refcli DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_artcod" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_artcod DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_artdsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_artdsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_colnom" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_colnom DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_colnum" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_colnum DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_piezas" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_piezas DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_unidade" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_unidade DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_unidad" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_unidad DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barcoda" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barcoda DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barreoa" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barreoa DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barpara" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barpara DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_NAlb" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_NAlb DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_local" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_local DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_user" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_user DESC" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_fecreg" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_fecreg DESC" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_fecent" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_fecent DESC" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barcod" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barcod DESC" ;
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
                  return conditional_P084A2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , ((Boolean) dynConstraints[66]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
      }
   }

}

