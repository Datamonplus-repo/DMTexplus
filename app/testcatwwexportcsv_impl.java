package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class testcatwwexportcsv_impl extends GXWebProcedure
{
   public testcatwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TESTCATWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TESTCATWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TESTCATWWColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "EstCatAny", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N.Serie Fac (Est.Cl/art/t.art)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Articulo (E.Cl./Art./T.A)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Desc.T.Art (E.Cl./Art./T.A)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acum.Imp0 (Est.Cl/Ar/T.Art)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acum.Imp.1 (Est.Cl/Ar/T.Art)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden (Est.Cli/Art/T.Art)", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Testcatwwds_1_filterfulltext = AV30FilterFullText ;
      AV58Testcatwwds_2_tfemprcod = AV34TFEmprCod ;
      AV59Testcatwwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV60Testcatwwds_4_tfclicod = AV36TFCliCod ;
      AV61Testcatwwds_5_tfclicod_to = AV37TFCliCod_To ;
      AV62Testcatwwds_6_tfartcod = AV38TFArtCod ;
      AV63Testcatwwds_7_tfartcod_sel = AV39TFArtCod_Sel ;
      AV64Testcatwwds_8_tfestcatany = AV40TFEstCatAny ;
      AV65Testcatwwds_9_tfestcatany_to = AV41TFEstCatAny_To ;
      AV66Testcatwwds_10_tfestcatser = AV42TFEstCatSer ;
      AV67Testcatwwds_11_tfestcatser_sel = AV43TFEstCatSer_Sel ;
      AV68Testcatwwds_12_tfestcattip = AV44TFEstCatTip ;
      AV69Testcatwwds_13_tfestcattip_to = AV45TFEstCatTip_To ;
      AV70Testcatwwds_14_tfestcatdsc = AV46TFEstCatDsc ;
      AV71Testcatwwds_15_tfestcatdsc_sel = AV47TFEstCatDsc_Sel ;
      AV72Testcatwwds_16_tfestcataim0 = AV48TFEstCatAIm0 ;
      AV73Testcatwwds_17_tfestcataim0_to = AV49TFEstCatAIm0_To ;
      AV74Testcatwwds_18_tfestcataim1 = AV50TFEstCatAIm1 ;
      AV75Testcatwwds_19_tfestcataim1_to = AV51TFEstCatAIm1_To ;
      AV76Testcatwwds_20_tfestcatord0 = AV52TFEstCatOrd0 ;
      AV77Testcatwwds_21_tfestcatord0_to = AV53TFEstCatOrd0_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Testcatwwds_1_filterfulltext ,
                                           AV59Testcatwwds_3_tfemprcod_sel ,
                                           AV58Testcatwwds_2_tfemprcod ,
                                           Integer.valueOf(AV60Testcatwwds_4_tfclicod) ,
                                           Integer.valueOf(AV61Testcatwwds_5_tfclicod_to) ,
                                           AV63Testcatwwds_7_tfartcod_sel ,
                                           AV62Testcatwwds_6_tfartcod ,
                                           Short.valueOf(AV64Testcatwwds_8_tfestcatany) ,
                                           Short.valueOf(AV65Testcatwwds_9_tfestcatany_to) ,
                                           AV67Testcatwwds_11_tfestcatser_sel ,
                                           AV66Testcatwwds_10_tfestcatser ,
                                           Short.valueOf(AV68Testcatwwds_12_tfestcattip) ,
                                           Short.valueOf(AV69Testcatwwds_13_tfestcattip_to) ,
                                           AV71Testcatwwds_15_tfestcatdsc_sel ,
                                           AV70Testcatwwds_14_tfestcatdsc ,
                                           AV72Testcatwwds_16_tfestcataim0 ,
                                           AV73Testcatwwds_17_tfestcataim0_to ,
                                           AV74Testcatwwds_18_tfestcataim1 ,
                                           AV75Testcatwwds_19_tfestcataim1_to ,
                                           AV76Testcatwwds_20_tfestcatord0 ,
                                           AV77Testcatwwds_21_tfestcatord0_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           Short.valueOf(A5382EstCatAny) ,
                                           A5383EstCatSer ,
                                           Short.valueOf(A5384EstCatTip) ,
                                           A5385EstCatDsc ,
                                           A5386EstCatAIm0 ,
                                           A5387EstCatAIm1 ,
                                           A5388EstCatOrd0 ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV57Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Testcatwwds_1_filterfulltext), "%", "") ;
      lV57Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Testcatwwds_1_filterfulltext), "%", "") ;
      lV57Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Testcatwwds_1_filterfulltext), "%", "") ;
      lV57Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Testcatwwds_1_filterfulltext), "%", "") ;
      lV57Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Testcatwwds_1_filterfulltext), "%", "") ;
      lV57Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Testcatwwds_1_filterfulltext), "%", "") ;
      lV57Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Testcatwwds_1_filterfulltext), "%", "") ;
      lV57Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Testcatwwds_1_filterfulltext), "%", "") ;
      lV57Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Testcatwwds_1_filterfulltext), "%", "") ;
      lV57Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Testcatwwds_1_filterfulltext), "%", "") ;
      lV58Testcatwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV58Testcatwwds_2_tfemprcod), 3, "%") ;
      lV62Testcatwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV62Testcatwwds_6_tfartcod), 16, "%") ;
      lV66Testcatwwds_10_tfestcatser = GXutil.padr( GXutil.rtrim( AV66Testcatwwds_10_tfestcatser), 3, "%") ;
      lV70Testcatwwds_14_tfestcatdsc = GXutil.padr( GXutil.rtrim( AV70Testcatwwds_14_tfestcatdsc), 30, "%") ;
      /* Using cursor P0ALB3 */
      pr_default.execute(0, new Object[] {lV57Testcatwwds_1_filterfulltext, lV57Testcatwwds_1_filterfulltext, lV57Testcatwwds_1_filterfulltext, lV57Testcatwwds_1_filterfulltext, lV57Testcatwwds_1_filterfulltext, lV57Testcatwwds_1_filterfulltext, lV57Testcatwwds_1_filterfulltext, lV57Testcatwwds_1_filterfulltext, lV57Testcatwwds_1_filterfulltext, lV57Testcatwwds_1_filterfulltext, lV58Testcatwwds_2_tfemprcod, AV59Testcatwwds_3_tfemprcod_sel, Integer.valueOf(AV60Testcatwwds_4_tfclicod), Integer.valueOf(AV61Testcatwwds_5_tfclicod_to), lV62Testcatwwds_6_tfartcod, AV63Testcatwwds_7_tfartcod_sel, Short.valueOf(AV64Testcatwwds_8_tfestcatany), Short.valueOf(AV65Testcatwwds_9_tfestcatany_to), lV66Testcatwwds_10_tfestcatser, AV67Testcatwwds_11_tfestcatser_sel, Short.valueOf(AV68Testcatwwds_12_tfestcattip), Short.valueOf(AV69Testcatwwds_13_tfestcattip_to), lV70Testcatwwds_14_tfestcatdsc, AV71Testcatwwds_15_tfestcatdsc_sel, AV72Testcatwwds_16_tfestcataim0, AV73Testcatwwds_17_tfestcataim0_to, AV74Testcatwwds_18_tfestcataim1, AV75Testcatwwds_19_tfestcataim1_to, AV76Testcatwwds_20_tfestcatord0, AV77Testcatwwds_21_tfestcatord0_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5388EstCatOrd0 = P0ALB3_A5388EstCatOrd0[0] ;
         n5388EstCatOrd0 = P0ALB3_n5388EstCatOrd0[0] ;
         A5385EstCatDsc = P0ALB3_A5385EstCatDsc[0] ;
         n5385EstCatDsc = P0ALB3_n5385EstCatDsc[0] ;
         A5384EstCatTip = P0ALB3_A5384EstCatTip[0] ;
         A5383EstCatSer = P0ALB3_A5383EstCatSer[0] ;
         A5382EstCatAny = P0ALB3_A5382EstCatAny[0] ;
         A65ArtCod = P0ALB3_A65ArtCod[0] ;
         A252CliCod = P0ALB3_A252CliCod[0] ;
         A396EmprCod = P0ALB3_A396EmprCod[0] ;
         A5387EstCatAIm1 = P0ALB3_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0ALB3_A5386EstCatAIm0[0] ;
         A5387EstCatAIm1 = P0ALB3_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0ALB3_A5386EstCatAIm0[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A396EmprCod, ";", ","), GXv_char3) ;
            testcatwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            testcatwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5382EstCatAny, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5383EstCatSer, ";", ","), GXv_char3) ;
            testcatwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5384EstCatTip, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5385EstCatDsc, ";", ","), GXv_char3) ;
            testcatwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5386EstCatAIm0, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5387EstCatAIm1, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5388EstCatOrd0, 12, 2) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TESTCATWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstCatAny", "", "EstCatAny", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstCatSer", "", "N.Serie Fac (Est.Cl/art/t.art)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstCatTip", "", "Tipo Articulo (E.Cl./Art./T.A)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstCatDsc", "", "Desc.T.Art (E.Cl./Art./T.A)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstCatAIm0", "", "Acum.Imp0 (Est.Cl/Ar/T.Art)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstCatAIm1", "", "Acum.Imp.1 (Est.Cl/Ar/T.Art)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstCatOrd0", "", "Orden (Est.Cli/Art/T.Art)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TESTCATWWColumnsSelector", GXv_char3) ;
      testcatwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TESTCATWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TESTCATWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("TESTCATWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
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
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATANY") == 0 )
         {
            AV40TFEstCatAny = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFEstCatAny_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATSER") == 0 )
         {
            AV42TFEstCatSer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATSER_SEL") == 0 )
         {
            AV43TFEstCatSer_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATTIP") == 0 )
         {
            AV44TFEstCatTip = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFEstCatTip_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATDSC") == 0 )
         {
            AV46TFEstCatDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATDSC_SEL") == 0 )
         {
            AV47TFEstCatDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATAIM0") == 0 )
         {
            AV48TFEstCatAIm0 = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFEstCatAIm0_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATAIM1") == 0 )
         {
            AV50TFEstCatAIm1 = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFEstCatAIm1_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATORD0") == 0 )
         {
            AV52TFEstCatOrd0 = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFEstCatOrd0_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
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
      A5383EstCatSer = "" ;
      A5385EstCatDsc = "" ;
      A5386EstCatAIm0 = DecimalUtil.ZERO ;
      A5387EstCatAIm1 = DecimalUtil.ZERO ;
      A5388EstCatOrd0 = DecimalUtil.ZERO ;
      AV57Testcatwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV58Testcatwwds_2_tfemprcod = "" ;
      AV34TFEmprCod = "" ;
      AV59Testcatwwds_3_tfemprcod_sel = "" ;
      AV35TFEmprCod_Sel = "" ;
      AV62Testcatwwds_6_tfartcod = "" ;
      AV38TFArtCod = "" ;
      AV63Testcatwwds_7_tfartcod_sel = "" ;
      AV39TFArtCod_Sel = "" ;
      AV66Testcatwwds_10_tfestcatser = "" ;
      AV42TFEstCatSer = "" ;
      AV67Testcatwwds_11_tfestcatser_sel = "" ;
      AV43TFEstCatSer_Sel = "" ;
      AV70Testcatwwds_14_tfestcatdsc = "" ;
      AV46TFEstCatDsc = "" ;
      AV71Testcatwwds_15_tfestcatdsc_sel = "" ;
      AV47TFEstCatDsc_Sel = "" ;
      AV72Testcatwwds_16_tfestcataim0 = DecimalUtil.ZERO ;
      AV48TFEstCatAIm0 = DecimalUtil.ZERO ;
      AV73Testcatwwds_17_tfestcataim0_to = DecimalUtil.ZERO ;
      AV49TFEstCatAIm0_To = DecimalUtil.ZERO ;
      AV74Testcatwwds_18_tfestcataim1 = DecimalUtil.ZERO ;
      AV50TFEstCatAIm1 = DecimalUtil.ZERO ;
      AV75Testcatwwds_19_tfestcataim1_to = DecimalUtil.ZERO ;
      AV51TFEstCatAIm1_To = DecimalUtil.ZERO ;
      AV76Testcatwwds_20_tfestcatord0 = DecimalUtil.ZERO ;
      AV52TFEstCatOrd0 = DecimalUtil.ZERO ;
      AV77Testcatwwds_21_tfestcatord0_to = DecimalUtil.ZERO ;
      AV53TFEstCatOrd0_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV57Testcatwwds_1_filterfulltext = "" ;
      lV58Testcatwwds_2_tfemprcod = "" ;
      lV62Testcatwwds_6_tfartcod = "" ;
      lV66Testcatwwds_10_tfestcatser = "" ;
      lV70Testcatwwds_14_tfestcatdsc = "" ;
      P0ALB3_A5388EstCatOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALB3_n5388EstCatOrd0 = new boolean[] {false} ;
      P0ALB3_A5385EstCatDsc = new String[] {""} ;
      P0ALB3_n5385EstCatDsc = new boolean[] {false} ;
      P0ALB3_A5384EstCatTip = new short[1] ;
      P0ALB3_A5383EstCatSer = new String[] {""} ;
      P0ALB3_A5382EstCatAny = new short[1] ;
      P0ALB3_A65ArtCod = new String[] {""} ;
      P0ALB3_A252CliCod = new int[1] ;
      P0ALB3_A396EmprCod = new String[] {""} ;
      P0ALB3_A5387EstCatAIm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALB3_A5386EstCatAIm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testcatwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0ALB3_A5388EstCatOrd0, P0ALB3_n5388EstCatOrd0, P0ALB3_A5385EstCatDsc, P0ALB3_n5385EstCatDsc, P0ALB3_A5384EstCatTip, P0ALB3_A5383EstCatSer, P0ALB3_A5382EstCatAny, P0ALB3_A65ArtCod, P0ALB3_A252CliCod, P0ALB3_A396EmprCod,
            P0ALB3_A5387EstCatAIm1, P0ALB3_A5386EstCatAIm0
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A5382EstCatAny ;
   private short A5384EstCatTip ;
   private short AV64Testcatwwds_8_tfestcatany ;
   private short AV40TFEstCatAny ;
   private short AV65Testcatwwds_9_tfestcatany_to ;
   private short AV41TFEstCatAny_To ;
   private short AV68Testcatwwds_12_tfestcattip ;
   private short AV44TFEstCatTip ;
   private short AV69Testcatwwds_13_tfestcattip_to ;
   private short AV45TFEstCatTip_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int AV60Testcatwwds_4_tfclicod ;
   private int AV36TFCliCod ;
   private int AV61Testcatwwds_5_tfclicod_to ;
   private int AV37TFCliCod_To ;
   private int AV78GXV1 ;
   private java.math.BigDecimal A5386EstCatAIm0 ;
   private java.math.BigDecimal A5387EstCatAIm1 ;
   private java.math.BigDecimal A5388EstCatOrd0 ;
   private java.math.BigDecimal AV72Testcatwwds_16_tfestcataim0 ;
   private java.math.BigDecimal AV48TFEstCatAIm0 ;
   private java.math.BigDecimal AV73Testcatwwds_17_tfestcataim0_to ;
   private java.math.BigDecimal AV49TFEstCatAIm0_To ;
   private java.math.BigDecimal AV74Testcatwwds_18_tfestcataim1 ;
   private java.math.BigDecimal AV50TFEstCatAIm1 ;
   private java.math.BigDecimal AV75Testcatwwds_19_tfestcataim1_to ;
   private java.math.BigDecimal AV51TFEstCatAIm1_To ;
   private java.math.BigDecimal AV76Testcatwwds_20_tfestcatord0 ;
   private java.math.BigDecimal AV52TFEstCatOrd0 ;
   private java.math.BigDecimal AV77Testcatwwds_21_tfestcatord0_to ;
   private java.math.BigDecimal AV53TFEstCatOrd0_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A5383EstCatSer ;
   private String A5385EstCatDsc ;
   private String AV58Testcatwwds_2_tfemprcod ;
   private String AV34TFEmprCod ;
   private String AV59Testcatwwds_3_tfemprcod_sel ;
   private String AV35TFEmprCod_Sel ;
   private String AV62Testcatwwds_6_tfartcod ;
   private String AV38TFArtCod ;
   private String AV63Testcatwwds_7_tfartcod_sel ;
   private String AV39TFArtCod_Sel ;
   private String AV66Testcatwwds_10_tfestcatser ;
   private String AV42TFEstCatSer ;
   private String AV67Testcatwwds_11_tfestcatser_sel ;
   private String AV43TFEstCatSer_Sel ;
   private String AV70Testcatwwds_14_tfestcatdsc ;
   private String AV46TFEstCatDsc ;
   private String AV71Testcatwwds_15_tfestcatdsc_sel ;
   private String AV47TFEstCatDsc_Sel ;
   private String scmdbuf ;
   private String lV58Testcatwwds_2_tfemprcod ;
   private String lV62Testcatwwds_6_tfartcod ;
   private String lV66Testcatwwds_10_tfestcatser ;
   private String lV70Testcatwwds_14_tfestcatdsc ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n5388EstCatOrd0 ;
   private boolean n5385EstCatDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV57Testcatwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV57Testcatwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0ALB3_A5388EstCatOrd0 ;
   private boolean[] P0ALB3_n5388EstCatOrd0 ;
   private String[] P0ALB3_A5385EstCatDsc ;
   private boolean[] P0ALB3_n5385EstCatDsc ;
   private short[] P0ALB3_A5384EstCatTip ;
   private String[] P0ALB3_A5383EstCatSer ;
   private short[] P0ALB3_A5382EstCatAny ;
   private String[] P0ALB3_A65ArtCod ;
   private int[] P0ALB3_A252CliCod ;
   private String[] P0ALB3_A396EmprCod ;
   private java.math.BigDecimal[] P0ALB3_A5387EstCatAIm1 ;
   private java.math.BigDecimal[] P0ALB3_A5386EstCatAIm0 ;
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

final  class testcatwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ALB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Testcatwwds_1_filterfulltext ,
                                          String AV59Testcatwwds_3_tfemprcod_sel ,
                                          String AV58Testcatwwds_2_tfemprcod ,
                                          int AV60Testcatwwds_4_tfclicod ,
                                          int AV61Testcatwwds_5_tfclicod_to ,
                                          String AV63Testcatwwds_7_tfartcod_sel ,
                                          String AV62Testcatwwds_6_tfartcod ,
                                          short AV64Testcatwwds_8_tfestcatany ,
                                          short AV65Testcatwwds_9_tfestcatany_to ,
                                          String AV67Testcatwwds_11_tfestcatser_sel ,
                                          String AV66Testcatwwds_10_tfestcatser ,
                                          short AV68Testcatwwds_12_tfestcattip ,
                                          short AV69Testcatwwds_13_tfestcattip_to ,
                                          String AV71Testcatwwds_15_tfestcatdsc_sel ,
                                          String AV70Testcatwwds_14_tfestcatdsc ,
                                          java.math.BigDecimal AV72Testcatwwds_16_tfestcataim0 ,
                                          java.math.BigDecimal AV73Testcatwwds_17_tfestcataim0_to ,
                                          java.math.BigDecimal AV74Testcatwwds_18_tfestcataim1 ,
                                          java.math.BigDecimal AV75Testcatwwds_19_tfestcataim1_to ,
                                          java.math.BigDecimal AV76Testcatwwds_20_tfestcatord0 ,
                                          java.math.BigDecimal AV77Testcatwwds_21_tfestcatord0_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          short A5382EstCatAny ,
                                          String A5383EstCatSer ,
                                          short A5384EstCatTip ,
                                          String A5385EstCatDsc ,
                                          java.math.BigDecimal A5386EstCatAIm0 ,
                                          java.math.BigDecimal A5387EstCatAIm1 ,
                                          java.math.BigDecimal A5388EstCatOrd0 ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EstCatOrd0, T1.EstCatDsc, T1.EstCatTip, T1.EstCatSer, T1.EstCatAny, T1.ArtCod, T1.CliCod, T1.EmprCod, COALESCE( T2.EstCatAIm1, 0) AS EstCatAIm1, COALESCE(" ;
      scmdbuf += " T2.EstCatAIm0, 0) AS EstCatAIm0 FROM (TXPESTCAT T1 LEFT JOIN (SELECT SUM(EstCatImp1) AS EstCatAIm1, EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, SUM(EstCatImp0)" ;
      scmdbuf += " AS EstCatAIm0 FROM TXPESTCA1 GROUP BY EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod" ;
      scmdbuf += " = T1.ArtCod AND T2.EstCatAny = T1.EstCatAny AND T2.EstCatSer = T1.EstCatSer AND T2.EstCatTip = T1.EstCatTip)" ;
      if ( ! (GXutil.strcmp("", AV57Testcatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatAny,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatSer) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatTip,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm0, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm1, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EstCatOrd0,'999999990.99'), 2) like '%' || ?))");
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
      }
      if ( (GXutil.strcmp("", AV59Testcatwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Testcatwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testcatwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV60Testcatwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV61Testcatwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Testcatwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Testcatwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Testcatwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV64Testcatwwds_8_tfestcatany) )
      {
         addWhere(sWhereString, "(T1.EstCatAny >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV65Testcatwwds_9_tfestcatany_to) )
      {
         addWhere(sWhereString, "(T1.EstCatAny <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Testcatwwds_11_tfestcatser_sel)==0) && ( ! (GXutil.strcmp("", AV66Testcatwwds_10_tfestcatser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Testcatwwds_11_tfestcatser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatSer = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV68Testcatwwds_12_tfestcattip) )
      {
         addWhere(sWhereString, "(T1.EstCatTip >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV69Testcatwwds_13_tfestcattip_to) )
      {
         addWhere(sWhereString, "(T1.EstCatTip <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Testcatwwds_15_tfestcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Testcatwwds_14_tfestcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Testcatwwds_15_tfestcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatDsc = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Testcatwwds_16_tfestcataim0)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Testcatwwds_17_tfestcataim0_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Testcatwwds_18_tfestcataim1)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Testcatwwds_19_tfestcataim1_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Testcatwwds_20_tfestcatord0)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Testcatwwds_21_tfestcatord0_to)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatDsc DESC" ;
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
         scmdbuf += " ORDER BY T1.EstCatAny" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatAny DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatSer" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatTip" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatTip DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatOrd0" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatOrd0 DESC" ;
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
                  return conditional_P0ALB3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               return;
      }
   }

}

