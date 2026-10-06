package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesosquimicos_trnwwexportcsv_impl extends GXWebProcedure
{
   public procesosquimicos_trnwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ProcesosQuimicos_TRNWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ProcesosQuimicos_TRNWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ProcesosQuimicos_TRNWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proc. Quim.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proc. Quim.(large)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tiempo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Temp.", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = AV30FilterFullText ;
      AV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = AV34TFProForCod ;
      AV49Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel = AV35TFProForCod_Sel ;
      AV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = AV36TFProForDsc ;
      AV51Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel = AV37TFProForDsc_Sel ;
      AV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = AV38TFProForDsc2 ;
      AV53Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel = AV39TFProForDsc2_Sel ;
      AV54Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie = AV40TFProForTie ;
      AV55Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to = AV41TFProForTie_To ;
      AV56Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx = AV42TFProForTmx ;
      AV57Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to = AV43TFProForTmx_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ,
                                           AV49Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel ,
                                           AV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ,
                                           AV51Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel ,
                                           AV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ,
                                           AV53Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel ,
                                           AV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ,
                                           Short.valueOf(AV54Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie) ,
                                           Short.valueOf(AV55Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to) ,
                                           Short.valueOf(AV56Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx) ,
                                           Short.valueOf(AV57Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A4715ProForDsc2 ,
                                           Short.valueOf(A771ProForTie) ,
                                           Short.valueOf(A772ProForTmx) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod), 6, "%") ;
      lV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc), 30, "%") ;
      lV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = GXutil.padr( GXutil.rtrim( AV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2), 40, "%") ;
      /* Using cursor P09FN2 */
      pr_default.execute(0, new Object[] {lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod, AV49Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel, lV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc, AV51Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel, lV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2, AV53Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel, Short.valueOf(AV54Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie), Short.valueOf(AV55Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to), Short.valueOf(AV56Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx), Short.valueOf(AV57Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A772ProForTmx = P09FN2_A772ProForTmx[0] ;
         A771ProForTie = P09FN2_A771ProForTie[0] ;
         A4715ProForDsc2 = P09FN2_A4715ProForDsc2[0] ;
         A766ProForDsc = P09FN2_A766ProForDsc[0] ;
         A764ProForCod = P09FN2_A764ProForCod[0] ;
         A396EmprCod = P09FN2_A396EmprCod[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A764ProForCod, ";", ","), GXv_char3) ;
            procesosquimicos_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A766ProForDsc, ";", ","), GXv_char3) ;
            procesosquimicos_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4715ProForDsc2, ";", ","), GXv_char3) ;
            procesosquimicos_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A771ProForTie, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A772ProForTmx, 4, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ProcesosQuimicos_TRNWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForCod", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForDsc", "", "Proc. Quim.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForDsc2", "", "Proc. Quim.(large)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForTie", "", "Tiempo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForTmx", "", "Temp.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ProcesosQuimicos_TRNWWColumnsSelector", GXv_char3) ;
      procesosquimicos_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ProcesosQuimicos_TRNWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProcesosQuimicos_TRNWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("FormulacionTinte.ProcesosQuimicos_TRNWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV34TFProForCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV35TFProForCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV36TFProForDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV37TFProForDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC2") == 0 )
         {
            AV38TFProForDsc2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC2_SEL") == 0 )
         {
            AV39TFProForDsc2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTIE") == 0 )
         {
            AV40TFProForTie = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFProForTie_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTMX") == 0 )
         {
            AV42TFProForTmx = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFProForTmx_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
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
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = "" ;
      AV34TFProForCod = "" ;
      AV49Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel = "" ;
      AV35TFProForCod_Sel = "" ;
      AV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = "" ;
      AV36TFProForDsc = "" ;
      AV51Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel = "" ;
      AV37TFProForDsc_Sel = "" ;
      AV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = "" ;
      AV38TFProForDsc2 = "" ;
      AV53Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel = "" ;
      AV39TFProForDsc2_Sel = "" ;
      scmdbuf = "" ;
      lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = "" ;
      lV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = "" ;
      lV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = "" ;
      lV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = "" ;
      P09FN2_A772ProForTmx = new short[1] ;
      P09FN2_A771ProForTie = new short[1] ;
      P09FN2_A4715ProForDsc2 = new String[] {""} ;
      P09FN2_A766ProForDsc = new String[] {""} ;
      P09FN2_A764ProForCod = new String[] {""} ;
      P09FN2_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_trnwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09FN2_A772ProForTmx, P09FN2_A771ProForTie, P09FN2_A4715ProForDsc2, P09FN2_A766ProForDsc, P09FN2_A764ProForCod, P09FN2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short AV54Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie ;
   private short AV40TFProForTie ;
   private short AV55Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to ;
   private short AV41TFProForTie_To ;
   private short AV56Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx ;
   private short AV42TFProForTmx ;
   private short AV57Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to ;
   private short AV43TFProForTmx_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV58GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A4715ProForDsc2 ;
   private String AV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ;
   private String AV34TFProForCod ;
   private String AV49Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel ;
   private String AV35TFProForCod_Sel ;
   private String AV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ;
   private String AV36TFProForDsc ;
   private String AV51Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel ;
   private String AV37TFProForDsc_Sel ;
   private String AV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ;
   private String AV38TFProForDsc2 ;
   private String AV53Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel ;
   private String AV39TFProForDsc2_Sel ;
   private String scmdbuf ;
   private String lV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ;
   private String lV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ;
   private String lV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P09FN2_A772ProForTmx ;
   private short[] P09FN2_A771ProForTie ;
   private String[] P09FN2_A4715ProForDsc2 ;
   private String[] P09FN2_A766ProForDsc ;
   private String[] P09FN2_A764ProForCod ;
   private String[] P09FN2_A396EmprCod ;
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

final  class procesosquimicos_trnwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09FN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ,
                                          String AV49Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel ,
                                          String AV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ,
                                          String AV51Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel ,
                                          String AV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ,
                                          String AV53Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel ,
                                          String AV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ,
                                          short AV54Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie ,
                                          short AV55Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to ,
                                          short AV56Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx ,
                                          short AV57Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A4715ProForDsc2 ,
                                          short A771ProForTie ,
                                          short A772ProForTmx ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ProForTmx, ProForTie, ProForDsc2, ProForDsc, ProForCod, EmprCod FROM TXPCPROFO" ;
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForDsc2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ProForTie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProForTmx,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(ProForCod = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc2 = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie) )
      {
         addWhere(sWhereString, "(ProForTie >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to) )
      {
         addWhere(sWhereString, "(ProForTie <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx) )
      {
         addWhere(sWhereString, "(ProForTmx >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to) )
      {
         addWhere(sWhereString, "(ProForTmx <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForDsc2" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForDsc2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForTie" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForTie DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForTmx" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForTmx DESC" ;
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
                  return conditional_P09FN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 40);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 40);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               return;
      }
   }

}

