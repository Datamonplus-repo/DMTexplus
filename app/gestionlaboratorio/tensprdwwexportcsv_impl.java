package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tensprdwwexportcsv_impl extends GXWebProcedure
{
   public tensprdwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TENSPRDWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.TENSPRDWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.TENSPRDWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Grupo", "") : "") ;
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
      AV41Gestionlaboratorio_tensprdwwds_1_filterfulltext = AV30FilterFullText ;
      AV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru = AV36TFLb_CodGru ;
      AV43Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel = AV37TFLb_CodGru_Sel ;
      AV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru = AV34TFLb_DscGru ;
      AV45Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel = AV35TFLb_DscGru_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV41Gestionlaboratorio_tensprdwwds_1_filterfulltext ,
                                           AV43Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel ,
                                           AV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru ,
                                           AV45Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel ,
                                           AV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru ,
                                           A5612Lb_CodGru ,
                                           A5613Lb_DscGru ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV41Gestionlaboratorio_tensprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gestionlaboratorio_tensprdwwds_1_filterfulltext), "%", "") ;
      lV41Gestionlaboratorio_tensprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gestionlaboratorio_tensprdwwds_1_filterfulltext), "%", "") ;
      lV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru = GXutil.padr( GXutil.rtrim( AV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru), 2, "%") ;
      lV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru = GXutil.padr( GXutil.rtrim( AV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru), 40, "%") ;
      /* Using cursor P096C2 */
      pr_default.execute(0, new Object[] {lV41Gestionlaboratorio_tensprdwwds_1_filterfulltext, lV41Gestionlaboratorio_tensprdwwds_1_filterfulltext, lV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru, AV43Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel, lV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru, AV45Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5613Lb_DscGru = P096C2_A5613Lb_DscGru[0] ;
         n5613Lb_DscGru = P096C2_n5613Lb_DscGru[0] ;
         A5612Lb_CodGru = P096C2_A5612Lb_CodGru[0] ;
         A396EmprCod = P096C2_A396EmprCod[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5612Lb_CodGru, ";", ","), GXv_char3) ;
            tensprdwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5613Lb_DscGru, ";", ","), GXv_char3) ;
            tensprdwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TENSPRDWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_CodGru", "", "Grupo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Lb_DscGru", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.TENSPRDWWColumnsSelector", GXv_char3) ;
      tensprdwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.TENSPRDWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.TENSPRDWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("GestionLaboratorio.TENSPRDWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CODGRU") == 0 )
         {
            AV36TFLb_CodGru = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CODGRU_SEL") == 0 )
         {
            AV37TFLb_CodGru_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_DSCGRU") == 0 )
         {
            AV34TFLb_DscGru = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_DSCGRU_SEL") == 0 )
         {
            AV35TFLb_DscGru_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
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
      A5612Lb_CodGru = "" ;
      A5613Lb_DscGru = "" ;
      AV41Gestionlaboratorio_tensprdwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru = "" ;
      AV36TFLb_CodGru = "" ;
      AV43Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel = "" ;
      AV37TFLb_CodGru_Sel = "" ;
      AV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru = "" ;
      AV34TFLb_DscGru = "" ;
      AV45Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel = "" ;
      AV35TFLb_DscGru_Sel = "" ;
      scmdbuf = "" ;
      lV41Gestionlaboratorio_tensprdwwds_1_filterfulltext = "" ;
      lV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru = "" ;
      lV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru = "" ;
      P096C2_A5613Lb_DscGru = new String[] {""} ;
      P096C2_n5613Lb_DscGru = new boolean[] {false} ;
      P096C2_A5612Lb_CodGru = new String[] {""} ;
      P096C2_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tensprdwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P096C2_A5613Lb_DscGru, P096C2_n5613Lb_DscGru, P096C2_A5612Lb_CodGru, P096C2_A396EmprCod
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
   private int AV46GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A5612Lb_CodGru ;
   private String A5613Lb_DscGru ;
   private String AV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru ;
   private String AV36TFLb_CodGru ;
   private String AV43Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel ;
   private String AV37TFLb_CodGru_Sel ;
   private String AV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru ;
   private String AV34TFLb_DscGru ;
   private String AV45Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel ;
   private String AV35TFLb_DscGru_Sel ;
   private String scmdbuf ;
   private String lV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru ;
   private String lV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n5613Lb_DscGru ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV41Gestionlaboratorio_tensprdwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV41Gestionlaboratorio_tensprdwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P096C2_A5613Lb_DscGru ;
   private boolean[] P096C2_n5613Lb_DscGru ;
   private String[] P096C2_A5612Lb_CodGru ;
   private String[] P096C2_A396EmprCod ;
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

final  class tensprdwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P096C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Gestionlaboratorio_tensprdwwds_1_filterfulltext ,
                                          String AV43Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel ,
                                          String AV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru ,
                                          String AV45Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel ,
                                          String AV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru ,
                                          String A5612Lb_CodGru ,
                                          String A5613Lb_DscGru ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[6];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT Lb_DscGru, Lb_CodGru, EmprCod FROM TXPENSPRD" ;
      if ( ! (GXutil.strcmp("", AV41Gestionlaboratorio_tensprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(Lb_CodGru) like '%' || UPPER(?)) or ( UPPER(Lb_DscGru) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel)==0) && ( ! (GXutil.strcmp("", AV42Gestionlaboratorio_tensprdwwds_2_tflb_codgru)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_CodGru) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_CodGru = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel)==0) && ( ! (GXutil.strcmp("", AV44Gestionlaboratorio_tensprdwwds_4_tflb_dscgru)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_DscGru) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_DscGru = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY EmprCod, Lb_CodGru" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Lb_CodGru" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Lb_CodGru DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY Lb_DscGru" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Lb_DscGru DESC" ;
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
                  return conditional_P096C2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Boolean) dynConstraints[8]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P096C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 2);
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
                  stmt.setString(sIdx, (String)parms[8], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
      }
   }

}

