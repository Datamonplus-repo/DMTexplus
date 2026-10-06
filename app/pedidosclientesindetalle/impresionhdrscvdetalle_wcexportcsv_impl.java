package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impresionhdrscvdetalle_wcexportcsv_impl extends GXWebProcedure
{
   public impresionhdrscvdetalle_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ImpresionHDRsCvDetalle_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N° Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido Cliente", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = AV30FilterFullText ;
      AV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = AV34TFBarNHdr ;
      AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = AV36TFBarEncCli ;
      AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel = AV37TFBarEncCli_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ,
                                           AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ,
                                           AV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ,
                                           AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ,
                                           AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4812BarEncCli ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV40BarEncCli ,
                                           AV38Emprcod ,
                                           Integer.valueOf(AV39Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      lV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext), "%", "") ;
      lV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext), "%", "") ;
      lV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr), 11, "%") ;
      lV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = GXutil.padr( GXutil.rtrim( AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli), 20, "%") ;
      /* Using cursor P09JX2 */
      pr_default.execute(0, new Object[] {AV38Emprcod, Integer.valueOf(AV39Clicod), AV40BarEncCli, lV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext, lV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext, lV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr, AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel, lV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli, AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P09JX2_A252CliCod[0] ;
         n252CliCod = P09JX2_n252CliCod[0] ;
         A396EmprCod = P09JX2_A396EmprCod[0] ;
         A4812BarEncCli = P09JX2_A4812BarEncCli[0] ;
         A13696BarNHdr = P09JX2_A13696BarNHdr[0] ;
         A129BarCod = P09JX2_A129BarCod[0] ;
         A132BarCodReo = P09JX2_A132BarCodReo[0] ;
         A130BarCodPar = P09JX2_A130BarCodPar[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            impresionhdrscvdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4812BarEncCli, ";", ","), GXv_char3) ;
            impresionhdrscvdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ImpresionHDRsCvDetalle_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNHdr", "", "N° Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarEncCli", "", "Pedido Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCColumnsSelector", GXv_char3) ;
      impresionhdrscvdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV34TFBarNHdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV35TFBarNHdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV36TFBarEncCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV37TFBarEncCli_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
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
      A13696BarNHdr = "" ;
      A4812BarEncCli = "" ;
      AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = "" ;
      AV34TFBarNHdr = "" ;
      AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel = "" ;
      AV35TFBarNHdr_Sel = "" ;
      AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = "" ;
      AV36TFBarEncCli = "" ;
      AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel = "" ;
      AV37TFBarEncCli_Sel = "" ;
      scmdbuf = "" ;
      lV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = "" ;
      lV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = "" ;
      lV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = "" ;
      A130BarCodPar = "" ;
      AV40BarEncCli = "" ;
      AV38Emprcod = "" ;
      A396EmprCod = "" ;
      P09JX2_A252CliCod = new int[1] ;
      P09JX2_n252CliCod = new boolean[] {false} ;
      P09JX2_A396EmprCod = new String[] {""} ;
      P09JX2_A4812BarEncCli = new String[] {""} ;
      P09JX2_A13696BarNHdr = new String[] {""} ;
      P09JX2_A129BarCod = new int[1] ;
      P09JX2_A132BarCodReo = new byte[1] ;
      P09JX2_A130BarCodPar = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.impresionhdrscvdetalle_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09JX2_A252CliCod, P09JX2_n252CliCod, P09JX2_A396EmprCod, P09JX2_A4812BarEncCli, P09JX2_A13696BarNHdr, P09JX2_A129BarCod, P09JX2_A132BarCodReo, P09JX2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A129BarCod ;
   private int AV39Clicod ;
   private int A252CliCod ;
   private int AV49GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13696BarNHdr ;
   private String A4812BarEncCli ;
   private String AV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ;
   private String AV34TFBarNHdr ;
   private String AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ;
   private String AV35TFBarNHdr_Sel ;
   private String AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ;
   private String AV36TFBarEncCli ;
   private String AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ;
   private String AV37TFBarEncCli_Sel ;
   private String scmdbuf ;
   private String lV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ;
   private String lV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ;
   private String A130BarCodPar ;
   private String AV40BarEncCli ;
   private String AV38Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n252CliCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P09JX2_A252CliCod ;
   private boolean[] P09JX2_n252CliCod ;
   private String[] P09JX2_A396EmprCod ;
   private String[] P09JX2_A4812BarEncCli ;
   private String[] P09JX2_A13696BarNHdr ;
   private int[] P09JX2_A129BarCod ;
   private byte[] P09JX2_A132BarCodReo ;
   private String[] P09JX2_A130BarCodPar ;
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

final  class impresionhdrscvdetalle_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09JX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ,
                                          String AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ,
                                          String AV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ,
                                          String AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ,
                                          String AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4812BarEncCli ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV40BarEncCli ,
                                          String AV38Emprcod ,
                                          int AV39Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[9];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT CliCod, EmprCod, BarEncCli, RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar AS" ;
      scmdbuf += " BarNHdr, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      addWhere(sWhereString, "(BarEncCli = ?)");
      if ( ! (GXutil.strcmp("", AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarEncCli) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV45Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY BarEncCli" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarEncCli DESC" ;
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
                  return conditional_P09JX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09JX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 11);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 20);
               }
               return;
      }
   }

}

