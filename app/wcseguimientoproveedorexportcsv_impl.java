package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcseguimientoproveedorexportcsv_impl extends GXWebProcedure
{
   public wcseguimientoproveedorexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCSeguimientoProveedorExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCSeguimientoProveedorColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCSeguimientoProveedorColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Entrega Prevista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV48Wcseguimientoproveedords_1_filterfulltext = AV44FilterFullText ;
      AV49Wcseguimientoproveedords_2_tfpedcod = AV35TFPedCod ;
      AV50Wcseguimientoproveedords_3_tfpedcod_to = AV36TFPedCod_To ;
      AV51Wcseguimientoproveedords_4_tfpedfec = AV37TFPedFec ;
      AV52Wcseguimientoproveedords_5_tfpedfecent = AV39TFPedFecEnt ;
      AV53Wcseguimientoproveedords_6_tfpedsit_sels = AV42TFPedSit_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A667PedSit ,
                                           AV53Wcseguimientoproveedords_6_tfpedsit_sels ,
                                           AV48Wcseguimientoproveedords_1_filterfulltext ,
                                           Integer.valueOf(AV49Wcseguimientoproveedords_2_tfpedcod) ,
                                           Integer.valueOf(AV50Wcseguimientoproveedords_3_tfpedcod_to) ,
                                           AV51Wcseguimientoproveedords_4_tfpedfec ,
                                           AV52Wcseguimientoproveedords_5_tfpedfecent ,
                                           Integer.valueOf(AV53Wcseguimientoproveedords_6_tfpedsit_sels.size()) ,
                                           Integer.valueOf(A658PedCod) ,
                                           A661PedFec ,
                                           A662PedFecEnt ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           AV43PedSit ,
                                           AV28Emprcod ,
                                           Integer.valueOf(AV29PrvNum) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A795PrvNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV48Wcseguimientoproveedords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Wcseguimientoproveedords_1_filterfulltext), "%", "") ;
      lV48Wcseguimientoproveedords_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Wcseguimientoproveedords_1_filterfulltext), "%", "") ;
      /* Using cursor P08PS2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, Integer.valueOf(AV29PrvNum), AV43PedSit, AV43PedSit, lV48Wcseguimientoproveedords_1_filterfulltext, lV48Wcseguimientoproveedords_1_filterfulltext, Integer.valueOf(AV49Wcseguimientoproveedords_2_tfpedcod), Integer.valueOf(AV50Wcseguimientoproveedords_3_tfpedcod_to), AV51Wcseguimientoproveedords_4_tfpedfec, AV52Wcseguimientoproveedords_5_tfpedfecent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P08PS2_A795PrvNum[0] ;
         A396EmprCod = P08PS2_A396EmprCod[0] ;
         A667PedSit = P08PS2_A667PedSit[0] ;
         A662PedFecEnt = P08PS2_A662PedFecEnt[0] ;
         A661PedFec = P08PS2_A661PedFec[0] ;
         A658PedCod = P08PS2_A658PedCod[0] ;
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
            AV14TextFileLine += GXutil.str( A658PedCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A661PedFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A662PedFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( A667PedSit), "S") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Cerrado", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A667PedSit), "N") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Pendiente", "") ;
            }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCSeguimientoProveedorExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedCod", "", "N Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedFec", "", "Fecha Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedFecEnt", "", "Fecha Entrega Prevista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "PedSit", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXt_char3 = AV20UserCustomValue ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCSeguimientoProveedorColumnsSelector", GXv_char4) ;
      wcseguimientoproveedorexportcsv_impl.this.GXt_char3 = GXv_char4[0] ;
      AV20UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector2[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector2[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCSeguimientoProveedorGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCSeguimientoProveedorGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("WCSeguimientoProveedorGridState"), null, null);
      }
      AV30OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV35TFPedCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFPedCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV37TFPedFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV39TFPedFecEnt = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDSIT_SEL") == 0 )
         {
            AV41TFPedSit_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV42TFPedSit_Sels.fromJSonString(AV41TFPedSit_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV29PrvNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDSIT") == 0 )
         {
            AV43PedSit = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
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
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      A667PedSit = "" ;
      AV48Wcseguimientoproveedords_1_filterfulltext = "" ;
      AV44FilterFullText = "" ;
      AV51Wcseguimientoproveedords_4_tfpedfec = GXutil.nullDate() ;
      AV37TFPedFec = GXutil.nullDate() ;
      AV52Wcseguimientoproveedords_5_tfpedfecent = GXutil.nullDate() ;
      AV39TFPedFecEnt = GXutil.nullDate() ;
      AV53Wcseguimientoproveedords_6_tfpedsit_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42TFPedSit_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV48Wcseguimientoproveedords_1_filterfulltext = "" ;
      AV43PedSit = "" ;
      AV28Emprcod = "" ;
      A396EmprCod = "" ;
      P08PS2_A795PrvNum = new int[1] ;
      P08PS2_A396EmprCod = new String[] {""} ;
      P08PS2_A667PedSit = new String[] {""} ;
      P08PS2_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PS2_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08PS2_A658PedCod = new int[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector2 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV41TFPedSit_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcseguimientoproveedorexportcsv__default(),
         new Object[] {
             new Object[] {
            P08PS2_A795PrvNum, P08PS2_A396EmprCod, P08PS2_A667PedSit, P08PS2_A662PedFecEnt, P08PS2_A661PedFec, P08PS2_A658PedCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV30OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A658PedCod ;
   private int AV49Wcseguimientoproveedords_2_tfpedcod ;
   private int AV35TFPedCod ;
   private int AV50Wcseguimientoproveedords_3_tfpedcod_to ;
   private int AV36TFPedCod_To ;
   private int AV53Wcseguimientoproveedords_6_tfpedsit_sels_size ;
   private int AV29PrvNum ;
   private int A795PrvNum ;
   private int AV54GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A667PedSit ;
   private String scmdbuf ;
   private String AV43PedSit ;
   private String AV28Emprcod ;
   private String A396EmprCod ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date AV51Wcseguimientoproveedords_4_tfpedfec ;
   private java.util.Date AV37TFPedFec ;
   private java.util.Date AV52Wcseguimientoproveedords_5_tfpedfecent ;
   private java.util.Date AV39TFPedFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV41TFPedSit_SelsJson ;
   private String AV11Filename ;
   private String AV48Wcseguimientoproveedords_1_filterfulltext ;
   private String AV44FilterFullText ;
   private String lV48Wcseguimientoproveedords_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P08PS2_A795PrvNum ;
   private String[] P08PS2_A396EmprCod ;
   private String[] P08PS2_A667PedSit ;
   private java.util.Date[] P08PS2_A662PedFecEnt ;
   private java.util.Date[] P08PS2_A661PedFec ;
   private int[] P08PS2_A658PedCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV53Wcseguimientoproveedords_6_tfpedsit_sels ;
   private GXSimpleCollection<String> AV42TFPedSit_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcseguimientoproveedorexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A667PedSit ,
                                          GXSimpleCollection<String> AV53Wcseguimientoproveedords_6_tfpedsit_sels ,
                                          String AV48Wcseguimientoproveedords_1_filterfulltext ,
                                          int AV49Wcseguimientoproveedords_2_tfpedcod ,
                                          int AV50Wcseguimientoproveedords_3_tfpedcod_to ,
                                          java.util.Date AV51Wcseguimientoproveedords_4_tfpedfec ,
                                          java.util.Date AV52Wcseguimientoproveedords_5_tfpedfecent ,
                                          int AV53Wcseguimientoproveedords_6_tfpedsit_sels_size ,
                                          int A658PedCod ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          String AV43PedSit ,
                                          String AV28Emprcod ,
                                          int AV29PrvNum ,
                                          String A396EmprCod ,
                                          int A795PrvNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[10];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT PrvNum, EmprCod, PedSit, PedFecEnt, PedFec, PedCod FROM TXPCPEDID" ;
      addWhere(sWhereString, "(EmprCod = ? and PrvNum = ?)");
      addWhere(sWhereString, "(PedSit = ? or ? = 'X')");
      if ( ! (GXutil.strcmp("", AV48Wcseguimientoproveedords_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(PedCod,'99999990'), 2) like '%' || ?) or ( UPPER(PedSit) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV49Wcseguimientoproveedords_2_tfpedcod) )
      {
         addWhere(sWhereString, "(PedCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV50Wcseguimientoproveedords_3_tfpedcod_to) )
      {
         addWhere(sWhereString, "(PedCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51Wcseguimientoproveedords_4_tfpedfec)) )
      {
         addWhere(sWhereString, "(PedFec >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52Wcseguimientoproveedords_5_tfpedfecent)) )
      {
         addWhere(sWhereString, "(PedFecEnt >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( AV53Wcseguimientoproveedords_6_tfpedsit_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV53Wcseguimientoproveedords_6_tfpedsit_sels, "PedSit IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV30OrderedBy == 1 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY PedFec" ;
      }
      else if ( ( AV30OrderedBy == 1 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PedFec DESC" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY PedCod" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PedCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY PedFecEnt" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PedFecEnt DESC" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY PedSit" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PedSit DESC" ;
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
                  return conditional_P08PS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Boolean) dynConstraints[12]).booleanValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               return;
      }
   }

}

