package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class menvwwexportcsv_impl extends GXWebProcedure
{
   public menvwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "MEnvWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Ingenieria.MEnvWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Ingenieria.MEnvWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "OS", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "R", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "P", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Seg.", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV67Ingenieria_menvwwds_1_filterfulltext = AV30FilterFullText ;
      AV68Ingenieria_menvwwds_2_tfbarcod = AV36TFBarCod ;
      AV69Ingenieria_menvwwds_3_tfbarcod_to = AV37TFBarCod_To ;
      AV70Ingenieria_menvwwds_4_tfbarcodreo = AV38TFBarCodReo ;
      AV71Ingenieria_menvwwds_5_tfbarcodreo_to = AV39TFBarCodReo_To ;
      AV72Ingenieria_menvwwds_6_tfbarcodpar = AV40TFBarCodPar ;
      AV73Ingenieria_menvwwds_7_tfbarcodpar_sel = AV41TFBarCodPar_Sel ;
      AV74Ingenieria_menvwwds_8_tfmenvord = AV52TFMEnvOrd ;
      AV75Ingenieria_menvwwds_9_tfmenvord_to = AV53TFMEnvOrd_To ;
      AV76Ingenieria_menvwwds_10_tffascod = AV54TFFasCod ;
      AV77Ingenieria_menvwwds_11_tffascod_sel = AV55TFFasCod_Sel ;
      AV78Ingenieria_menvwwds_12_tfmenvini = AV56TFMEnvIni ;
      AV79Ingenieria_menvwwds_13_tfmenvfin = AV58TFMEnvFin ;
      AV80Ingenieria_menvwwds_14_tfmenvest_sels = AV61TFMEnvEst_Sels ;
      AV81Ingenieria_menvwwds_15_tfmenvint = AV62TFMEnvInt ;
      AV82Ingenieria_menvwwds_16_tfmenvint_to = AV63TFMEnvInt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A14156MEnvEst) ,
                                           AV80Ingenieria_menvwwds_14_tfmenvest_sels ,
                                           Integer.valueOf(AV68Ingenieria_menvwwds_2_tfbarcod) ,
                                           Integer.valueOf(AV69Ingenieria_menvwwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV70Ingenieria_menvwwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV71Ingenieria_menvwwds_5_tfbarcodreo_to) ,
                                           AV73Ingenieria_menvwwds_7_tfbarcodpar_sel ,
                                           AV72Ingenieria_menvwwds_6_tfbarcodpar ,
                                           Short.valueOf(AV74Ingenieria_menvwwds_8_tfmenvord) ,
                                           Short.valueOf(AV75Ingenieria_menvwwds_9_tfmenvord_to) ,
                                           AV77Ingenieria_menvwwds_11_tffascod_sel ,
                                           AV76Ingenieria_menvwwds_10_tffascod ,
                                           AV78Ingenieria_menvwwds_12_tfmenvini ,
                                           AV79Ingenieria_menvwwds_13_tfmenvfin ,
                                           AV81Ingenieria_menvwwds_15_tfmenvint ,
                                           AV82Ingenieria_menvwwds_16_tfmenvint_to ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A14152MEnvOrd) ,
                                           A457FasCod ,
                                           A14158MEnvIni ,
                                           A14157MEnvFin ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV67Ingenieria_menvwwds_1_filterfulltext ,
                                           A14162MEnvInt ,
                                           Integer.valueOf(AV80Ingenieria_menvwwds_14_tfmenvest_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV72Ingenieria_menvwwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV72Ingenieria_menvwwds_6_tfbarcodpar), 1, "%") ;
      lV76Ingenieria_menvwwds_10_tffascod = GXutil.padr( GXutil.rtrim( AV76Ingenieria_menvwwds_10_tffascod), 8, "%") ;
      /* Using cursor P0AUT2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV80Ingenieria_menvwwds_14_tfmenvest_sels.size()), Integer.valueOf(AV68Ingenieria_menvwwds_2_tfbarcod), Integer.valueOf(AV69Ingenieria_menvwwds_3_tfbarcod_to), Byte.valueOf(AV70Ingenieria_menvwwds_4_tfbarcodreo), Byte.valueOf(AV71Ingenieria_menvwwds_5_tfbarcodreo_to), lV72Ingenieria_menvwwds_6_tfbarcodpar, AV73Ingenieria_menvwwds_7_tfbarcodpar_sel, Short.valueOf(AV74Ingenieria_menvwwds_8_tfmenvord), Short.valueOf(AV75Ingenieria_menvwwds_9_tfmenvord_to), lV76Ingenieria_menvwwds_10_tffascod, AV77Ingenieria_menvwwds_11_tffascod_sel, AV78Ingenieria_menvwwds_12_tfmenvini, AV79Ingenieria_menvwwds_13_tfmenvfin, AV81Ingenieria_menvwwds_15_tfmenvint, AV82Ingenieria_menvwwds_16_tfmenvint_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14162MEnvInt = P0AUT2_A14162MEnvInt[0] ;
         A457FasCod = P0AUT2_A457FasCod[0] ;
         A14152MEnvOrd = P0AUT2_A14152MEnvOrd[0] ;
         A130BarCodPar = P0AUT2_A130BarCodPar[0] ;
         A132BarCodReo = P0AUT2_A132BarCodReo[0] ;
         A129BarCod = P0AUT2_A129BarCod[0] ;
         A14156MEnvEst = P0AUT2_A14156MEnvEst[0] ;
         A14157MEnvFin = P0AUT2_A14157MEnvFin[0] ;
         A14158MEnvIni = P0AUT2_A14158MEnvIni[0] ;
         A396EmprCod = P0AUT2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV67Ingenieria_menvwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV67Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV67Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV67Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14152MEnvOrd, 4, 0) , GXutil.padr( "%" + AV67Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV67Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a procesar", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A14156MEnvEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "procesado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A14156MEnvEst == 2 ) ) || ( GXutil.like( GXutil.str( A14162MEnvInt, 10, 2) , GXutil.padr( "%" + AV67Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
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
               AV14TextFileLine += GXutil.str( A129BarCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A132BarCodReo, 1, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A130BarCodPar, ";", ","), GXv_char3) ;
               menvwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A14152MEnvOrd, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A457FasCod, ";", ","), GXv_char3) ;
               menvwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += httpContext.getMessage( app.ingenieria.gxdomainestadosenvioparametros.getDescription(httpContext,(byte)A14156MEnvEst), "") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A14162MEnvInt, 10, 2) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=MEnvWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarCod", "", "OS", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarCodReo", "", "R", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarCodPar", "", "P", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MEnvOrd", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasCod", "", "Codigo Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MEnvIni", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MEnvFin", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MEnvEst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MEnvInt", "", "Seg.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Ingenieria.MEnvWWColumnsSelector", GXv_char3) ;
      menvwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Ingenieria.MEnvWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.MEnvWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("Ingenieria.MEnvWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV83GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV36TFBarCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFBarCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV38TFBarCodReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarCodReo_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV40TFBarCodPar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV41TFBarCodPar_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVORD") == 0 )
         {
            AV52TFMEnvOrd = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFMEnvOrd_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV54TFFasCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV55TFFasCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVINI") == 0 )
         {
            AV56TFMEnvIni = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVFIN") == 0 )
         {
            AV58TFMEnvFin = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVEST_SEL") == 0 )
         {
            AV60TFMEnvEst_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV61TFMEnvEst_Sels.fromJSonString(AV60TFMEnvEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVINT") == 0 )
         {
            AV62TFMEnvInt = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFMEnvInt_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
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
      A130BarCodPar = "" ;
      A457FasCod = "" ;
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      A14162MEnvInt = DecimalUtil.ZERO ;
      AV67Ingenieria_menvwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV72Ingenieria_menvwwds_6_tfbarcodpar = "" ;
      AV40TFBarCodPar = "" ;
      AV73Ingenieria_menvwwds_7_tfbarcodpar_sel = "" ;
      AV41TFBarCodPar_Sel = "" ;
      AV76Ingenieria_menvwwds_10_tffascod = "" ;
      AV54TFFasCod = "" ;
      AV77Ingenieria_menvwwds_11_tffascod_sel = "" ;
      AV55TFFasCod_Sel = "" ;
      AV78Ingenieria_menvwwds_12_tfmenvini = GXutil.resetTime( GXutil.nullDate() );
      AV56TFMEnvIni = GXutil.resetTime( GXutil.nullDate() );
      AV79Ingenieria_menvwwds_13_tfmenvfin = GXutil.resetTime( GXutil.nullDate() );
      AV58TFMEnvFin = GXutil.resetTime( GXutil.nullDate() );
      AV80Ingenieria_menvwwds_14_tfmenvest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV61TFMEnvEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV81Ingenieria_menvwwds_15_tfmenvint = DecimalUtil.ZERO ;
      AV62TFMEnvInt = DecimalUtil.ZERO ;
      AV82Ingenieria_menvwwds_16_tfmenvint_to = DecimalUtil.ZERO ;
      AV63TFMEnvInt_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV67Ingenieria_menvwwds_1_filterfulltext = "" ;
      lV72Ingenieria_menvwwds_6_tfbarcodpar = "" ;
      lV76Ingenieria_menvwwds_10_tffascod = "" ;
      P0AUT2_A14162MEnvInt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUT2_A457FasCod = new String[] {""} ;
      P0AUT2_A14152MEnvOrd = new short[1] ;
      P0AUT2_A130BarCodPar = new String[] {""} ;
      P0AUT2_A132BarCodReo = new byte[1] ;
      P0AUT2_A129BarCod = new int[1] ;
      P0AUT2_A14156MEnvEst = new byte[1] ;
      P0AUT2_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUT2_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUT2_A396EmprCod = new String[] {""} ;
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
      AV60TFMEnvEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.menvwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0AUT2_A14162MEnvInt, P0AUT2_A457FasCod, P0AUT2_A14152MEnvOrd, P0AUT2_A130BarCodPar, P0AUT2_A132BarCodReo, P0AUT2_A129BarCod, P0AUT2_A14156MEnvEst, P0AUT2_A14157MEnvFin, P0AUT2_A14158MEnvIni, P0AUT2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A14156MEnvEst ;
   private byte AV70Ingenieria_menvwwds_4_tfbarcodreo ;
   private byte AV38TFBarCodReo ;
   private byte AV71Ingenieria_menvwwds_5_tfbarcodreo_to ;
   private byte AV39TFBarCodReo_To ;
   private short gxcookieaux ;
   private short A14152MEnvOrd ;
   private short AV74Ingenieria_menvwwds_8_tfmenvord ;
   private short AV52TFMEnvOrd ;
   private short AV75Ingenieria_menvwwds_9_tfmenvord_to ;
   private short AV53TFMEnvOrd_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A129BarCod ;
   private int AV68Ingenieria_menvwwds_2_tfbarcod ;
   private int AV36TFBarCod ;
   private int AV69Ingenieria_menvwwds_3_tfbarcod_to ;
   private int AV37TFBarCod_To ;
   private int AV80Ingenieria_menvwwds_14_tfmenvest_sels_size ;
   private int AV83GXV1 ;
   private java.math.BigDecimal A14162MEnvInt ;
   private java.math.BigDecimal AV81Ingenieria_menvwwds_15_tfmenvint ;
   private java.math.BigDecimal AV62TFMEnvInt ;
   private java.math.BigDecimal AV82Ingenieria_menvwwds_16_tfmenvint_to ;
   private java.math.BigDecimal AV63TFMEnvInt_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String AV72Ingenieria_menvwwds_6_tfbarcodpar ;
   private String AV40TFBarCodPar ;
   private String AV73Ingenieria_menvwwds_7_tfbarcodpar_sel ;
   private String AV41TFBarCodPar_Sel ;
   private String AV76Ingenieria_menvwwds_10_tffascod ;
   private String AV54TFFasCod ;
   private String AV77Ingenieria_menvwwds_11_tffascod_sel ;
   private String AV55TFFasCod_Sel ;
   private String scmdbuf ;
   private String lV72Ingenieria_menvwwds_6_tfbarcodpar ;
   private String lV76Ingenieria_menvwwds_10_tffascod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A14158MEnvIni ;
   private java.util.Date A14157MEnvFin ;
   private java.util.Date AV78Ingenieria_menvwwds_12_tfmenvini ;
   private java.util.Date AV56TFMEnvIni ;
   private java.util.Date AV79Ingenieria_menvwwds_13_tfmenvfin ;
   private java.util.Date AV58TFMEnvFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV60TFMEnvEst_SelsJson ;
   private String AV11Filename ;
   private String AV67Ingenieria_menvwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV67Ingenieria_menvwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV80Ingenieria_menvwwds_14_tfmenvest_sels ;
   private GXSimpleCollection<Byte> AV61TFMEnvEst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0AUT2_A14162MEnvInt ;
   private String[] P0AUT2_A457FasCod ;
   private short[] P0AUT2_A14152MEnvOrd ;
   private String[] P0AUT2_A130BarCodPar ;
   private byte[] P0AUT2_A132BarCodReo ;
   private int[] P0AUT2_A129BarCod ;
   private byte[] P0AUT2_A14156MEnvEst ;
   private java.util.Date[] P0AUT2_A14157MEnvFin ;
   private java.util.Date[] P0AUT2_A14158MEnvIni ;
   private String[] P0AUT2_A396EmprCod ;
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

final  class menvwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AUT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A14156MEnvEst ,
                                          GXSimpleCollection<Byte> AV80Ingenieria_menvwwds_14_tfmenvest_sels ,
                                          int AV68Ingenieria_menvwwds_2_tfbarcod ,
                                          int AV69Ingenieria_menvwwds_3_tfbarcod_to ,
                                          byte AV70Ingenieria_menvwwds_4_tfbarcodreo ,
                                          byte AV71Ingenieria_menvwwds_5_tfbarcodreo_to ,
                                          String AV73Ingenieria_menvwwds_7_tfbarcodpar_sel ,
                                          String AV72Ingenieria_menvwwds_6_tfbarcodpar ,
                                          short AV74Ingenieria_menvwwds_8_tfmenvord ,
                                          short AV75Ingenieria_menvwwds_9_tfmenvord_to ,
                                          String AV77Ingenieria_menvwwds_11_tffascod_sel ,
                                          String AV76Ingenieria_menvwwds_10_tffascod ,
                                          java.util.Date AV78Ingenieria_menvwwds_12_tfmenvini ,
                                          java.util.Date AV79Ingenieria_menvwwds_13_tfmenvfin ,
                                          java.math.BigDecimal AV81Ingenieria_menvwwds_15_tfmenvint ,
                                          java.math.BigDecimal AV82Ingenieria_menvwwds_16_tfmenvint_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A14152MEnvOrd ,
                                          String A457FasCod ,
                                          java.util.Date A14158MEnvIni ,
                                          java.util.Date A14157MEnvFin ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV67Ingenieria_menvwwds_1_filterfulltext ,
                                          java.math.BigDecimal A14162MEnvInt ,
                                          int AV80Ingenieria_menvwwds_14_tfmenvest_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END AS MEnvInt, FasCod, MEnvOrd," ;
      scmdbuf += " BarCodPar, BarCodReo, BarCod, CASE  WHEN (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN 1 ELSE 2 END AS MEnvEst, MEnvFin, MEnvIni, EmprCod FROM TXPMEnv" ;
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV80Ingenieria_menvwwds_14_tfmenvest_sels, "CASE  WHEN (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN 1 ELSE 2 END IN (", ")")+"))");
      if ( ! (0==AV68Ingenieria_menvwwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV69Ingenieria_menvwwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV70Ingenieria_menvwwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Ingenieria_menvwwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ingenieria_menvwwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV72Ingenieria_menvwwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ingenieria_menvwwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV74Ingenieria_menvwwds_8_tfmenvord) )
      {
         addWhere(sWhereString, "(MEnvOrd >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV75Ingenieria_menvwwds_9_tfmenvord_to) )
      {
         addWhere(sWhereString, "(MEnvOrd <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Ingenieria_menvwwds_11_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV76Ingenieria_menvwwds_10_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Ingenieria_menvwwds_11_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(FasCod = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV78Ingenieria_menvwwds_12_tfmenvini) )
      {
         addWhere(sWhereString, "(MEnvIni >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV79Ingenieria_menvwwds_13_tfmenvfin) )
      {
         addWhere(sWhereString, "(MEnvFin >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Ingenieria_menvwwds_15_tfmenvint)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ingenieria_menvwwds_16_tfmenvint_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCodReo" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCodReo DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCodPar" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCodPar DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MEnvOrd" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MEnvOrd DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY FasCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY FasCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MEnvIni" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MEnvIni DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MEnvFin" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MEnvFin DESC" ;
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
                  return conditional_P0AUT2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9, true);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[26], false, true);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               return;
      }
   }

}

