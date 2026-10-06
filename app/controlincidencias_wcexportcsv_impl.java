package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlincidencias_wcexportcsv_impl extends GXWebProcedure
{
   public controlincidencias_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ControlIncidencias_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ControlIncidencias_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ControlIncidencias_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Terminal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Programa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº documento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Observaciones", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Controlincidencias_wcds_1_filterfulltext = AV30FilterFullText ;
      AV58Controlincidencias_wcds_2_tfinc_dia = AV35TFInc_Dia ;
      AV59Controlincidencias_wcds_3_tfinc_linea = AV37TFInc_Linea ;
      AV60Controlincidencias_wcds_4_tfinc_linea_to = AV38TFInc_Linea_To ;
      AV61Controlincidencias_wcds_5_tfinc_hora = AV39TFInc_Hora ;
      AV62Controlincidencias_wcds_6_tfinc_usuario = AV41TFInc_Usuario ;
      AV63Controlincidencias_wcds_7_tfinc_usuario_sel = AV42TFInc_Usuario_Sel ;
      AV64Controlincidencias_wcds_8_tfinc_terminal = AV43TFInc_Terminal ;
      AV65Controlincidencias_wcds_9_tfinc_terminal_sel = AV44TFInc_Terminal_Sel ;
      AV66Controlincidencias_wcds_10_tfinc_prog = AV45TFInc_Prog ;
      AV67Controlincidencias_wcds_11_tfinc_prog_sel = AV46TFInc_Prog_Sel ;
      AV68Controlincidencias_wcds_12_tfinc_hdr = AV47TFInc_Hdr ;
      AV69Controlincidencias_wcds_13_tfinc_hdr_sel = AV48TFInc_Hdr_Sel ;
      AV70Controlincidencias_wcds_14_tfinc_obstxt = AV49TFInc_obsTxt ;
      AV71Controlincidencias_wcds_15_tfinc_obstxt_sel = AV50TFInc_obsTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Controlincidencias_wcds_1_filterfulltext ,
                                           AV58Controlincidencias_wcds_2_tfinc_dia ,
                                           Long.valueOf(AV59Controlincidencias_wcds_3_tfinc_linea) ,
                                           Long.valueOf(AV60Controlincidencias_wcds_4_tfinc_linea_to) ,
                                           AV61Controlincidencias_wcds_5_tfinc_hora ,
                                           AV63Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                           AV62Controlincidencias_wcds_6_tfinc_usuario ,
                                           AV65Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                           AV64Controlincidencias_wcds_8_tfinc_terminal ,
                                           AV67Controlincidencias_wcds_11_tfinc_prog_sel ,
                                           AV66Controlincidencias_wcds_10_tfinc_prog ,
                                           AV69Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                           AV68Controlincidencias_wcds_12_tfinc_hdr ,
                                           AV71Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                           AV70Controlincidencias_wcds_14_tfinc_obstxt ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           A5301Inc_BarPar ,
                                           A4936Inc_Obs ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV51Emprcod ,
                                           AV52Inc_dia ,
                                           A396EmprCod ,
                                           AV53Inc_dia_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.DATE
                                           }
      });
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV62Controlincidencias_wcds_6_tfinc_usuario = GXutil.padr( GXutil.rtrim( AV62Controlincidencias_wcds_6_tfinc_usuario), 8, "%") ;
      lV64Controlincidencias_wcds_8_tfinc_terminal = GXutil.padr( GXutil.rtrim( AV64Controlincidencias_wcds_8_tfinc_terminal), 10, "%") ;
      lV66Controlincidencias_wcds_10_tfinc_prog = GXutil.padr( GXutil.rtrim( AV66Controlincidencias_wcds_10_tfinc_prog), 10, "%") ;
      lV68Controlincidencias_wcds_12_tfinc_hdr = GXutil.padr( GXutil.rtrim( AV68Controlincidencias_wcds_12_tfinc_hdr), 11, "%") ;
      lV70Controlincidencias_wcds_14_tfinc_obstxt = GXutil.concat( GXutil.rtrim( AV70Controlincidencias_wcds_14_tfinc_obstxt), "%", "") ;
      /* Using cursor P094B2 */
      pr_default.execute(0, new Object[] {AV51Emprcod, AV52Inc_dia, AV53Inc_dia_to, lV57Controlincidencias_wcds_1_filterfulltext, lV57Controlincidencias_wcds_1_filterfulltext, lV57Controlincidencias_wcds_1_filterfulltext, lV57Controlincidencias_wcds_1_filterfulltext, lV57Controlincidencias_wcds_1_filterfulltext, lV57Controlincidencias_wcds_1_filterfulltext, AV58Controlincidencias_wcds_2_tfinc_dia, Long.valueOf(AV59Controlincidencias_wcds_3_tfinc_linea), Long.valueOf(AV60Controlincidencias_wcds_4_tfinc_linea_to), AV61Controlincidencias_wcds_5_tfinc_hora, lV62Controlincidencias_wcds_6_tfinc_usuario, AV63Controlincidencias_wcds_7_tfinc_usuario_sel, lV64Controlincidencias_wcds_8_tfinc_terminal, AV65Controlincidencias_wcds_9_tfinc_terminal_sel, lV66Controlincidencias_wcds_10_tfinc_prog, AV67Controlincidencias_wcds_11_tfinc_prog_sel, lV68Controlincidencias_wcds_12_tfinc_hdr, AV69Controlincidencias_wcds_13_tfinc_hdr_sel, lV70Controlincidencias_wcds_14_tfinc_obstxt, AV71Controlincidencias_wcds_15_tfinc_obstxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P094B2_A396EmprCod[0] ;
         A4935Inc_Prog = P094B2_A4935Inc_Prog[0] ;
         A4934Inc_Termin = P094B2_A4934Inc_Termin[0] ;
         A4933Inc_Usuari = P094B2_A4933Inc_Usuari[0] ;
         A4932Inc_Hora = P094B2_A4932Inc_Hora[0] ;
         A4931Inc_Linea = P094B2_A4931Inc_Linea[0] ;
         A4929Inc_Dia = P094B2_A4929Inc_Dia[0] ;
         A5301Inc_BarPar = P094B2_A5301Inc_BarPar[0] ;
         A5300Inc_BarReo = P094B2_A5300Inc_BarReo[0] ;
         A5299Inc_Barcod = P094B2_A5299Inc_Barcod[0] ;
         A4936Inc_Obs = P094B2_A4936Inc_Obs[0] ;
         A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
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
            AV14TextFileLine += localUtil.dtoc( A4929Inc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4931Inc_Linea, 10, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4932Inc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4933Inc_Usuari, ";", ","), GXv_char3) ;
            controlincidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4934Inc_Termin, ";", ","), GXv_char3) ;
            controlincidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4935Inc_Prog, ";", ","), GXv_char3) ;
            controlincidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13713Inc_Hdr, ";", ","), GXv_char3) ;
            controlincidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV31NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A13712Inc_obsTxt, ";", ","), AV31NewLine, " "), GXv_char3) ;
            controlincidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ControlIncidencias_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Dia", "", "Dia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Linea", "", "Linea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Hora", "", "Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Usuario", "", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Terminal", "", "Terminal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Prog", "", "Programa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Hdr", "", "Nº documento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_obsTxt", "", "Observaciones", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ControlIncidencias_WCColumnsSelector", GXv_char3) ;
      controlincidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ControlIncidencias_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlIncidencias_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("ControlIncidencias_WCGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV35TFInc_Dia = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV37TFInc_Linea = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV38TFInc_Linea_To = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV39TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV41TFInc_Usuario = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV42TFInc_Usuario_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV43TFInc_Terminal = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV44TFInc_Terminal_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV45TFInc_Prog = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV46TFInc_Prog_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR") == 0 )
         {
            AV47TFInc_Hdr = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR_SEL") == 0 )
         {
            AV48TFInc_Hdr_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_OBSTXT") == 0 )
         {
            AV49TFInc_obsTxt = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_OBSTXT_SEL") == 0 )
         {
            AV50TFInc_obsTxt_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INC_DIA") == 0 )
         {
            AV52Inc_dia = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INC_DIA_TO") == 0 )
         {
            AV53Inc_dia_to = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
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
      A4929Inc_Dia = GXutil.nullDate() ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A13713Inc_Hdr = "" ;
      A13712Inc_obsTxt = "" ;
      AV57Controlincidencias_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV58Controlincidencias_wcds_2_tfinc_dia = GXutil.nullDate() ;
      AV35TFInc_Dia = GXutil.nullDate() ;
      AV61Controlincidencias_wcds_5_tfinc_hora = GXutil.resetTime( GXutil.nullDate() );
      AV39TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV62Controlincidencias_wcds_6_tfinc_usuario = "" ;
      AV41TFInc_Usuario = "" ;
      AV63Controlincidencias_wcds_7_tfinc_usuario_sel = "" ;
      AV42TFInc_Usuario_Sel = "" ;
      AV64Controlincidencias_wcds_8_tfinc_terminal = "" ;
      AV43TFInc_Terminal = "" ;
      AV65Controlincidencias_wcds_9_tfinc_terminal_sel = "" ;
      AV44TFInc_Terminal_Sel = "" ;
      AV66Controlincidencias_wcds_10_tfinc_prog = "" ;
      AV45TFInc_Prog = "" ;
      AV67Controlincidencias_wcds_11_tfinc_prog_sel = "" ;
      AV46TFInc_Prog_Sel = "" ;
      AV68Controlincidencias_wcds_12_tfinc_hdr = "" ;
      AV47TFInc_Hdr = "" ;
      AV69Controlincidencias_wcds_13_tfinc_hdr_sel = "" ;
      AV48TFInc_Hdr_Sel = "" ;
      AV70Controlincidencias_wcds_14_tfinc_obstxt = "" ;
      AV49TFInc_obsTxt = "" ;
      AV71Controlincidencias_wcds_15_tfinc_obstxt_sel = "" ;
      AV50TFInc_obsTxt_Sel = "" ;
      scmdbuf = "" ;
      lV57Controlincidencias_wcds_1_filterfulltext = "" ;
      lV62Controlincidencias_wcds_6_tfinc_usuario = "" ;
      lV64Controlincidencias_wcds_8_tfinc_terminal = "" ;
      lV66Controlincidencias_wcds_10_tfinc_prog = "" ;
      lV68Controlincidencias_wcds_12_tfinc_hdr = "" ;
      lV70Controlincidencias_wcds_14_tfinc_obstxt = "" ;
      A5301Inc_BarPar = "" ;
      A4936Inc_Obs = "" ;
      AV51Emprcod = "" ;
      AV52Inc_dia = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV53Inc_dia_to = GXutil.nullDate() ;
      P094B2_A396EmprCod = new String[] {""} ;
      P094B2_A4935Inc_Prog = new String[] {""} ;
      P094B2_A4934Inc_Termin = new String[] {""} ;
      P094B2_A4933Inc_Usuari = new String[] {""} ;
      P094B2_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      P094B2_A4931Inc_Linea = new long[1] ;
      P094B2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P094B2_A5301Inc_BarPar = new String[] {""} ;
      P094B2_A5300Inc_BarReo = new byte[1] ;
      P094B2_A5299Inc_Barcod = new int[1] ;
      P094B2_A4936Inc_Obs = new String[] {""} ;
      AV31NewLine = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlincidencias_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P094B2_A396EmprCod, P094B2_A4935Inc_Prog, P094B2_A4934Inc_Termin, P094B2_A4933Inc_Usuari, P094B2_A4932Inc_Hora, P094B2_A4931Inc_Linea, P094B2_A4929Inc_Dia, P094B2_A5301Inc_BarPar, P094B2_A5300Inc_BarReo, P094B2_A5299Inc_Barcod,
            P094B2_A4936Inc_Obs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5300Inc_BarReo ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A5299Inc_Barcod ;
   private int AV72GXV1 ;
   private long A4931Inc_Linea ;
   private long AV59Controlincidencias_wcds_3_tfinc_linea ;
   private long AV37TFInc_Linea ;
   private long AV60Controlincidencias_wcds_4_tfinc_linea_to ;
   private long AV38TFInc_Linea_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A13713Inc_Hdr ;
   private String AV62Controlincidencias_wcds_6_tfinc_usuario ;
   private String AV41TFInc_Usuario ;
   private String AV63Controlincidencias_wcds_7_tfinc_usuario_sel ;
   private String AV42TFInc_Usuario_Sel ;
   private String AV64Controlincidencias_wcds_8_tfinc_terminal ;
   private String AV43TFInc_Terminal ;
   private String AV65Controlincidencias_wcds_9_tfinc_terminal_sel ;
   private String AV44TFInc_Terminal_Sel ;
   private String AV66Controlincidencias_wcds_10_tfinc_prog ;
   private String AV45TFInc_Prog ;
   private String AV67Controlincidencias_wcds_11_tfinc_prog_sel ;
   private String AV46TFInc_Prog_Sel ;
   private String AV68Controlincidencias_wcds_12_tfinc_hdr ;
   private String AV47TFInc_Hdr ;
   private String AV69Controlincidencias_wcds_13_tfinc_hdr_sel ;
   private String AV48TFInc_Hdr_Sel ;
   private String scmdbuf ;
   private String lV62Controlincidencias_wcds_6_tfinc_usuario ;
   private String lV64Controlincidencias_wcds_8_tfinc_terminal ;
   private String lV66Controlincidencias_wcds_10_tfinc_prog ;
   private String lV68Controlincidencias_wcds_12_tfinc_hdr ;
   private String A5301Inc_BarPar ;
   private String AV51Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV61Controlincidencias_wcds_5_tfinc_hora ;
   private java.util.Date AV39TFInc_Hora ;
   private java.util.Date A4929Inc_Dia ;
   private java.util.Date AV58Controlincidencias_wcds_2_tfinc_dia ;
   private java.util.Date AV35TFInc_Dia ;
   private java.util.Date AV52Inc_dia ;
   private java.util.Date AV53Inc_dia_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String A13712Inc_obsTxt ;
   private String AV57Controlincidencias_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV70Controlincidencias_wcds_14_tfinc_obstxt ;
   private String AV49TFInc_obsTxt ;
   private String AV71Controlincidencias_wcds_15_tfinc_obstxt_sel ;
   private String AV50TFInc_obsTxt_Sel ;
   private String lV57Controlincidencias_wcds_1_filterfulltext ;
   private String lV70Controlincidencias_wcds_14_tfinc_obstxt ;
   private String A4936Inc_Obs ;
   private String AV31NewLine ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P094B2_A396EmprCod ;
   private String[] P094B2_A4935Inc_Prog ;
   private String[] P094B2_A4934Inc_Termin ;
   private String[] P094B2_A4933Inc_Usuari ;
   private java.util.Date[] P094B2_A4932Inc_Hora ;
   private long[] P094B2_A4931Inc_Linea ;
   private java.util.Date[] P094B2_A4929Inc_Dia ;
   private String[] P094B2_A5301Inc_BarPar ;
   private byte[] P094B2_A5300Inc_BarReo ;
   private int[] P094B2_A5299Inc_Barcod ;
   private String[] P094B2_A4936Inc_Obs ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class controlincidencias_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Controlincidencias_wcds_1_filterfulltext ,
                                          java.util.Date AV58Controlincidencias_wcds_2_tfinc_dia ,
                                          long AV59Controlincidencias_wcds_3_tfinc_linea ,
                                          long AV60Controlincidencias_wcds_4_tfinc_linea_to ,
                                          java.util.Date AV61Controlincidencias_wcds_5_tfinc_hora ,
                                          String AV63Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                          String AV62Controlincidencias_wcds_6_tfinc_usuario ,
                                          String AV65Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                          String AV64Controlincidencias_wcds_8_tfinc_terminal ,
                                          String AV67Controlincidencias_wcds_11_tfinc_prog_sel ,
                                          String AV66Controlincidencias_wcds_10_tfinc_prog ,
                                          String AV69Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                          String AV68Controlincidencias_wcds_12_tfinc_hdr ,
                                          String AV71Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                          String AV70Controlincidencias_wcds_14_tfinc_obstxt ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String A5301Inc_BarPar ,
                                          String A4936Inc_Obs ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV51Emprcod ,
                                          java.util.Date AV52Inc_dia ,
                                          String A396EmprCod ,
                                          java.util.Date AV53Inc_dia_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[23];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, Inc_Prog, Inc_Termin, Inc_Usuari, Inc_Hora, Inc_Linea, Inc_Dia, Inc_BarPar, Inc_BarReo, Inc_Barcod, Inc_Obs FROM TXPCRTIN1" ;
      addWhere(sWhereString, "(EmprCod = ? and Inc_Dia >= ?)");
      addWhere(sWhereString, "(Inc_Dia <= ?)");
      if ( ! (GXutil.strcmp("", AV57Controlincidencias_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Inc_Linea,'9999999990'), 2) like '%' || ?) or ( UPPER(Inc_Usuari) like '%' || UPPER(?)) or ( UPPER(Inc_Termin) like '%' || UPPER(?)) or ( UPPER(Inc_Prog) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?)) or ( UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Controlincidencias_wcds_2_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV59Controlincidencias_wcds_3_tfinc_linea) )
      {
         addWhere(sWhereString, "(Inc_Linea >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlincidencias_wcds_4_tfinc_linea_to) )
      {
         addWhere(sWhereString, "(Inc_Linea <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV61Controlincidencias_wcds_5_tfinc_hora) )
      {
         addWhere(sWhereString, "(Inc_Hora >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlincidencias_wcds_7_tfinc_usuario_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlincidencias_wcds_6_tfinc_usuario)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Usuari) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlincidencias_wcds_7_tfinc_usuario_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Usuari = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlincidencias_wcds_9_tfinc_terminal_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlincidencias_wcds_8_tfinc_terminal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Termin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlincidencias_wcds_9_tfinc_terminal_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Termin = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlincidencias_wcds_11_tfinc_prog_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlincidencias_wcds_10_tfinc_prog)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Prog) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlincidencias_wcds_11_tfinc_prog_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Prog = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Controlincidencias_wcds_13_tfinc_hdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlincidencias_wcds_12_tfinc_hdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlincidencias_wcds_13_tfinc_hdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) && ( ! (GXutil.strcmp("", AV70Controlincidencias_wcds_14_tfinc_obstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(Inc_Obs, 1, 400) = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Dia" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Dia DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Linea" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Linea DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Hora" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Hora DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Usuari" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Usuari DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Termin" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Termin DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Prog" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Prog DESC" ;
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
                  return conditional_P094B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[34]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[35], true);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 10);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 400);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 400);
               }
               return;
      }
   }

}

