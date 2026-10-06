package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodiferenciarecuento_wcexport extends GXProcedure
{
   public listadodiferenciarecuento_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodiferenciarecuento_wcexport.class ), "" );
   }

   public listadodiferenciarecuento_wcexport( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      listadodiferenciarecuento_wcexport.this.aP1 = new String[] {""};
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
      listadodiferenciarecuento_wcexport.this.aP0 = aP0;
      listadodiferenciarecuento_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ListadoDiferenciaRecuento_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23FilterFullText, GXv_char5) ;
      listadodiferenciarecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41TFRecFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV41TFRecFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV42TFRechora) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha/Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV42TFRechora );
      }
      if ( ! ( (GXutil.strcmp("", AV44TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFPrdNum_Sel, GXv_char5) ;
         listadodiferenciarecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFPrdNum, GXv_char5) ;
            listadodiferenciarecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV46TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFPrdNom_Sel, GXv_char5) ;
         listadodiferenciarecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFPrdNom, GXv_char5) ;
            listadodiferenciarecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFRecExiTeo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFRecExiTeo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Existencias", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFRecExiTeo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFRecExiTeo_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFRecExiRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFRecExiRea_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Existencias", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFRecExiRea)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFRecExiRea_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFRecPreRec)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFRecPreRec_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFRecPreRec)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFRecPreRec_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFDifAlmacen)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFDifAlmacen_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Diferencia Inventario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFDifAlmacen)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFDifAlmacen_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFDifAlmPor)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFDifAlmPor_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "% Desvio Inventário", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TFDifAlmPor)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodiferenciarecuento_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFDifAlmPor_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV38VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV24Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCColumnsSelector"), "") != 0 )
      {
         AV33ColumnsSelectorXML = AV24Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCColumnsSelector") ;
         AV30ColumnsSelector.fromxml(AV33ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV32ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV61GXV1));
         if ( AV32ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV32ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV32ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV32ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setColor( 11 );
            AV38VisibleColumnCount = (long)(AV38VisibleColumnCount+1) ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV23FilterFullText ;
      AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV41TFRecFec ;
      AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV42TFRechora ;
      AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV43TFPrdNum ;
      AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV44TFPrdNum_Sel ;
      AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV45TFPrdNom ;
      AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV46TFPrdNom_Sel ;
      AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV49TFRecExiTeo ;
      AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV50TFRecExiTeo_To ;
      AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV51TFRecExiRea ;
      AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV52TFRecExiRea_To ;
      AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV47TFRecPreRec ;
      AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV48TFRecPreRec_To ;
      AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV53TFDifAlmacen ;
      AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV54TFDifAlmacen_To ;
      AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV56TFDifAlmPor ;
      AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV57TFDifAlmPor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                           AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                           AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                           AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                           AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                           AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                           AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                           AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                           AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                           AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                           AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                           AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                           AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                           AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                           AV17recfec ,
                                           AV18prdnumfrom ,
                                           AV19prdnumto ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           Short.valueOf(AV21OrderedBy) ,
                                           Boolean.valueOf(AV22OrderedDsc) ,
                                           AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                           A14034DifAlmacen ,
                                           A14377DifAlmPor ,
                                           AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                           AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                           AV20desvios ,
                                           AV16emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum), 6, "%") ;
      lV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom), 26, "%") ;
      /* Using cursor P0AIL2 */
      pr_default.execute(0, new Object[] {AV16emprcod, AV20desvios, AV20desvios, AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec, AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora, lV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum, AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel, lV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom, AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel, AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo, AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to, AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea, AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to, AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec, AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to, AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen, AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to, AV17recfec, AV18prdnumfrom, AV19prdnumto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AIL2_A396EmprCod[0] ;
         A14034DifAlmacen = P0AIL2_A14034DifAlmacen[0] ;
         A6573RecPreRec = P0AIL2_A6573RecPreRec[0] ;
         A718PrdNom = P0AIL2_A718PrdNom[0] ;
         A719PrdNum = P0AIL2_A719PrdNum[0] ;
         A13455Rechora = P0AIL2_A13455Rechora[0] ;
         A810RecFec = P0AIL2_A810RecFec[0] ;
         A807RecExiRea = P0AIL2_A807RecExiRea[0] ;
         A809RecExiTeo = P0AIL2_A809RecExiTeo[0] ;
         A718PrdNom = P0AIL2_A718PrdNom[0] ;
         GXt_decimal7 = A14377DifAlmPor ;
         GXv_decimal8[0] = GXt_decimal7 ;
         new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal8) ;
         listadodiferenciarecuento_wcexport.this.GXt_decimal7 = GXv_decimal8[0] ;
         A14377DifAlmPor = GXt_decimal7 ;
         if ( (GXutil.strcmp("", AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A809RecExiTeo, 12, 4) , GXutil.padr( "%" + AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A807RecExiRea, 12, 4) , GXutil.padr( "%" + AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6573RecPreRec, 14, 5) , GXutil.padr( "%" + AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14034DifAlmacen, 12, 4) , GXutil.padr( "%" + AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14377DifAlmPor, 7, 2) , GXutil.padr( "%" + AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to) <= 0 ) ) )
               {
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
                  AV38VisibleColumnCount = 0 ;
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setDate( A13455Rechora );
                     AV38VisibleColumnCount = (long)(AV38VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char5[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
                     listadodiferenciarecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV38VisibleColumnCount = (long)(AV38VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     GXt_char4 = "" ;
                     GXv_char5[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
                     listadodiferenciarecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setText( GXt_char4 );
                     AV38VisibleColumnCount = (long)(AV38VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A809RecExiTeo)) );
                     AV38VisibleColumnCount = (long)(AV38VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A6573RecPreRec)) );
                     AV38VisibleColumnCount = (long)(AV38VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV29ValorActual = GXutil.roundDecimal( (A807RecExiRea.multiply(A6573RecPreRec)), 2) ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV29ValorActual)) );
                     AV38VisibleColumnCount = (long)(AV38VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14034DifAlmacen)) );
                     AV38VisibleColumnCount = (long)(AV38VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14377DifAlmPor)) );
                     AV38VisibleColumnCount = (long)(AV38VisibleColumnCount+1) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV30ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV58DesvioMon = (A14034DifAlmacen.multiply(A6573RecPreRec)) ;
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV38VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58DesvioMon)) );
                     AV38VisibleColumnCount = (long)(AV38VisibleColumnCount+1) ;
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
               }
            }
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
      AV30ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "RecFec", "", "Fecha", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "Rechora", "", "Fecha/Hora", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrdNum", "", "Producto", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrdNom", "", "Descripcion", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "RecExiTeo", "Teorico", "Existencias", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "RecExiRea", "Real", "Existencias", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "RecPreRec", "", "Precio", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&ValorActual", "Real", "Valor", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "DifAlmacen", "", "Diferencia Inventario", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "DifAlmPor", "", "% Desvio Inventário", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV30ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&DesvioMon", "", "Valor", true, "") ;
      AV30ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char4 = AV34UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadoDiferenciaRecuento_WCColumnsSelector", GXv_char5) ;
      listadodiferenciarecuento_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV34UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV34UserCustomValue)==0) ) )
      {
         AV31ColumnsSelectorAux.fromxml(AV34UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV31ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV30ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV31ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV30ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCGridState"), "") == 0 )
      {
         AV26GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.ListadoDiferenciaRecuento_WCGridState"), null, null);
      }
      else
      {
         AV26GridState.fromxml(AV24Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCGridState"), null, null);
      }
      AV21OrderedBy = AV26GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV22OrderedDsc = AV26GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV80GXV2 = 1 ;
      while ( AV80GXV2 <= AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV2));
         if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV23FilterFullText = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV41TFRecFec = localUtil.ctod( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV42TFRechora = localUtil.ctot( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV43TFPrdNum = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV44TFPrdNum_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV45TFPrdNom = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV46TFPrdNom_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV49TFRecExiTeo = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFRecExiTeo_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV51TFRecExiRea = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFRecExiRea_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPREREC") == 0 )
         {
            AV47TFRecPreRec = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFRecPreRec_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFALMACEN") == 0 )
         {
            AV53TFDifAlmacen = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFDifAlmacen_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFALMPOR") == 0 )
         {
            AV56TFDifAlmPor = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFDifAlmPor_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16emprcod = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV17recfec = localUtil.ctod( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMFROM") == 0 )
         {
            AV18prdnumfrom = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMTO") == 0 )
         {
            AV19prdnumto = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DESVIOS") == 0 )
         {
            AV20desvios = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV80GXV2 = (int)(AV80GXV2+1) ;
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
      this.aP0[0] = listadodiferenciarecuento_wcexport.this.AV11Filename;
      this.aP1[0] = listadodiferenciarecuento_wcexport.this.AV12ErrorMessage;
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
      AV23FilterFullText = "" ;
      AV41TFRecFec = GXutil.nullDate() ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV42TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV44TFPrdNum_Sel = "" ;
      AV43TFPrdNum = "" ;
      AV46TFPrdNom_Sel = "" ;
      AV45TFPrdNom = "" ;
      AV49TFRecExiTeo = DecimalUtil.ZERO ;
      AV50TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV51TFRecExiRea = DecimalUtil.ZERO ;
      AV52TFRecExiRea_To = DecimalUtil.ZERO ;
      AV47TFRecPreRec = DecimalUtil.ZERO ;
      AV48TFRecPreRec_To = DecimalUtil.ZERO ;
      AV53TFDifAlmacen = DecimalUtil.ZERO ;
      AV54TFDifAlmacen_To = DecimalUtil.ZERO ;
      AV56TFDifAlmPor = DecimalUtil.ZERO ;
      AV57TFDifAlmPor_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV24Session = httpContext.getWebSession();
      AV33ColumnsSelectorXML = "" ;
      AV30ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV32ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A14034DifAlmacen = DecimalUtil.ZERO ;
      A14377DifAlmPor = DecimalUtil.ZERO ;
      AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = "" ;
      AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = GXutil.nullDate() ;
      AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = "" ;
      AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = "" ;
      AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = "" ;
      AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = "" ;
      AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = DecimalUtil.ZERO ;
      AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = DecimalUtil.ZERO ;
      AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = DecimalUtil.ZERO ;
      AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = DecimalUtil.ZERO ;
      AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = DecimalUtil.ZERO ;
      AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = DecimalUtil.ZERO ;
      AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = DecimalUtil.ZERO ;
      AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = DecimalUtil.ZERO ;
      AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = "" ;
      lV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = "" ;
      AV17recfec = GXutil.nullDate() ;
      AV18prdnumfrom = "" ;
      AV19prdnumto = "" ;
      A810RecFec = GXutil.nullDate() ;
      AV20desvios = "" ;
      AV16emprcod = "" ;
      A396EmprCod = "" ;
      P0AIL2_A396EmprCod = new String[] {""} ;
      P0AIL2_A14034DifAlmacen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIL2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIL2_A718PrdNom = new String[] {""} ;
      P0AIL2_A719PrdNum = new String[] {""} ;
      P0AIL2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P0AIL2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AIL2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIL2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXt_decimal7 = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV29ValorActual = DecimalUtil.ZERO ;
      AV58DesvioMon = DecimalUtil.ZERO ;
      AV34UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV31ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV26GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV27GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodiferenciarecuento_wcexport__default(),
         new Object[] {
             new Object[] {
            P0AIL2_A396EmprCod, P0AIL2_A14034DifAlmacen, P0AIL2_A6573RecPreRec, P0AIL2_A718PrdNom, P0AIL2_A719PrdNum, P0AIL2_A13455Rechora, P0AIL2_A810RecFec, P0AIL2_A807RecExiRea, P0AIL2_A809RecExiTeo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV21OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV61GXV1 ;
   private int AV80GXV2 ;
   private long AV38VisibleColumnCount ;
   private java.math.BigDecimal AV49TFRecExiTeo ;
   private java.math.BigDecimal AV50TFRecExiTeo_To ;
   private java.math.BigDecimal AV51TFRecExiRea ;
   private java.math.BigDecimal AV52TFRecExiRea_To ;
   private java.math.BigDecimal AV47TFRecPreRec ;
   private java.math.BigDecimal AV48TFRecPreRec_To ;
   private java.math.BigDecimal AV53TFDifAlmacen ;
   private java.math.BigDecimal AV54TFDifAlmacen_To ;
   private java.math.BigDecimal AV56TFDifAlmPor ;
   private java.math.BigDecimal AV57TFDifAlmPor_To ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A14034DifAlmacen ;
   private java.math.BigDecimal A14377DifAlmPor ;
   private java.math.BigDecimal AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ;
   private java.math.BigDecimal AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ;
   private java.math.BigDecimal AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ;
   private java.math.BigDecimal AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ;
   private java.math.BigDecimal AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ;
   private java.math.BigDecimal AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ;
   private java.math.BigDecimal AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ;
   private java.math.BigDecimal AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ;
   private java.math.BigDecimal AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ;
   private java.math.BigDecimal AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ;
   private java.math.BigDecimal GXt_decimal7 ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV29ValorActual ;
   private java.math.BigDecimal AV58DesvioMon ;
   private String AV44TFPrdNum_Sel ;
   private String AV43TFPrdNum ;
   private String AV46TFPrdNom_Sel ;
   private String AV45TFPrdNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ;
   private String AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ;
   private String AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ;
   private String AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ;
   private String lV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ;
   private String AV18prdnumfrom ;
   private String AV19prdnumto ;
   private String AV20desvios ;
   private String AV16emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV42TFRechora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ;
   private java.util.Date AV41TFRecFec ;
   private java.util.Date AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ;
   private java.util.Date AV17recfec ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean AV22OrderedDsc ;
   private String AV33ColumnsSelectorXML ;
   private String AV34UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV23FilterFullText ;
   private String AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AIL2_A396EmprCod ;
   private java.math.BigDecimal[] P0AIL2_A14034DifAlmacen ;
   private java.math.BigDecimal[] P0AIL2_A6573RecPreRec ;
   private String[] P0AIL2_A718PrdNom ;
   private String[] P0AIL2_A719PrdNum ;
   private java.util.Date[] P0AIL2_A13455Rechora ;
   private java.util.Date[] P0AIL2_A810RecFec ;
   private java.math.BigDecimal[] P0AIL2_A807RecExiRea ;
   private java.math.BigDecimal[] P0AIL2_A809RecExiTeo ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV26GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV27GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV31ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV32ColumnsSelector_Column ;
}

final  class listadodiferenciarecuento_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AIL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                          String AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                          String AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                          String AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                          String AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                          java.math.BigDecimal AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                          java.math.BigDecimal AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                          java.math.BigDecimal AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                          java.util.Date AV17recfec ,
                                          String AV18prdnumfrom ,
                                          String AV19prdnumto ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          short AV21OrderedBy ,
                                          boolean AV22OrderedDsc ,
                                          String AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A14034DifAlmacen ,
                                          java.math.BigDecimal A14377DifAlmPor ,
                                          java.math.BigDecimal AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                          java.math.BigDecimal AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                          String AV20desvios ,
                                          String AV16emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[20];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, ( T1.RecExiTeo - T1.RecExiRea) AS DifAlmacen, T1.RecPreRec, T2.PrdNom, T1.PrdNum, T1.Rechora, T1.RecFec, T1.RecExiRea, T1.RecExiTeo FROM (TXPRECUEN" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(( ( T1.RecExiTeo - T1.RecExiRea) <> 0 and ? = 'S') or ? = 'N')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17recfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV21OrderedBy == 1 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV21OrderedBy == 1 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFec" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFec DESC" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Rechora" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Rechora DESC" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiRea" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiRea DESC" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPreRec" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPreRec DESC" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P0AIL2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[24], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               return;
      }
   }

}

