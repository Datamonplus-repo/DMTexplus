package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcdupfasesexport extends GXProcedure
{
   public wcdupfasesexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdupfasesexport.class ), "" );
   }

   public wcdupfasesexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcdupfasesexport.this.aP1 = new String[] {""};
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
      wcdupfasesexport.this.aP0 = aP0;
      wcdupfasesexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCDupFasesExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcdupfasesexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56FilterFullText, GXv_char5) ;
      wcdupfasesexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV54TFMaqFDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdupfasesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFMaqFDsc_Sel, GXv_char5) ;
         wcdupfasesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFMaqFDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcdupfasesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFMaqFDsc, GXv_char5) ;
            wcdupfasesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV58TFMaqFFind_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdupfasesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFMaqFFind_Sel, GXv_char5) ;
         wcdupfasesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFMaqFFind)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcdupfasesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFMaqFFind, GXv_char5) ;
            wcdupfasesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV44VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV32Session.getValue("WCDupFasesColumnsSelector"), "") != 0 )
      {
         AV39ColumnsSelectorXML = AV32Session.getValue("WCDupFasesColumnsSelector") ;
         AV36ColumnsSelector.fromxml(AV39ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV38ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV62GXV1));
         if ( AV38ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV44VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV38ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV38ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV38ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV44VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV44VisibleColumnCount), 1, 1).setColor( 11 );
            AV44VisibleColumnCount = (long)(AV44VisibleColumnCount+1) ;
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV64Wcdupfasesds_1_filterfulltext = AV56FilterFullText ;
      AV65Wcdupfasesds_2_tfmaqfdsc = AV53TFMaqFDsc ;
      AV66Wcdupfasesds_3_tfmaqfdsc_sel = AV54TFMaqFDsc_Sel ;
      AV67Wcdupfasesds_4_tfmaqffind = AV57TFMaqFFind ;
      AV68Wcdupfasesds_5_tfmaqffind_sel = AV58TFMaqFFind_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV66Wcdupfasesds_3_tfmaqfdsc_sel ,
                                           AV65Wcdupfasesds_2_tfmaqfdsc ,
                                           A1143MaqFDsc ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV64Wcdupfasesds_1_filterfulltext ,
                                           A1144MaqFFind ,
                                           AV68Wcdupfasesds_5_tfmaqffind_sel ,
                                           AV67Wcdupfasesds_4_tfmaqffind ,
                                           AV16EmprCod ,
                                           AV17MaqCod ,
                                           A396EmprCod ,
                                           A602MaqCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Wcdupfasesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcdupfasesds_1_filterfulltext), "%", "") ;
      lV64Wcdupfasesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcdupfasesds_1_filterfulltext), "%", "") ;
      lV67Wcdupfasesds_4_tfmaqffind = GXutil.padr( GXutil.rtrim( AV67Wcdupfasesds_4_tfmaqffind), 8, "%") ;
      lV65Wcdupfasesds_2_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV65Wcdupfasesds_2_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08CP2 */
      pr_default.execute(0, new Object[] {AV16EmprCod, AV17MaqCod, AV64Wcdupfasesds_1_filterfulltext, lV64Wcdupfasesds_1_filterfulltext, lV64Wcdupfasesds_1_filterfulltext, AV68Wcdupfasesds_5_tfmaqffind_sel, AV67Wcdupfasesds_4_tfmaqffind, lV67Wcdupfasesds_4_tfmaqffind, AV68Wcdupfasesds_5_tfmaqffind_sel, AV68Wcdupfasesds_5_tfmaqffind_sel, lV65Wcdupfasesds_2_tfmaqfdsc, AV66Wcdupfasesds_3_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1142MaqFCod = P08CP2_A1142MaqFCod[0] ;
         A602MaqCod = P08CP2_A602MaqCod[0] ;
         A396EmprCod = P08CP2_A396EmprCod[0] ;
         A1143MaqFDsc = P08CP2_A1143MaqFDsc[0] ;
         A1144MaqFFind = P08CP2_A1144MaqFFind[0] ;
         n1144MaqFFind = P08CP2_n1144MaqFFind[0] ;
         A1144MaqFFind = P08CP2_A1144MaqFFind[0] ;
         n1144MaqFFind = P08CP2_n1144MaqFFind[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV44VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1143MaqFDsc, GXv_char5) ;
            wcdupfasesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV44VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV44VisibleColumnCount = (long)(AV44VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1144MaqFFind, GXv_char5) ;
            wcdupfasesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV44VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV44VisibleColumnCount = (long)(AV44VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
      AV36ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqFDsc", "", "Descripcion", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqFFind", "", "Fase", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV40UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCDupFasesColumnsSelector", GXv_char5) ;
      wcdupfasesexport.this.GXt_char4 = GXv_char5[0] ;
      AV40UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV40UserCustomValue)==0) ) )
      {
         AV37ColumnsSelectorAux.fromxml(AV40UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV36ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV37ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV36ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue("WCDupFasesGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCDupFasesGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV32Session.getValue("WCDupFasesGridState"), null, null);
      }
      AV18OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV19OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV69GXV2 = 1 ;
      while ( AV69GXV2 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV2));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV56FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFDSC") == 0 )
         {
            AV53TFMaqFDsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFDSC_SEL") == 0 )
         {
            AV54TFMaqFDsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFFIND") == 0 )
         {
            AV57TFMaqFFind = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFFIND_SEL") == 0 )
         {
            AV58TFMaqFFind_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16EmprCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV17MaqCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV69GXV2 = (int)(AV69GXV2+1) ;
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
      this.aP0[0] = wcdupfasesexport.this.AV11Filename;
      this.aP1[0] = wcdupfasesexport.this.AV12ErrorMessage;
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
      AV56FilterFullText = "" ;
      AV54TFMaqFDsc_Sel = "" ;
      AV53TFMaqFDsc = "" ;
      AV58TFMaqFFind_Sel = "" ;
      AV57TFMaqFFind = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV32Session = httpContext.getWebSession();
      AV39ColumnsSelectorXML = "" ;
      AV36ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV38ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A1143MaqFDsc = "" ;
      A1144MaqFFind = "" ;
      AV64Wcdupfasesds_1_filterfulltext = "" ;
      AV65Wcdupfasesds_2_tfmaqfdsc = "" ;
      AV66Wcdupfasesds_3_tfmaqfdsc_sel = "" ;
      AV67Wcdupfasesds_4_tfmaqffind = "" ;
      AV68Wcdupfasesds_5_tfmaqffind_sel = "" ;
      lV64Wcdupfasesds_1_filterfulltext = "" ;
      lV67Wcdupfasesds_4_tfmaqffind = "" ;
      scmdbuf = "" ;
      lV65Wcdupfasesds_2_tfmaqfdsc = "" ;
      AV16EmprCod = "" ;
      AV17MaqCod = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P08CP2_A457FasCod = new String[] {""} ;
      P08CP2_A1142MaqFCod = new String[] {""} ;
      P08CP2_A602MaqCod = new String[] {""} ;
      P08CP2_A396EmprCod = new String[] {""} ;
      P08CP2_A1143MaqFDsc = new String[] {""} ;
      P08CP2_A1144MaqFFind = new String[] {""} ;
      P08CP2_n1144MaqFFind = new boolean[] {false} ;
      A1142MaqFCod = "" ;
      AV40UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV37ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdupfasesexport__default(),
         new Object[] {
             new Object[] {
            P08CP2_A457FasCod, P08CP2_A1142MaqFCod, P08CP2_A602MaqCod, P08CP2_A396EmprCod, P08CP2_A1143MaqFDsc, P08CP2_A1144MaqFFind, P08CP2_n1144MaqFFind
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV18OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV62GXV1 ;
   private int AV69GXV2 ;
   private long AV44VisibleColumnCount ;
   private String AV54TFMaqFDsc_Sel ;
   private String AV53TFMaqFDsc ;
   private String AV58TFMaqFFind_Sel ;
   private String AV57TFMaqFFind ;
   private String A1143MaqFDsc ;
   private String A1144MaqFFind ;
   private String AV65Wcdupfasesds_2_tfmaqfdsc ;
   private String AV66Wcdupfasesds_3_tfmaqfdsc_sel ;
   private String AV67Wcdupfasesds_4_tfmaqffind ;
   private String AV68Wcdupfasesds_5_tfmaqffind_sel ;
   private String lV67Wcdupfasesds_4_tfmaqffind ;
   private String scmdbuf ;
   private String lV65Wcdupfasesds_2_tfmaqfdsc ;
   private String AV16EmprCod ;
   private String AV17MaqCod ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A1142MaqFCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV19OrderedDsc ;
   private boolean n1144MaqFFind ;
   private String AV39ColumnsSelectorXML ;
   private String AV40UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV56FilterFullText ;
   private String AV64Wcdupfasesds_1_filterfulltext ;
   private String lV64Wcdupfasesds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08CP2_A457FasCod ;
   private String[] P08CP2_A1142MaqFCod ;
   private String[] P08CP2_A602MaqCod ;
   private String[] P08CP2_A396EmprCod ;
   private String[] P08CP2_A1143MaqFDsc ;
   private String[] P08CP2_A1144MaqFFind ;
   private boolean[] P08CP2_n1144MaqFFind ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV38ColumnsSelector_Column ;
}

final  class wcdupfasesexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08CP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Wcdupfasesds_3_tfmaqfdsc_sel ,
                                          String AV65Wcdupfasesds_2_tfmaqfdsc ,
                                          String A1143MaqFDsc ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV64Wcdupfasesds_1_filterfulltext ,
                                          String A1144MaqFFind ,
                                          String AV68Wcdupfasesds_5_tfmaqffind_sel ,
                                          String AV67Wcdupfasesds_4_tfmaqffind ,
                                          String AV16EmprCod ,
                                          String AV17MaqCod ,
                                          String A396EmprCod ,
                                          String A602MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[12];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.FasCod, T1.MaqFCod, T1.MaqCod, T1.EmprCod, T1.MaqFDsc, COALESCE( T2.FasCod, 'xxxxxxxx') AS MaqFFind FROM (TXPMAQFAS T1 LEFT JOIN TXPFASPRO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.FasCod = T1.MaqFCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)) or ( UPPER(COALESCE( T2.FasCod, 'xxxxxxxx')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.FasCod, 'xxxxxxxx')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.FasCod, 'xxxxxxxx') = ?))");
      if ( (GXutil.strcmp("", AV66Wcdupfasesds_3_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Wcdupfasesds_2_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Wcdupfasesds_3_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV18OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqFDsc" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqFDsc DESC" ;
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
                  return conditional_P08CP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08CP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 28);
               }
               return;
      }
   }

}

