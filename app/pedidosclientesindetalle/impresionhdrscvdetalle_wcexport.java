package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class impresionhdrscvdetalle_wcexport extends GXProcedure
{
   public impresionhdrscvdetalle_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionhdrscvdetalle_wcexport.class ), "" );
   }

   public impresionhdrscvdetalle_wcexport( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      impresionhdrscvdetalle_wcexport.this.aP1 = new String[] {""};
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
      impresionhdrscvdetalle_wcexport.this.aP0 = aP0;
      impresionhdrscvdetalle_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ImpresionHDRsCvDetalle_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      impresionhdrscvdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      impresionhdrscvdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionhdrscvdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFBarNHdr_Sel, GXv_char5) ;
         impresionhdrscvdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            impresionhdrscvdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFBarNHdr, GXv_char5) ;
            impresionhdrscvdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFBarEncCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionhdrscvdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFBarEncCli_Sel, GXv_char5) ;
         impresionhdrscvdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFBarEncCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            impresionhdrscvdetalle_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFBarEncCli, GXv_char5) ;
            impresionhdrscvdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV44GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = AV18FilterFullText ;
      AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = AV34TFBarNHdr ;
      AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = AV36TFBarEncCli ;
      AV50Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel = AV37TFBarEncCli_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ,
                                           AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ,
                                           AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ,
                                           AV50Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ,
                                           AV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4812BarEncCli ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV41BarEncCli ,
                                           AV39Emprcod ,
                                           Integer.valueOf(AV40Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      lV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext), "%", "") ;
      lV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext), "%", "") ;
      lV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr), 11, "%") ;
      lV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = GXutil.padr( GXutil.rtrim( AV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli), 20, "%") ;
      /* Using cursor P09JW2 */
      pr_default.execute(0, new Object[] {AV39Emprcod, Integer.valueOf(AV40Clicod), AV41BarEncCli, lV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext, lV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext, lV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr, AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel, lV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli, AV50Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P09JW2_A252CliCod[0] ;
         n252CliCod = P09JW2_n252CliCod[0] ;
         A396EmprCod = P09JW2_A396EmprCod[0] ;
         A4812BarEncCli = P09JW2_A4812BarEncCli[0] ;
         A13696BarNHdr = P09JW2_A13696BarNHdr[0] ;
         A129BarCod = P09JW2_A129BarCod[0] ;
         A132BarCodReo = P09JW2_A132BarCodReo[0] ;
         A130BarCodPar = P09JW2_A130BarCodPar[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            impresionhdrscvdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4812BarEncCli, GXv_char5) ;
            impresionhdrscvdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNHdr", "", "N° Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarEncCli", "", "Pedido Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCColumnsSelector", GXv_char5) ;
      impresionhdrscvdetalle_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV51GXV2 = 1 ;
      while ( AV51GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV34TFBarNHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV35TFBarNHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV36TFBarEncCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV37TFBarEncCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV2 = (int)(AV51GXV2+1) ;
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
      this.aP0[0] = impresionhdrscvdetalle_wcexport.this.AV11Filename;
      this.aP1[0] = impresionhdrscvdetalle_wcexport.this.AV12ErrorMessage;
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
      AV18FilterFullText = "" ;
      AV35TFBarNHdr_Sel = "" ;
      AV34TFBarNHdr = "" ;
      AV37TFBarEncCli_Sel = "" ;
      AV36TFBarEncCli = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13696BarNHdr = "" ;
      A4812BarEncCli = "" ;
      AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = "" ;
      AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = "" ;
      AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel = "" ;
      AV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = "" ;
      AV50Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel = "" ;
      scmdbuf = "" ;
      lV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = "" ;
      lV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = "" ;
      lV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = "" ;
      A130BarCodPar = "" ;
      AV41BarEncCli = "" ;
      AV39Emprcod = "" ;
      A396EmprCod = "" ;
      P09JW2_A252CliCod = new int[1] ;
      P09JW2_n252CliCod = new boolean[] {false} ;
      P09JW2_A396EmprCod = new String[] {""} ;
      P09JW2_A4812BarEncCli = new String[] {""} ;
      P09JW2_A13696BarNHdr = new String[] {""} ;
      P09JW2_A129BarCod = new int[1] ;
      P09JW2_A132BarCodReo = new byte[1] ;
      P09JW2_A130BarCodPar = new String[] {""} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.impresionhdrscvdetalle_wcexport__default(),
         new Object[] {
             new Object[] {
            P09JW2_A252CliCod, P09JW2_n252CliCod, P09JW2_A396EmprCod, P09JW2_A4812BarEncCli, P09JW2_A13696BarNHdr, P09JW2_A129BarCod, P09JW2_A132BarCodReo, P09JW2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV44GXV1 ;
   private int A129BarCod ;
   private int AV40Clicod ;
   private int A252CliCod ;
   private int AV51GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV35TFBarNHdr_Sel ;
   private String AV34TFBarNHdr ;
   private String AV37TFBarEncCli_Sel ;
   private String AV36TFBarEncCli ;
   private String A13696BarNHdr ;
   private String A4812BarEncCli ;
   private String AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ;
   private String AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ;
   private String AV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ;
   private String AV50Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ;
   private String scmdbuf ;
   private String lV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ;
   private String lV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ;
   private String A130BarCodPar ;
   private String AV41BarEncCli ;
   private String AV39Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n252CliCod ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ;
   private String lV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P09JW2_A252CliCod ;
   private boolean[] P09JW2_n252CliCod ;
   private String[] P09JW2_A396EmprCod ;
   private String[] P09JW2_A4812BarEncCli ;
   private String[] P09JW2_A13696BarNHdr ;
   private int[] P09JW2_A129BarCod ;
   private byte[] P09JW2_A132BarCodReo ;
   private String[] P09JW2_A130BarCodPar ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class impresionhdrscvdetalle_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09JW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ,
                                          String AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ,
                                          String AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ,
                                          String AV50Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ,
                                          String AV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4812BarEncCli ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV41BarEncCli ,
                                          String AV39Emprcod ,
                                          int AV40Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[9];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT CliCod, EmprCod, BarEncCli, RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar AS" ;
      scmdbuf += " BarNHdr, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      addWhere(sWhereString, "(BarEncCli = ?)");
      if ( ! (GXutil.strcmp("", AV46Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarEncCli) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV47Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV49Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY BarEncCli" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarEncCli DESC" ;
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
                  return conditional_P09JW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09JW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

