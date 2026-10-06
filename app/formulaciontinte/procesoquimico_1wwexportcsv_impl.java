package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesoquimico_1wwexportcsv_impl extends GXWebProcedure
{
   public procesoquimico_1wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ProcesoQuimico_1WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ProcesoQuimico_1WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ProcesoQuimico_1WWColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion (large)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Activo?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = AV30FilterFullText ;
      AV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod = AV34TFProForCod ;
      AV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc = AV36TFProForDsc ;
      AV47Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel = AV37TFProForDsc_Sel ;
      AV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 = AV38TFProForDsc2 ;
      AV49Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel = AV39TFProForDsc2_Sel ;
      AV50Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel = AV40TFProForAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext ,
                                           AV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod ,
                                           AV35TFProForCod_Sel ,
                                           AV47Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel ,
                                           AV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc ,
                                           AV49Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel ,
                                           AV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 ,
                                           AV50Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A4715ProForDsc2 ,
                                           A13133ProForAct ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext), "%", "") ;
      lV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod), 6, "%") ;
      lV35TFProForCod_Sel = GXutil.padr( GXutil.rtrim( AV35TFProForCod_Sel), 6, "%") ;
      lV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc), 30, "%") ;
      lV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2), 40, "%") ;
      /* Using cursor P09TD2 */
      pr_default.execute(0, new Object[] {lV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext, lV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext, lV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext, lV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod, lV35TFProForCod_Sel, lV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc, AV47Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel, lV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2, AV49Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel, AV50Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P09TD2_A764ProForCod[0] ;
         A13133ProForAct = P09TD2_A13133ProForAct[0] ;
         A4715ProForDsc2 = P09TD2_A4715ProForDsc2[0] ;
         A766ProForDsc = P09TD2_A766ProForDsc[0] ;
         A396EmprCod = P09TD2_A396EmprCod[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A764ProForCod, ";", ","), GXv_char3) ;
            procesoquimico_1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A766ProForDsc, ";", ","), GXv_char3) ;
            procesoquimico_1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4715ProForDsc2, ";", ","), GXv_char3) ;
            procesoquimico_1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13133ProForAct, ";", ","), GXv_char3) ;
            procesoquimico_1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ProcesoQuimico_1WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForCod", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForDsc2", "", "Descripcion (large)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForAct", "", "Activo?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ProcesoQuimico_1WWColumnsSelector", GXv_char3) ;
      procesoquimico_1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ProcesoQuimico_1WWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProcesoQuimico_1WWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("FormulacionTinte.ProcesoQuimico_1WWGridState"), null, null);
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
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV34TFProForCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV36TFProForDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV37TFProForDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC2") == 0 )
         {
            AV38TFProForDsc2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC2_SEL") == 0 )
         {
            AV39TFProForDsc2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORACT_SEL") == 0 )
         {
            AV40TFProForAct_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      A13133ProForAct = "" ;
      AV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod = "" ;
      AV34TFProForCod = "" ;
      AV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc = "" ;
      AV36TFProForDsc = "" ;
      AV47Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel = "" ;
      AV37TFProForDsc_Sel = "" ;
      AV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 = "" ;
      AV38TFProForDsc2 = "" ;
      AV49Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel = "" ;
      AV39TFProForDsc2_Sel = "" ;
      AV50Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel = "" ;
      AV40TFProForAct_Sel = "" ;
      scmdbuf = "" ;
      lV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = "" ;
      lV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod = "" ;
      lV35TFProForCod_Sel = "" ;
      lV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc = "" ;
      lV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 = "" ;
      AV35TFProForCod_Sel = "" ;
      P09TD2_A764ProForCod = new String[] {""} ;
      P09TD2_A13133ProForAct = new String[] {""} ;
      P09TD2_A4715ProForDsc2 = new String[] {""} ;
      P09TD2_A766ProForDsc = new String[] {""} ;
      P09TD2_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_1wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09TD2_A764ProForCod, P09TD2_A13133ProForAct, P09TD2_A4715ProForDsc2, P09TD2_A766ProForDsc, P09TD2_A396EmprCod
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
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A4715ProForDsc2 ;
   private String A13133ProForAct ;
   private String AV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod ;
   private String AV34TFProForCod ;
   private String AV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc ;
   private String AV36TFProForDsc ;
   private String AV47Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel ;
   private String AV37TFProForDsc_Sel ;
   private String AV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 ;
   private String AV38TFProForDsc2 ;
   private String AV49Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel ;
   private String AV39TFProForDsc2_Sel ;
   private String AV50Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel ;
   private String AV40TFProForAct_Sel ;
   private String scmdbuf ;
   private String lV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod ;
   private String lV35TFProForCod_Sel ;
   private String lV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc ;
   private String lV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 ;
   private String AV35TFProForCod_Sel ;
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
   private String AV11Filename ;
   private String AV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09TD2_A764ProForCod ;
   private String[] P09TD2_A13133ProForAct ;
   private String[] P09TD2_A4715ProForDsc2 ;
   private String[] P09TD2_A766ProForDsc ;
   private String[] P09TD2_A396EmprCod ;
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

final  class procesoquimico_1wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09TD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext ,
                                          String AV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod ,
                                          String AV35TFProForCod_Sel ,
                                          String AV47Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel ,
                                          String AV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc ,
                                          String AV49Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel ,
                                          String AV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 ,
                                          String AV50Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A4715ProForDsc2 ,
                                          String A13133ProForAct ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[10];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ProForCod, ProForAct, ProForDsc2, ProForDsc, EmprCod FROM TXPCPROFO" ;
      if ( ! (GXutil.strcmp("", AV44Formulaciontinte_procesoquimico_1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForDsc2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Formulaciontinte_procesoquimico_1wwds_2_tfproforcod)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(ProForCod))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFProForCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(ProForCod))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc2 = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel)==0) )
      {
         addWhere(sWhereString, "(ProForAct = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForDsc" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForDsc2" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForDsc2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForAct" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForAct DESC" ;
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
                  return conditional_P09TD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09TD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
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
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               return;
      }
   }

}

