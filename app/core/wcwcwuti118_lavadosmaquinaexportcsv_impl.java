package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwcwuti118_lavadosmaquinaexportcsv_impl extends GXWebProcedure
{
   public wcwcwuti118_lavadosmaquinaexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "WCWCWUti118_LavadosMaquinaExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWCWUti118_LavadosMaquinaColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCWCWUti118_LavadosMaquinaColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext = AV30FilterFullText ;
      AV47Wcwcwuti118_lavadosmaquinads_2_tfccstkcans = AV34TFCCStkCanS ;
      AV48Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to = AV35TFCCStkCanS_To ;
      AV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc = AV36TFCCStkDsc ;
      AV50Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel = AV37TFCCStkDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext ,
                                           AV47Wcwcwuti118_lavadosmaquinads_2_tfccstkcans ,
                                           AV48Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to ,
                                           AV50Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel ,
                                           AV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc ,
                                           A3344CCStkCanS ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           A3348CCStkFec ,
                                           AV41Fec1 ,
                                           AV42Fec2 ,
                                           A5722CCStkLot ,
                                           AV40HreLote ,
                                           A3345TipMovCc ,
                                           AV38EmprCod ,
                                           AV39Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext), "%", "") ;
      lV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext), "%", "") ;
      lV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc), 30, "%") ;
      /* Using cursor P08XC2 */
      pr_default.execute(0, new Object[] {AV38EmprCod, AV39Prdnum, AV41Fec1, AV42Fec2, AV40HreLote, lV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext, lV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext, AV47Wcwcwuti118_lavadosmaquinads_2_tfccstkcans, AV48Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to, lV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc, AV50Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3345TipMovCc = P08XC2_A3345TipMovCc[0] ;
         A3348CCStkFec = P08XC2_A3348CCStkFec[0] ;
         A5722CCStkLot = P08XC2_A5722CCStkLot[0] ;
         A719PrdNum = P08XC2_A719PrdNum[0] ;
         A396EmprCod = P08XC2_A396EmprCod[0] ;
         A3357CCStkDsc = P08XC2_A3357CCStkDsc[0] ;
         A3344CCStkCanS = P08XC2_A3344CCStkCanS[0] ;
         A3342CCStkLin = P08XC2_A3342CCStkLin[0] ;
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
            AV14TextFileLine += GXutil.str( A3344CCStkCanS, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3357CCStkDsc, ";", ","), GXv_char3) ;
            wcwcwuti118_lavadosmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCWCWUti118_LavadosMaquinaExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkCanS", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCStkDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWCWUti118_LavadosMaquinaColumnsSelector", GXv_char3) ;
      wcwcwuti118_lavadosmaquinaexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWCWUti118_LavadosMaquinaGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWCWUti118_LavadosMaquinaGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("WCWCWUti118_LavadosMaquinaGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANS") == 0 )
         {
            AV34TFCCStkCanS = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFCCStkCanS_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV36TFCCStkDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV37TFCCStkDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
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
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3357CCStkDsc = "" ;
      AV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV47Wcwcwuti118_lavadosmaquinads_2_tfccstkcans = DecimalUtil.ZERO ;
      AV34TFCCStkCanS = DecimalUtil.ZERO ;
      AV48Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to = DecimalUtil.ZERO ;
      AV35TFCCStkCanS_To = DecimalUtil.ZERO ;
      AV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc = "" ;
      AV36TFCCStkDsc = "" ;
      AV50Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel = "" ;
      AV37TFCCStkDsc_Sel = "" ;
      scmdbuf = "" ;
      lV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext = "" ;
      lV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      AV41Fec1 = GXutil.nullDate() ;
      AV42Fec2 = GXutil.nullDate() ;
      A5722CCStkLot = "" ;
      AV40HreLote = "" ;
      A3345TipMovCc = "" ;
      AV38EmprCod = "" ;
      AV39Prdnum = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P08XC2_A3345TipMovCc = new String[] {""} ;
      P08XC2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08XC2_A5722CCStkLot = new String[] {""} ;
      P08XC2_A719PrdNum = new String[] {""} ;
      P08XC2_A396EmprCod = new String[] {""} ;
      P08XC2_A3357CCStkDsc = new String[] {""} ;
      P08XC2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XC2_A3342CCStkLin = new long[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.wcwcwuti118_lavadosmaquinaexportcsv__default(),
         new Object[] {
             new Object[] {
            P08XC2_A3345TipMovCc, P08XC2_A3348CCStkFec, P08XC2_A5722CCStkLot, P08XC2_A719PrdNum, P08XC2_A396EmprCod, P08XC2_A3357CCStkDsc, P08XC2_A3344CCStkCanS, P08XC2_A3342CCStkLin
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
   private int AV51GXV1 ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV47Wcwcwuti118_lavadosmaquinads_2_tfccstkcans ;
   private java.math.BigDecimal AV34TFCCStkCanS ;
   private java.math.BigDecimal AV48Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to ;
   private java.math.BigDecimal AV35TFCCStkCanS_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A3357CCStkDsc ;
   private String AV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc ;
   private String AV36TFCCStkDsc ;
   private String AV50Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel ;
   private String AV37TFCCStkDsc_Sel ;
   private String scmdbuf ;
   private String lV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc ;
   private String A5722CCStkLot ;
   private String AV40HreLote ;
   private String A3345TipMovCc ;
   private String AV38EmprCod ;
   private String AV39Prdnum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV41Fec1 ;
   private java.util.Date AV42Fec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08XC2_A3345TipMovCc ;
   private java.util.Date[] P08XC2_A3348CCStkFec ;
   private String[] P08XC2_A5722CCStkLot ;
   private String[] P08XC2_A719PrdNum ;
   private String[] P08XC2_A396EmprCod ;
   private String[] P08XC2_A3357CCStkDsc ;
   private java.math.BigDecimal[] P08XC2_A3344CCStkCanS ;
   private long[] P08XC2_A3342CCStkLin ;
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

final  class wcwcwuti118_lavadosmaquinaexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08XC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext ,
                                          java.math.BigDecimal AV47Wcwcwuti118_lavadosmaquinads_2_tfccstkcans ,
                                          java.math.BigDecimal AV48Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to ,
                                          String AV50Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel ,
                                          String AV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3357CCStkDsc ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          java.util.Date A3348CCStkFec ,
                                          java.util.Date AV41Fec1 ,
                                          java.util.Date AV42Fec2 ,
                                          String A5722CCStkLot ,
                                          String AV40HreLote ,
                                          String A3345TipMovCc ,
                                          String AV38EmprCod ,
                                          String AV39Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[11];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT TipMovCc, CCStkFec, CCStkLot, PrdNum, EmprCod, CCStkDsc, CCStkCanS, CCStkLin FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(CCStkFec >= ?)");
      addWhere(sWhereString, "(CCStkFec <= ?)");
      addWhere(sWhereString, "(CCStkDsc like '%Lavado en Maquina%')");
      addWhere(sWhereString, "(CCStkLot = ?)");
      addWhere(sWhereString, "(TipMovCc = 'SM')");
      if ( ! (GXutil.strcmp("", AV46Wcwcwuti118_lavadosmaquinads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(CCStkDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47Wcwcwuti118_lavadosmaquinads_2_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(CCStkCanS >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(CCStkCanS <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY TipMovCc" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkCanS" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkCanS DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CCStkDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CCStkDsc DESC" ;
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
                  return conditional_P08XC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Boolean) dynConstraints[8]).booleanValue() , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((long[]) buf[7])[0] = rslt.getLong(8);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               return;
      }
   }

}

