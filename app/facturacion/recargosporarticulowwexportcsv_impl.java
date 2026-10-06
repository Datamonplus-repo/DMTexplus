package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recargosporarticulowwexportcsv_impl extends GXWebProcedure
{
   public recargosporarticulowwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "RecargosporArticuloWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.RecargosporArticuloWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Facturacion.RecargosporArticuloWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ultima Linea", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV51Facturacion_recargosporarticulowwds_1_filterfulltext = AV30FilterFullText ;
      AV52Facturacion_recargosporarticulowwds_2_tfemprcod = AV34TFEmprCod ;
      AV53Facturacion_recargosporarticulowwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV54Facturacion_recargosporarticulowwds_4_tfclicod = AV36TFCliCod ;
      AV55Facturacion_recargosporarticulowwds_5_tfclicod_to = AV37TFCliCod_To ;
      AV56Facturacion_recargosporarticulowwds_6_tfartcod = AV38TFArtCod ;
      AV57Facturacion_recargosporarticulowwds_7_tfartcod_sel = AV39TFArtCod_Sel ;
      AV58Facturacion_recargosporarticulowwds_8_tfclinom = AV40TFCliNom ;
      AV59Facturacion_recargosporarticulowwds_9_tfclinom_sel = AV41TFCliNom_Sel ;
      AV60Facturacion_recargosporarticulowwds_10_tfartdsc = AV42TFArtDsc ;
      AV61Facturacion_recargosporarticulowwds_11_tfartdsc_sel = AV43TFArtDsc_Sel ;
      AV62Facturacion_recargosporarticulowwds_12_tfemprnom = AV44TFEmprNom ;
      AV63Facturacion_recargosporarticulowwds_13_tfemprnom_sel = AV45TFEmprNom_Sel ;
      AV64Facturacion_recargosporarticulowwds_14_tfulinrec = AV46TFULinRec ;
      AV65Facturacion_recargosporarticulowwds_15_tfulinrec_to = AV47TFULinRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                           AV53Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                           AV52Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                           Integer.valueOf(AV54Facturacion_recargosporarticulowwds_4_tfclicod) ,
                                           Integer.valueOf(AV55Facturacion_recargosporarticulowwds_5_tfclicod_to) ,
                                           AV57Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                           AV56Facturacion_recargosporarticulowwds_6_tfartcod ,
                                           AV59Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                           AV58Facturacion_recargosporarticulowwds_8_tfclinom ,
                                           AV61Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                           AV60Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                           AV63Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                           AV62Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                           Byte.valueOf(AV64Facturacion_recargosporarticulowwds_14_tfulinrec) ,
                                           Byte.valueOf(AV65Facturacion_recargosporarticulowwds_15_tfulinrec_to) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           A279CliNom ,
                                           A69ArtDsc ,
                                           A407EmprNom ,
                                           Byte.valueOf(A845ULinRec) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV51Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV51Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV51Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV51Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV51Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV51Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV51Facturacion_recargosporarticulowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Facturacion_recargosporarticulowwds_1_filterfulltext), "%", "") ;
      lV52Facturacion_recargosporarticulowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV52Facturacion_recargosporarticulowwds_2_tfemprcod), 3, "%") ;
      lV56Facturacion_recargosporarticulowwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV56Facturacion_recargosporarticulowwds_6_tfartcod), 16, "%") ;
      lV58Facturacion_recargosporarticulowwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV58Facturacion_recargosporarticulowwds_8_tfclinom), 30, "%") ;
      lV60Facturacion_recargosporarticulowwds_10_tfartdsc = GXutil.padr( GXutil.rtrim( AV60Facturacion_recargosporarticulowwds_10_tfartdsc), 26, "%") ;
      lV62Facturacion_recargosporarticulowwds_12_tfemprnom = GXutil.padr( GXutil.rtrim( AV62Facturacion_recargosporarticulowwds_12_tfemprnom), 30, "%") ;
      /* Using cursor P0ALW2 */
      pr_default.execute(0, new Object[] {lV51Facturacion_recargosporarticulowwds_1_filterfulltext, lV51Facturacion_recargosporarticulowwds_1_filterfulltext, lV51Facturacion_recargosporarticulowwds_1_filterfulltext, lV51Facturacion_recargosporarticulowwds_1_filterfulltext, lV51Facturacion_recargosporarticulowwds_1_filterfulltext, lV51Facturacion_recargosporarticulowwds_1_filterfulltext, lV51Facturacion_recargosporarticulowwds_1_filterfulltext, lV52Facturacion_recargosporarticulowwds_2_tfemprcod, AV53Facturacion_recargosporarticulowwds_3_tfemprcod_sel, Integer.valueOf(AV54Facturacion_recargosporarticulowwds_4_tfclicod), Integer.valueOf(AV55Facturacion_recargosporarticulowwds_5_tfclicod_to), lV56Facturacion_recargosporarticulowwds_6_tfartcod, AV57Facturacion_recargosporarticulowwds_7_tfartcod_sel, lV58Facturacion_recargosporarticulowwds_8_tfclinom, AV59Facturacion_recargosporarticulowwds_9_tfclinom_sel, lV60Facturacion_recargosporarticulowwds_10_tfartdsc, AV61Facturacion_recargosporarticulowwds_11_tfartdsc_sel, lV62Facturacion_recargosporarticulowwds_12_tfemprnom, AV63Facturacion_recargosporarticulowwds_13_tfemprnom_sel, Byte.valueOf(AV64Facturacion_recargosporarticulowwds_14_tfulinrec), Byte.valueOf(AV65Facturacion_recargosporarticulowwds_15_tfulinrec_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A845ULinRec = P0ALW2_A845ULinRec[0] ;
         n845ULinRec = P0ALW2_n845ULinRec[0] ;
         A407EmprNom = P0ALW2_A407EmprNom[0] ;
         n407EmprNom = P0ALW2_n407EmprNom[0] ;
         A69ArtDsc = P0ALW2_A69ArtDsc[0] ;
         n69ArtDsc = P0ALW2_n69ArtDsc[0] ;
         A279CliNom = P0ALW2_A279CliNom[0] ;
         A65ArtCod = P0ALW2_A65ArtCod[0] ;
         A252CliCod = P0ALW2_A252CliCod[0] ;
         A396EmprCod = P0ALW2_A396EmprCod[0] ;
         A407EmprNom = P0ALW2_A407EmprNom[0] ;
         n407EmprNom = P0ALW2_n407EmprNom[0] ;
         A279CliNom = P0ALW2_A279CliNom[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A396EmprCod, ";", ","), GXv_char3) ;
            recargosporarticulowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A65ArtCod, ";", ","), GXv_char3) ;
            recargosporarticulowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            recargosporarticulowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A69ArtDsc, ";", ","), GXv_char3) ;
            recargosporarticulowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A407EmprNom, ";", ","), GXv_char3) ;
            recargosporarticulowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A845ULinRec, 2, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=RecargosporArticuloWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprCod", "", "Código Empresa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtCod", "", "Código Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtDsc", "", "Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ULinRec", "", "Ultima Linea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.RecargosporArticuloWWColumnsSelector", GXv_char3) ;
      recargosporarticulowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.RecargosporArticuloWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.RecargosporArticuloWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("Facturacion.RecargosporArticuloWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV38TFArtCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV39TFArtCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV42TFArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV43TFArtDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV44TFEmprNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV45TFEmprNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFULINREC") == 0 )
         {
            AV46TFULinRec = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFULinRec_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
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
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      A407EmprNom = "" ;
      AV51Facturacion_recargosporarticulowwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV52Facturacion_recargosporarticulowwds_2_tfemprcod = "" ;
      AV34TFEmprCod = "" ;
      AV53Facturacion_recargosporarticulowwds_3_tfemprcod_sel = "" ;
      AV35TFEmprCod_Sel = "" ;
      AV56Facturacion_recargosporarticulowwds_6_tfartcod = "" ;
      AV38TFArtCod = "" ;
      AV57Facturacion_recargosporarticulowwds_7_tfartcod_sel = "" ;
      AV39TFArtCod_Sel = "" ;
      AV58Facturacion_recargosporarticulowwds_8_tfclinom = "" ;
      AV40TFCliNom = "" ;
      AV59Facturacion_recargosporarticulowwds_9_tfclinom_sel = "" ;
      AV41TFCliNom_Sel = "" ;
      AV60Facturacion_recargosporarticulowwds_10_tfartdsc = "" ;
      AV42TFArtDsc = "" ;
      AV61Facturacion_recargosporarticulowwds_11_tfartdsc_sel = "" ;
      AV43TFArtDsc_Sel = "" ;
      AV62Facturacion_recargosporarticulowwds_12_tfemprnom = "" ;
      AV44TFEmprNom = "" ;
      AV63Facturacion_recargosporarticulowwds_13_tfemprnom_sel = "" ;
      AV45TFEmprNom_Sel = "" ;
      scmdbuf = "" ;
      lV51Facturacion_recargosporarticulowwds_1_filterfulltext = "" ;
      lV52Facturacion_recargosporarticulowwds_2_tfemprcod = "" ;
      lV56Facturacion_recargosporarticulowwds_6_tfartcod = "" ;
      lV58Facturacion_recargosporarticulowwds_8_tfclinom = "" ;
      lV60Facturacion_recargosporarticulowwds_10_tfartdsc = "" ;
      lV62Facturacion_recargosporarticulowwds_12_tfemprnom = "" ;
      P0ALW2_A845ULinRec = new byte[1] ;
      P0ALW2_n845ULinRec = new boolean[] {false} ;
      P0ALW2_A407EmprNom = new String[] {""} ;
      P0ALW2_n407EmprNom = new boolean[] {false} ;
      P0ALW2_A69ArtDsc = new String[] {""} ;
      P0ALW2_n69ArtDsc = new boolean[] {false} ;
      P0ALW2_A279CliNom = new String[] {""} ;
      P0ALW2_A65ArtCod = new String[] {""} ;
      P0ALW2_A252CliCod = new int[1] ;
      P0ALW2_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.recargosporarticulowwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0ALW2_A845ULinRec, P0ALW2_n845ULinRec, P0ALW2_A407EmprNom, P0ALW2_n407EmprNom, P0ALW2_A69ArtDsc, P0ALW2_n69ArtDsc, P0ALW2_A279CliNom, P0ALW2_A65ArtCod, P0ALW2_A252CliCod, P0ALW2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A845ULinRec ;
   private byte AV64Facturacion_recargosporarticulowwds_14_tfulinrec ;
   private byte AV46TFULinRec ;
   private byte AV65Facturacion_recargosporarticulowwds_15_tfulinrec_to ;
   private byte AV47TFULinRec_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int AV54Facturacion_recargosporarticulowwds_4_tfclicod ;
   private int AV36TFCliCod ;
   private int AV55Facturacion_recargosporarticulowwds_5_tfclicod_to ;
   private int AV37TFCliCod_To ;
   private int AV66GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A279CliNom ;
   private String A69ArtDsc ;
   private String A407EmprNom ;
   private String AV52Facturacion_recargosporarticulowwds_2_tfemprcod ;
   private String AV34TFEmprCod ;
   private String AV53Facturacion_recargosporarticulowwds_3_tfemprcod_sel ;
   private String AV35TFEmprCod_Sel ;
   private String AV56Facturacion_recargosporarticulowwds_6_tfartcod ;
   private String AV38TFArtCod ;
   private String AV57Facturacion_recargosporarticulowwds_7_tfartcod_sel ;
   private String AV39TFArtCod_Sel ;
   private String AV58Facturacion_recargosporarticulowwds_8_tfclinom ;
   private String AV40TFCliNom ;
   private String AV59Facturacion_recargosporarticulowwds_9_tfclinom_sel ;
   private String AV41TFCliNom_Sel ;
   private String AV60Facturacion_recargosporarticulowwds_10_tfartdsc ;
   private String AV42TFArtDsc ;
   private String AV61Facturacion_recargosporarticulowwds_11_tfartdsc_sel ;
   private String AV43TFArtDsc_Sel ;
   private String AV62Facturacion_recargosporarticulowwds_12_tfemprnom ;
   private String AV44TFEmprNom ;
   private String AV63Facturacion_recargosporarticulowwds_13_tfemprnom_sel ;
   private String AV45TFEmprNom_Sel ;
   private String scmdbuf ;
   private String lV52Facturacion_recargosporarticulowwds_2_tfemprcod ;
   private String lV56Facturacion_recargosporarticulowwds_6_tfartcod ;
   private String lV58Facturacion_recargosporarticulowwds_8_tfclinom ;
   private String lV60Facturacion_recargosporarticulowwds_10_tfartdsc ;
   private String lV62Facturacion_recargosporarticulowwds_12_tfemprnom ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n845ULinRec ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV51Facturacion_recargosporarticulowwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV51Facturacion_recargosporarticulowwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P0ALW2_A845ULinRec ;
   private boolean[] P0ALW2_n845ULinRec ;
   private String[] P0ALW2_A407EmprNom ;
   private boolean[] P0ALW2_n407EmprNom ;
   private String[] P0ALW2_A69ArtDsc ;
   private boolean[] P0ALW2_n69ArtDsc ;
   private String[] P0ALW2_A279CliNom ;
   private String[] P0ALW2_A65ArtCod ;
   private int[] P0ALW2_A252CliCod ;
   private String[] P0ALW2_A396EmprCod ;
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

final  class recargosporarticulowwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ALW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Facturacion_recargosporarticulowwds_1_filterfulltext ,
                                          String AV53Facturacion_recargosporarticulowwds_3_tfemprcod_sel ,
                                          String AV52Facturacion_recargosporarticulowwds_2_tfemprcod ,
                                          int AV54Facturacion_recargosporarticulowwds_4_tfclicod ,
                                          int AV55Facturacion_recargosporarticulowwds_5_tfclicod_to ,
                                          String AV57Facturacion_recargosporarticulowwds_7_tfartcod_sel ,
                                          String AV56Facturacion_recargosporarticulowwds_6_tfartcod ,
                                          String AV59Facturacion_recargosporarticulowwds_9_tfclinom_sel ,
                                          String AV58Facturacion_recargosporarticulowwds_8_tfclinom ,
                                          String AV61Facturacion_recargosporarticulowwds_11_tfartdsc_sel ,
                                          String AV60Facturacion_recargosporarticulowwds_10_tfartdsc ,
                                          String AV63Facturacion_recargosporarticulowwds_13_tfemprnom_sel ,
                                          String AV62Facturacion_recargosporarticulowwds_12_tfemprnom ,
                                          byte AV64Facturacion_recargosporarticulowwds_14_tfulinrec ,
                                          byte AV65Facturacion_recargosporarticulowwds_15_tfulinrec_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A279CliNom ,
                                          String A69ArtDsc ,
                                          String A407EmprNom ,
                                          byte A845ULinRec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ULinRec, T2.EmprNom, T1.ArtDsc, T3.CliNom, T1.ArtCod, T1.CliCod, T1.EmprCod FROM ((TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV51Facturacion_recargosporarticulowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ULinRec,'90'), 2) like '%' || ?))");
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
      }
      if ( (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV52Facturacion_recargosporarticulowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Facturacion_recargosporarticulowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV54Facturacion_recargosporarticulowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Facturacion_recargosporarticulowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV56Facturacion_recargosporarticulowwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_recargosporarticulowwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_recargosporarticulowwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_recargosporarticulowwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Facturacion_recargosporarticulowwds_10_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Facturacion_recargosporarticulowwds_11_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV62Facturacion_recargosporarticulowwds_12_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Facturacion_recargosporarticulowwds_13_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_recargosporarticulowwds_14_tfulinrec) )
      {
         addWhere(sWhereString, "(T1.ULinRec >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV65Facturacion_recargosporarticulowwds_15_tfulinrec_to) )
      {
         addWhere(sWhereString, "(T1.ULinRec <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
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
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ULinRec" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ULinRec DESC" ;
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
                  return conditional_P0ALW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
      }
   }

}

