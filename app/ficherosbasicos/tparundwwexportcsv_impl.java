package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tparundwwexportcsv_impl extends GXWebProcedure
{
   public tparundwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TPARUNDWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TPARUNDWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FicherosBasicos.TPARUNDWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad", "") : "") ;
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
      AV58Ficherosbasicos_tparundwwds_1_filterfulltext = AV52FilterFullText ;
      AV59Ficherosbasicos_tparundwwds_2_tfparundid = AV48TFParUndID ;
      AV60Ficherosbasicos_tparundwwds_3_tfparundid_to = AV49TFParUndID_To ;
      AV61Ficherosbasicos_tparundwwds_4_tfparunddsc = AV50TFParUndDsc ;
      AV62Ficherosbasicos_tparundwwds_5_tfparunddsc_sel = AV51TFParUndDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Ficherosbasicos_tparundwwds_1_filterfulltext ,
                                           Short.valueOf(AV59Ficherosbasicos_tparundwwds_2_tfparundid) ,
                                           Short.valueOf(AV60Ficherosbasicos_tparundwwds_3_tfparundid_to) ,
                                           AV62Ficherosbasicos_tparundwwds_5_tfparunddsc_sel ,
                                           AV61Ficherosbasicos_tparundwwds_4_tfparunddsc ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV58Ficherosbasicos_tparundwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ficherosbasicos_tparundwwds_1_filterfulltext), "%", "") ;
      lV58Ficherosbasicos_tparundwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ficherosbasicos_tparundwwds_1_filterfulltext), "%", "") ;
      lV61Ficherosbasicos_tparundwwds_4_tfparunddsc = GXutil.padr( GXutil.rtrim( AV61Ficherosbasicos_tparundwwds_4_tfparunddsc), 15, "%") ;
      /* Using cursor P080U2 */
      pr_default.execute(0, new Object[] {lV58Ficherosbasicos_tparundwwds_1_filterfulltext, lV58Ficherosbasicos_tparundwwds_1_filterfulltext, Short.valueOf(AV59Ficherosbasicos_tparundwwds_2_tfparundid), Short.valueOf(AV60Ficherosbasicos_tparundwwds_3_tfparundid_to), lV61Ficherosbasicos_tparundwwds_4_tfparunddsc, AV62Ficherosbasicos_tparundwwds_5_tfparunddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13204ParUndDsc = P080U2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080U2_n13204ParUndDsc[0] ;
         A13203ParUndID = P080U2_A13203ParUndID[0] ;
         A396EmprCod = P080U2_A396EmprCod[0] ;
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
            AV14TextFileLine += GXutil.str( A13203ParUndID, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13204ParUndDsc, ";", ","), GXv_char3) ;
            tparundwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TPARUNDWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParUndID", "", "Unidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParUndDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FicherosBasicos.TPARUNDWWColumnsSelector", GXv_char3) ;
      tparundwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TPARUNDWWGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TPARUNDWWGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("FicherosBasicos.TPARUNDWWGridState"), null, null);
      }
      AV28OrderedBy = AV46GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV46GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDID") == 0 )
         {
            AV48TFParUndID = (short)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFParUndID_To = (short)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC") == 0 )
         {
            AV50TFParUndDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC_SEL") == 0 )
         {
            AV51TFParUndDsc_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
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
      A13204ParUndDsc = "" ;
      AV58Ficherosbasicos_tparundwwds_1_filterfulltext = "" ;
      AV52FilterFullText = "" ;
      AV61Ficherosbasicos_tparundwwds_4_tfparunddsc = "" ;
      AV50TFParUndDsc = "" ;
      AV62Ficherosbasicos_tparundwwds_5_tfparunddsc_sel = "" ;
      AV51TFParUndDsc_Sel = "" ;
      scmdbuf = "" ;
      lV58Ficherosbasicos_tparundwwds_1_filterfulltext = "" ;
      lV61Ficherosbasicos_tparundwwds_4_tfparunddsc = "" ;
      P080U2_A13204ParUndDsc = new String[] {""} ;
      P080U2_n13204ParUndDsc = new boolean[] {false} ;
      P080U2_A13203ParUndID = new short[1] ;
      P080U2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparundwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P080U2_A13204ParUndDsc, P080U2_n13204ParUndDsc, P080U2_A13203ParUndID, P080U2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A13203ParUndID ;
   private short AV59Ficherosbasicos_tparundwwds_2_tfparundid ;
   private short AV48TFParUndID ;
   private short AV60Ficherosbasicos_tparundwwds_3_tfparundid_to ;
   private short AV49TFParUndID_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV63GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13204ParUndDsc ;
   private String AV61Ficherosbasicos_tparundwwds_4_tfparunddsc ;
   private String AV50TFParUndDsc ;
   private String AV62Ficherosbasicos_tparundwwds_5_tfparunddsc_sel ;
   private String AV51TFParUndDsc_Sel ;
   private String scmdbuf ;
   private String lV61Ficherosbasicos_tparundwwds_4_tfparunddsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n13204ParUndDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV58Ficherosbasicos_tparundwwds_1_filterfulltext ;
   private String AV52FilterFullText ;
   private String lV58Ficherosbasicos_tparundwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P080U2_A13204ParUndDsc ;
   private boolean[] P080U2_n13204ParUndDsc ;
   private short[] P080U2_A13203ParUndID ;
   private String[] P080U2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV46GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV47GridStateFilterValue ;
}

final  class tparundwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080U2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Ficherosbasicos_tparundwwds_1_filterfulltext ,
                                          short AV59Ficherosbasicos_tparundwwds_2_tfparundid ,
                                          short AV60Ficherosbasicos_tparundwwds_3_tfparundid_to ,
                                          String AV62Ficherosbasicos_tparundwwds_5_tfparunddsc_sel ,
                                          String AV61Ficherosbasicos_tparundwwds_4_tfparunddsc ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[6];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ParUndDsc, ParUndID, EmprCod FROM TXPPARUND" ;
      if ( ! (GXutil.strcmp("", AV58Ficherosbasicos_tparundwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(ParUndID,'9990'), 2) like '%' || ?) or ( UPPER(ParUndDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV59Ficherosbasicos_tparundwwds_2_tfparundid) )
      {
         addWhere(sWhereString, "(ParUndID >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV60Ficherosbasicos_tparundwwds_3_tfparundid_to) )
      {
         addWhere(sWhereString, "(ParUndID <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Ficherosbasicos_tparundwwds_5_tfparunddsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Ficherosbasicos_tparundwwds_4_tfparunddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ParUndDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Ficherosbasicos_tparundwwds_5_tfparunddsc_sel)==0) )
      {
         addWhere(sWhereString, "(ParUndDsc = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ParUndDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ParUndDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ParUndID" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ParUndID DESC" ;
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
                  return conditional_P080U2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Boolean) dynConstraints[8]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080U2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 15);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 15);
               }
               return;
      }
   }

}

