package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn09wwexportcsv_impl extends GXWebProcedure
{
   public ttrn09wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TTrn09WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTrn09WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TTrn09WWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero Albaran Produccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Barcada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Reoperado Barcada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Particion Barcada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Línea Fase", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV59Ttrn09wwds_1_filterfulltext = AV53FilterFullText ;
      AV60Ttrn09wwds_2_tfalbprocod = AV45TFAlbProCod ;
      AV61Ttrn09wwds_3_tfalbprocod_to = AV46TFAlbProCod_To ;
      AV62Ttrn09wwds_4_tfbarcod = AV47TFBarCod ;
      AV63Ttrn09wwds_5_tfbarcod_to = AV48TFBarCod_To ;
      AV64Ttrn09wwds_6_tfbarcodreo = AV49TFBarCodReo ;
      AV65Ttrn09wwds_7_tfbarcodreo_to = AV50TFBarCodReo_To ;
      AV66Ttrn09wwds_8_tfbarcodpar = AV51TFBarCodPar ;
      AV67Ttrn09wwds_9_tfbarcodpar_sel = AV52TFBarCodPar_Sel ;
      AV68Ttrn09wwds_10_tfguifasmaxlin = AV54TFGuiFasMaxLin ;
      AV69Ttrn09wwds_11_tfguifasmaxlin_to = AV55TFGuiFasMaxLin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV60Ttrn09wwds_2_tfalbprocod) ,
                                           Long.valueOf(AV61Ttrn09wwds_3_tfalbprocod_to) ,
                                           Integer.valueOf(AV62Ttrn09wwds_4_tfbarcod) ,
                                           Integer.valueOf(AV63Ttrn09wwds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV64Ttrn09wwds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV65Ttrn09wwds_7_tfbarcodreo_to) ,
                                           AV67Ttrn09wwds_9_tfbarcodpar_sel ,
                                           AV66Ttrn09wwds_8_tfbarcodpar ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV59Ttrn09wwds_1_filterfulltext ,
                                           Short.valueOf(A13786GuiFasMaxL) ,
                                           Short.valueOf(AV68Ttrn09wwds_10_tfguifasmaxlin) ,
                                           Short.valueOf(AV69Ttrn09wwds_11_tfguifasmaxlin_to) } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV59Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV59Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV59Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV59Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV59Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV66Ttrn09wwds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV66Ttrn09wwds_8_tfbarcodpar), 1, "%") ;
      /* Using cursor P08FE3 */
      pr_default.execute(0, new Object[] {AV59Ttrn09wwds_1_filterfulltext, lV59Ttrn09wwds_1_filterfulltext, lV59Ttrn09wwds_1_filterfulltext, lV59Ttrn09wwds_1_filterfulltext, lV59Ttrn09wwds_1_filterfulltext, lV59Ttrn09wwds_1_filterfulltext, Short.valueOf(AV68Ttrn09wwds_10_tfguifasmaxlin), Short.valueOf(AV68Ttrn09wwds_10_tfguifasmaxlin), Short.valueOf(AV69Ttrn09wwds_11_tfguifasmaxlin_to), Short.valueOf(AV69Ttrn09wwds_11_tfguifasmaxlin_to), Long.valueOf(AV60Ttrn09wwds_2_tfalbprocod), Long.valueOf(AV61Ttrn09wwds_3_tfalbprocod_to), Integer.valueOf(AV62Ttrn09wwds_4_tfbarcod), Integer.valueOf(AV63Ttrn09wwds_5_tfbarcod_to), Byte.valueOf(AV64Ttrn09wwds_6_tfbarcodreo), Byte.valueOf(AV65Ttrn09wwds_7_tfbarcodreo_to), lV66Ttrn09wwds_8_tfbarcodpar, AV67Ttrn09wwds_9_tfbarcodpar_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08FE3_A396EmprCod[0] ;
         A130BarCodPar = P08FE3_A130BarCodPar[0] ;
         A132BarCodReo = P08FE3_A132BarCodReo[0] ;
         A129BarCod = P08FE3_A129BarCod[0] ;
         A30AlbProCod = P08FE3_A30AlbProCod[0] ;
         A1248GuiFasULin = P08FE3_A1248GuiFasULin[0] ;
         A13786GuiFasMaxL = P08FE3_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08FE3_n13786GuiFasMaxL[0] ;
         A13786GuiFasMaxL = P08FE3_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08FE3_n13786GuiFasMaxL[0] ;
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
            AV14TextFileLine += GXutil.str( A30AlbProCod, 10, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A129BarCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A132BarCodReo, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A130BarCodPar, ";", ","), GXv_char3) ;
            ttrn09wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13786GuiFasMaxL, 4, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TTrn09WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProCod", "", "Numero Albaran Produccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarCod", "", "Codigo Barcada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarCodReo", "", "Codigo Reoperado Barcada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarCodPar", "", "Codigo Particion Barcada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GuiFasMaxLin", "", "Línea Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTrn09WWColumnsSelector", GXv_char3) ;
      ttrn09wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTrn09WWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn09WWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV19Session.getValue("TTrn09WWGridState"), null, null);
      }
      AV28OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV53FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV45TFAlbProCod = GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV46TFAlbProCod_To = GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV47TFBarCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFBarCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV49TFBarCodReo = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFBarCodReo_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV51TFBarCodPar = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV52TFBarCodPar_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASMAXLIN") == 0 )
         {
            AV54TFGuiFasMaxLin = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFGuiFasMaxLin_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV70GXV1 = (int)(AV70GXV1+1) ;
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
      A130BarCodPar = "" ;
      AV59Ttrn09wwds_1_filterfulltext = "" ;
      AV53FilterFullText = "" ;
      AV66Ttrn09wwds_8_tfbarcodpar = "" ;
      AV51TFBarCodPar = "" ;
      AV67Ttrn09wwds_9_tfbarcodpar_sel = "" ;
      AV52TFBarCodPar_Sel = "" ;
      lV59Ttrn09wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV66Ttrn09wwds_8_tfbarcodpar = "" ;
      P08FE3_A396EmprCod = new String[] {""} ;
      P08FE3_A130BarCodPar = new String[] {""} ;
      P08FE3_A132BarCodReo = new byte[1] ;
      P08FE3_A129BarCod = new int[1] ;
      P08FE3_A30AlbProCod = new long[1] ;
      P08FE3_A1248GuiFasULin = new short[1] ;
      P08FE3_A13786GuiFasMaxL = new short[1] ;
      P08FE3_n13786GuiFasMaxL = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn09wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08FE3_A396EmprCod, P08FE3_A130BarCodPar, P08FE3_A132BarCodReo, P08FE3_A129BarCod, P08FE3_A30AlbProCod, P08FE3_A1248GuiFasULin, P08FE3_A13786GuiFasMaxL, P08FE3_n13786GuiFasMaxL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV64Ttrn09wwds_6_tfbarcodreo ;
   private byte AV49TFBarCodReo ;
   private byte AV65Ttrn09wwds_7_tfbarcodreo_to ;
   private byte AV50TFBarCodReo_To ;
   private short gxcookieaux ;
   private short A13786GuiFasMaxL ;
   private short AV68Ttrn09wwds_10_tfguifasmaxlin ;
   private short AV54TFGuiFasMaxLin ;
   private short AV69Ttrn09wwds_11_tfguifasmaxlin_to ;
   private short AV55TFGuiFasMaxLin_To ;
   private short AV28OrderedBy ;
   private short A1248GuiFasULin ;
   private short Gx_err ;
   private int AV13Random ;
   private int A129BarCod ;
   private int AV62Ttrn09wwds_4_tfbarcod ;
   private int AV47TFBarCod ;
   private int AV63Ttrn09wwds_5_tfbarcod_to ;
   private int AV48TFBarCod_To ;
   private int AV70GXV1 ;
   private long A30AlbProCod ;
   private long AV60Ttrn09wwds_2_tfalbprocod ;
   private long AV45TFAlbProCod ;
   private long AV61Ttrn09wwds_3_tfalbprocod_to ;
   private long AV46TFAlbProCod_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A130BarCodPar ;
   private String AV66Ttrn09wwds_8_tfbarcodpar ;
   private String AV51TFBarCodPar ;
   private String AV67Ttrn09wwds_9_tfbarcodpar_sel ;
   private String AV52TFBarCodPar_Sel ;
   private String scmdbuf ;
   private String lV66Ttrn09wwds_8_tfbarcodpar ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n13786GuiFasMaxL ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV59Ttrn09wwds_1_filterfulltext ;
   private String AV53FilterFullText ;
   private String lV59Ttrn09wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08FE3_A396EmprCod ;
   private String[] P08FE3_A130BarCodPar ;
   private byte[] P08FE3_A132BarCodReo ;
   private int[] P08FE3_A129BarCod ;
   private long[] P08FE3_A30AlbProCod ;
   private short[] P08FE3_A1248GuiFasULin ;
   private short[] P08FE3_A13786GuiFasMaxL ;
   private boolean[] P08FE3_n13786GuiFasMaxL ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class ttrn09wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV60Ttrn09wwds_2_tfalbprocod ,
                                          long AV61Ttrn09wwds_3_tfalbprocod_to ,
                                          int AV62Ttrn09wwds_4_tfbarcod ,
                                          int AV63Ttrn09wwds_5_tfbarcod_to ,
                                          byte AV64Ttrn09wwds_6_tfbarcodreo ,
                                          byte AV65Ttrn09wwds_7_tfbarcodreo_to ,
                                          String AV67Ttrn09wwds_9_tfbarcodpar_sel ,
                                          String AV66Ttrn09wwds_8_tfbarcodpar ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV59Ttrn09wwds_1_filterfulltext ,
                                          short A13786GuiFasMaxL ,
                                          short AV68Ttrn09wwds_10_tfguifasmaxlin ,
                                          short AV69Ttrn09wwds_11_tfguifasmaxlin_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.GuiFasULin, COALESCE( T2.GuiFasMaxL, 0) AS GuiFasMaxL FROM (TXPALBBAR T1 LEFT JOIN (SELECT" ;
      scmdbuf += " MAX(GuiFasLin) AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.AlbProCod,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.GuiFasMaxL, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.GuiFasMaxL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.GuiFasMaxL, 0) <= ?))");
      if ( ! (0==AV60Ttrn09wwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Ttrn09wwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Ttrn09wwds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Ttrn09wwds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Ttrn09wwds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Ttrn09wwds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ttrn09wwds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV66Ttrn09wwds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ttrn09wwds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.GuiFasULin" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
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
                  return conditional_P08FE3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

