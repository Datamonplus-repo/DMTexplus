package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipentwwexport extends GXProcedure
{
   public ttipentwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipentwwexport.class ), "" );
   }

   public ttipentwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ttipentwwexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      ttipentwwexport.this.aP0 = aP0;
      ttipentwwexport.this.aP1 = aP1;
      initialize();
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
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "TTIPENTWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      ttipentwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53FilterFullText, GXv_char5) ;
      ttipentwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV48TFTipEntCod) && (0==AV49TFTipEntCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipentwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFTipEntCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipentwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFTipEntCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFTipEntNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipentwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFTipEntNom_Sel, GXv_char5) ;
         ttipentwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFTipEntNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttipentwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFTipEntNom, GXv_char5) ;
            ttipentwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV45VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV33Session.getValue("TTIPENTWWColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV33Session.getValue("TTIPENTWWColumnsSelector") ;
         AV37ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV56GXV1 = 1 ;
      while ( AV56GXV1 <= AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV39ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV56GXV1));
         if ( AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setColor( 11 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         AV56GXV1 = (int)(AV56GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV58Ttipentwwds_1_filterfulltext = AV53FilterFullText ;
      AV59Ttipentwwds_2_tftipentcod = AV48TFTipEntCod ;
      AV60Ttipentwwds_3_tftipentcod_to = AV49TFTipEntCod_To ;
      AV61Ttipentwwds_4_tftipentnom = AV50TFTipEntNom ;
      AV62Ttipentwwds_5_tftipentnom_sel = AV51TFTipEntNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Ttipentwwds_1_filterfulltext ,
                                           Short.valueOf(AV59Ttipentwwds_2_tftipentcod) ,
                                           Short.valueOf(AV60Ttipentwwds_3_tftipentcod_to) ,
                                           AV62Ttipentwwds_5_tftipentnom_sel ,
                                           AV61Ttipentwwds_4_tftipentnom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV58Ttipentwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ttipentwwds_1_filterfulltext), "%", "") ;
      lV58Ttipentwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ttipentwwds_1_filterfulltext), "%", "") ;
      lV61Ttipentwwds_4_tftipentnom = GXutil.padr( GXutil.rtrim( AV61Ttipentwwds_4_tftipentnom), 25, "%") ;
      /* Using cursor P07Y42 */
      pr_default.execute(0, new Object[] {lV58Ttipentwwds_1_filterfulltext, lV58Ttipentwwds_1_filterfulltext, Short.valueOf(AV59Ttipentwwds_2_tftipentcod), Short.valueOf(AV60Ttipentwwds_3_tftipentcod_to), lV61Ttipentwwds_4_tftipentnom, AV62Ttipentwwds_5_tftipentnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1212TipEntNom = P07Y42_A1212TipEntNom[0] ;
         n1212TipEntNom = P07Y42_n1212TipEntNom[0] ;
         A1211TipEntCod = P07Y42_A1211TipEntCod[0] ;
         A396EmprCod = P07Y42_A396EmprCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV45VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A1211TipEntCod );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1212TipEntNom, GXv_char5) ;
            ttipentwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV37ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipEntCod", "", "Tipo Entrada", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipEntNom", "", "Descripcion", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV41UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTIPENTWWColumnsSelector", GXv_char5) ;
      ttipentwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV41UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV41UserCustomValue)==0) ) )
      {
         AV38ColumnsSelectorAux.fromxml(AV41UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV38ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV38ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("TTIPENTWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTIPENTWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("TTIPENTWWGridState"), null, null);
      }
      AV16OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV63GXV2 = 1 ;
      while ( AV63GXV2 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV2));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV53FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTCOD") == 0 )
         {
            AV48TFTipEntCod = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFTipEntCod_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV50TFTipEntNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV51TFTipEntNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV63GXV2 = (int)(AV63GXV2+1) ;
      }
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = ttipentwwexport.this.AV11Filename;
      this.aP1[0] = ttipentwwexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV53FilterFullText = "" ;
      AV51TFTipEntNom_Sel = "" ;
      AV50TFTipEntNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV33Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      AV37ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A1212TipEntNom = "" ;
      AV58Ttipentwwds_1_filterfulltext = "" ;
      AV61Ttipentwwds_4_tftipentnom = "" ;
      AV62Ttipentwwds_5_tftipentnom_sel = "" ;
      scmdbuf = "" ;
      lV58Ttipentwwds_1_filterfulltext = "" ;
      lV61Ttipentwwds_4_tftipentnom = "" ;
      P07Y42_A1212TipEntNom = new String[] {""} ;
      P07Y42_n1212TipEntNom = new boolean[] {false} ;
      P07Y42_A1211TipEntCod = new short[1] ;
      P07Y42_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV41UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV38ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttipentwwexport__default(),
         new Object[] {
             new Object[] {
            P07Y42_A1212TipEntNom, P07Y42_n1212TipEntNom, P07Y42_A1211TipEntCod, P07Y42_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV48TFTipEntCod ;
   private short AV49TFTipEntCod_To ;
   private short GXv_int3[] ;
   private short A1211TipEntCod ;
   private short AV59Ttipentwwds_2_tftipentcod ;
   private short AV60Ttipentwwds_3_tftipentcod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV56GXV1 ;
   private int AV63GXV2 ;
   private long AV45VisibleColumnCount ;
   private String AV51TFTipEntNom_Sel ;
   private String AV50TFTipEntNom ;
   private String A1212TipEntNom ;
   private String AV61Ttipentwwds_4_tftipentnom ;
   private String AV62Ttipentwwds_5_tftipentnom_sel ;
   private String scmdbuf ;
   private String lV61Ttipentwwds_4_tftipentnom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n1212TipEntNom ;
   private String AV40ColumnsSelectorXML ;
   private String AV41UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV53FilterFullText ;
   private String AV58Ttipentwwds_1_filterfulltext ;
   private String lV58Ttipentwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07Y42_A1212TipEntNom ;
   private boolean[] P07Y42_n1212TipEntNom ;
   private short[] P07Y42_A1211TipEntCod ;
   private String[] P07Y42_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV38ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV39ColumnsSelector_Column ;
}

final  class ttipentwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07Y42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Ttipentwwds_1_filterfulltext ,
                                          short AV59Ttipentwwds_2_tftipentcod ,
                                          short AV60Ttipentwwds_3_tftipentcod_to ,
                                          String AV62Ttipentwwds_5_tftipentnom_sel ,
                                          String AV61Ttipentwwds_4_tftipentnom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[6];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT TipEntNom, TipEntCod, EmprCod FROM TXPENTRAD" ;
      if ( ! (GXutil.strcmp("", AV58Ttipentwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TipEntCod,'9990'), 2) like '%' || ?) or ( UPPER(TipEntNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV59Ttipentwwds_2_tftipentcod) )
      {
         addWhere(sWhereString, "(TipEntCod >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV60Ttipentwwds_3_tftipentcod_to) )
      {
         addWhere(sWhereString, "(TipEntCod <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Ttipentwwds_5_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Ttipentwwds_4_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Ttipentwwds_5_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(TipEntNom = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipEntCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipEntCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipEntNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipEntNom DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P07Y42(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Boolean) dynConstraints[8]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07Y42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
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
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 25);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 25);
               }
               return;
      }
   }

}

