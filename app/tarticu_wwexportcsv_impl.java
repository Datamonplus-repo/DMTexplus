package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarticu_wwexportcsv_impl extends GXWebProcedure
{
   public tarticu_wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "Tarticu_WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Tarticu_WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Tarticu_WWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pml", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Grm2", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rdto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ancho Ac", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artículo Comercial", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Activo?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV64Tarticu_wwds_1_filterfulltext = AV30FilterFullText ;
      AV65Tarticu_wwds_2_tfclicod = AV38TFCliCod ;
      AV66Tarticu_wwds_3_tfclicod_to = AV39TFCliCod_To ;
      AV67Tarticu_wwds_4_tfclinom = AV40TFCliNom ;
      AV68Tarticu_wwds_5_tfclinom_sel = AV41TFCliNom_Sel ;
      AV69Tarticu_wwds_6_tfartcod = AV42TFArtCod ;
      AV70Tarticu_wwds_7_tfartcod_sel = AV43TFArtCod_Sel ;
      AV71Tarticu_wwds_8_tfartdsc = AV44TFArtDsc ;
      AV72Tarticu_wwds_9_tfartdsc_sel = AV45TFArtDsc_Sel ;
      AV73Tarticu_wwds_10_tftipartcod = AV46TFTipArtCod ;
      AV74Tarticu_wwds_11_tftipartcod_to = AV47TFTipArtCod_To ;
      AV75Tarticu_wwds_12_tftipartdsc = AV48TFTipArtDsc ;
      AV76Tarticu_wwds_13_tftipartdsc_sel = AV49TFTipArtDsc_Sel ;
      AV77Tarticu_wwds_14_tfartpml = AV50TFArtPml ;
      AV78Tarticu_wwds_15_tfartpml_to = AV51TFArtPml_To ;
      AV79Tarticu_wwds_16_tfartgraaca = AV52TFArtGraAca ;
      AV80Tarticu_wwds_17_tfartgraaca_to = AV53TFArtGraAca_To ;
      AV81Tarticu_wwds_18_tfartren = AV54TFArtRen ;
      AV82Tarticu_wwds_19_tfartren_to = AV55TFArtRen_To ;
      AV83Tarticu_wwds_20_tfartacamin = AV56TFArtAcaMin ;
      AV84Tarticu_wwds_21_tfartacamin_to = AV57TFArtAcaMin_To ;
      AV85Tarticu_wwds_22_tfartcomer = AV58TFArtComer ;
      AV86Tarticu_wwds_23_tfartcomer_sel = AV59TFArtComer_Sel ;
      AV87Tarticu_wwds_24_tfartactivo_sel = AV60TFArtActivo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Tarticu_wwds_1_filterfulltext ,
                                           Integer.valueOf(AV65Tarticu_wwds_2_tfclicod) ,
                                           Integer.valueOf(AV66Tarticu_wwds_3_tfclicod_to) ,
                                           AV68Tarticu_wwds_5_tfclinom_sel ,
                                           AV67Tarticu_wwds_4_tfclinom ,
                                           AV70Tarticu_wwds_7_tfartcod_sel ,
                                           AV69Tarticu_wwds_6_tfartcod ,
                                           AV72Tarticu_wwds_9_tfartdsc_sel ,
                                           AV71Tarticu_wwds_8_tfartdsc ,
                                           Short.valueOf(AV73Tarticu_wwds_10_tftipartcod) ,
                                           Short.valueOf(AV74Tarticu_wwds_11_tftipartcod_to) ,
                                           AV76Tarticu_wwds_13_tftipartdsc_sel ,
                                           AV75Tarticu_wwds_12_tftipartdsc ,
                                           Short.valueOf(AV77Tarticu_wwds_14_tfartpml) ,
                                           Short.valueOf(AV78Tarticu_wwds_15_tfartpml_to) ,
                                           Short.valueOf(AV79Tarticu_wwds_16_tfartgraaca) ,
                                           Short.valueOf(AV80Tarticu_wwds_17_tfartgraaca_to) ,
                                           AV81Tarticu_wwds_18_tfartren ,
                                           AV82Tarticu_wwds_19_tfartren_to ,
                                           Short.valueOf(AV83Tarticu_wwds_20_tfartacamin) ,
                                           Short.valueOf(AV84Tarticu_wwds_21_tfartacamin_to) ,
                                           AV86Tarticu_wwds_23_tfartcomer_sel ,
                                           AV85Tarticu_wwds_22_tfartcomer ,
                                           AV87Tarticu_wwds_24_tfartactivo_sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A14295ArtActivo ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV64Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV67Tarticu_wwds_4_tfclinom), 30, "%") ;
      lV69Tarticu_wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV69Tarticu_wwds_6_tfartcod), 16, "%") ;
      lV71Tarticu_wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV71Tarticu_wwds_8_tfartdsc), 26, "%") ;
      lV75Tarticu_wwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV75Tarticu_wwds_12_tftipartdsc), 30, "%") ;
      lV85Tarticu_wwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV85Tarticu_wwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P0A9E2 */
      pr_default.execute(0, new Object[] {lV64Tarticu_wwds_1_filterfulltext, lV64Tarticu_wwds_1_filterfulltext, lV64Tarticu_wwds_1_filterfulltext, lV64Tarticu_wwds_1_filterfulltext, lV64Tarticu_wwds_1_filterfulltext, lV64Tarticu_wwds_1_filterfulltext, lV64Tarticu_wwds_1_filterfulltext, lV64Tarticu_wwds_1_filterfulltext, lV64Tarticu_wwds_1_filterfulltext, lV64Tarticu_wwds_1_filterfulltext, lV64Tarticu_wwds_1_filterfulltext, Integer.valueOf(AV65Tarticu_wwds_2_tfclicod), Integer.valueOf(AV66Tarticu_wwds_3_tfclicod_to), lV67Tarticu_wwds_4_tfclinom, AV68Tarticu_wwds_5_tfclinom_sel, lV69Tarticu_wwds_6_tfartcod, AV70Tarticu_wwds_7_tfartcod_sel, lV71Tarticu_wwds_8_tfartdsc, AV72Tarticu_wwds_9_tfartdsc_sel, Short.valueOf(AV73Tarticu_wwds_10_tftipartcod), Short.valueOf(AV74Tarticu_wwds_11_tftipartcod_to), lV75Tarticu_wwds_12_tftipartdsc, AV76Tarticu_wwds_13_tftipartdsc_sel, Short.valueOf(AV77Tarticu_wwds_14_tfartpml), Short.valueOf(AV78Tarticu_wwds_15_tfartpml_to), Short.valueOf(AV79Tarticu_wwds_16_tfartgraaca), Short.valueOf(AV80Tarticu_wwds_17_tfartgraaca_to), AV81Tarticu_wwds_18_tfartren, AV82Tarticu_wwds_19_tfartren_to, Short.valueOf(AV83Tarticu_wwds_20_tfartacamin), Short.valueOf(AV84Tarticu_wwds_21_tfartacamin_to), lV85Tarticu_wwds_22_tfartcomer, AV86Tarticu_wwds_23_tfartcomer_sel, AV87Tarticu_wwds_24_tfartactivo_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = P0A9E2_A10045CliAct[0] ;
         A14295ArtActivo = P0A9E2_A14295ArtActivo[0] ;
         A5741ArtComer = P0A9E2_A5741ArtComer[0] ;
         n5741ArtComer = P0A9E2_n5741ArtComer[0] ;
         A63ArtAcaMin = P0A9E2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P0A9E2_n63ArtAcaMin[0] ;
         A95ArtRen = P0A9E2_A95ArtRen[0] ;
         n95ArtRen = P0A9E2_n95ArtRen[0] ;
         A1903ArtGraAca = P0A9E2_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P0A9E2_n1903ArtGraAca[0] ;
         A1148ArtPml = P0A9E2_A1148ArtPml[0] ;
         n1148ArtPml = P0A9E2_n1148ArtPml[0] ;
         A830TipArtDsc = P0A9E2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9E2_n830TipArtDsc[0] ;
         A829TipArtCod = P0A9E2_A829TipArtCod[0] ;
         A69ArtDsc = P0A9E2_A69ArtDsc[0] ;
         n69ArtDsc = P0A9E2_n69ArtDsc[0] ;
         A65ArtCod = P0A9E2_A65ArtCod[0] ;
         A279CliNom = P0A9E2_A279CliNom[0] ;
         A252CliCod = P0A9E2_A252CliCod[0] ;
         A396EmprCod = P0A9E2_A396EmprCod[0] ;
         A10045CliAct = P0A9E2_A10045CliAct[0] ;
         A279CliNom = P0A9E2_A279CliNom[0] ;
         A830TipArtDsc = P0A9E2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9E2_n830TipArtDsc[0] ;
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
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            tarticu_wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A65ArtCod, ";", ","), GXv_char3) ;
            tarticu_wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A69ArtDsc, ";", ","), GXv_char3) ;
            tarticu_wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A829TipArtCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A830TipArtDsc, ";", ","), GXv_char3) ;
            tarticu_wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1148ArtPml, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1903ArtGraAca, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A95ArtRen, 6, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A63ArtAcaMin, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV31NProc, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV32ProCods, ";", ","), GXv_char3) ;
            tarticu_wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV33ProDscs, ";", ","), GXv_char3) ;
            tarticu_wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV34ArtProCod, ";", ","), GXv_char3) ;
            tarticu_wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5741ArtComer, ";", ","), GXv_char3) ;
            tarticu_wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14295ArtActivo, ";", ","), GXv_char3) ;
            tarticu_wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=Tarticu_WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtCod", "", "Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipArtCod", "", "Tipo Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipArtDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtPml", "", "Pml", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtGraAca", "", "Grm2", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtRen", "", "Rdto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtAcaMin", "", "Ancho Ac", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&NProc", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&ProCods", "", "Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&ProDscs", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&ArtProCod", "", "Acs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtComer", "", "Artículo Comercial", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtActivo", "", "Activo?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Tarticu_WWColumnsSelector", GXv_char3) ;
      tarticu_wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Tarticu_WWGridState"), "") == 0 )
      {
         AV36GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Tarticu_WWGridState"), null, null);
      }
      else
      {
         AV36GridState.fromxml(AV19Session.getValue("Tarticu_WWGridState"), null, null);
      }
      AV28OrderedBy = AV36GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV36GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV88GXV1 = 1 ;
      while ( AV88GXV1 <= AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV37GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV1));
         if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV42TFArtCod = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV43TFArtCod_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV44TFArtDsc = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV45TFArtDsc_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV46TFTipArtCod = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFTipArtCod_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV48TFTipArtDsc = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV49TFTipArtDsc_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPML") == 0 )
         {
            AV50TFArtPml = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFArtPml_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTGRAACA") == 0 )
         {
            AV52TFArtGraAca = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFArtGraAca_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTREN") == 0 )
         {
            AV54TFArtRen = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFArtRen_To = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACAMIN") == 0 )
         {
            AV56TFArtAcaMin = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFArtAcaMin_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER") == 0 )
         {
            AV58TFArtComer = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER_SEL") == 0 )
         {
            AV59TFArtComer_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACTIVO_SEL") == 0 )
         {
            AV60TFArtActivo_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A5741ArtComer = "" ;
      A14295ArtActivo = "" ;
      AV64Tarticu_wwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV67Tarticu_wwds_4_tfclinom = "" ;
      AV40TFCliNom = "" ;
      AV68Tarticu_wwds_5_tfclinom_sel = "" ;
      AV41TFCliNom_Sel = "" ;
      AV69Tarticu_wwds_6_tfartcod = "" ;
      AV42TFArtCod = "" ;
      AV70Tarticu_wwds_7_tfartcod_sel = "" ;
      AV43TFArtCod_Sel = "" ;
      AV71Tarticu_wwds_8_tfartdsc = "" ;
      AV44TFArtDsc = "" ;
      AV72Tarticu_wwds_9_tfartdsc_sel = "" ;
      AV45TFArtDsc_Sel = "" ;
      AV75Tarticu_wwds_12_tftipartdsc = "" ;
      AV48TFTipArtDsc = "" ;
      AV76Tarticu_wwds_13_tftipartdsc_sel = "" ;
      AV49TFTipArtDsc_Sel = "" ;
      AV81Tarticu_wwds_18_tfartren = DecimalUtil.ZERO ;
      AV54TFArtRen = DecimalUtil.ZERO ;
      AV82Tarticu_wwds_19_tfartren_to = DecimalUtil.ZERO ;
      AV55TFArtRen_To = DecimalUtil.ZERO ;
      AV85Tarticu_wwds_22_tfartcomer = "" ;
      AV58TFArtComer = "" ;
      AV86Tarticu_wwds_23_tfartcomer_sel = "" ;
      AV59TFArtComer_Sel = "" ;
      AV87Tarticu_wwds_24_tfartactivo_sel = "" ;
      AV60TFArtActivo_Sel = "" ;
      scmdbuf = "" ;
      lV64Tarticu_wwds_1_filterfulltext = "" ;
      lV67Tarticu_wwds_4_tfclinom = "" ;
      lV69Tarticu_wwds_6_tfartcod = "" ;
      lV71Tarticu_wwds_8_tfartdsc = "" ;
      lV75Tarticu_wwds_12_tftipartdsc = "" ;
      lV85Tarticu_wwds_22_tfartcomer = "" ;
      A10045CliAct = "" ;
      P0A9E2_A10045CliAct = new String[] {""} ;
      P0A9E2_A14295ArtActivo = new String[] {""} ;
      P0A9E2_A5741ArtComer = new String[] {""} ;
      P0A9E2_n5741ArtComer = new boolean[] {false} ;
      P0A9E2_A63ArtAcaMin = new short[1] ;
      P0A9E2_n63ArtAcaMin = new boolean[] {false} ;
      P0A9E2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9E2_n95ArtRen = new boolean[] {false} ;
      P0A9E2_A1903ArtGraAca = new short[1] ;
      P0A9E2_n1903ArtGraAca = new boolean[] {false} ;
      P0A9E2_A1148ArtPml = new short[1] ;
      P0A9E2_n1148ArtPml = new boolean[] {false} ;
      P0A9E2_A830TipArtDsc = new String[] {""} ;
      P0A9E2_n830TipArtDsc = new boolean[] {false} ;
      P0A9E2_A829TipArtCod = new short[1] ;
      P0A9E2_A69ArtDsc = new String[] {""} ;
      P0A9E2_n69ArtDsc = new boolean[] {false} ;
      P0A9E2_A65ArtCod = new String[] {""} ;
      P0A9E2_A279CliNom = new String[] {""} ;
      P0A9E2_A252CliCod = new int[1] ;
      P0A9E2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV32ProCods = "" ;
      AV33ProDscs = "" ;
      AV34ArtProCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV36GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV37GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0A9E2_A10045CliAct, P0A9E2_A14295ArtActivo, P0A9E2_A5741ArtComer, P0A9E2_n5741ArtComer, P0A9E2_A63ArtAcaMin, P0A9E2_n63ArtAcaMin, P0A9E2_A95ArtRen, P0A9E2_n95ArtRen, P0A9E2_A1903ArtGraAca, P0A9E2_n1903ArtGraAca,
            P0A9E2_A1148ArtPml, P0A9E2_n1148ArtPml, P0A9E2_A830TipArtDsc, P0A9E2_n830TipArtDsc, P0A9E2_A829TipArtCod, P0A9E2_A69ArtDsc, P0A9E2_n69ArtDsc, P0A9E2_A65ArtCod, P0A9E2_A279CliNom, P0A9E2_A252CliCod,
            P0A9E2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short AV73Tarticu_wwds_10_tftipartcod ;
   private short AV46TFTipArtCod ;
   private short AV74Tarticu_wwds_11_tftipartcod_to ;
   private short AV47TFTipArtCod_To ;
   private short AV77Tarticu_wwds_14_tfartpml ;
   private short AV50TFArtPml ;
   private short AV78Tarticu_wwds_15_tfartpml_to ;
   private short AV51TFArtPml_To ;
   private short AV79Tarticu_wwds_16_tfartgraaca ;
   private short AV52TFArtGraAca ;
   private short AV80Tarticu_wwds_17_tfartgraaca_to ;
   private short AV53TFArtGraAca_To ;
   private short AV83Tarticu_wwds_20_tfartacamin ;
   private short AV56TFArtAcaMin ;
   private short AV84Tarticu_wwds_21_tfartacamin_to ;
   private short AV57TFArtAcaMin_To ;
   private short AV28OrderedBy ;
   private short AV31NProc ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int AV65Tarticu_wwds_2_tfclicod ;
   private int AV38TFCliCod ;
   private int AV66Tarticu_wwds_3_tfclicod_to ;
   private int AV39TFCliCod_To ;
   private int AV88GXV1 ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal AV81Tarticu_wwds_18_tfartren ;
   private java.math.BigDecimal AV54TFArtRen ;
   private java.math.BigDecimal AV82Tarticu_wwds_19_tfartren_to ;
   private java.math.BigDecimal AV55TFArtRen_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String A5741ArtComer ;
   private String A14295ArtActivo ;
   private String AV67Tarticu_wwds_4_tfclinom ;
   private String AV40TFCliNom ;
   private String AV68Tarticu_wwds_5_tfclinom_sel ;
   private String AV41TFCliNom_Sel ;
   private String AV69Tarticu_wwds_6_tfartcod ;
   private String AV42TFArtCod ;
   private String AV70Tarticu_wwds_7_tfartcod_sel ;
   private String AV43TFArtCod_Sel ;
   private String AV71Tarticu_wwds_8_tfartdsc ;
   private String AV44TFArtDsc ;
   private String AV72Tarticu_wwds_9_tfartdsc_sel ;
   private String AV45TFArtDsc_Sel ;
   private String AV75Tarticu_wwds_12_tftipartdsc ;
   private String AV48TFTipArtDsc ;
   private String AV76Tarticu_wwds_13_tftipartdsc_sel ;
   private String AV49TFTipArtDsc_Sel ;
   private String AV85Tarticu_wwds_22_tfartcomer ;
   private String AV58TFArtComer ;
   private String AV86Tarticu_wwds_23_tfartcomer_sel ;
   private String AV59TFArtComer_Sel ;
   private String AV87Tarticu_wwds_24_tfartactivo_sel ;
   private String AV60TFArtActivo_Sel ;
   private String scmdbuf ;
   private String lV67Tarticu_wwds_4_tfclinom ;
   private String lV69Tarticu_wwds_6_tfartcod ;
   private String lV71Tarticu_wwds_8_tfartdsc ;
   private String lV75Tarticu_wwds_12_tftipartdsc ;
   private String lV85Tarticu_wwds_22_tfartcomer ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private String AV32ProCods ;
   private String AV33ProDscs ;
   private String AV34ArtProCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n5741ArtComer ;
   private boolean n63ArtAcaMin ;
   private boolean n95ArtRen ;
   private boolean n1903ArtGraAca ;
   private boolean n1148ArtPml ;
   private boolean n830TipArtDsc ;
   private boolean n69ArtDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV64Tarticu_wwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV64Tarticu_wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9E2_A10045CliAct ;
   private String[] P0A9E2_A14295ArtActivo ;
   private String[] P0A9E2_A5741ArtComer ;
   private boolean[] P0A9E2_n5741ArtComer ;
   private short[] P0A9E2_A63ArtAcaMin ;
   private boolean[] P0A9E2_n63ArtAcaMin ;
   private java.math.BigDecimal[] P0A9E2_A95ArtRen ;
   private boolean[] P0A9E2_n95ArtRen ;
   private short[] P0A9E2_A1903ArtGraAca ;
   private boolean[] P0A9E2_n1903ArtGraAca ;
   private short[] P0A9E2_A1148ArtPml ;
   private boolean[] P0A9E2_n1148ArtPml ;
   private String[] P0A9E2_A830TipArtDsc ;
   private boolean[] P0A9E2_n830TipArtDsc ;
   private short[] P0A9E2_A829TipArtCod ;
   private String[] P0A9E2_A69ArtDsc ;
   private boolean[] P0A9E2_n69ArtDsc ;
   private String[] P0A9E2_A65ArtCod ;
   private String[] P0A9E2_A279CliNom ;
   private int[] P0A9E2_A252CliCod ;
   private String[] P0A9E2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV36GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV37GridStateFilterValue ;
}

final  class tarticu_wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Tarticu_wwds_1_filterfulltext ,
                                          int AV65Tarticu_wwds_2_tfclicod ,
                                          int AV66Tarticu_wwds_3_tfclicod_to ,
                                          String AV68Tarticu_wwds_5_tfclinom_sel ,
                                          String AV67Tarticu_wwds_4_tfclinom ,
                                          String AV70Tarticu_wwds_7_tfartcod_sel ,
                                          String AV69Tarticu_wwds_6_tfartcod ,
                                          String AV72Tarticu_wwds_9_tfartdsc_sel ,
                                          String AV71Tarticu_wwds_8_tfartdsc ,
                                          short AV73Tarticu_wwds_10_tftipartcod ,
                                          short AV74Tarticu_wwds_11_tftipartcod_to ,
                                          String AV76Tarticu_wwds_13_tftipartdsc_sel ,
                                          String AV75Tarticu_wwds_12_tftipartdsc ,
                                          short AV77Tarticu_wwds_14_tfartpml ,
                                          short AV78Tarticu_wwds_15_tfartpml_to ,
                                          short AV79Tarticu_wwds_16_tfartgraaca ,
                                          short AV80Tarticu_wwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV81Tarticu_wwds_18_tfartren ,
                                          java.math.BigDecimal AV82Tarticu_wwds_19_tfartren_to ,
                                          short AV83Tarticu_wwds_20_tfartacamin ,
                                          short AV84Tarticu_wwds_21_tfartacamin_to ,
                                          String AV86Tarticu_wwds_23_tfartcomer_sel ,
                                          String AV85Tarticu_wwds_22_tfartcomer ,
                                          String AV87Tarticu_wwds_24_tfartactivo_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A14295ArtActivo ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[34];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.CliAct, T1.ArtActivo, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T3.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.EmprCod FROM ((TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.TipArtCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV64Tarticu_wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV65Tarticu_wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV66Tarticu_wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tarticu_wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV67Tarticu_wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tarticu_wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tarticu_wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tarticu_wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tarticu_wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tarticu_wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Tarticu_wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tarticu_wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV73Tarticu_wwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV74Tarticu_wwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tarticu_wwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Tarticu_wwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tarticu_wwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV77Tarticu_wwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV78Tarticu_wwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV79Tarticu_wwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV80Tarticu_wwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tarticu_wwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Tarticu_wwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV83Tarticu_wwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV84Tarticu_wwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tarticu_wwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV85Tarticu_wwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tarticu_wwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tarticu_wwds_24_tfartactivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtActivo = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod" ;
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
         scmdbuf += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipArtCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtPml" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtPml DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtRen" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtRen DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtComer" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtComer DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtActivo" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtActivo DESC" ;
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
                  return conditional_P0A9E2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((String[]) buf[20])[0] = rslt.getString(14, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
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
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
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
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               return;
      }
   }

}

