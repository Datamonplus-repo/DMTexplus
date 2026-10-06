package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wc_repuestocompatibleexport extends GXProcedure
{
   public wc_repuestocompatibleexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wc_repuestocompatibleexport.class ), "" );
   }

   public wc_repuestocompatibleexport( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wc_repuestocompatibleexport.this.aP1 = new String[] {""};
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
      wc_repuestocompatibleexport.this.aP0 = aP0;
      wc_repuestocompatibleexport.this.aP1 = aP1;
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
      AV11Filename = "PrivateTempStorage" + "WC_RepuestoCompatibleExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wc_repuestocompatibleexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV20FilterFullText, GXv_char5) ;
      wc_repuestocompatibleexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV37TFMRComNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Compatible", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_repuestocompatibleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFMRComNom_Sel, GXv_char5) ;
         wc_repuestocompatibleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFMRComNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Compatible", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wc_repuestocompatibleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFMRComNom, GXv_char5) ;
            wc_repuestocompatibleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV38TFMRComCod) && (0==AV39TFMRComCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Compatible", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_repuestocompatibleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFMRComCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wc_repuestocompatibleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFMRComCod_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV33VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV21Session.getValue("WC_RepuestoCompatibleColumnsSelector"), "") != 0 )
      {
         AV28ColumnsSelectorXML = AV21Session.getValue("WC_RepuestoCompatibleColumnsSelector") ;
         AV25ColumnsSelector.fromxml(AV28ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV27ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV44GXV1));
         if ( AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setColor( 11 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV46Wc_repuestocompatibleds_1_emprcod = AV16EmprCod ;
      AV47Wc_repuestocompatibleds_2_mrpricod = AV17MRPriCod ;
      AV48Wc_repuestocompatibleds_3_mrprinom = AV41MRPriNom ;
      AV49Wc_repuestocompatibleds_4_filterfulltext = AV20FilterFullText ;
      AV50Wc_repuestocompatibleds_5_tfmrcomnom = AV36TFMRComNom ;
      AV51Wc_repuestocompatibleds_6_tfmrcomnom_sel = AV37TFMRComNom_Sel ;
      AV52Wc_repuestocompatibleds_7_tfmrcomcod = AV38TFMRComCod ;
      AV53Wc_repuestocompatibleds_8_tfmrcomcod_to = AV39TFMRComCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Wc_repuestocompatibleds_4_filterfulltext ,
                                           AV51Wc_repuestocompatibleds_6_tfmrcomnom_sel ,
                                           AV50Wc_repuestocompatibleds_5_tfmrcomnom ,
                                           Integer.valueOf(AV52Wc_repuestocompatibleds_7_tfmrcomcod) ,
                                           Integer.valueOf(AV53Wc_repuestocompatibleds_8_tfmrcomcod_to) ,
                                           A1064MRComNom ,
                                           Integer.valueOf(A1063MRComCod) ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           A1062MRPriNom ,
                                           AV48Wc_repuestocompatibleds_3_mrprinom ,
                                           AV46Wc_repuestocompatibleds_1_emprcod ,
                                           Integer.valueOf(AV47Wc_repuestocompatibleds_2_mrpricod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A1061MRPriCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV49Wc_repuestocompatibleds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Wc_repuestocompatibleds_4_filterfulltext), "%", "") ;
      lV49Wc_repuestocompatibleds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Wc_repuestocompatibleds_4_filterfulltext), "%", "") ;
      lV50Wc_repuestocompatibleds_5_tfmrcomnom = GXutil.padr( GXutil.rtrim( AV50Wc_repuestocompatibleds_5_tfmrcomnom), 100, "%") ;
      /* Using cursor P08VS2 */
      pr_default.execute(0, new Object[] {AV46Wc_repuestocompatibleds_1_emprcod, Integer.valueOf(AV47Wc_repuestocompatibleds_2_mrpricod), AV48Wc_repuestocompatibleds_3_mrprinom, lV49Wc_repuestocompatibleds_4_filterfulltext, lV49Wc_repuestocompatibleds_4_filterfulltext, lV50Wc_repuestocompatibleds_5_tfmrcomnom, AV51Wc_repuestocompatibleds_6_tfmrcomnom_sel, Integer.valueOf(AV52Wc_repuestocompatibleds_7_tfmrcomcod), Integer.valueOf(AV53Wc_repuestocompatibleds_8_tfmrcomcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1063MRComCod = P08VS2_A1063MRComCod[0] ;
         A1064MRComNom = P08VS2_A1064MRComNom[0] ;
         n1064MRComNom = P08VS2_n1064MRComNom[0] ;
         A1062MRPriNom = P08VS2_A1062MRPriNom[0] ;
         n1062MRPriNom = P08VS2_n1062MRPriNom[0] ;
         A1061MRPriCod = P08VS2_A1061MRPriCod[0] ;
         A396EmprCod = P08VS2_A396EmprCod[0] ;
         A1062MRPriNom = P08VS2_A1062MRPriNom[0] ;
         n1062MRPriNom = P08VS2_n1062MRPriNom[0] ;
         A1064MRComNom = P08VS2_A1064MRComNom[0] ;
         n1064MRComNom = P08VS2_n1064MRComNom[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV33VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1064MRComNom, GXv_char5) ;
            wc_repuestocompatibleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( A1063MRComCod );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
      AV25ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRComNom", "", "Nombre Compatible", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MRComCod", "", "Compatible", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV29UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WC_RepuestoCompatibleColumnsSelector", GXv_char5) ;
      wc_repuestocompatibleexport.this.GXt_char4 = GXv_char5[0] ;
      AV29UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV29UserCustomValue)==0) ) )
      {
         AV26ColumnsSelectorAux.fromxml(AV29UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV25ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV26ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV25ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("WC_RepuestoCompatibleGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WC_RepuestoCompatibleGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("WC_RepuestoCompatibleGridState"), null, null);
      }
      AV18OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV19OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV54GXV2 = 1 ;
      while ( AV54GXV2 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV2));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMNOM") == 0 )
         {
            AV36TFMRComNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMNOM_SEL") == 0 )
         {
            AV37TFMRComNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOMCOD") == 0 )
         {
            AV38TFMRComCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFMRComCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16EmprCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRPRICOD") == 0 )
         {
            AV17MRPriCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRPRINOM") == 0 )
         {
            AV41MRPriNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV2 = (int)(AV54GXV2+1) ;
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
      this.aP0[0] = wc_repuestocompatibleexport.this.AV11Filename;
      this.aP1[0] = wc_repuestocompatibleexport.this.AV12ErrorMessage;
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
      AV20FilterFullText = "" ;
      AV37TFMRComNom_Sel = "" ;
      AV36TFMRComNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV21Session = httpContext.getWebSession();
      AV28ColumnsSelectorXML = "" ;
      AV25ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV27ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A1064MRComNom = "" ;
      AV46Wc_repuestocompatibleds_1_emprcod = "" ;
      AV16EmprCod = "" ;
      AV48Wc_repuestocompatibleds_3_mrprinom = "" ;
      AV41MRPriNom = "" ;
      AV49Wc_repuestocompatibleds_4_filterfulltext = "" ;
      AV50Wc_repuestocompatibleds_5_tfmrcomnom = "" ;
      AV51Wc_repuestocompatibleds_6_tfmrcomnom_sel = "" ;
      scmdbuf = "" ;
      lV49Wc_repuestocompatibleds_4_filterfulltext = "" ;
      lV50Wc_repuestocompatibleds_5_tfmrcomnom = "" ;
      A1062MRPriNom = "" ;
      A396EmprCod = "" ;
      P08VS2_A1063MRComCod = new int[1] ;
      P08VS2_A1064MRComNom = new String[] {""} ;
      P08VS2_n1064MRComNom = new boolean[] {false} ;
      P08VS2_A1062MRPriNom = new String[] {""} ;
      P08VS2_n1062MRPriNom = new boolean[] {false} ;
      P08VS2_A1061MRPriCod = new int[1] ;
      P08VS2_A396EmprCod = new String[] {""} ;
      AV29UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV26ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wc_repuestocompatibleexport__default(),
         new Object[] {
             new Object[] {
            P08VS2_A1063MRComCod, P08VS2_A1064MRComNom, P08VS2_n1064MRComNom, P08VS2_A1062MRPriNom, P08VS2_n1062MRPriNom, P08VS2_A1061MRPriCod, P08VS2_A396EmprCod
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
   private int AV38TFMRComCod ;
   private int AV39TFMRComCod_To ;
   private int AV44GXV1 ;
   private int A1063MRComCod ;
   private int AV47Wc_repuestocompatibleds_2_mrpricod ;
   private int AV17MRPriCod ;
   private int AV52Wc_repuestocompatibleds_7_tfmrcomcod ;
   private int AV53Wc_repuestocompatibleds_8_tfmrcomcod_to ;
   private int A1061MRPriCod ;
   private int AV54GXV2 ;
   private long AV33VisibleColumnCount ;
   private String AV37TFMRComNom_Sel ;
   private String AV36TFMRComNom ;
   private String A1064MRComNom ;
   private String AV46Wc_repuestocompatibleds_1_emprcod ;
   private String AV16EmprCod ;
   private String AV48Wc_repuestocompatibleds_3_mrprinom ;
   private String AV41MRPriNom ;
   private String AV50Wc_repuestocompatibleds_5_tfmrcomnom ;
   private String AV51Wc_repuestocompatibleds_6_tfmrcomnom_sel ;
   private String scmdbuf ;
   private String lV50Wc_repuestocompatibleds_5_tfmrcomnom ;
   private String A1062MRPriNom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV19OrderedDsc ;
   private boolean n1064MRComNom ;
   private boolean n1062MRPriNom ;
   private String AV28ColumnsSelectorXML ;
   private String AV29UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV20FilterFullText ;
   private String AV49Wc_repuestocompatibleds_4_filterfulltext ;
   private String lV49Wc_repuestocompatibleds_4_filterfulltext ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P08VS2_A1063MRComCod ;
   private String[] P08VS2_A1064MRComNom ;
   private boolean[] P08VS2_n1064MRComNom ;
   private String[] P08VS2_A1062MRPriNom ;
   private boolean[] P08VS2_n1062MRPriNom ;
   private int[] P08VS2_A1061MRPriCod ;
   private String[] P08VS2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV27ColumnsSelector_Column ;
}

final  class wc_repuestocompatibleexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Wc_repuestocompatibleds_4_filterfulltext ,
                                          String AV51Wc_repuestocompatibleds_6_tfmrcomnom_sel ,
                                          String AV50Wc_repuestocompatibleds_5_tfmrcomnom ,
                                          int AV52Wc_repuestocompatibleds_7_tfmrcomcod ,
                                          int AV53Wc_repuestocompatibleds_8_tfmrcomcod_to ,
                                          String A1064MRComNom ,
                                          int A1063MRComCod ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String A1062MRPriNom ,
                                          String AV48Wc_repuestocompatibleds_3_mrprinom ,
                                          String AV46Wc_repuestocompatibleds_1_emprcod ,
                                          int AV47Wc_repuestocompatibleds_2_mrpricod ,
                                          String A396EmprCod ,
                                          int A1061MRPriCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[9];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.MRComCod AS MRComCod, T3.MRNom AS MRComNom, T2.MRNom AS MRPriNom, T1.MRPriCod AS MRPriCod, T1.EmprCod FROM ((TXPMRCom1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MRCod = T1.MRPriCod) INNER JOIN TXPMREPUE T3 ON T3.EmprCod = T1.EmprCod AND T3.MRCod = T1.MRComCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRPriCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      if ( ! (GXutil.strcmp("", AV49Wc_repuestocompatibleds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T3.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRComCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Wc_repuestocompatibleds_6_tfmrcomnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Wc_repuestocompatibleds_5_tfmrcomnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Wc_repuestocompatibleds_6_tfmrcomnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MRNom = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV52Wc_repuestocompatibleds_7_tfmrcomcod) )
      {
         addWhere(sWhereString, "(T1.MRComCod >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV53Wc_repuestocompatibleds_8_tfmrcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MRComCod <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRPriCod, T2.MRNom, T3.MRNom" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRPriCod DESC, T2.MRNom DESC, T3.MRNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRPriCod, T2.MRNom, T1.MRComCod" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRPriCod DESC, T2.MRNom DESC, T1.MRComCod DESC" ;
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
                  return conditional_P08VS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).shortValue() , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

