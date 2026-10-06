package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wc_repuestocompatibleexportcsv_impl extends GXWebProcedure
{
   public wc_repuestocompatibleexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WC_RepuestoCompatibleExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.WC_RepuestoCompatibleColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("MantenimientoMaquina.WC_RepuestoCompatibleColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Compatible", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Compatible", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV44Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod = AV28EmprCod ;
      AV45Mantenimientomaquina_wc_repuestocompatibleds_2_mrpricod = AV29MRPriCod ;
      AV46Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom = AV40MRPriNom ;
      AV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext = AV32FilterFullText ;
      AV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom = AV36TFMRComNom ;
      AV49Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel = AV37TFMRComNom_Sel ;
      AV50Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod = AV38TFMRComCod ;
      AV51Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to = AV39TFMRComCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext ,
                                           AV49Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel ,
                                           AV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom ,
                                           Integer.valueOf(AV50Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod) ,
                                           Integer.valueOf(AV51Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to) ,
                                           A1064MRComNom ,
                                           Integer.valueOf(A1063MRComCod) ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           A1062MRPriNom ,
                                           AV46Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom ,
                                           AV44Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod ,
                                           Integer.valueOf(AV45Mantenimientomaquina_wc_repuestocompatibleds_2_mrpricod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A1061MRPriCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext), "%", "") ;
      lV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext), "%", "") ;
      lV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom = GXutil.padr( GXutil.rtrim( AV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom), 100, "%") ;
      /* Using cursor P08VU2 */
      pr_default.execute(0, new Object[] {AV44Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod, Integer.valueOf(AV45Mantenimientomaquina_wc_repuestocompatibleds_2_mrpricod), AV46Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom, lV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext, lV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext, lV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom, AV49Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel, Integer.valueOf(AV50Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod), Integer.valueOf(AV51Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1063MRComCod = P08VU2_A1063MRComCod[0] ;
         A1064MRComNom = P08VU2_A1064MRComNom[0] ;
         n1064MRComNom = P08VU2_n1064MRComNom[0] ;
         A1062MRPriNom = P08VU2_A1062MRPriNom[0] ;
         n1062MRPriNom = P08VU2_n1062MRPriNom[0] ;
         A1061MRPriCod = P08VU2_A1061MRPriCod[0] ;
         A396EmprCod = P08VU2_A396EmprCod[0] ;
         A1062MRPriNom = P08VU2_A1062MRPriNom[0] ;
         n1062MRPriNom = P08VU2_n1062MRPriNom[0] ;
         A1064MRComNom = P08VU2_A1064MRComNom[0] ;
         n1064MRComNom = P08VU2_n1064MRComNom[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1064MRComNom, ";", ","), GXv_char3) ;
            wc_repuestocompatibleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1063MRComCod, 8, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WC_RepuestoCompatibleExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRComNom", "", "Nombre Compatible", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MRComCod", "", "Compatible", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.WC_RepuestoCompatibleColumnsSelector", GXv_char3) ;
      wc_repuestocompatibleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.WC_RepuestoCompatibleGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WC_RepuestoCompatibleGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV19Session.getValue("MantenimientoMaquina.WC_RepuestoCompatibleGridState"), null, null);
      }
      AV30OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMNOM") == 0 )
         {
            AV36TFMRComNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMNOM_SEL") == 0 )
         {
            AV37TFMRComNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMCOD") == 0 )
         {
            AV38TFMRComCod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFMRComCod_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28EmprCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRPRICOD") == 0 )
         {
            AV29MRPriCod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRPRINOM") == 0 )
         {
            AV40MRPriNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
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
      A1064MRComNom = "" ;
      AV44Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod = "" ;
      AV28EmprCod = "" ;
      AV46Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom = "" ;
      AV40MRPriNom = "" ;
      AV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext = "" ;
      AV32FilterFullText = "" ;
      AV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom = "" ;
      AV36TFMRComNom = "" ;
      AV49Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel = "" ;
      AV37TFMRComNom_Sel = "" ;
      scmdbuf = "" ;
      lV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext = "" ;
      lV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom = "" ;
      A1062MRPriNom = "" ;
      A396EmprCod = "" ;
      P08VU2_A1063MRComCod = new int[1] ;
      P08VU2_A1064MRComNom = new String[] {""} ;
      P08VU2_n1064MRComNom = new boolean[] {false} ;
      P08VU2_A1062MRPriNom = new String[] {""} ;
      P08VU2_n1062MRPriNom = new boolean[] {false} ;
      P08VU2_A1061MRPriCod = new int[1] ;
      P08VU2_A396EmprCod = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wc_repuestocompatibleexportcsv__default(),
         new Object[] {
             new Object[] {
            P08VU2_A1063MRComCod, P08VU2_A1064MRComNom, P08VU2_n1064MRComNom, P08VU2_A1062MRPriNom, P08VU2_n1062MRPriNom, P08VU2_A1061MRPriCod, P08VU2_A396EmprCod
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
   private int A1063MRComCod ;
   private int AV45Mantenimientomaquina_wc_repuestocompatibleds_2_mrpricod ;
   private int AV29MRPriCod ;
   private int AV50Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod ;
   private int AV38TFMRComCod ;
   private int AV51Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to ;
   private int AV39TFMRComCod_To ;
   private int A1061MRPriCod ;
   private int AV52GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A1064MRComNom ;
   private String AV44Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod ;
   private String AV28EmprCod ;
   private String AV46Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom ;
   private String AV40MRPriNom ;
   private String AV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom ;
   private String AV36TFMRComNom ;
   private String AV49Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel ;
   private String AV37TFMRComNom_Sel ;
   private String scmdbuf ;
   private String lV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom ;
   private String A1062MRPriNom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private boolean n1064MRComNom ;
   private boolean n1062MRPriNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext ;
   private String AV32FilterFullText ;
   private String lV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P08VU2_A1063MRComCod ;
   private String[] P08VU2_A1064MRComNom ;
   private boolean[] P08VU2_n1064MRComNom ;
   private String[] P08VU2_A1062MRPriNom ;
   private boolean[] P08VU2_n1062MRPriNom ;
   private int[] P08VU2_A1061MRPriCod ;
   private String[] P08VU2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class wc_repuestocompatibleexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext ,
                                          String AV49Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel ,
                                          String AV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom ,
                                          int AV50Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod ,
                                          int AV51Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to ,
                                          String A1064MRComNom ,
                                          int A1063MRComCod ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          String A1062MRPriNom ,
                                          String AV46Mantenimientomaquina_wc_repuestocompatibleds_3_mrprinom ,
                                          String AV44Mantenimientomaquina_wc_repuestocompatibleds_1_emprcod ,
                                          int AV45Mantenimientomaquina_wc_repuestocompatibleds_2_mrpricod ,
                                          String A396EmprCod ,
                                          int A1061MRPriCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[9];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.MRComCod AS MRComCod, T3.MRNom AS MRComNom, T2.MRNom AS MRPriNom, T1.MRPriCod AS MRPriCod, T1.EmprCod FROM ((TXPMRCom1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MRCod = T1.MRPriCod) INNER JOIN TXPMREPUE T3 ON T3.EmprCod = T1.EmprCod AND T3.MRCod = T1.MRComCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRPriCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      if ( ! (GXutil.strcmp("", AV47Mantenimientomaquina_wc_repuestocompatibleds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T3.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRComCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Mantenimientomaquina_wc_repuestocompatibleds_5_tfmrcomnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Mantenimientomaquina_wc_repuestocompatibleds_6_tfmrcomnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MRNom = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV50Mantenimientomaquina_wc_repuestocompatibleds_7_tfmrcomcod) )
      {
         addWhere(sWhereString, "(T1.MRComCod >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV51Mantenimientomaquina_wc_repuestocompatibleds_8_tfmrcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MRComCod <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV30OrderedBy == 1 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRPriCod, T2.MRNom, T3.MRNom" ;
      }
      else if ( ( AV30OrderedBy == 1 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRPriCod DESC, T2.MRNom DESC, T3.MRNom DESC" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRPriCod, T2.MRNom, T1.MRComCod" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRPriCod DESC, T2.MRNom DESC, T1.MRComCod DESC" ;
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
                  return conditional_P08VU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).shortValue() , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[11], 100);
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
                  stmt.setString(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
      }
   }

}

