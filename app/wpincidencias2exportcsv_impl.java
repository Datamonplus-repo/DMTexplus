package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpincidencias2exportcsv_impl extends GXWebProcedure
{
   public wpincidencias2exportcsv_impl( com.genexus.internet.HttpContext context )
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
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
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
      AV11Filename = "./PrivateTempStorage/" + "WPIncidencias2ExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      /* 'LOADDYNAMICFILTERS' Routine */
      returnInSub = false ;
      if ( AV46GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV44GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV46GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV30DynamicFiltersSelector1 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV30DynamicFiltersSelector1, "INC_NUM_ULT") == 0 )
         {
            AV31DynamicFiltersOperator1 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV32Inc_Num_ult1 = GXutil.lval( AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
         }
         else if ( GXutil.strcmp(AV30DynamicFiltersSelector1, "EMPRNOM") == 0 )
         {
            AV31DynamicFiltersOperator1 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV33EmprNom1 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
         }
         if ( AV46GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV34DynamicFiltersEnabled2 = true ;
            AV44GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV46GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV35DynamicFiltersSelector2 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV35DynamicFiltersSelector2, "INC_NUM_ULT") == 0 )
            {
               AV36DynamicFiltersOperator2 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV37Inc_Num_ult2 = GXutil.lval( AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
            }
            else if ( GXutil.strcmp(AV35DynamicFiltersSelector2, "EMPRNOM") == 0 )
            {
               AV36DynamicFiltersOperator2 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV38EmprNom2 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            }
            if ( AV46GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV39DynamicFiltersEnabled3 = true ;
               AV44GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV46GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV40DynamicFiltersSelector3 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV40DynamicFiltersSelector3, "INC_NUM_ULT") == 0 )
               {
                  AV41DynamicFiltersOperator3 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV42Inc_Num_ult3 = GXutil.lval( AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
               }
               else if ( GXutil.strcmp(AV40DynamicFiltersSelector3, "EMPRNOM") == 0 )
               {
                  AV41DynamicFiltersOperator3 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV43EmprNom3 = AV44GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               }
            }
         }
      }
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("WPIncidencias2ColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WPIncidencias2ColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Programa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Terminal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Texto Obs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Observación", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65FilterFullText ,
                                           AV30DynamicFiltersSelector1 ,
                                           Short.valueOf(AV31DynamicFiltersOperator1) ,
                                           Long.valueOf(AV32Inc_Num_ult1) ,
                                           AV33EmprNom1 ,
                                           Boolean.valueOf(AV34DynamicFiltersEnabled2) ,
                                           AV35DynamicFiltersSelector2 ,
                                           Short.valueOf(AV36DynamicFiltersOperator2) ,
                                           Long.valueOf(AV37Inc_Num_ult2) ,
                                           AV38EmprNom2 ,
                                           Boolean.valueOf(AV39DynamicFiltersEnabled3) ,
                                           AV40DynamicFiltersSelector3 ,
                                           Short.valueOf(AV41DynamicFiltersOperator3) ,
                                           Long.valueOf(AV42Inc_Num_ult3) ,
                                           AV43EmprNom3 ,
                                           AV48TFInc_Dia ,
                                           Long.valueOf(AV50TFInc_Linea) ,
                                           Long.valueOf(AV51TFInc_Linea_To) ,
                                           AV52TFInc_Hora ,
                                           AV55TFInc_Prog_Sel ,
                                           AV54TFInc_Prog ,
                                           AV57TFInc_Terminal_Sel ,
                                           AV56TFInc_Terminal ,
                                           AV59TFInc_Usuario_Sel ,
                                           AV58TFInc_Usuario ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4935Inc_Prog ,
                                           A4934Inc_Termin ,
                                           A4933Inc_Usuari ,
                                           A4936Inc_Obs ,
                                           Long.valueOf(A4930Inc_Num_ul) ,
                                           A407EmprNom ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV33EmprNom1 = GXutil.padr( GXutil.rtrim( AV33EmprNom1), 30, "%") ;
      lV33EmprNom1 = GXutil.padr( GXutil.rtrim( AV33EmprNom1), 30, "%") ;
      lV38EmprNom2 = GXutil.padr( GXutil.rtrim( AV38EmprNom2), 30, "%") ;
      lV38EmprNom2 = GXutil.padr( GXutil.rtrim( AV38EmprNom2), 30, "%") ;
      lV43EmprNom3 = GXutil.padr( GXutil.rtrim( AV43EmprNom3), 30, "%") ;
      lV43EmprNom3 = GXutil.padr( GXutil.rtrim( AV43EmprNom3), 30, "%") ;
      /* Using cursor P089G2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV32Inc_Num_ult1), Long.valueOf(AV32Inc_Num_ult1), Long.valueOf(AV32Inc_Num_ult1), lV33EmprNom1, lV33EmprNom1, Long.valueOf(AV37Inc_Num_ult2), Long.valueOf(AV37Inc_Num_ult2), Long.valueOf(AV37Inc_Num_ult2), lV38EmprNom2, lV38EmprNom2, Long.valueOf(AV42Inc_Num_ult3), Long.valueOf(AV42Inc_Num_ult3), Long.valueOf(AV42Inc_Num_ult3), lV43EmprNom3, lV43EmprNom3, AV48TFInc_Dia});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P089G2_A396EmprCod[0] ;
         A4929Inc_Dia = P089G2_A4929Inc_Dia[0] ;
         A407EmprNom = P089G2_A407EmprNom[0] ;
         n407EmprNom = P089G2_n407EmprNom[0] ;
         A4930Inc_Num_ul = P089G2_A4930Inc_Num_ul[0] ;
         n4930Inc_Num_ul = P089G2_n4930Inc_Num_ul[0] ;
         A407EmprNom = P089G2_A407EmprNom[0] ;
         n407EmprNom = P089G2_n407EmprNom[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4935Inc_Prog, ";", ","), GXv_char3) ;
            wpincidencias2exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4934Inc_Termin, ";", ","), GXv_char3) ;
            wpincidencias2exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4933Inc_Usuari, ";", ","), GXv_char3) ;
            wpincidencias2exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV69Nlin = DecimalUtil.doubleToDec(GXutil.gxmlines( A4936Inc_Obs, (short)(60))) ;
            AV70I = (byte)(1) ;
            AV60Inc_obsTxt = " " ;
            while ( AV70I <= AV69Nlin.doubleValue() )
            {
               AV60Inc_obsTxt += GXutil.gxgetmli( A4936Inc_Obs, AV70I, (short)(60)) + GXutil.newLine( ) ;
               AV70I = (byte)(AV70I+1) ;
            }
            AV14TextFileLine += ";" ;
            AV61NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( AV60Inc_obsTxt, ";", ","), AV61NewLine, " "), GXv_char3) ;
            wpincidencias2exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV62Inc_Hdr, ";", ","), GXv_char3) ;
            wpincidencias2exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV61NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A4936Inc_Obs, ";", ","), AV61NewLine, " "), GXv_char3) ;
            wpincidencias2exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
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

   public void S191( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WPIncidencias2ExportCSV.csv");
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

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Dia", "", "Dia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Linea", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Hora", "", "Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Prog", "", "Programa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Terminal", "", "Terminal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Usuario", "", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Inc_obsTxt", "", "Texto Obs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Inc_Hdr", "", "Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Inc_Obs", "", "Observación", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WPIncidencias2ColumnsSelector", GXv_char3) ;
      wpincidencias2exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WPIncidencias2GridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WPIncidencias2GridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("WPIncidencias2GridState"), null, null);
      }
      AV28OrderedBy = AV46GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV46GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV65FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV48TFInc_Dia = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV50TFInc_Linea = GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV51TFInc_Linea_To = GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV52TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV54TFInc_Prog = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV55TFInc_Prog_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV56TFInc_Terminal = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV57TFInc_Terminal_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV58TFInc_Usuario = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV59TFInc_Usuario_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
      /* Execute user subroutine: 'LOADDYNAMICFILTERS' */
      S131 ();
      if (returnInSub) return;
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
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
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV30DynamicFiltersSelector1 = "" ;
      AV33EmprNom1 = "" ;
      AV35DynamicFiltersSelector2 = "" ;
      AV38EmprNom2 = "" ;
      AV40DynamicFiltersSelector3 = "" ;
      AV43EmprNom3 = "" ;
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A4935Inc_Prog = "" ;
      A4934Inc_Termin = "" ;
      A4933Inc_Usuari = "" ;
      A4936Inc_Obs = "" ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV33EmprNom1 = "" ;
      lV38EmprNom2 = "" ;
      lV43EmprNom3 = "" ;
      AV65FilterFullText = "" ;
      AV48TFInc_Dia = GXutil.nullDate() ;
      AV52TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV55TFInc_Prog_Sel = "" ;
      AV54TFInc_Prog = "" ;
      AV57TFInc_Terminal_Sel = "" ;
      AV56TFInc_Terminal = "" ;
      AV59TFInc_Usuario_Sel = "" ;
      AV58TFInc_Usuario = "" ;
      A407EmprNom = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      P089G2_A396EmprCod = new String[] {""} ;
      P089G2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089G2_A407EmprNom = new String[] {""} ;
      P089G2_n407EmprNom = new boolean[] {false} ;
      P089G2_A4930Inc_Num_ul = new long[1] ;
      P089G2_n4930Inc_Num_ul = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV69Nlin = DecimalUtil.ZERO ;
      AV60Inc_obsTxt = "" ;
      AV61NewLine = "" ;
      AV62Inc_Hdr = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpincidencias2exportcsv__default(),
         new Object[] {
             new Object[] {
            P089G2_A396EmprCod, P089G2_A4929Inc_Dia, P089G2_A407EmprNom, P089G2_n407EmprNom, P089G2_A4930Inc_Num_ul, P089G2_n4930Inc_Num_ul
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV70I ;
   private short gxcookieaux ;
   private short AV31DynamicFiltersOperator1 ;
   private short AV36DynamicFiltersOperator2 ;
   private short AV41DynamicFiltersOperator3 ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV71GXV1 ;
   private long AV32Inc_Num_ult1 ;
   private long AV37Inc_Num_ult2 ;
   private long AV42Inc_Num_ult3 ;
   private long A4931Inc_Linea ;
   private long AV50TFInc_Linea ;
   private long AV51TFInc_Linea_To ;
   private long A4930Inc_Num_ul ;
   private java.math.BigDecimal AV69Nlin ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV33EmprNom1 ;
   private String AV38EmprNom2 ;
   private String AV43EmprNom3 ;
   private String A4935Inc_Prog ;
   private String A4934Inc_Termin ;
   private String A4933Inc_Usuari ;
   private String scmdbuf ;
   private String lV33EmprNom1 ;
   private String lV38EmprNom2 ;
   private String lV43EmprNom3 ;
   private String AV55TFInc_Prog_Sel ;
   private String AV54TFInc_Prog ;
   private String AV57TFInc_Terminal_Sel ;
   private String AV56TFInc_Terminal ;
   private String AV59TFInc_Usuario_Sel ;
   private String AV58TFInc_Usuario ;
   private String A407EmprNom ;
   private String A396EmprCod ;
   private String AV62Inc_Hdr ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV52TFInc_Hora ;
   private java.util.Date AV48TFInc_Dia ;
   private java.util.Date A4929Inc_Dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV34DynamicFiltersEnabled2 ;
   private boolean AV39DynamicFiltersEnabled3 ;
   private boolean AV29OrderedDsc ;
   private boolean n407EmprNom ;
   private boolean n4930Inc_Num_ul ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV30DynamicFiltersSelector1 ;
   private String AV35DynamicFiltersSelector2 ;
   private String AV40DynamicFiltersSelector3 ;
   private String A4936Inc_Obs ;
   private String AV65FilterFullText ;
   private String AV60Inc_obsTxt ;
   private String AV61NewLine ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P089G2_A396EmprCod ;
   private java.util.Date[] P089G2_A4929Inc_Dia ;
   private String[] P089G2_A407EmprNom ;
   private boolean[] P089G2_n407EmprNom ;
   private long[] P089G2_A4930Inc_Num_ul ;
   private boolean[] P089G2_n4930Inc_Num_ul ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV46GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV47GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV44GridStateDynamicFilter ;
}

final  class wpincidencias2exportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P089G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65FilterFullText ,
                                          String AV30DynamicFiltersSelector1 ,
                                          short AV31DynamicFiltersOperator1 ,
                                          long AV32Inc_Num_ult1 ,
                                          String AV33EmprNom1 ,
                                          boolean AV34DynamicFiltersEnabled2 ,
                                          String AV35DynamicFiltersSelector2 ,
                                          short AV36DynamicFiltersOperator2 ,
                                          long AV37Inc_Num_ult2 ,
                                          String AV38EmprNom2 ,
                                          boolean AV39DynamicFiltersEnabled3 ,
                                          String AV40DynamicFiltersSelector3 ,
                                          short AV41DynamicFiltersOperator3 ,
                                          long AV42Inc_Num_ult3 ,
                                          String AV43EmprNom3 ,
                                          java.util.Date AV48TFInc_Dia ,
                                          long AV50TFInc_Linea ,
                                          long AV51TFInc_Linea_To ,
                                          java.util.Date AV52TFInc_Hora ,
                                          String AV55TFInc_Prog_Sel ,
                                          String AV54TFInc_Prog ,
                                          String AV57TFInc_Terminal_Sel ,
                                          String AV56TFInc_Terminal ,
                                          String AV59TFInc_Usuario_Sel ,
                                          String AV58TFInc_Usuario ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          String A4936Inc_Obs ,
                                          long A4930Inc_Num_ul ,
                                          String A407EmprNom ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[16];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Inc_Dia, T2.EmprNom, T1.Inc_Num_ul FROM (TXPCRTINC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ( GXutil.strcmp(AV30DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV31DynamicFiltersOperator1 == 0 ) && ( ! (0==AV32Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV30DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV31DynamicFiltersOperator1 == 1 ) && ( ! (0==AV32Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV30DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV31DynamicFiltersOperator1 == 2 ) && ( ! (0==AV32Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV30DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV31DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV33EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV30DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV31DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV33EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( AV34DynamicFiltersEnabled2 && ( GXutil.strcmp(AV35DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV36DynamicFiltersOperator2 == 0 ) && ( ! (0==AV37Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( AV34DynamicFiltersEnabled2 && ( GXutil.strcmp(AV35DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV36DynamicFiltersOperator2 == 1 ) && ( ! (0==AV37Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( AV34DynamicFiltersEnabled2 && ( GXutil.strcmp(AV35DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV36DynamicFiltersOperator2 == 2 ) && ( ! (0==AV37Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( AV34DynamicFiltersEnabled2 && ( GXutil.strcmp(AV35DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV36DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV38EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( AV34DynamicFiltersEnabled2 && ( GXutil.strcmp(AV35DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV36DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV38EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( AV39DynamicFiltersEnabled3 && ( GXutil.strcmp(AV40DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator3 == 0 ) && ( ! (0==AV42Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( AV39DynamicFiltersEnabled3 && ( GXutil.strcmp(AV40DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator3 == 1 ) && ( ! (0==AV42Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( AV39DynamicFiltersEnabled3 && ( GXutil.strcmp(AV40DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator3 == 2 ) && ( ! (0==AV42Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( AV39DynamicFiltersEnabled3 && ( GXutil.strcmp(AV40DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV41DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV43EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( AV39DynamicFiltersEnabled3 && ( GXutil.strcmp(AV40DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV41DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV43EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48TFInc_Dia)) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.Inc_Num_ul" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Inc_Dia" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Inc_Dia DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
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
                  return conditional_P089G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).longValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).longValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).longValue() , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P089G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[16]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[17]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[27]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
      }
   }

}

