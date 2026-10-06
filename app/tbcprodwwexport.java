package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tbcprodwwexport extends GXProcedure
{
   public tbcprodwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbcprodwwexport.class ), "" );
   }

   public tbcprodwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tbcprodwwexport.this.aP1 = new String[] {""};
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
      tbcprodwwexport.this.aP0 = aP0;
      tbcprodwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TBCPRODWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70FilterFullText, GXv_char5) ;
      tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV49TFBCProducto_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBCProducto_Sel, GXv_char5) ;
         tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFBCProducto)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBCProducto, GXv_char5) ;
            tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFBCDescripcion_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFBCDescripcion_Sel, GXv_char5) ;
         tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFBCDescripcion)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBCDescripcion, GXv_char5) ;
            tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBCPrecio)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBCPrecio_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFBCPrecio)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFBCPrecio_To)) );
      }
      if ( ! ( ( AV55TFBCUndComp_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad Compra", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV69i = 1 ;
         AV73GXV1 = 1 ;
         while ( AV73GXV1 <= AV55TFBCUndComp_Sels.size() )
         {
            AV56TFBCUndComp_Sel = ((Number) AV55TFBCUndComp_Sels.elementAt(-1+AV73GXV1)).shortValue() ;
            if ( AV69i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV56TFBCUndComp_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Kilos", "") );
            }
            else if ( AV56TFBCUndComp_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Litros", "") );
            }
            AV69i = (long)(AV69i+1) ;
            AV73GXV1 = (int)(AV73GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV58TFBCProveedor_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFBCProveedor_Sel, GXv_char5) ;
         tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFBCProveedor)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFBCProveedor, GXv_char5) ;
            tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV59TFBCProcesado) && (0==AV60TFBCProcesado_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Procesado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV59TFBCProcesado );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV60TFBCProcesado_To );
      }
      if ( ! ( (0==AV61TFBCError) && (0==AV62TFBCError_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Error", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV61TFBCError );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV62TFBCError_To );
      }
      if ( ! ( (GXutil.strcmp("", AV64TFBCDescError_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción error", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFBCDescError_Sel, GXv_char5) ;
         tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFBCDescError)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción error", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFBCDescError, GXv_char5) ;
            tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV65TFBCFechError) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha y hora error", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV65TFBCFechError );
      }
      if ( ! ( (GXutil.strcmp("", AV68TFBCPilaError_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pila error", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFBCPilaError_Sel, GXv_char5) ;
         tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFBCPilaError)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pila error", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tbcprodwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFBCPilaError, GXv_char5) ;
            tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV33Session.getValue("TBCPRODWWColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV33Session.getValue("TBCPRODWWColumnsSelector") ;
         AV37ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV74GXV2 = 1 ;
      while ( AV74GXV2 <= AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV39ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV74GXV2));
         if ( AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setColor( 11 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         AV74GXV2 = (int)(AV74GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV76Tbcprodwwds_1_filterfulltext = AV70FilterFullText ;
      AV77Tbcprodwwds_2_tfbcproducto = AV48TFBCProducto ;
      AV78Tbcprodwwds_3_tfbcproducto_sel = AV49TFBCProducto_Sel ;
      AV79Tbcprodwwds_4_tfbcdescripcion = AV50TFBCDescripcion ;
      AV80Tbcprodwwds_5_tfbcdescripcion_sel = AV51TFBCDescripcion_Sel ;
      AV81Tbcprodwwds_6_tfbcprecio = AV52TFBCPrecio ;
      AV82Tbcprodwwds_7_tfbcprecio_to = AV53TFBCPrecio_To ;
      AV83Tbcprodwwds_8_tfbcundcomp_sels = AV55TFBCUndComp_Sels ;
      AV84Tbcprodwwds_9_tfbcproveedor = AV57TFBCProveedor ;
      AV85Tbcprodwwds_10_tfbcproveedor_sel = AV58TFBCProveedor_Sel ;
      AV86Tbcprodwwds_11_tfbcprocesado = AV59TFBCProcesado ;
      AV87Tbcprodwwds_12_tfbcprocesado_to = AV60TFBCProcesado_To ;
      AV88Tbcprodwwds_13_tfbcerror = AV61TFBCError ;
      AV89Tbcprodwwds_14_tfbcerror_to = AV62TFBCError_To ;
      AV90Tbcprodwwds_15_tfbcdescerror = AV63TFBCDescError ;
      AV91Tbcprodwwds_16_tfbcdescerror_sel = AV64TFBCDescError_Sel ;
      AV92Tbcprodwwds_17_tfbcfecherror = AV65TFBCFechError ;
      AV93Tbcprodwwds_18_tfbcpilaerror = AV67TFBCPilaError ;
      AV94Tbcprodwwds_19_tfbcpilaerror_sel = AV68TFBCPilaError_Sel ;
      pr_ekamat.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(A13481BCUndComp) ,
                                           AV83Tbcprodwwds_8_tfbcundcomp_sels ,
                                           AV78Tbcprodwwds_3_tfbcproducto_sel ,
                                           AV77Tbcprodwwds_2_tfbcproducto ,
                                           AV80Tbcprodwwds_5_tfbcdescripcion_sel ,
                                           AV79Tbcprodwwds_4_tfbcdescripcion ,
                                           AV81Tbcprodwwds_6_tfbcprecio ,
                                           AV82Tbcprodwwds_7_tfbcprecio_to ,
                                           Integer.valueOf(AV83Tbcprodwwds_8_tfbcundcomp_sels.size()) ,
                                           AV85Tbcprodwwds_10_tfbcproveedor_sel ,
                                           AV84Tbcprodwwds_9_tfbcproveedor ,
                                           Short.valueOf(AV86Tbcprodwwds_11_tfbcprocesado) ,
                                           Short.valueOf(AV87Tbcprodwwds_12_tfbcprocesado_to) ,
                                           Short.valueOf(AV88Tbcprodwwds_13_tfbcerror) ,
                                           Short.valueOf(AV89Tbcprodwwds_14_tfbcerror_to) ,
                                           AV91Tbcprodwwds_16_tfbcdescerror_sel ,
                                           AV90Tbcprodwwds_15_tfbcdescerror ,
                                           AV92Tbcprodwwds_17_tfbcfecherror ,
                                           AV94Tbcprodwwds_19_tfbcpilaerror_sel ,
                                           AV93Tbcprodwwds_18_tfbcpilaerror ,
                                           A13478BCProducto ,
                                           A13479BCDescripc ,
                                           A13480BCPrecio ,
                                           A13482BCProveedo ,
                                           Short.valueOf(A13483BCProcesad) ,
                                           Short.valueOf(A13484BCError) ,
                                           A13485BCDescErro ,
                                           A13486BCFechErro ,
                                           A13487BCPilaErro ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV76Tbcprodwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV77Tbcprodwwds_2_tfbcproducto = GXutil.padr( GXutil.rtrim( AV77Tbcprodwwds_2_tfbcproducto), 6, "%") ;
      lV79Tbcprodwwds_4_tfbcdescripcion = GXutil.padr( GXutil.rtrim( AV79Tbcprodwwds_4_tfbcdescripcion), 26, "%") ;
      lV84Tbcprodwwds_9_tfbcproveedor = GXutil.padr( GXutil.rtrim( AV84Tbcprodwwds_9_tfbcproveedor), 20, "%") ;
      lV90Tbcprodwwds_15_tfbcdescerror = GXutil.concat( GXutil.rtrim( AV90Tbcprodwwds_15_tfbcdescerror), "%", "") ;
      lV93Tbcprodwwds_18_tfbcpilaerror = GXutil.concat( GXutil.rtrim( AV93Tbcprodwwds_18_tfbcpilaerror), "%", "") ;
      /* Using cursor P07ZK2 */
      pr_ekamat.execute(0, new Object[] {lV77Tbcprodwwds_2_tfbcproducto, AV78Tbcprodwwds_3_tfbcproducto_sel, lV79Tbcprodwwds_4_tfbcdescripcion, AV80Tbcprodwwds_5_tfbcdescripcion_sel, AV81Tbcprodwwds_6_tfbcprecio, AV82Tbcprodwwds_7_tfbcprecio_to, lV84Tbcprodwwds_9_tfbcproveedor, AV85Tbcprodwwds_10_tfbcproveedor_sel, Short.valueOf(AV86Tbcprodwwds_11_tfbcprocesado), Short.valueOf(AV87Tbcprodwwds_12_tfbcprocesado_to), Short.valueOf(AV88Tbcprodwwds_13_tfbcerror), Short.valueOf(AV89Tbcprodwwds_14_tfbcerror_to), lV90Tbcprodwwds_15_tfbcdescerror, AV91Tbcprodwwds_16_tfbcdescerror_sel, AV92Tbcprodwwds_17_tfbcfecherror, lV93Tbcprodwwds_18_tfbcpilaerror, AV94Tbcprodwwds_19_tfbcpilaerror_sel});
      while ( (pr_ekamat.getStatus(0) != 101) )
      {
         A13487BCPilaErro = P07ZK2_A13487BCPilaErro[0] ;
         n13487BCPilaErro = P07ZK2_n13487BCPilaErro[0] ;
         A13486BCFechErro = P07ZK2_A13486BCFechErro[0] ;
         n13486BCFechErro = P07ZK2_n13486BCFechErro[0] ;
         A13485BCDescErro = P07ZK2_A13485BCDescErro[0] ;
         n13485BCDescErro = P07ZK2_n13485BCDescErro[0] ;
         A13484BCError = P07ZK2_A13484BCError[0] ;
         n13484BCError = P07ZK2_n13484BCError[0] ;
         A13483BCProcesad = P07ZK2_A13483BCProcesad[0] ;
         n13483BCProcesad = P07ZK2_n13483BCProcesad[0] ;
         A13482BCProveedo = P07ZK2_A13482BCProveedo[0] ;
         n13482BCProveedo = P07ZK2_n13482BCProveedo[0] ;
         A13480BCPrecio = P07ZK2_A13480BCPrecio[0] ;
         n13480BCPrecio = P07ZK2_n13480BCPrecio[0] ;
         A13479BCDescripc = P07ZK2_A13479BCDescripc[0] ;
         n13479BCDescripc = P07ZK2_n13479BCDescripc[0] ;
         A13478BCProducto = P07ZK2_A13478BCProducto[0] ;
         A13481BCUndComp = P07ZK2_A13481BCUndComp[0] ;
         n13481BCUndComp = P07ZK2_n13481BCUndComp[0] ;
         A396EmprCod = P07ZK2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV76Tbcprodwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13478BCProducto) , GXutil.padr( "%" + GXutil.upper( AV76Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13479BCDescripc) , GXutil.padr( "%" + GXutil.upper( AV76Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13480BCPrecio, 13, 5) , GXutil.padr( "%" + AV76Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "kilos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "litros", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 2 ) ) || ( GXutil.like( GXutil.upper( A13482BCProveedo) , GXutil.padr( "%" + GXutil.upper( AV76Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13483BCProcesad, 4, 0) , GXutil.padr( "%" + AV76Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13484BCError, 4, 0) , GXutil.padr( "%" + AV76Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13485BCDescErro) , GXutil.padr( "%" + GXutil.upper( AV76Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13487BCPilaErro) , GXutil.padr( "%" + GXutil.upper( AV76Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_ekamat.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV45VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13478BCProducto, GXv_char5) ;
               tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13479BCDescripc, GXv_char5) ;
               tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13480BCPrecio)) );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( "" );
               if ( A13481BCUndComp == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Kilos", "") );
               }
               else if ( A13481BCUndComp == 2 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Litros", "") );
               }
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13482BCProveedo, GXv_char5) ;
               tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A13483BCProcesad );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A13484BCError );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13485BCDescErro, GXv_char5) ;
               tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setDate( A13486BCFechErro );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13487BCPilaErro, GXv_char5) ;
               tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_ekamat.close(0);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_ekamat.readNext(0);
      }
      pr_ekamat.close(0);
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BCProducto", "", "Producto", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BCDescripcion", "", "Descripcion", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BCPrecio", "", "Precio", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BCUndComp", "", "Unidad Compra", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BCProveedor", "", "Proveedor", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BCProcesado", "", "Procesado", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BCError", "", "Error", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BCDescError", "", "Descripción error", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BCFechError", "", "Fecha y hora error", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BCPilaError", "", "Pila error", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV41UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TBCPRODWWColumnsSelector", GXv_char5) ;
      tbcprodwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV33Session.getValue("TBCPRODWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TBCPRODWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("TBCPRODWWGridState"), null, null);
      }
      AV16OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV95GXV3 = 1 ;
      while ( AV95GXV3 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV95GXV3));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV70FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRODUCTO") == 0 )
         {
            AV48TFBCProducto = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRODUCTO_SEL") == 0 )
         {
            AV49TFBCProducto_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCRIPCION") == 0 )
         {
            AV50TFBCDescripcion = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCRIPCION_SEL") == 0 )
         {
            AV51TFBCDescripcion_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRECIO") == 0 )
         {
            AV52TFBCPrecio = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFBCPrecio_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCUNDCOMP_SEL") == 0 )
         {
            AV54TFBCUndComp_SelsJson = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55TFBCUndComp_Sels.fromJSonString(AV54TFBCUndComp_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROVEEDOR") == 0 )
         {
            AV57TFBCProveedor = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROVEEDOR_SEL") == 0 )
         {
            AV58TFBCProveedor_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROCESADO") == 0 )
         {
            AV59TFBCProcesado = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFBCProcesado_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCERROR") == 0 )
         {
            AV61TFBCError = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFBCError_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCERROR") == 0 )
         {
            AV63TFBCDescError = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCERROR_SEL") == 0 )
         {
            AV64TFBCDescError_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCFECHERROR") == 0 )
         {
            AV65TFBCFechError = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPILAERROR") == 0 )
         {
            AV67TFBCPilaError = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPILAERROR_SEL") == 0 )
         {
            AV68TFBCPilaError_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV95GXV3 = (int)(AV95GXV3+1) ;
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
      this.aP0[0] = tbcprodwwexport.this.AV11Filename;
      this.aP1[0] = tbcprodwwexport.this.AV12ErrorMessage;
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
      AV70FilterFullText = "" ;
      AV49TFBCProducto_Sel = "" ;
      AV48TFBCProducto = "" ;
      AV51TFBCDescripcion_Sel = "" ;
      AV50TFBCDescripcion = "" ;
      AV52TFBCPrecio = DecimalUtil.ZERO ;
      AV53TFBCPrecio_To = DecimalUtil.ZERO ;
      AV55TFBCUndComp_Sels = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV58TFBCProveedor_Sel = "" ;
      AV57TFBCProveedor = "" ;
      AV64TFBCDescError_Sel = "" ;
      AV63TFBCDescError = "" ;
      AV65TFBCFechError = GXutil.resetTime( GXutil.nullDate() );
      AV68TFBCPilaError_Sel = "" ;
      AV67TFBCPilaError = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV33Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      AV37ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13478BCProducto = "" ;
      A13479BCDescripc = "" ;
      A13480BCPrecio = DecimalUtil.ZERO ;
      A13482BCProveedo = "" ;
      A13485BCDescErro = "" ;
      A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      A13487BCPilaErro = "" ;
      AV76Tbcprodwwds_1_filterfulltext = "" ;
      AV77Tbcprodwwds_2_tfbcproducto = "" ;
      AV78Tbcprodwwds_3_tfbcproducto_sel = "" ;
      AV79Tbcprodwwds_4_tfbcdescripcion = "" ;
      AV80Tbcprodwwds_5_tfbcdescripcion_sel = "" ;
      AV81Tbcprodwwds_6_tfbcprecio = DecimalUtil.ZERO ;
      AV82Tbcprodwwds_7_tfbcprecio_to = DecimalUtil.ZERO ;
      AV83Tbcprodwwds_8_tfbcundcomp_sels = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV84Tbcprodwwds_9_tfbcproveedor = "" ;
      AV85Tbcprodwwds_10_tfbcproveedor_sel = "" ;
      AV90Tbcprodwwds_15_tfbcdescerror = "" ;
      AV91Tbcprodwwds_16_tfbcdescerror_sel = "" ;
      AV92Tbcprodwwds_17_tfbcfecherror = GXutil.resetTime( GXutil.nullDate() );
      AV93Tbcprodwwds_18_tfbcpilaerror = "" ;
      AV94Tbcprodwwds_19_tfbcpilaerror_sel = "" ;
      lV76Tbcprodwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV77Tbcprodwwds_2_tfbcproducto = "" ;
      lV79Tbcprodwwds_4_tfbcdescripcion = "" ;
      lV84Tbcprodwwds_9_tfbcproveedor = "" ;
      lV90Tbcprodwwds_15_tfbcdescerror = "" ;
      lV93Tbcprodwwds_18_tfbcpilaerror = "" ;
      P07ZK2_A13487BCPilaErro = new String[] {""} ;
      P07ZK2_n13487BCPilaErro = new boolean[] {false} ;
      P07ZK2_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      P07ZK2_n13486BCFechErro = new boolean[] {false} ;
      P07ZK2_A13485BCDescErro = new String[] {""} ;
      P07ZK2_n13485BCDescErro = new boolean[] {false} ;
      P07ZK2_A13484BCError = new short[1] ;
      P07ZK2_n13484BCError = new boolean[] {false} ;
      P07ZK2_A13483BCProcesad = new short[1] ;
      P07ZK2_n13483BCProcesad = new boolean[] {false} ;
      P07ZK2_A13482BCProveedo = new String[] {""} ;
      P07ZK2_n13482BCProveedo = new boolean[] {false} ;
      P07ZK2_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZK2_n13480BCPrecio = new boolean[] {false} ;
      P07ZK2_A13479BCDescripc = new String[] {""} ;
      P07ZK2_n13479BCDescripc = new boolean[] {false} ;
      P07ZK2_A13478BCProducto = new String[] {""} ;
      P07ZK2_A13481BCUndComp = new short[1] ;
      P07ZK2_n13481BCUndComp = new boolean[] {false} ;
      P07ZK2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV41UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV38ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54TFBCUndComp_SelsJson = "" ;
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbcprodwwexport__ekamat(),
         new Object[] {
             new Object[] {
            P07ZK2_A13487BCPilaErro, P07ZK2_n13487BCPilaErro, P07ZK2_A13486BCFechErro, P07ZK2_n13486BCFechErro, P07ZK2_A13485BCDescErro, P07ZK2_n13485BCDescErro, P07ZK2_A13484BCError, P07ZK2_n13484BCError, P07ZK2_A13483BCProcesad, P07ZK2_n13483BCProcesad,
            P07ZK2_A13482BCProveedo, P07ZK2_n13482BCProveedo, P07ZK2_A13480BCPrecio, P07ZK2_n13480BCPrecio, P07ZK2_A13479BCDescripc, P07ZK2_n13479BCDescripc, P07ZK2_A13478BCProducto, P07ZK2_A13481BCUndComp, P07ZK2_n13481BCUndComp, P07ZK2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV56TFBCUndComp_Sel ;
   private short AV59TFBCProcesado ;
   private short AV60TFBCProcesado_To ;
   private short AV61TFBCError ;
   private short AV62TFBCError_To ;
   private short GXv_int3[] ;
   private short A13481BCUndComp ;
   private short A13483BCProcesad ;
   private short A13484BCError ;
   private short AV86Tbcprodwwds_11_tfbcprocesado ;
   private short AV87Tbcprodwwds_12_tfbcprocesado_to ;
   private short AV88Tbcprodwwds_13_tfbcerror ;
   private short AV89Tbcprodwwds_14_tfbcerror_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV73GXV1 ;
   private int AV74GXV2 ;
   private int AV83Tbcprodwwds_8_tfbcundcomp_sels_size ;
   private int AV95GXV3 ;
   private long AV69i ;
   private long AV45VisibleColumnCount ;
   private java.math.BigDecimal AV52TFBCPrecio ;
   private java.math.BigDecimal AV53TFBCPrecio_To ;
   private java.math.BigDecimal A13480BCPrecio ;
   private java.math.BigDecimal AV81Tbcprodwwds_6_tfbcprecio ;
   private java.math.BigDecimal AV82Tbcprodwwds_7_tfbcprecio_to ;
   private String AV49TFBCProducto_Sel ;
   private String AV48TFBCProducto ;
   private String AV51TFBCDescripcion_Sel ;
   private String AV50TFBCDescripcion ;
   private String AV58TFBCProveedor_Sel ;
   private String AV57TFBCProveedor ;
   private String A13478BCProducto ;
   private String A13479BCDescripc ;
   private String A13482BCProveedo ;
   private String AV77Tbcprodwwds_2_tfbcproducto ;
   private String AV78Tbcprodwwds_3_tfbcproducto_sel ;
   private String AV79Tbcprodwwds_4_tfbcdescripcion ;
   private String AV80Tbcprodwwds_5_tfbcdescripcion_sel ;
   private String AV84Tbcprodwwds_9_tfbcproveedor ;
   private String AV85Tbcprodwwds_10_tfbcproveedor_sel ;
   private String scmdbuf ;
   private String lV77Tbcprodwwds_2_tfbcproducto ;
   private String lV79Tbcprodwwds_4_tfbcdescripcion ;
   private String lV84Tbcprodwwds_9_tfbcproveedor ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV65TFBCFechError ;
   private java.util.Date A13486BCFechErro ;
   private java.util.Date AV92Tbcprodwwds_17_tfbcfecherror ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13487BCPilaErro ;
   private boolean n13486BCFechErro ;
   private boolean n13485BCDescErro ;
   private boolean n13484BCError ;
   private boolean n13483BCProcesad ;
   private boolean n13482BCProveedo ;
   private boolean n13480BCPrecio ;
   private boolean n13479BCDescripc ;
   private boolean n13481BCUndComp ;
   private String AV40ColumnsSelectorXML ;
   private String AV41UserCustomValue ;
   private String AV54TFBCUndComp_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV70FilterFullText ;
   private String AV64TFBCDescError_Sel ;
   private String AV63TFBCDescError ;
   private String AV68TFBCPilaError_Sel ;
   private String AV67TFBCPilaError ;
   private String A13485BCDescErro ;
   private String A13487BCPilaErro ;
   private String AV76Tbcprodwwds_1_filterfulltext ;
   private String AV90Tbcprodwwds_15_tfbcdescerror ;
   private String AV91Tbcprodwwds_16_tfbcdescerror_sel ;
   private String AV93Tbcprodwwds_18_tfbcpilaerror ;
   private String AV94Tbcprodwwds_19_tfbcpilaerror_sel ;
   private String lV76Tbcprodwwds_1_filterfulltext ;
   private String lV90Tbcprodwwds_15_tfbcdescerror ;
   private String lV93Tbcprodwwds_18_tfbcpilaerror ;
   private GXSimpleCollection<Short> AV55TFBCUndComp_Sels ;
   private GXSimpleCollection<Short> AV83Tbcprodwwds_8_tfbcundcomp_sels ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_ekamat ;
   private String[] P07ZK2_A13487BCPilaErro ;
   private boolean[] P07ZK2_n13487BCPilaErro ;
   private java.util.Date[] P07ZK2_A13486BCFechErro ;
   private boolean[] P07ZK2_n13486BCFechErro ;
   private String[] P07ZK2_A13485BCDescErro ;
   private boolean[] P07ZK2_n13485BCDescErro ;
   private short[] P07ZK2_A13484BCError ;
   private boolean[] P07ZK2_n13484BCError ;
   private short[] P07ZK2_A13483BCProcesad ;
   private boolean[] P07ZK2_n13483BCProcesad ;
   private String[] P07ZK2_A13482BCProveedo ;
   private boolean[] P07ZK2_n13482BCProveedo ;
   private java.math.BigDecimal[] P07ZK2_A13480BCPrecio ;
   private boolean[] P07ZK2_n13480BCPrecio ;
   private String[] P07ZK2_A13479BCDescripc ;
   private boolean[] P07ZK2_n13479BCDescripc ;
   private String[] P07ZK2_A13478BCProducto ;
   private short[] P07ZK2_A13481BCUndComp ;
   private boolean[] P07ZK2_n13481BCUndComp ;
   private String[] P07ZK2_A396EmprCod ;
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

final  class tbcprodwwexport__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A13481BCUndComp ,
                                          GXSimpleCollection<Short> AV83Tbcprodwwds_8_tfbcundcomp_sels ,
                                          String AV78Tbcprodwwds_3_tfbcproducto_sel ,
                                          String AV77Tbcprodwwds_2_tfbcproducto ,
                                          String AV80Tbcprodwwds_5_tfbcdescripcion_sel ,
                                          String AV79Tbcprodwwds_4_tfbcdescripcion ,
                                          java.math.BigDecimal AV81Tbcprodwwds_6_tfbcprecio ,
                                          java.math.BigDecimal AV82Tbcprodwwds_7_tfbcprecio_to ,
                                          int AV83Tbcprodwwds_8_tfbcundcomp_sels_size ,
                                          String AV85Tbcprodwwds_10_tfbcproveedor_sel ,
                                          String AV84Tbcprodwwds_9_tfbcproveedor ,
                                          short AV86Tbcprodwwds_11_tfbcprocesado ,
                                          short AV87Tbcprodwwds_12_tfbcprocesado_to ,
                                          short AV88Tbcprodwwds_13_tfbcerror ,
                                          short AV89Tbcprodwwds_14_tfbcerror_to ,
                                          String AV91Tbcprodwwds_16_tfbcdescerror_sel ,
                                          String AV90Tbcprodwwds_15_tfbcdescerror ,
                                          java.util.Date AV92Tbcprodwwds_17_tfbcfecherror ,
                                          String AV94Tbcprodwwds_19_tfbcpilaerror_sel ,
                                          String AV93Tbcprodwwds_18_tfbcpilaerror ,
                                          String A13478BCProducto ,
                                          String A13479BCDescripc ,
                                          java.math.BigDecimal A13480BCPrecio ,
                                          String A13482BCProveedo ,
                                          short A13483BCProcesad ,
                                          short A13484BCError ,
                                          String A13485BCDescErro ,
                                          java.util.Date A13486BCFechErro ,
                                          String A13487BCPilaErro ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV76Tbcprodwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT [Pila error], [Fecha y hora error], [Descripción error], [Error], [Procesado], [Proveedor], [Precio], [Descripción], [Producto], [Unidad Compra], [Emprcod]" ;
      scmdbuf += " FROM [Producto] WITH (NOLOCK)" ;
      if ( (GXutil.strcmp("", AV78Tbcprodwwds_3_tfbcproducto_sel)==0) && ( ! (GXutil.strcmp("", AV77Tbcprodwwds_2_tfbcproducto)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Producto]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tbcprodwwds_3_tfbcproducto_sel)==0) )
      {
         addWhere(sWhereString, "([Producto] = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tbcprodwwds_5_tfbcdescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV79Tbcprodwwds_4_tfbcdescripcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tbcprodwwds_5_tfbcdescripcion_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción] = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tbcprodwwds_6_tfbcprecio)==0) )
      {
         addWhere(sWhereString, "([Precio] >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Tbcprodwwds_7_tfbcprecio_to)==0) )
      {
         addWhere(sWhereString, "([Precio] <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( AV83Tbcprodwwds_8_tfbcundcomp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("sqlserver", AV83Tbcprodwwds_8_tfbcundcomp_sels, "[Unidad Compra] IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV85Tbcprodwwds_10_tfbcproveedor_sel)==0) && ( ! (GXutil.strcmp("", AV84Tbcprodwwds_9_tfbcproveedor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Proveedor]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tbcprodwwds_10_tfbcproveedor_sel)==0) )
      {
         addWhere(sWhereString, "([Proveedor] = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV86Tbcprodwwds_11_tfbcprocesado) )
      {
         addWhere(sWhereString, "([Procesado] >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Tbcprodwwds_12_tfbcprocesado_to) )
      {
         addWhere(sWhereString, "([Procesado] <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV88Tbcprodwwds_13_tfbcerror) )
      {
         addWhere(sWhereString, "([Error] >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV89Tbcprodwwds_14_tfbcerror_to) )
      {
         addWhere(sWhereString, "([Error] <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tbcprodwwds_16_tfbcdescerror_sel)==0) && ( ! (GXutil.strcmp("", AV90Tbcprodwwds_15_tfbcdescerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tbcprodwwds_16_tfbcdescerror_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción error] = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Tbcprodwwds_17_tfbcfecherror) )
      {
         addWhere(sWhereString, "([Fecha y hora error] >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tbcprodwwds_19_tfbcpilaerror_sel)==0) && ( ! (GXutil.strcmp("", AV93Tbcprodwwds_18_tfbcpilaerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Pila error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tbcprodwwds_19_tfbcpilaerror_sel)==0) )
      {
         addWhere(sWhereString, "([Pila error] = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [Descripción]" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Descripción] DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [Producto]" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Producto] DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [Precio]" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Precio] DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [Unidad Compra]" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Unidad Compra] DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [Proveedor]" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Proveedor] DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [Procesado]" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Procesado] DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [Error]" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Error] DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [Descripción error]" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Descripción error] DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [Fecha y hora error]" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Fecha y hora error] DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY [Pila error]" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Pila error] DESC" ;
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
                  return conditional_P07ZK2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

