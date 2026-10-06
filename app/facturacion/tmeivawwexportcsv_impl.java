package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmeivawwexportcsv_impl extends GXWebProcedure
{
   public tmeivawwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TMEIVAWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.TMEIVAWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Facturacion.TMEIVAWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Norma aplicable", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV43Facturacion_tmeivawwds_1_filterfulltext = AV30FilterFullText ;
      AV44Facturacion_tmeivawwds_2_tfmeivaid = AV34TFMeivaId ;
      AV45Facturacion_tmeivawwds_3_tfmeivaid_sel = AV35TFMeivaId_Sel ;
      AV46Facturacion_tmeivawwds_4_tfmeivadsc = AV36TFMeivaDsc ;
      AV47Facturacion_tmeivawwds_5_tfmeivadsc_sel = AV37TFMeivaDsc_Sel ;
      AV48Facturacion_tmeivawwds_6_tfmeivanorma = AV38TFMeivaNorma ;
      AV49Facturacion_tmeivawwds_7_tfmeivanorma_sel = AV39TFMeivaNorma_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Facturacion_tmeivawwds_1_filterfulltext ,
                                           AV45Facturacion_tmeivawwds_3_tfmeivaid_sel ,
                                           AV44Facturacion_tmeivawwds_2_tfmeivaid ,
                                           AV47Facturacion_tmeivawwds_5_tfmeivadsc_sel ,
                                           AV46Facturacion_tmeivawwds_4_tfmeivadsc ,
                                           AV49Facturacion_tmeivawwds_7_tfmeivanorma_sel ,
                                           AV48Facturacion_tmeivawwds_6_tfmeivanorma ,
                                           A11629MeivaId ,
                                           A11630MeivaDsc ,
                                           A11631MeivaNorma ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV43Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV43Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV43Facturacion_tmeivawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Facturacion_tmeivawwds_1_filterfulltext), "%", "") ;
      lV44Facturacion_tmeivawwds_2_tfmeivaid = GXutil.padr( GXutil.rtrim( AV44Facturacion_tmeivawwds_2_tfmeivaid), 4, "%") ;
      lV46Facturacion_tmeivawwds_4_tfmeivadsc = GXutil.concat( GXutil.rtrim( AV46Facturacion_tmeivawwds_4_tfmeivadsc), "%", "") ;
      lV48Facturacion_tmeivawwds_6_tfmeivanorma = GXutil.concat( GXutil.rtrim( AV48Facturacion_tmeivawwds_6_tfmeivanorma), "%", "") ;
      /* Using cursor P09YZ2 */
      pr_default.execute(0, new Object[] {lV43Facturacion_tmeivawwds_1_filterfulltext, lV43Facturacion_tmeivawwds_1_filterfulltext, lV43Facturacion_tmeivawwds_1_filterfulltext, lV44Facturacion_tmeivawwds_2_tfmeivaid, AV45Facturacion_tmeivawwds_3_tfmeivaid_sel, lV46Facturacion_tmeivawwds_4_tfmeivadsc, AV47Facturacion_tmeivawwds_5_tfmeivadsc_sel, lV48Facturacion_tmeivawwds_6_tfmeivanorma, AV49Facturacion_tmeivawwds_7_tfmeivanorma_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11631MeivaNorma = P09YZ2_A11631MeivaNorma[0] ;
         n11631MeivaNorma = P09YZ2_n11631MeivaNorma[0] ;
         A11630MeivaDsc = P09YZ2_A11630MeivaDsc[0] ;
         n11630MeivaDsc = P09YZ2_n11630MeivaDsc[0] ;
         A11629MeivaId = P09YZ2_A11629MeivaId[0] ;
         A396EmprCod = P09YZ2_A396EmprCod[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11629MeivaId, ";", ","), GXv_char3) ;
            tmeivawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11630MeivaDsc, ";", ","), GXv_char3) ;
            tmeivawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11631MeivaNorma, ";", ","), GXv_char3) ;
            tmeivawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TMEIVAWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MeivaId", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MeivaDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MeivaNorma", "", "Norma aplicable", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.TMEIVAWWColumnsSelector", GXv_char3) ;
      tmeivawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.TMEIVAWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TMEIVAWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("Facturacion.TMEIVAWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVAID") == 0 )
         {
            AV34TFMeivaId = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVAID_SEL") == 0 )
         {
            AV35TFMeivaId_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVADSC") == 0 )
         {
            AV36TFMeivaDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVADSC_SEL") == 0 )
         {
            AV37TFMeivaDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVANORMA") == 0 )
         {
            AV38TFMeivaNorma = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMEIVANORMA_SEL") == 0 )
         {
            AV39TFMeivaNorma_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
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
      A11629MeivaId = "" ;
      A11630MeivaDsc = "" ;
      A11631MeivaNorma = "" ;
      AV43Facturacion_tmeivawwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV44Facturacion_tmeivawwds_2_tfmeivaid = "" ;
      AV34TFMeivaId = "" ;
      AV45Facturacion_tmeivawwds_3_tfmeivaid_sel = "" ;
      AV35TFMeivaId_Sel = "" ;
      AV46Facturacion_tmeivawwds_4_tfmeivadsc = "" ;
      AV36TFMeivaDsc = "" ;
      AV47Facturacion_tmeivawwds_5_tfmeivadsc_sel = "" ;
      AV37TFMeivaDsc_Sel = "" ;
      AV48Facturacion_tmeivawwds_6_tfmeivanorma = "" ;
      AV38TFMeivaNorma = "" ;
      AV49Facturacion_tmeivawwds_7_tfmeivanorma_sel = "" ;
      AV39TFMeivaNorma_Sel = "" ;
      scmdbuf = "" ;
      lV43Facturacion_tmeivawwds_1_filterfulltext = "" ;
      lV44Facturacion_tmeivawwds_2_tfmeivaid = "" ;
      lV46Facturacion_tmeivawwds_4_tfmeivadsc = "" ;
      lV48Facturacion_tmeivawwds_6_tfmeivanorma = "" ;
      P09YZ2_A11631MeivaNorma = new String[] {""} ;
      P09YZ2_n11631MeivaNorma = new boolean[] {false} ;
      P09YZ2_A11630MeivaDsc = new String[] {""} ;
      P09YZ2_n11630MeivaDsc = new boolean[] {false} ;
      P09YZ2_A11629MeivaId = new String[] {""} ;
      P09YZ2_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tmeivawwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09YZ2_A11631MeivaNorma, P09YZ2_n11631MeivaNorma, P09YZ2_A11630MeivaDsc, P09YZ2_n11630MeivaDsc, P09YZ2_A11629MeivaId, P09YZ2_A396EmprCod
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
   private int AV50GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A11629MeivaId ;
   private String AV44Facturacion_tmeivawwds_2_tfmeivaid ;
   private String AV34TFMeivaId ;
   private String AV45Facturacion_tmeivawwds_3_tfmeivaid_sel ;
   private String AV35TFMeivaId_Sel ;
   private String scmdbuf ;
   private String lV44Facturacion_tmeivawwds_2_tfmeivaid ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n11631MeivaNorma ;
   private boolean n11630MeivaDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String A11630MeivaDsc ;
   private String A11631MeivaNorma ;
   private String AV43Facturacion_tmeivawwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV46Facturacion_tmeivawwds_4_tfmeivadsc ;
   private String AV36TFMeivaDsc ;
   private String AV47Facturacion_tmeivawwds_5_tfmeivadsc_sel ;
   private String AV37TFMeivaDsc_Sel ;
   private String AV48Facturacion_tmeivawwds_6_tfmeivanorma ;
   private String AV38TFMeivaNorma ;
   private String AV49Facturacion_tmeivawwds_7_tfmeivanorma_sel ;
   private String AV39TFMeivaNorma_Sel ;
   private String lV43Facturacion_tmeivawwds_1_filterfulltext ;
   private String lV46Facturacion_tmeivawwds_4_tfmeivadsc ;
   private String lV48Facturacion_tmeivawwds_6_tfmeivanorma ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09YZ2_A11631MeivaNorma ;
   private boolean[] P09YZ2_n11631MeivaNorma ;
   private String[] P09YZ2_A11630MeivaDsc ;
   private boolean[] P09YZ2_n11630MeivaDsc ;
   private String[] P09YZ2_A11629MeivaId ;
   private String[] P09YZ2_A396EmprCod ;
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

final  class tmeivawwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09YZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Facturacion_tmeivawwds_1_filterfulltext ,
                                          String AV45Facturacion_tmeivawwds_3_tfmeivaid_sel ,
                                          String AV44Facturacion_tmeivawwds_2_tfmeivaid ,
                                          String AV47Facturacion_tmeivawwds_5_tfmeivadsc_sel ,
                                          String AV46Facturacion_tmeivawwds_4_tfmeivadsc ,
                                          String AV49Facturacion_tmeivawwds_7_tfmeivanorma_sel ,
                                          String AV48Facturacion_tmeivawwds_6_tfmeivanorma ,
                                          String A11629MeivaId ,
                                          String A11630MeivaDsc ,
                                          String A11631MeivaNorma ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[9];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT MeivaNorma, MeivaDsc, MeivaId, EmprCod FROM TXPMEIVA" ;
      if ( ! (GXutil.strcmp("", AV43Facturacion_tmeivawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MeivaId) like '%' || UPPER(?)) or ( UPPER(MeivaDsc) like '%' || UPPER(?)) or ( UPPER(MeivaNorma) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Facturacion_tmeivawwds_3_tfmeivaid_sel)==0) && ( ! (GXutil.strcmp("", AV44Facturacion_tmeivawwds_2_tfmeivaid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Facturacion_tmeivawwds_3_tfmeivaid_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaId = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Facturacion_tmeivawwds_5_tfmeivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Facturacion_tmeivawwds_4_tfmeivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Facturacion_tmeivawwds_5_tfmeivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Facturacion_tmeivawwds_7_tfmeivanorma_sel)==0) && ( ! (GXutil.strcmp("", AV48Facturacion_tmeivawwds_6_tfmeivanorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MeivaNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Facturacion_tmeivawwds_7_tfmeivanorma_sel)==0) )
      {
         addWhere(sWhereString, "(MeivaNorma = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY EmprCod, MeivaId" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MeivaId" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MeivaId DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MeivaDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MeivaDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MeivaNorma" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MeivaNorma DESC" ;
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
                  return conditional_P09YZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 4);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               return;
      }
   }

}

