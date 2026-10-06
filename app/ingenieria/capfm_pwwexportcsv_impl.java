package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class capfm_pwwexportcsv_impl extends GXWebProcedure
{
   public capfm_pwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "CAPFM_PWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Ingenieria.CAPFM_PWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Ingenieria.CAPFM_PWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cód. Art.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cód. Proc.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cód. Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cód Maq.", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV63Ingenieria_capfm_pwwds_1_filterfulltext = AV30FilterFullText ;
      AV64Ingenieria_capfm_pwwds_2_tfclicod = AV38TFCliCod ;
      AV65Ingenieria_capfm_pwwds_3_tfclicod_to = AV39TFCliCod_To ;
      AV66Ingenieria_capfm_pwwds_4_tfclinom = AV40TFCliNom ;
      AV67Ingenieria_capfm_pwwds_5_tfclinom_sel = AV41TFCliNom_Sel ;
      AV68Ingenieria_capfm_pwwds_6_tfartcod = AV42TFArtCod ;
      AV69Ingenieria_capfm_pwwds_7_tfartcod_sel = AV43TFArtCod_Sel ;
      AV70Ingenieria_capfm_pwwds_8_tfartdsc = AV44TFArtDsc ;
      AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel = AV45TFArtDsc_Sel ;
      AV72Ingenieria_capfm_pwwds_10_tfprocod = AV46TFProCod ;
      AV73Ingenieria_capfm_pwwds_11_tfprocod_sel = AV47TFProCod_Sel ;
      AV74Ingenieria_capfm_pwwds_12_tfprodsc = AV48TFProDsc ;
      AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel = AV49TFProDsc_Sel ;
      AV76Ingenieria_capfm_pwwds_14_tffascodm = AV50TFFasCodM ;
      AV77Ingenieria_capfm_pwwds_15_tffascodm_sel = AV51TFFasCodM_Sel ;
      AV78Ingenieria_capfm_pwwds_16_tfmaqcodc = AV54TFMaqCodC ;
      AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = AV55TFMaqCodC_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Ingenieria_capfm_pwwds_1_filterfulltext ,
                                           Integer.valueOf(AV64Ingenieria_capfm_pwwds_2_tfclicod) ,
                                           Integer.valueOf(AV65Ingenieria_capfm_pwwds_3_tfclicod_to) ,
                                           AV67Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                           AV66Ingenieria_capfm_pwwds_4_tfclinom ,
                                           AV69Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                           AV68Ingenieria_capfm_pwwds_6_tfartcod ,
                                           AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                           AV70Ingenieria_capfm_pwwds_8_tfartdsc ,
                                           AV73Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                           AV72Ingenieria_capfm_pwwds_10_tfprocod ,
                                           AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                           AV74Ingenieria_capfm_pwwds_12_tfprodsc ,
                                           AV77Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                           AV76Ingenieria_capfm_pwwds_14_tffascodm ,
                                           AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                           AV78Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A9836FasCodM ,
                                           A9830MaqCodC ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV66Ingenieria_capfm_pwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV66Ingenieria_capfm_pwwds_4_tfclinom), 30, "%") ;
      lV68Ingenieria_capfm_pwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV68Ingenieria_capfm_pwwds_6_tfartcod), 16, "%") ;
      lV70Ingenieria_capfm_pwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV70Ingenieria_capfm_pwwds_8_tfartdsc), 26, "%") ;
      lV72Ingenieria_capfm_pwwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV72Ingenieria_capfm_pwwds_10_tfprocod), 8, "%") ;
      lV74Ingenieria_capfm_pwwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV74Ingenieria_capfm_pwwds_12_tfprodsc), 40, "%") ;
      lV76Ingenieria_capfm_pwwds_14_tffascodm = GXutil.padr( GXutil.rtrim( AV76Ingenieria_capfm_pwwds_14_tffascodm), 8, "%") ;
      lV78Ingenieria_capfm_pwwds_16_tfmaqcodc = GXutil.padr( GXutil.rtrim( AV78Ingenieria_capfm_pwwds_16_tfmaqcodc), 6, "%") ;
      /* Using cursor P09RL2 */
      pr_default.execute(0, new Object[] {lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, Integer.valueOf(AV64Ingenieria_capfm_pwwds_2_tfclicod), Integer.valueOf(AV65Ingenieria_capfm_pwwds_3_tfclicod_to), lV66Ingenieria_capfm_pwwds_4_tfclinom, AV67Ingenieria_capfm_pwwds_5_tfclinom_sel, lV68Ingenieria_capfm_pwwds_6_tfartcod, AV69Ingenieria_capfm_pwwds_7_tfartcod_sel, lV70Ingenieria_capfm_pwwds_8_tfartdsc, AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel, lV72Ingenieria_capfm_pwwds_10_tfprocod, AV73Ingenieria_capfm_pwwds_11_tfprocod_sel, lV74Ingenieria_capfm_pwwds_12_tfprodsc, AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel, lV76Ingenieria_capfm_pwwds_14_tffascodm, AV77Ingenieria_capfm_pwwds_15_tffascodm_sel, lV78Ingenieria_capfm_pwwds_16_tfmaqcodc, AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09RL2_A396EmprCod[0] ;
         A9830MaqCodC = P09RL2_A9830MaqCodC[0] ;
         A9836FasCodM = P09RL2_A9836FasCodM[0] ;
         A759ProDsc = P09RL2_A759ProDsc[0] ;
         A758ProCod = P09RL2_A758ProCod[0] ;
         A69ArtDsc = P09RL2_A69ArtDsc[0] ;
         n69ArtDsc = P09RL2_n69ArtDsc[0] ;
         A65ArtCod = P09RL2_A65ArtCod[0] ;
         A279CliNom = P09RL2_A279CliNom[0] ;
         A252CliCod = P09RL2_A252CliCod[0] ;
         A759ProDsc = P09RL2_A759ProDsc[0] ;
         A279CliNom = P09RL2_A279CliNom[0] ;
         A69ArtDsc = P09RL2_A69ArtDsc[0] ;
         n69ArtDsc = P09RL2_n69ArtDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            capfm_pwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A65ArtCod, ";", ","), GXv_char3) ;
            capfm_pwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A69ArtDsc, ";", ","), GXv_char3) ;
            capfm_pwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A758ProCod, ";", ","), GXv_char3) ;
            capfm_pwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A759ProDsc, ";", ","), GXv_char3) ;
            capfm_pwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9836FasCodM, ";", ","), GXv_char3) ;
            capfm_pwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9830MaqCodC, ";", ","), GXv_char3) ;
            capfm_pwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=CAPFM_PWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtCod", "", "Cód. Art.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtDsc", "", "Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProCod", "", "Cód. Proc.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProDsc", "", "Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasCodM", "", "Cód. Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCodC", "", "Cód Maq.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Ingenieria.CAPFM_PWWColumnsSelector", GXv_char3) ;
      capfm_pwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Ingenieria.CAPFM_PWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.CAPFM_PWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("Ingenieria.CAPFM_PWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV42TFArtCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV43TFArtCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV44TFArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV45TFArtDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV46TFProCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV47TFProCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV48TFProDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV49TFProDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODM") == 0 )
         {
            AV50TFFasCodM = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODM_SEL") == 0 )
         {
            AV51TFFasCodM_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODC") == 0 )
         {
            AV54TFMaqCodC = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODC_SEL") == 0 )
         {
            AV55TFMaqCodC_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
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
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A9836FasCodM = "" ;
      A9830MaqCodC = "" ;
      AV63Ingenieria_capfm_pwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV66Ingenieria_capfm_pwwds_4_tfclinom = "" ;
      AV40TFCliNom = "" ;
      AV67Ingenieria_capfm_pwwds_5_tfclinom_sel = "" ;
      AV41TFCliNom_Sel = "" ;
      AV68Ingenieria_capfm_pwwds_6_tfartcod = "" ;
      AV42TFArtCod = "" ;
      AV69Ingenieria_capfm_pwwds_7_tfartcod_sel = "" ;
      AV43TFArtCod_Sel = "" ;
      AV70Ingenieria_capfm_pwwds_8_tfartdsc = "" ;
      AV44TFArtDsc = "" ;
      AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel = "" ;
      AV45TFArtDsc_Sel = "" ;
      AV72Ingenieria_capfm_pwwds_10_tfprocod = "" ;
      AV46TFProCod = "" ;
      AV73Ingenieria_capfm_pwwds_11_tfprocod_sel = "" ;
      AV47TFProCod_Sel = "" ;
      AV74Ingenieria_capfm_pwwds_12_tfprodsc = "" ;
      AV48TFProDsc = "" ;
      AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel = "" ;
      AV49TFProDsc_Sel = "" ;
      AV76Ingenieria_capfm_pwwds_14_tffascodm = "" ;
      AV50TFFasCodM = "" ;
      AV77Ingenieria_capfm_pwwds_15_tffascodm_sel = "" ;
      AV51TFFasCodM_Sel = "" ;
      AV78Ingenieria_capfm_pwwds_16_tfmaqcodc = "" ;
      AV54TFMaqCodC = "" ;
      AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = "" ;
      AV55TFMaqCodC_Sel = "" ;
      scmdbuf = "" ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = "" ;
      lV66Ingenieria_capfm_pwwds_4_tfclinom = "" ;
      lV68Ingenieria_capfm_pwwds_6_tfartcod = "" ;
      lV70Ingenieria_capfm_pwwds_8_tfartdsc = "" ;
      lV72Ingenieria_capfm_pwwds_10_tfprocod = "" ;
      lV74Ingenieria_capfm_pwwds_12_tfprodsc = "" ;
      lV76Ingenieria_capfm_pwwds_14_tffascodm = "" ;
      lV78Ingenieria_capfm_pwwds_16_tfmaqcodc = "" ;
      P09RL2_A396EmprCod = new String[] {""} ;
      P09RL2_A9830MaqCodC = new String[] {""} ;
      P09RL2_A9836FasCodM = new String[] {""} ;
      P09RL2_A759ProDsc = new String[] {""} ;
      P09RL2_A758ProCod = new String[] {""} ;
      P09RL2_A69ArtDsc = new String[] {""} ;
      P09RL2_n69ArtDsc = new boolean[] {false} ;
      P09RL2_A65ArtCod = new String[] {""} ;
      P09RL2_A279CliNom = new String[] {""} ;
      P09RL2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.capfm_pwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09RL2_A396EmprCod, P09RL2_A9830MaqCodC, P09RL2_A9836FasCodM, P09RL2_A759ProDsc, P09RL2_A758ProCod, P09RL2_A69ArtDsc, P09RL2_n69ArtDsc, P09RL2_A65ArtCod, P09RL2_A279CliNom, P09RL2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int AV64Ingenieria_capfm_pwwds_2_tfclicod ;
   private int AV38TFCliCod ;
   private int AV65Ingenieria_capfm_pwwds_3_tfclicod_to ;
   private int AV39TFCliCod_To ;
   private int AV80GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A9836FasCodM ;
   private String A9830MaqCodC ;
   private String AV66Ingenieria_capfm_pwwds_4_tfclinom ;
   private String AV40TFCliNom ;
   private String AV67Ingenieria_capfm_pwwds_5_tfclinom_sel ;
   private String AV41TFCliNom_Sel ;
   private String AV68Ingenieria_capfm_pwwds_6_tfartcod ;
   private String AV42TFArtCod ;
   private String AV69Ingenieria_capfm_pwwds_7_tfartcod_sel ;
   private String AV43TFArtCod_Sel ;
   private String AV70Ingenieria_capfm_pwwds_8_tfartdsc ;
   private String AV44TFArtDsc ;
   private String AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel ;
   private String AV45TFArtDsc_Sel ;
   private String AV72Ingenieria_capfm_pwwds_10_tfprocod ;
   private String AV46TFProCod ;
   private String AV73Ingenieria_capfm_pwwds_11_tfprocod_sel ;
   private String AV47TFProCod_Sel ;
   private String AV74Ingenieria_capfm_pwwds_12_tfprodsc ;
   private String AV48TFProDsc ;
   private String AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel ;
   private String AV49TFProDsc_Sel ;
   private String AV76Ingenieria_capfm_pwwds_14_tffascodm ;
   private String AV50TFFasCodM ;
   private String AV77Ingenieria_capfm_pwwds_15_tffascodm_sel ;
   private String AV51TFFasCodM_Sel ;
   private String AV78Ingenieria_capfm_pwwds_16_tfmaqcodc ;
   private String AV54TFMaqCodC ;
   private String AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ;
   private String AV55TFMaqCodC_Sel ;
   private String scmdbuf ;
   private String lV66Ingenieria_capfm_pwwds_4_tfclinom ;
   private String lV68Ingenieria_capfm_pwwds_6_tfartcod ;
   private String lV70Ingenieria_capfm_pwwds_8_tfartdsc ;
   private String lV72Ingenieria_capfm_pwwds_10_tfprocod ;
   private String lV74Ingenieria_capfm_pwwds_12_tfprodsc ;
   private String lV76Ingenieria_capfm_pwwds_14_tffascodm ;
   private String lV78Ingenieria_capfm_pwwds_16_tfmaqcodc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n69ArtDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV63Ingenieria_capfm_pwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV63Ingenieria_capfm_pwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09RL2_A396EmprCod ;
   private String[] P09RL2_A9830MaqCodC ;
   private String[] P09RL2_A9836FasCodM ;
   private String[] P09RL2_A759ProDsc ;
   private String[] P09RL2_A758ProCod ;
   private String[] P09RL2_A69ArtDsc ;
   private boolean[] P09RL2_n69ArtDsc ;
   private String[] P09RL2_A65ArtCod ;
   private String[] P09RL2_A279CliNom ;
   private int[] P09RL2_A252CliCod ;
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

final  class capfm_pwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09RL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Ingenieria_capfm_pwwds_1_filterfulltext ,
                                          int AV64Ingenieria_capfm_pwwds_2_tfclicod ,
                                          int AV65Ingenieria_capfm_pwwds_3_tfclicod_to ,
                                          String AV67Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                          String AV66Ingenieria_capfm_pwwds_4_tfclinom ,
                                          String AV69Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                          String AV68Ingenieria_capfm_pwwds_6_tfartcod ,
                                          String AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                          String AV70Ingenieria_capfm_pwwds_8_tfartdsc ,
                                          String AV73Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                          String AV72Ingenieria_capfm_pwwds_10_tfprocod ,
                                          String AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                          String AV74Ingenieria_capfm_pwwds_12_tfprodsc ,
                                          String AV77Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                          String AV76Ingenieria_capfm_pwwds_14_tffascodm ,
                                          String AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                          String AV78Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A9836FasCodM ,
                                          String A9830MaqCodC ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCodC, T1.FasCodM, T2.ProDsc, T1.ProCod, T4.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod FROM (((TXPCAPFM1 T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod AND T4.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T4.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCodM) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodC) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV64Ingenieria_capfm_pwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV65Ingenieria_capfm_pwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV66Ingenieria_capfm_pwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Ingenieria_capfm_pwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_capfm_pwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV72Ingenieria_capfm_pwwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_capfm_pwwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) && ( ! (GXutil.strcmp("", AV76Ingenieria_capfm_pwwds_14_tffascodm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodM = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) && ( ! (GXutil.strcmp("", AV78Ingenieria_capfm_pwwds_16_tfmaqcodc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodC = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ProDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ProDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCodM" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCodM DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodC DESC" ;
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
                  return conditional_P09RL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((int[]) buf[9])[0] = rslt.getInt(9);
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
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               return;
      }
   }

}

