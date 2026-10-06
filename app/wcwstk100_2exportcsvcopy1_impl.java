package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwstk100_2exportcsvcopy1_impl extends GXWebProcedure
{
   public wcwstk100_2exportcsvcopy1_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV19Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV31PrdNum = httpContext.GetPar( "PrdNum") ;
            AV32Prdnum_to = httpContext.GetPar( "Prdnum_to") ;
            AV35PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
            AV36Prvnum_to = (int)(GXutil.lval( httpContext.GetPar( "Prvnum_to"))) ;
            AV17Dias = (int)(GXutil.lval( httpContext.GetPar( "Dias"))) ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV44WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV44WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
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
      S171 ();
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
      AV37Random = (int)(GXutil.random( )*10000) ;
      AV21Filename = "WCWstk100_2ExportCSV-" + GXutil.trim( GXutil.str( AV37Random, 8, 0)) + ".csv" ;
      AV39TextFile.setSource( AV21Filename );
      AV39TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV39TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV40TextFileLine = "" ;
      if ( GXutil.strcmp(AV38Session.getValue("WCWstk100_2ColumnsSelector"), "") != 0 )
      {
         AV13ColumnsSelectorXML = AV38Session.getValue("WCWstk100_2ColumnsSelector") ;
         AV10ColumnsSelector.fromxml(AV13ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV40TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Proveedor", "") : "") ;
      AV40TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Proveedor", "") : "") ;
      AV40TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Producto", "") : "") ;
      AV40TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Producto", "") : "") ;
      AV40TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencias Almacen", "") : "") ;
      AV40TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha  Ult Mov.", "") : "") ;
      AV40TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Tipo Movimiento", "") : "") ;
      AV40TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dias", "") : "") ;
      AV40TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio Actual", "") : "") ;
      if ( GXutil.len( AV40TextFileLine) > 0 )
      {
         AV39TextFile.writeLine(GXutil.substring( AV40TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV31PrdNum ,
                                           AV32Prdnum_to ,
                                           Integer.valueOf(AV35PrvNum) ,
                                           Integer.valueOf(AV36Prvnum_to) ,
                                           A719PrdNum ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A704PrdExiAlm ,
                                           AV19Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P08Y02 */
      pr_default.execute(0, new Object[] {AV19Emprcod, AV31PrdNum, AV32Prdnum_to, Integer.valueOf(AV35PrvNum), Integer.valueOf(AV36Prvnum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08Y02_A396EmprCod[0] ;
         A704PrdExiAlm = P08Y02_A704PrdExiAlm[0] ;
         A795PrvNum = P08Y02_A795PrvNum[0] ;
         A719PrdNum = P08Y02_A719PrdNum[0] ;
         A718PrdNom = P08Y02_A718PrdNom[0] ;
         A794PrvNom = P08Y02_A794PrvNom[0] ;
         n794PrvNom = P08Y02_n794PrvNom[0] ;
         A724PrdPreAct = P08Y02_A724PrdPreAct[0] ;
         A794PrvNom = P08Y02_A794PrvNom[0] ;
         n794PrvNom = P08Y02_n794PrvNom[0] ;
         AV8CCStkFec = GXutil.nullDate() ;
         AV41TipMovCc = "" ;
         AV47PrdNumIN = A719PrdNum ;
         /* Execute user subroutine: 'CCSTKS' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV18Dif = 0 ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8CCStkFec)) )
         {
            AV18Dif = (int)(GXutil.ddiff(GXutil.today( ),AV8CCStkFec)) ;
         }
         AV46dtf = GXutil.serverNow( context, remoteHandle, pr_default) ;
         AV48Min = (short)(GXutil.dtdiff( AV46dtf, AV45dti)/ (double) (60)) ;
         AV49Hh = (short)(AV48Min/ (double) (60)) ;
         AV50Hhint = (short)(GXutil.Int( AV49Hh)) ;
         AV52Mm = (short)(AV48Min-(AV50Hhint*60)) ;
         AV52Mm = (short)(GXutil.Int( AV52Mm)) ;
         AV51HhMm = GXutil.str( AV50Hhint, 4, 0) + ":" + GXutil.str( AV52Mm, 2, 0) ;
         AV30PrdNom = A718PrdNom ;
         AV31PrdNum = A719PrdNum ;
         AV35PrvNum = A795PrvNum ;
         AV34PrvNom = A794PrvNom ;
         AV29PrdExiAlm = A704PrdExiAlm ;
         AV33PrdPreAct = A724PrdPreAct ;
         AV40TextFileLine = "" ;
         AV40TextFileLine = GXutil.str( AV35PrvNum, 6, 0) + ";" ;
         AV40TextFileLine += AV34PrvNom + ";" ;
         AV40TextFileLine += GXutil.trim( AV31PrdNum) + ";" ;
         AV40TextFileLine += GXutil.trim( AV30PrdNom) + ";" ;
         AV40TextFileLine += GXutil.str( AV29PrdExiAlm, 12, 4) + ";" ;
         AV40TextFileLine += localUtil.dtoc( AV8CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" ;
         AV40TextFileLine += GXutil.trim( AV41TipMovCc) + ";" ;
         AV40TextFileLine += GXutil.str( AV18Dif, 6, 0) + ";" ;
         AV40TextFileLine += GXutil.str( AV33PrdPreAct, 14, 5) + ";" ;
         AV39TextFile.writeLine(GXutil.substring( AV40TextFileLine, 2, -1));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S171( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV39TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV39TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV26HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV26HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCWstk100_2ExportCSV.csv");
         }
         AV26HttpResponse.addFile(AV39TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV39TextFile.getErrCode() != 0 )
      {
         AV21Filename = "" ;
         AV20ErrorMessage = AV39TextFile.getErrDescription() ;
         AV39TextFile.close();
         AV26HttpResponse.addString(AV20ErrorMessage);
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
      AV10ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector2[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "&PrvNum", "", "Codigo Proveedor", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "&PrvNom", "", "Nombre Proveedor", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "&PrdNum", "", "Codigo Producto", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "&PrdNom", "", "Descripcion Producto", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "&PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "&CCStkFec", "", "Fecha  Ult Mov.", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "&TipMovCc", "", "Codigo Tipo Movimiento", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "&Dif", "", "Dias", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "&PrdPreAct", "", "Precio Actual", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXt_char3 = AV42UserCustomValue ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWstk100_2ColumnsSelector", GXv_char4) ;
      wcwstk100_2exportcsvcopy1_impl.this.GXt_char3 = GXv_char4[0] ;
      AV42UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV42UserCustomValue)==0) ) )
      {
         AV12ColumnsSelectorAux.fromxml(AV42UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector2[0] = AV12ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV10ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, GXv_SdtWWPColumnsSelector5) ;
         AV12ColumnsSelectorAux = GXv_SdtWWPColumnsSelector2[0] ;
         AV10ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S162( )
   {
      /* 'CCSTKS' Routine */
      returnInSub = false ;
      /* Using cursor P08Y03 */
      pr_default.execute(1, new Object[] {AV19Emprcod, AV47PrdNumIN});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P08Y03_A396EmprCod[0] ;
         A719PrdNum = P08Y03_A719PrdNum[0] ;
         A3345TipMovCc = P08Y03_A3345TipMovCc[0] ;
         A3348CCStkFec = P08Y03_A3348CCStkFec[0] ;
         A3342CCStkLin = P08Y03_A3342CCStkLin[0] ;
         AV8CCStkFec = A3348CCStkFec ;
         AV41TipMovCc = A3345TipMovCc ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
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
      AV19Emprcod = "" ;
      AV31PrdNum = "" ;
      AV32Prdnum_to = "" ;
      AV44WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Filename = "" ;
      AV39TextFile = new com.genexus.util.GXFile();
      AV40TextFileLine = "" ;
      AV38Session = httpContext.getWebSession();
      AV13ColumnsSelectorXML = "" ;
      AV10ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      scmdbuf = "" ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08Y02_A396EmprCod = new String[] {""} ;
      P08Y02_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Y02_A795PrvNum = new int[1] ;
      P08Y02_A719PrdNum = new String[] {""} ;
      P08Y02_A718PrdNom = new String[] {""} ;
      P08Y02_A794PrvNom = new String[] {""} ;
      P08Y02_n794PrvNom = new boolean[] {false} ;
      P08Y02_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV8CCStkFec = GXutil.nullDate() ;
      AV41TipMovCc = "" ;
      AV47PrdNumIN = "" ;
      AV46dtf = GXutil.resetTime( GXutil.nullDate() );
      AV45dti = GXutil.resetTime( GXutil.nullDate() );
      AV51HhMm = "" ;
      AV30PrdNom = "" ;
      AV34PrvNom = "" ;
      AV29PrdExiAlm = DecimalUtil.ZERO ;
      AV33PrdPreAct = DecimalUtil.ZERO ;
      AV26HttpResponse = httpContext.getHttpResponse();
      AV20ErrorMessage = "" ;
      AV42UserCustomValue = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV12ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector2 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      P08Y03_A396EmprCod = new String[] {""} ;
      P08Y03_A719PrdNum = new String[] {""} ;
      P08Y03_A3345TipMovCc = new String[] {""} ;
      P08Y03_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08Y03_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwstk100_2exportcsvcopy1__default(),
         new Object[] {
             new Object[] {
            P08Y02_A396EmprCod, P08Y02_A704PrdExiAlm, P08Y02_A795PrvNum, P08Y02_A719PrdNum, P08Y02_A718PrdNom, P08Y02_A794PrvNom, P08Y02_n794PrvNom, P08Y02_A724PrdPreAct
            }
            , new Object[] {
            P08Y03_A396EmprCod, P08Y03_A719PrdNum, P08Y03_A3345TipMovCc, P08Y03_A3348CCStkFec, P08Y03_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV48Min ;
   private short AV49Hh ;
   private short AV50Hhint ;
   private short AV52Mm ;
   private short Gx_err ;
   private int AV35PrvNum ;
   private int AV36Prvnum_to ;
   private int AV17Dias ;
   private int AV37Random ;
   private int A795PrvNum ;
   private int AV18Dif ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV29PrdExiAlm ;
   private java.math.BigDecimal AV33PrdPreAct ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV19Emprcod ;
   private String AV31PrdNum ;
   private String AV32Prdnum_to ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String AV41TipMovCc ;
   private String AV47PrdNumIN ;
   private String AV51HhMm ;
   private String AV30PrdNom ;
   private String AV34PrvNom ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String A3345TipMovCc ;
   private java.util.Date AV46dtf ;
   private java.util.Date AV45dti ;
   private java.util.Date AV8CCStkFec ;
   private java.util.Date A3348CCStkFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean n794PrvNom ;
   private String AV40TextFileLine ;
   private String AV13ColumnsSelectorXML ;
   private String AV42UserCustomValue ;
   private String AV21Filename ;
   private String AV20ErrorMessage ;
   private com.genexus.webpanels.WebSession AV38Session ;
   private com.genexus.util.GXFile AV39TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08Y02_A396EmprCod ;
   private java.math.BigDecimal[] P08Y02_A704PrdExiAlm ;
   private int[] P08Y02_A795PrvNum ;
   private String[] P08Y02_A719PrdNum ;
   private String[] P08Y02_A718PrdNom ;
   private String[] P08Y02_A794PrvNom ;
   private boolean[] P08Y02_n794PrvNom ;
   private java.math.BigDecimal[] P08Y02_A724PrdPreAct ;
   private String[] P08Y03_A396EmprCod ;
   private String[] P08Y03_A719PrdNum ;
   private String[] P08Y03_A3345TipMovCc ;
   private java.util.Date[] P08Y03_A3348CCStkFec ;
   private long[] P08Y03_A3342CCStkLin ;
   private com.genexus.internet.HttpResponse AV26HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV12ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPContext AV44WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class wcwstk100_2exportcsvcopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08Y02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV31PrdNum ,
                                          String AV32Prdnum_to ,
                                          int AV35PrvNum ,
                                          int AV36Prvnum_to ,
                                          String A719PrdNum ,
                                          int A795PrvNum ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          String AV19Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[5];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdExiAlm, T1.PrvNum, T1.PrdNum, T1.PrdNom, T2.PrvNom, T1.PrdPreAct FROM (TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdExiAlm > 0)");
      if ( ! (GXutil.strcmp("", AV31PrdNum)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV32Prdnum_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV35PrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV36Prvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvNum, T1.PrdNum" ;
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
                  return conditional_P08Y02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Y02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Y03", "SELECT * FROM (SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (TipMovCc <> 'SR') ORDER BY EmprCod, PrdNum, CCStkLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

