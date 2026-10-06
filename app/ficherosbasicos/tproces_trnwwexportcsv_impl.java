package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tproces_trnwwexportcsv_impl extends GXWebProcedure
{
   public tproces_trnwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TProces_TRNWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TProces_TRNWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FicherosBasicos.TProces_TRNWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion (cont)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext = AV30FilterFullText ;
      AV63Ficherosbasicos_tproces_trnwwds_2_tfprocod = AV36TFProCod ;
      AV64Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel = AV37TFProCod_Sel ;
      AV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc = AV38TFProDsc ;
      AV66Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel = AV39TFProDsc_Sel ;
      AV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = AV40TFProDsc2 ;
      AV68Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel = AV41TFProDsc2_Sel ;
      AV69Ficherosbasicos_tproces_trnwwds_8_tfproest_sels = AV45TFProEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14284ProEst ,
                                           AV69Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ,
                                           AV64Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ,
                                           AV63Ficherosbasicos_tproces_trnwwds_2_tfprocod ,
                                           AV66Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ,
                                           AV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc ,
                                           AV68Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ,
                                           AV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ,
                                           Integer.valueOf(AV69Ficherosbasicos_tproces_trnwwds_8_tfproest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV63Ficherosbasicos_tproces_trnwwds_2_tfprocod = GXutil.padr( GXutil.rtrim( AV63Ficherosbasicos_tproces_trnwwds_2_tfprocod), 8, "%") ;
      lV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc), 40, "%") ;
      lV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2), 100, "%") ;
      /* Using cursor P0A9N2 */
      pr_default.execute(0, new Object[] {lV63Ficherosbasicos_tproces_trnwwds_2_tfprocod, AV64Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel, lV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc, AV66Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel, lV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2, AV68Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4628ProDsc2 = P0A9N2_A4628ProDsc2[0] ;
         A759ProDsc = P0A9N2_A759ProDsc[0] ;
         A758ProCod = P0A9N2_A758ProCod[0] ;
         A14284ProEst = P0A9N2_A14284ProEst[0] ;
         A396EmprCod = P0A9N2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactivo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "I", "")) == 0 ) ) ) )
         {
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
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A758ProCod, ";", ","), GXv_char3) ;
               tproces_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A759ProDsc, ";", ","), GXv_char3) ;
               tproces_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4628ProDsc2, ";", ","), GXv_char3) ;
               tproces_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A14284ProEst), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Activo", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A14284ProEst), "I") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Inactivo", "") ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TProces_TRNWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProCod", "", "Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProDsc2", "", "Descripcion (cont)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProEst", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FicherosBasicos.TProces_TRNWWColumnsSelector", GXv_char3) ;
      tproces_trnwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FicherosBasicos.TProces_TRNWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TProces_TRNWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("FicherosBasicos.TProces_TRNWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV36TFProCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV37TFProCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV38TFProDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV39TFProDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2") == 0 )
         {
            AV40TFProDsc2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2_SEL") == 0 )
         {
            AV41TFProDsc2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEST_SEL") == 0 )
         {
            AV44TFProEst_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV45TFProEst_Sels.fromJSonString(AV44TFProEst_SelsJson, null);
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
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      A14284ProEst = "" ;
      AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV63Ficherosbasicos_tproces_trnwwds_2_tfprocod = "" ;
      AV36TFProCod = "" ;
      AV64Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel = "" ;
      AV37TFProCod_Sel = "" ;
      AV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc = "" ;
      AV38TFProDsc = "" ;
      AV66Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel = "" ;
      AV39TFProDsc_Sel = "" ;
      AV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = "" ;
      AV40TFProDsc2 = "" ;
      AV68Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel = "" ;
      AV41TFProDsc2_Sel = "" ;
      AV69Ficherosbasicos_tproces_trnwwds_8_tfproest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV45TFProEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV63Ficherosbasicos_tproces_trnwwds_2_tfprocod = "" ;
      lV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc = "" ;
      lV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 = "" ;
      P0A9N2_A4628ProDsc2 = new String[] {""} ;
      P0A9N2_A759ProDsc = new String[] {""} ;
      P0A9N2_A758ProCod = new String[] {""} ;
      P0A9N2_A14284ProEst = new String[] {""} ;
      P0A9N2_A396EmprCod = new String[] {""} ;
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
      AV44TFProEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_trnwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0A9N2_A4628ProDsc2, P0A9N2_A759ProDsc, P0A9N2_A758ProCod, P0A9N2_A14284ProEst, P0A9N2_A396EmprCod
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
   private int AV69Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size ;
   private int AV70GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A4628ProDsc2 ;
   private String A14284ProEst ;
   private String AV63Ficherosbasicos_tproces_trnwwds_2_tfprocod ;
   private String AV36TFProCod ;
   private String AV64Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ;
   private String AV37TFProCod_Sel ;
   private String AV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc ;
   private String AV38TFProDsc ;
   private String AV66Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ;
   private String AV39TFProDsc_Sel ;
   private String AV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ;
   private String AV40TFProDsc2 ;
   private String AV68Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ;
   private String AV41TFProDsc2_Sel ;
   private String scmdbuf ;
   private String lV63Ficherosbasicos_tproces_trnwwds_2_tfprocod ;
   private String lV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc ;
   private String lV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV44TFProEst_SelsJson ;
   private String AV11Filename ;
   private String AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9N2_A4628ProDsc2 ;
   private String[] P0A9N2_A759ProDsc ;
   private String[] P0A9N2_A758ProCod ;
   private String[] P0A9N2_A14284ProEst ;
   private String[] P0A9N2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV69Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ;
   private GXSimpleCollection<String> AV45TFProEst_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class tproces_trnwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14284ProEst ,
                                          GXSimpleCollection<String> AV69Ficherosbasicos_tproces_trnwwds_8_tfproest_sels ,
                                          String AV64Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel ,
                                          String AV63Ficherosbasicos_tproces_trnwwds_2_tfprocod ,
                                          String AV66Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel ,
                                          String AV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc ,
                                          String AV68Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel ,
                                          String AV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2 ,
                                          int AV69Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV62Ficherosbasicos_tproces_trnwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[6];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ProDsc2, ProDsc, ProCod, ProEst, EmprCod FROM TXPPROCES" ;
      if ( (GXutil.strcmp("", AV64Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Ficherosbasicos_tproces_trnwwds_2_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Ficherosbasicos_tproces_trnwwds_3_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tproces_trnwwds_4_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tproces_trnwwds_5_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tproces_trnwwds_6_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tproces_trnwwds_7_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( AV69Ficherosbasicos_tproces_trnwwds_8_tfproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Ficherosbasicos_tproces_trnwwds_8_tfproest_sels, "ProEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProDsc2" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProDsc2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProEst" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProEst DESC" ;
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
                  return conditional_P0A9N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[6], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 40);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 100);
               }
               return;
      }
   }

}

