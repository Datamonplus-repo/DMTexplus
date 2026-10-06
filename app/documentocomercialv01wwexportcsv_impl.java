package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentocomercialv01wwexportcsv_impl extends GXWebProcedure
{
   public documentocomercialv01wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "DocumentoComercialv01WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("DocumentoComercialv01WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("DocumentoComercialv01WWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Documento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Prioridad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Hora Salida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod Transp", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Matricula", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Domicilio de Envio", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV59Documentocomercialv01wwds_1_filterfulltext = AV30FilterFullText ;
      AV60Documentocomercialv01wwds_2_tfalbcomcod = AV34TFAlbComCod ;
      AV61Documentocomercialv01wwds_3_tfalbcomcod_to = AV35TFAlbComCod_To ;
      AV62Documentocomercialv01wwds_4_tfalbcompri = AV38TFAlbComPri ;
      AV63Documentocomercialv01wwds_5_tfalbcompri_sel = AV39TFAlbComPri_Sel ;
      AV64Documentocomercialv01wwds_6_tfalbcomfch = AV36TFAlbComFch ;
      AV65Documentocomercialv01wwds_7_tfalbcomhor = AV54TFAlbComHor ;
      AV66Documentocomercialv01wwds_8_tfclicod = AV44TFCliCod ;
      AV67Documentocomercialv01wwds_9_tfclicod_to = AV45TFCliCod_To ;
      AV68Documentocomercialv01wwds_10_tfclinom = AV46TFCliNom ;
      AV69Documentocomercialv01wwds_11_tfclinom_sel = AV47TFCliNom_Sel ;
      AV70Documentocomercialv01wwds_12_tftrncod = AV48TFTrnCod ;
      AV71Documentocomercialv01wwds_13_tftrncod_to = AV49TFTrnCod_To ;
      AV72Documentocomercialv01wwds_14_tftrnnom = AV50TFTrnNom ;
      AV73Documentocomercialv01wwds_15_tftrnnom_sel = AV51TFTrnNom_Sel ;
      AV74Documentocomercialv01wwds_16_tfalbcommat = AV52TFAlbComMat ;
      AV75Documentocomercialv01wwds_17_tfalbcommat_sel = AV53TFAlbComMat_Sel ;
      AV76Documentocomercialv01wwds_18_tfalcdomenv = AV40TFAlcDomEnv ;
      AV77Documentocomercialv01wwds_19_tfalcdomenv_to = AV41TFAlcDomEnv_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Documentocomercialv01wwds_1_filterfulltext ,
                                           Integer.valueOf(AV60Documentocomercialv01wwds_2_tfalbcomcod) ,
                                           Integer.valueOf(AV61Documentocomercialv01wwds_3_tfalbcomcod_to) ,
                                           AV63Documentocomercialv01wwds_5_tfalbcompri_sel ,
                                           AV62Documentocomercialv01wwds_4_tfalbcompri ,
                                           AV64Documentocomercialv01wwds_6_tfalbcomfch ,
                                           AV65Documentocomercialv01wwds_7_tfalbcomhor ,
                                           Integer.valueOf(AV66Documentocomercialv01wwds_8_tfclicod) ,
                                           Integer.valueOf(AV67Documentocomercialv01wwds_9_tfclicod_to) ,
                                           AV69Documentocomercialv01wwds_11_tfclinom_sel ,
                                           AV68Documentocomercialv01wwds_10_tfclinom ,
                                           Short.valueOf(AV70Documentocomercialv01wwds_12_tftrncod) ,
                                           Short.valueOf(AV71Documentocomercialv01wwds_13_tftrncod_to) ,
                                           AV73Documentocomercialv01wwds_15_tftrnnom_sel ,
                                           AV72Documentocomercialv01wwds_14_tftrnnom ,
                                           AV75Documentocomercialv01wwds_17_tfalbcommat_sel ,
                                           AV74Documentocomercialv01wwds_16_tfalbcommat ,
                                           Byte.valueOf(AV76Documentocomercialv01wwds_18_tfalcdomenv) ,
                                           Byte.valueOf(AV77Documentocomercialv01wwds_19_tfalcdomenv_to) ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A22AlbComPri ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A4830AlbComMat ,
                                           Byte.valueOf(A5142AlcDomEnv) ,
                                           A17AlbComFch ,
                                           A4829AlbComHor ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV59Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV59Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV59Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV59Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV59Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV59Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV59Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV59Documentocomercialv01wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Documentocomercialv01wwds_1_filterfulltext), "%", "") ;
      lV62Documentocomercialv01wwds_4_tfalbcompri = GXutil.padr( GXutil.rtrim( AV62Documentocomercialv01wwds_4_tfalbcompri), 1, "%") ;
      lV68Documentocomercialv01wwds_10_tfclinom = GXutil.padr( GXutil.rtrim( AV68Documentocomercialv01wwds_10_tfclinom), 30, "%") ;
      lV72Documentocomercialv01wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV72Documentocomercialv01wwds_14_tftrnnom), 30, "%") ;
      lV74Documentocomercialv01wwds_16_tfalbcommat = GXutil.padr( GXutil.rtrim( AV74Documentocomercialv01wwds_16_tfalbcommat), 20, "%") ;
      /* Using cursor P090M2 */
      pr_default.execute(0, new Object[] {lV59Documentocomercialv01wwds_1_filterfulltext, lV59Documentocomercialv01wwds_1_filterfulltext, lV59Documentocomercialv01wwds_1_filterfulltext, lV59Documentocomercialv01wwds_1_filterfulltext, lV59Documentocomercialv01wwds_1_filterfulltext, lV59Documentocomercialv01wwds_1_filterfulltext, lV59Documentocomercialv01wwds_1_filterfulltext, lV59Documentocomercialv01wwds_1_filterfulltext, Integer.valueOf(AV60Documentocomercialv01wwds_2_tfalbcomcod), Integer.valueOf(AV61Documentocomercialv01wwds_3_tfalbcomcod_to), lV62Documentocomercialv01wwds_4_tfalbcompri, AV63Documentocomercialv01wwds_5_tfalbcompri_sel, AV64Documentocomercialv01wwds_6_tfalbcomfch, AV65Documentocomercialv01wwds_7_tfalbcomhor, Integer.valueOf(AV66Documentocomercialv01wwds_8_tfclicod), Integer.valueOf(AV67Documentocomercialv01wwds_9_tfclicod_to), lV68Documentocomercialv01wwds_10_tfclinom, AV69Documentocomercialv01wwds_11_tfclinom_sel, Short.valueOf(AV70Documentocomercialv01wwds_12_tftrncod), Short.valueOf(AV71Documentocomercialv01wwds_13_tftrncod_to), lV72Documentocomercialv01wwds_14_tftrnnom, AV73Documentocomercialv01wwds_15_tftrnnom_sel, lV74Documentocomercialv01wwds_16_tfalbcommat, AV75Documentocomercialv01wwds_17_tfalbcommat_sel, Byte.valueOf(AV76Documentocomercialv01wwds_18_tfalcdomenv), Byte.valueOf(AV77Documentocomercialv01wwds_19_tfalcdomenv_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P090M2_A396EmprCod[0] ;
         A5142AlcDomEnv = P090M2_A5142AlcDomEnv[0] ;
         A4830AlbComMat = P090M2_A4830AlbComMat[0] ;
         A841TrnNom = P090M2_A841TrnNom[0] ;
         n841TrnNom = P090M2_n841TrnNom[0] ;
         A840TrnCod = P090M2_A840TrnCod[0] ;
         n840TrnCod = P090M2_n840TrnCod[0] ;
         A279CliNom = P090M2_A279CliNom[0] ;
         A252CliCod = P090M2_A252CliCod[0] ;
         A4829AlbComHor = P090M2_A4829AlbComHor[0] ;
         A17AlbComFch = P090M2_A17AlbComFch[0] ;
         A22AlbComPri = P090M2_A22AlbComPri[0] ;
         A14AlbComCod = P090M2_A14AlbComCod[0] ;
         A841TrnNom = P090M2_A841TrnNom[0] ;
         n841TrnNom = P090M2_n841TrnNom[0] ;
         A279CliNom = P090M2_A279CliNom[0] ;
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
            AV14TextFileLine += GXutil.str( A14AlbComCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A22AlbComPri, ";", ","), GXv_char3) ;
            documentocomercialv01wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A17AlbComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            documentocomercialv01wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A840TrnCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A841TrnNom, ";", ","), GXv_char3) ;
            documentocomercialv01wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4830AlbComMat, ";", ","), GXv_char3) ;
            documentocomercialv01wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5142AlcDomEnv, 1, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=DocumentoComercialv01WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComCod", "", "Nº Documento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComPri", "", "Prioridad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComFch", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComHor", "", "Fecha Hora Salida", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnCod", "", "Cod Transp", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnNom", "", "Transportista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComMat", "", "Matricula", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlcDomEnv", "", "Domicilio de Envio", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "DocumentoComercialv01WWColumnsSelector", GXv_char3) ;
      documentocomercialv01wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("DocumentoComercialv01WWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoComercialv01WWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("DocumentoComercialv01WWGridState"), null, null);
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
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV34TFAlbComCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFAlbComCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI") == 0 )
         {
            AV38TFAlbComPri = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV39TFAlbComPri_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV36TFAlbComFch = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMHOR") == 0 )
         {
            AV54TFAlbComHor = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV44TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV46TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV47TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV48TFTrnCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFTrnCod_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV50TFTrnNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV51TFTrnNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMMAT") == 0 )
         {
            AV52TFAlbComMat = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMMAT_SEL") == 0 )
         {
            AV53TFAlbComMat_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALCDOMENV") == 0 )
         {
            AV40TFAlcDomEnv = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFAlcDomEnv_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A4830AlbComMat = "" ;
      AV59Documentocomercialv01wwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV62Documentocomercialv01wwds_4_tfalbcompri = "" ;
      AV38TFAlbComPri = "" ;
      AV63Documentocomercialv01wwds_5_tfalbcompri_sel = "" ;
      AV39TFAlbComPri_Sel = "" ;
      AV64Documentocomercialv01wwds_6_tfalbcomfch = GXutil.nullDate() ;
      AV36TFAlbComFch = GXutil.nullDate() ;
      AV65Documentocomercialv01wwds_7_tfalbcomhor = GXutil.resetTime( GXutil.nullDate() );
      AV54TFAlbComHor = GXutil.resetTime( GXutil.nullDate() );
      AV68Documentocomercialv01wwds_10_tfclinom = "" ;
      AV46TFCliNom = "" ;
      AV69Documentocomercialv01wwds_11_tfclinom_sel = "" ;
      AV47TFCliNom_Sel = "" ;
      AV72Documentocomercialv01wwds_14_tftrnnom = "" ;
      AV50TFTrnNom = "" ;
      AV73Documentocomercialv01wwds_15_tftrnnom_sel = "" ;
      AV51TFTrnNom_Sel = "" ;
      AV74Documentocomercialv01wwds_16_tfalbcommat = "" ;
      AV52TFAlbComMat = "" ;
      AV75Documentocomercialv01wwds_17_tfalbcommat_sel = "" ;
      AV53TFAlbComMat_Sel = "" ;
      scmdbuf = "" ;
      lV59Documentocomercialv01wwds_1_filterfulltext = "" ;
      lV62Documentocomercialv01wwds_4_tfalbcompri = "" ;
      lV68Documentocomercialv01wwds_10_tfclinom = "" ;
      lV72Documentocomercialv01wwds_14_tftrnnom = "" ;
      lV74Documentocomercialv01wwds_16_tfalbcommat = "" ;
      P090M2_A396EmprCod = new String[] {""} ;
      P090M2_A5142AlcDomEnv = new byte[1] ;
      P090M2_A4830AlbComMat = new String[] {""} ;
      P090M2_A841TrnNom = new String[] {""} ;
      P090M2_n841TrnNom = new boolean[] {false} ;
      P090M2_A840TrnCod = new short[1] ;
      P090M2_n840TrnCod = new boolean[] {false} ;
      P090M2_A279CliNom = new String[] {""} ;
      P090M2_A252CliCod = new int[1] ;
      P090M2_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090M2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090M2_A22AlbComPri = new String[] {""} ;
      P090M2_A14AlbComCod = new int[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv01wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P090M2_A396EmprCod, P090M2_A5142AlcDomEnv, P090M2_A4830AlbComMat, P090M2_A841TrnNom, P090M2_n841TrnNom, P090M2_A840TrnCod, P090M2_n840TrnCod, P090M2_A279CliNom, P090M2_A252CliCod, P090M2_A4829AlbComHor,
            P090M2_A17AlbComFch, P090M2_A22AlbComPri, P090M2_A14AlbComCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5142AlcDomEnv ;
   private byte AV76Documentocomercialv01wwds_18_tfalcdomenv ;
   private byte AV40TFAlcDomEnv ;
   private byte AV77Documentocomercialv01wwds_19_tfalcdomenv_to ;
   private byte AV41TFAlcDomEnv_To ;
   private short gxcookieaux ;
   private short A840TrnCod ;
   private short AV70Documentocomercialv01wwds_12_tftrncod ;
   private short AV48TFTrnCod ;
   private short AV71Documentocomercialv01wwds_13_tftrncod_to ;
   private short AV49TFTrnCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV60Documentocomercialv01wwds_2_tfalbcomcod ;
   private int AV34TFAlbComCod ;
   private int AV61Documentocomercialv01wwds_3_tfalbcomcod_to ;
   private int AV35TFAlbComCod_To ;
   private int AV66Documentocomercialv01wwds_8_tfclicod ;
   private int AV44TFCliCod ;
   private int AV67Documentocomercialv01wwds_9_tfclicod_to ;
   private int AV45TFCliCod_To ;
   private int AV78GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A22AlbComPri ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String A4830AlbComMat ;
   private String AV62Documentocomercialv01wwds_4_tfalbcompri ;
   private String AV38TFAlbComPri ;
   private String AV63Documentocomercialv01wwds_5_tfalbcompri_sel ;
   private String AV39TFAlbComPri_Sel ;
   private String AV68Documentocomercialv01wwds_10_tfclinom ;
   private String AV46TFCliNom ;
   private String AV69Documentocomercialv01wwds_11_tfclinom_sel ;
   private String AV47TFCliNom_Sel ;
   private String AV72Documentocomercialv01wwds_14_tftrnnom ;
   private String AV50TFTrnNom ;
   private String AV73Documentocomercialv01wwds_15_tftrnnom_sel ;
   private String AV51TFTrnNom_Sel ;
   private String AV74Documentocomercialv01wwds_16_tfalbcommat ;
   private String AV52TFAlbComMat ;
   private String AV75Documentocomercialv01wwds_17_tfalbcommat_sel ;
   private String AV53TFAlbComMat_Sel ;
   private String scmdbuf ;
   private String lV62Documentocomercialv01wwds_4_tfalbcompri ;
   private String lV68Documentocomercialv01wwds_10_tfclinom ;
   private String lV72Documentocomercialv01wwds_14_tftrnnom ;
   private String lV74Documentocomercialv01wwds_16_tfalbcommat ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date AV65Documentocomercialv01wwds_7_tfalbcomhor ;
   private java.util.Date AV54TFAlbComHor ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV64Documentocomercialv01wwds_6_tfalbcomfch ;
   private java.util.Date AV36TFAlbComFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV59Documentocomercialv01wwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV59Documentocomercialv01wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P090M2_A396EmprCod ;
   private byte[] P090M2_A5142AlcDomEnv ;
   private String[] P090M2_A4830AlbComMat ;
   private String[] P090M2_A841TrnNom ;
   private boolean[] P090M2_n841TrnNom ;
   private short[] P090M2_A840TrnCod ;
   private boolean[] P090M2_n840TrnCod ;
   private String[] P090M2_A279CliNom ;
   private int[] P090M2_A252CliCod ;
   private java.util.Date[] P090M2_A4829AlbComHor ;
   private java.util.Date[] P090M2_A17AlbComFch ;
   private String[] P090M2_A22AlbComPri ;
   private int[] P090M2_A14AlbComCod ;
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

final  class documentocomercialv01wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090M2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Documentocomercialv01wwds_1_filterfulltext ,
                                          int AV60Documentocomercialv01wwds_2_tfalbcomcod ,
                                          int AV61Documentocomercialv01wwds_3_tfalbcomcod_to ,
                                          String AV63Documentocomercialv01wwds_5_tfalbcompri_sel ,
                                          String AV62Documentocomercialv01wwds_4_tfalbcompri ,
                                          java.util.Date AV64Documentocomercialv01wwds_6_tfalbcomfch ,
                                          java.util.Date AV65Documentocomercialv01wwds_7_tfalbcomhor ,
                                          int AV66Documentocomercialv01wwds_8_tfclicod ,
                                          int AV67Documentocomercialv01wwds_9_tfclicod_to ,
                                          String AV69Documentocomercialv01wwds_11_tfclinom_sel ,
                                          String AV68Documentocomercialv01wwds_10_tfclinom ,
                                          short AV70Documentocomercialv01wwds_12_tftrncod ,
                                          short AV71Documentocomercialv01wwds_13_tftrncod_to ,
                                          String AV73Documentocomercialv01wwds_15_tftrnnom_sel ,
                                          String AV72Documentocomercialv01wwds_14_tftrnnom ,
                                          String AV75Documentocomercialv01wwds_17_tfalbcommat_sel ,
                                          String AV74Documentocomercialv01wwds_16_tfalbcommat ,
                                          byte AV76Documentocomercialv01wwds_18_tfalcdomenv ,
                                          byte AV77Documentocomercialv01wwds_19_tfalcdomenv_to ,
                                          int A14AlbComCod ,
                                          String A22AlbComPri ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A4830AlbComMat ,
                                          byte A5142AlcDomEnv ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[26];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlcDomEnv, T1.AlbComMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.AlbComHor, T1.AlbComFch, T1.AlbComPri, T1.AlbComCod FROM ((TXPCALCOM" ;
      scmdbuf += " T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV59Documentocomercialv01wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlcDomEnv,'90'), 2) like '%' || ?))");
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
      if ( ! (0==AV60Documentocomercialv01wwds_2_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV61Documentocomercialv01wwds_3_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Documentocomercialv01wwds_5_tfalbcompri_sel)==0) && ( ! (GXutil.strcmp("", AV62Documentocomercialv01wwds_4_tfalbcompri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Documentocomercialv01wwds_5_tfalbcompri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComPri = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Documentocomercialv01wwds_6_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Documentocomercialv01wwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV66Documentocomercialv01wwds_8_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV67Documentocomercialv01wwds_9_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Documentocomercialv01wwds_11_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentocomercialv01wwds_10_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentocomercialv01wwds_11_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV70Documentocomercialv01wwds_12_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Documentocomercialv01wwds_13_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentocomercialv01wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentocomercialv01wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentocomercialv01wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentocomercialv01wwds_17_tfalbcommat_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentocomercialv01wwds_16_tfalbcommat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentocomercialv01wwds_17_tfalbcommat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComMat = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV76Documentocomercialv01wwds_18_tfalcdomenv) )
      {
         addWhere(sWhereString, "(T1.AlcDomEnv >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Documentocomercialv01wwds_19_tfalcdomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlcDomEnv <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFch" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFch DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComPri" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComPri DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComHor" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComHor DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComMat" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComMat DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlcDomEnv" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlcDomEnv DESC" ;
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
                  return conditional_P090M2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090M2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((int[]) buf[12])[0] = rslt.getInt(11);
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
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               return;
      }
   }

}

