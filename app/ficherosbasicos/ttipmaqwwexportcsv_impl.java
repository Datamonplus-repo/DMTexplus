package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipmaqwwexportcsv_impl extends GXWebProcedure
{
   public ttipmaqwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TTIPMAQWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TTIPMAQWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FicherosBasicos.TTIPMAQWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo de Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Carga por 24 Horas", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext = AV54FilterFullText ;
      AV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = AV48TFTipMaqCod ;
      AV60Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel = AV49TFTipMaqCod_Sel ;
      AV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = AV50TFTipMaqDsc ;
      AV62Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel = AV51TFTipMaqDsc_Sel ;
      AV63Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 = AV52TFTipMaqC24 ;
      AV64Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to = AV53TFTipMaqC24_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext ,
                                           AV60Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ,
                                           AV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ,
                                           AV62Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ,
                                           AV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ,
                                           AV63Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ,
                                           AV64Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc ,
                                           A12447TipMaqC24 ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod), 4, "%") ;
      lV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc), 30, "%") ;
      /* Using cursor P080E2 */
      pr_default.execute(0, new Object[] {lV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod, AV60Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel, lV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc, AV62Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel, AV63Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24, AV64Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12447TipMaqC24 = P080E2_A12447TipMaqC24[0] ;
         n12447TipMaqC24 = P080E2_n12447TipMaqC24[0] ;
         A1012TipMaqDsc = P080E2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P080E2_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P080E2_A1011TipMaqCod[0] ;
         A396EmprCod = P080E2_A396EmprCod[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1011TipMaqCod, ";", ","), GXv_char3) ;
            ttipmaqwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1012TipMaqDsc, ";", ","), GXv_char3) ;
            ttipmaqwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A12447TipMaqC24, 10, 2) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TTIPMAQWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipMaqCod", "", "Tipo de Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipMaqDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipMaqC24", "", "Carga por 24 Horas", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FicherosBasicos.TTIPMAQWWColumnsSelector", GXv_char3) ;
      ttipmaqwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TTIPMAQWWGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTIPMAQWWGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("FicherosBasicos.TTIPMAQWWGridState"), null, null);
      }
      AV28OrderedBy = AV46GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV46GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV48TFTipMaqCod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV49TFTipMaqCod_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV50TFTipMaqDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV51TFTipMaqDsc_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQC24") == 0 )
         {
            AV52TFTipMaqC24 = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFTipMaqC24_To = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
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
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      A12447TipMaqC24 = DecimalUtil.ZERO ;
      AV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext = "" ;
      AV54FilterFullText = "" ;
      AV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = "" ;
      AV48TFTipMaqCod = "" ;
      AV60Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel = "" ;
      AV49TFTipMaqCod_Sel = "" ;
      AV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = "" ;
      AV50TFTipMaqDsc = "" ;
      AV62Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel = "" ;
      AV51TFTipMaqDsc_Sel = "" ;
      AV63Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 = DecimalUtil.ZERO ;
      AV52TFTipMaqC24 = DecimalUtil.ZERO ;
      AV64Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to = DecimalUtil.ZERO ;
      AV53TFTipMaqC24_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext = "" ;
      lV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = "" ;
      lV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = "" ;
      P080E2_A12447TipMaqC24 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P080E2_n12447TipMaqC24 = new boolean[] {false} ;
      P080E2_A1012TipMaqDsc = new String[] {""} ;
      P080E2_n1012TipMaqDsc = new boolean[] {false} ;
      P080E2_A1011TipMaqCod = new String[] {""} ;
      P080E2_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipmaqwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P080E2_A12447TipMaqC24, P080E2_n12447TipMaqC24, P080E2_A1012TipMaqDsc, P080E2_n1012TipMaqDsc, P080E2_A1011TipMaqCod, P080E2_A396EmprCod
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
   private int AV65GXV1 ;
   private java.math.BigDecimal A12447TipMaqC24 ;
   private java.math.BigDecimal AV63Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ;
   private java.math.BigDecimal AV52TFTipMaqC24 ;
   private java.math.BigDecimal AV64Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ;
   private java.math.BigDecimal AV53TFTipMaqC24_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String AV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ;
   private String AV48TFTipMaqCod ;
   private String AV60Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ;
   private String AV49TFTipMaqCod_Sel ;
   private String AV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ;
   private String AV50TFTipMaqDsc ;
   private String AV62Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ;
   private String AV51TFTipMaqDsc_Sel ;
   private String scmdbuf ;
   private String lV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ;
   private String lV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n12447TipMaqC24 ;
   private boolean n1012TipMaqDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext ;
   private String AV54FilterFullText ;
   private String lV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P080E2_A12447TipMaqC24 ;
   private boolean[] P080E2_n12447TipMaqC24 ;
   private String[] P080E2_A1012TipMaqDsc ;
   private boolean[] P080E2_n1012TipMaqDsc ;
   private String[] P080E2_A1011TipMaqCod ;
   private String[] P080E2_A396EmprCod ;
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

final  class ttipmaqwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext ,
                                          String AV60Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ,
                                          String AV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ,
                                          String AV62Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ,
                                          String AV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ,
                                          java.math.BigDecimal AV63Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ,
                                          java.math.BigDecimal AV64Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          java.math.BigDecimal A12447TipMaqC24 ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[9];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT TipMaqC24, TipMaqDsc, TipMaqCod, EmprCod FROM TXPTIPMAQ" ;
      if ( ! (GXutil.strcmp("", AV58Ficherosbasicos_ttipmaqwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TipMaqCod) like '%' || UPPER(?)) or ( UPPER(TipMaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(TipMaqC24,'9999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV59Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(TipMaqCod = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMaqDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24)==0) )
      {
         addWhere(sWhereString, "(TipMaqC24 >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to)==0) )
      {
         addWhere(sWhereString, "(TipMaqC24 <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMaqCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMaqC24" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMaqC24 DESC" ;
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
                  return conditional_P080E2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
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
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               return;
      }
   }

}

