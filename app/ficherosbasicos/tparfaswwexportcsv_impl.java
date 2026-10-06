package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tparfaswwexportcsv_impl extends GXWebProcedure
{
   public tparfaswwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TPARFASWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TPARFASWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FicherosBasicos.TPARFASWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Parametro Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV73Ficherosbasicos_tparfaswwds_1_filterfulltext = AV67FilterFullText ;
      AV74Ficherosbasicos_tparfaswwds_2_tfparfascod = AV51TFParFasCod ;
      AV75Ficherosbasicos_tparfaswwds_3_tfparfascod_to = AV52TFParFasCod_To ;
      AV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc = AV53TFParFasDsc ;
      AV77Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel = AV54TFParFasDsc_Sel ;
      AV78Ficherosbasicos_tparfaswwds_6_tfparundid = AV63TFParUndID ;
      AV79Ficherosbasicos_tparfaswwds_7_tfparundid_to = AV64TFParUndID_To ;
      AV80Ficherosbasicos_tparfaswwds_8_tfparunddsc = AV65TFParUndDsc ;
      AV81Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel = AV66TFParUndDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV73Ficherosbasicos_tparfaswwds_1_filterfulltext ,
                                           Short.valueOf(AV74Ficherosbasicos_tparfaswwds_2_tfparfascod) ,
                                           Short.valueOf(AV75Ficherosbasicos_tparfaswwds_3_tfparfascod_to) ,
                                           AV77Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ,
                                           AV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc ,
                                           Short.valueOf(AV78Ficherosbasicos_tparfaswwds_6_tfparundid) ,
                                           Short.valueOf(AV79Ficherosbasicos_tparfaswwds_7_tfparundid_to) ,
                                           AV81Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ,
                                           AV80Ficherosbasicos_tparfaswwds_8_tfparunddsc ,
                                           Short.valueOf(A1664ParFasCod) ,
                                           A1665ParFasDsc ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV73Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV73Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV73Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV73Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc = GXutil.padr( GXutil.rtrim( AV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc), 30, "%") ;
      lV80Ficherosbasicos_tparfaswwds_8_tfparunddsc = GXutil.padr( GXutil.rtrim( AV80Ficherosbasicos_tparfaswwds_8_tfparunddsc), 15, "%") ;
      /* Using cursor P080Q2 */
      pr_default.execute(0, new Object[] {lV73Ficherosbasicos_tparfaswwds_1_filterfulltext, lV73Ficherosbasicos_tparfaswwds_1_filterfulltext, lV73Ficherosbasicos_tparfaswwds_1_filterfulltext, lV73Ficherosbasicos_tparfaswwds_1_filterfulltext, Short.valueOf(AV74Ficherosbasicos_tparfaswwds_2_tfparfascod), Short.valueOf(AV75Ficherosbasicos_tparfaswwds_3_tfparfascod_to), lV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc, AV77Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel, Short.valueOf(AV78Ficherosbasicos_tparfaswwds_6_tfparundid), Short.valueOf(AV79Ficherosbasicos_tparfaswwds_7_tfparundid_to), lV80Ficherosbasicos_tparfaswwds_8_tfparunddsc, AV81Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P080Q2_A396EmprCod[0] ;
         A13204ParUndDsc = P080Q2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080Q2_n13204ParUndDsc[0] ;
         A13203ParUndID = P080Q2_A13203ParUndID[0] ;
         n13203ParUndID = P080Q2_n13203ParUndID[0] ;
         A1665ParFasDsc = P080Q2_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P080Q2_n1665ParFasDsc[0] ;
         A1664ParFasCod = P080Q2_A1664ParFasCod[0] ;
         A13204ParUndDsc = P080Q2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080Q2_n13204ParUndDsc[0] ;
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
            AV14TextFileLine += GXutil.str( A1664ParFasCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1665ParFasDsc, ";", ","), GXv_char3) ;
            tparfaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13203ParUndID, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13204ParUndDsc, ";", ","), GXv_char3) ;
            tparfaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TPARFASWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParFasCod", "", "Codigo Parametro Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParFasDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParUndID", "", "Unidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParUndDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FicherosBasicos.TPARFASWWColumnsSelector", GXv_char3) ;
      tparfaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TPARFASWWGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TPARFASWWGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV19Session.getValue("FicherosBasicos.TPARFASWWGridState"), null, null);
      }
      AV28OrderedBy = AV49GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV49GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV67FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASCOD") == 0 )
         {
            AV51TFParFasCod = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFParFasCod_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASDSC") == 0 )
         {
            AV53TFParFasDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASDSC_SEL") == 0 )
         {
            AV54TFParFasDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDID") == 0 )
         {
            AV63TFParUndID = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFParUndID_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC") == 0 )
         {
            AV65TFParUndDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC_SEL") == 0 )
         {
            AV66TFParUndDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
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
      A1665ParFasDsc = "" ;
      A13204ParUndDsc = "" ;
      AV73Ficherosbasicos_tparfaswwds_1_filterfulltext = "" ;
      AV67FilterFullText = "" ;
      AV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc = "" ;
      AV53TFParFasDsc = "" ;
      AV77Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel = "" ;
      AV54TFParFasDsc_Sel = "" ;
      AV80Ficherosbasicos_tparfaswwds_8_tfparunddsc = "" ;
      AV65TFParUndDsc = "" ;
      AV81Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel = "" ;
      AV66TFParUndDsc_Sel = "" ;
      scmdbuf = "" ;
      lV73Ficherosbasicos_tparfaswwds_1_filterfulltext = "" ;
      lV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc = "" ;
      lV80Ficherosbasicos_tparfaswwds_8_tfparunddsc = "" ;
      P080Q2_A396EmprCod = new String[] {""} ;
      P080Q2_A13204ParUndDsc = new String[] {""} ;
      P080Q2_n13204ParUndDsc = new boolean[] {false} ;
      P080Q2_A13203ParUndID = new short[1] ;
      P080Q2_n13203ParUndID = new boolean[] {false} ;
      P080Q2_A1665ParFasDsc = new String[] {""} ;
      P080Q2_n1665ParFasDsc = new boolean[] {false} ;
      P080Q2_A1664ParFasCod = new short[1] ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparfaswwexportcsv__default(),
         new Object[] {
             new Object[] {
            P080Q2_A396EmprCod, P080Q2_A13204ParUndDsc, P080Q2_n13204ParUndDsc, P080Q2_A13203ParUndID, P080Q2_n13203ParUndID, P080Q2_A1665ParFasDsc, P080Q2_n1665ParFasDsc, P080Q2_A1664ParFasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A1664ParFasCod ;
   private short A13203ParUndID ;
   private short AV74Ficherosbasicos_tparfaswwds_2_tfparfascod ;
   private short AV51TFParFasCod ;
   private short AV75Ficherosbasicos_tparfaswwds_3_tfparfascod_to ;
   private short AV52TFParFasCod_To ;
   private short AV78Ficherosbasicos_tparfaswwds_6_tfparundid ;
   private short AV63TFParUndID ;
   private short AV79Ficherosbasicos_tparfaswwds_7_tfparundid_to ;
   private short AV64TFParUndID_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV82GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A1665ParFasDsc ;
   private String A13204ParUndDsc ;
   private String AV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc ;
   private String AV53TFParFasDsc ;
   private String AV77Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ;
   private String AV54TFParFasDsc_Sel ;
   private String AV80Ficherosbasicos_tparfaswwds_8_tfparunddsc ;
   private String AV65TFParUndDsc ;
   private String AV81Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ;
   private String AV66TFParUndDsc_Sel ;
   private String scmdbuf ;
   private String lV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc ;
   private String lV80Ficherosbasicos_tparfaswwds_8_tfparunddsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n13204ParUndDsc ;
   private boolean n13203ParUndID ;
   private boolean n1665ParFasDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV73Ficherosbasicos_tparfaswwds_1_filterfulltext ;
   private String AV67FilterFullText ;
   private String lV73Ficherosbasicos_tparfaswwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P080Q2_A396EmprCod ;
   private String[] P080Q2_A13204ParUndDsc ;
   private boolean[] P080Q2_n13204ParUndDsc ;
   private short[] P080Q2_A13203ParUndID ;
   private boolean[] P080Q2_n13203ParUndID ;
   private String[] P080Q2_A1665ParFasDsc ;
   private boolean[] P080Q2_n1665ParFasDsc ;
   private short[] P080Q2_A1664ParFasCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class tparfaswwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Ficherosbasicos_tparfaswwds_1_filterfulltext ,
                                          short AV74Ficherosbasicos_tparfaswwds_2_tfparfascod ,
                                          short AV75Ficherosbasicos_tparfaswwds_3_tfparfascod_to ,
                                          String AV77Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ,
                                          String AV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc ,
                                          short AV78Ficherosbasicos_tparfaswwds_6_tfparundid ,
                                          short AV79Ficherosbasicos_tparfaswwds_7_tfparundid_to ,
                                          String AV81Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ,
                                          String AV80Ficherosbasicos_tparfaswwds_8_tfparunddsc ,
                                          short A1664ParFasCod ,
                                          String A1665ParFasDsc ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ParUndDsc, T1.ParUndID, T1.ParFasDsc, T1.ParFasCod FROM (TXPPARFAS T1 LEFT JOIN TXPPARUND T2 ON T2.EmprCod = T1.EmprCod AND T2.ParUndID = T1.ParUndID)" ;
      if ( ! (GXutil.strcmp("", AV73Ficherosbasicos_tparfaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ParFasCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ParFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ParUndID,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParUndDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV74Ficherosbasicos_tparfaswwds_2_tfparfascod) )
      {
         addWhere(sWhereString, "(T1.ParFasCod >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV75Ficherosbasicos_tparfaswwds_3_tfparfascod_to) )
      {
         addWhere(sWhereString, "(T1.ParFasCod <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Ficherosbasicos_tparfaswwds_4_tfparfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ParFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ParFasDsc = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Ficherosbasicos_tparfaswwds_6_tfparundid) )
      {
         addWhere(sWhereString, "(T1.ParUndID >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Ficherosbasicos_tparfaswwds_7_tfparundid_to) )
      {
         addWhere(sWhereString, "(T1.ParUndID <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Ficherosbasicos_tparfaswwds_8_tfparunddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParUndDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParUndDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParFasDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParFasDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParFasCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParFasCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParUndID" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParUndID DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ParUndDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ParUndDsc DESC" ;
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
                  return conditional_P080Q2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 15);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 15);
               }
               return;
      }
   }

}

