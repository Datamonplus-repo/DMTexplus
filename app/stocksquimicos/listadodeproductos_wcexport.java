package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeproductos_wcexport extends GXProcedure
{
   public listadodeproductos_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeproductos_wcexport.class ), "" );
   }

   public listadodeproductos_wcexport( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      listadodeproductos_wcexport.this.aP1 = new String[] {""};
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
      listadodeproductos_wcexport.this.aP0 = aP0;
      listadodeproductos_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeProductos_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFPrdNum_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFPrdNum, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrdNom_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrdNom, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPrdExiAlm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrdExiAlm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Existencias Almacen", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFPrdExiAlm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFPrdExiAlm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdCanRes)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFPrdCanRes_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad Reservada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFPrdCanRes)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFPrdCanRes_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFPrdDisponible)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFPrdDisponible_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disponible", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV98TFPrdDisponible)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV99TFPrdDisponible_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdCanPen)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdCanPen_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pdte. Recibir", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFPrdCanPen)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFPrdCanPen_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdPreAct_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio Actual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFPrdPreAct)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFPrdPreAct_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFTipPrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFTipPrdDsc_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFTipPrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFTipPrdDsc, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFValDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Validez", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFValDsc_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFValDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Validez", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFValDsc, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFPrdRec_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "R?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFPrdRec_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFPrdRec)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "R?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFPrdRec, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdAox)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPrdAox_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "AOX", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TFPrdAox)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFPrdAox_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFPrdGots_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "GOTS", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFPrdGots_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFPrdGots)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "GOTS", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFPrdGots, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV61TFPrdReach_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "REACH", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFPrdReach_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFPrdReach)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "REACH", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFPrdReach, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV63TFPrdOkotex_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Oeko Tex", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV38i = 1 ;
         AV102GXV1 = 1 ;
         while ( AV102GXV1 <= AV63TFPrdOkotex_Sels.size() )
         {
            AV64TFPrdOkotex_Sel = (String)AV63TFPrdOkotex_Sels.elementAt(-1+AV102GXV1) ;
            if ( AV38i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV64TFPrdOkotex_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV64TFPrdOkotex_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "S", "") );
            }
            AV38i = (long)(AV38i+1) ;
            AV102GXV1 = (int)(AV102GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV66TFPrdHm_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HM", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFPrdHm_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV65TFPrdHm)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HM", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFPrdHm, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV68TFPrdZDHC_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "ZDHC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV38i = 1 ;
         AV103GXV2 = 1 ;
         while ( AV103GXV2 <= AV68TFPrdZDHC_Sels.size() )
         {
            AV69TFPrdZDHC_Sel = (String)AV68TFPrdZDHC_Sels.elementAt(-1+AV103GXV2) ;
            if ( AV38i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV69TFPrdZDHC_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV69TFPrdZDHC_Sel), "1") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nivel 1", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV69TFPrdZDHC_Sel), "2") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nivel 2", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV69TFPrdZDHC_Sel), "3") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Nivel 3", "") );
            }
            AV38i = (long)(AV38i+1) ;
            AV103GXV2 = (int)(AV103GXV2+1) ;
         }
      }
      if ( ! ( ( AV71TFPrdList_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "List by Inditex ", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV38i = 1 ;
         AV104GXV3 = 1 ;
         while ( AV104GXV3 <= AV71TFPrdList_Sels.size() )
         {
            AV72TFPrdList_Sel = (String)AV71TFPrdList_Sels.elementAt(-1+AV104GXV3) ;
            if ( AV38i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV72TFPrdList_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "S", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV72TFPrdList_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            AV38i = (long)(AV38i+1) ;
            AV104GXV3 = (int)(AV104GXV3+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV74TFPrdTHELIST_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "THELIST", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFPrdTHELIST_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFPrdTHELIST)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "THELIST", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFPrdTHELIST, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV76TFPrdGRS_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "GRS", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV38i = 1 ;
         AV105GXV4 = 1 ;
         while ( AV105GXV4 <= AV76TFPrdGRS_Sels.size() )
         {
            AV77TFPrdGRS_Sel = (String)AV76TFPrdGRS_Sels.elementAt(-1+AV105GXV4) ;
            if ( AV38i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV77TFPrdGRS_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV77TFPrdGRS_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "S", "") );
            }
            AV38i = (long)(AV38i+1) ;
            AV105GXV4 = (int)(AV105GXV4+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV79TFPrdHS_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hoja?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFPrdHS_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV78TFPrdHS)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hoja?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFPrdHS, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80TFPrdFHS)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV80TFPrdFHS );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV83TFPrdNum2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV83TFPrdNum2_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV82TFPrdNum2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFPrdNum2, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV85TFPrdNom2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "NOmbre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV85TFPrdNom2_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV84TFPrdNom2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "NOmbre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV84TFPrdNom2, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV87TFPrdRefPrv_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Referencia Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV87TFPrdRefPrv_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV86TFPrdRefPrv)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Referencia Proveedor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV86TFPrdRefPrv, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV89TFPrdFuncion_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Funcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV89TFPrdFuncion_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV88TFPrdFuncion)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Funcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV88TFPrdFuncion, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV91TFPrdEINECS_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N EINECS", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV91TFPrdEINECS_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV90TFPrdEINECS)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N EINECS", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90TFPrdEINECS, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV93TFPrdNCAS_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº CAS", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV93TFPrdNCAS_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV92TFPrdNCAS)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº CAS", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92TFPrdNCAS, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV94TFPrvNum) && (0==AV95TFPrvNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV94TFPrvNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV95TFPrvNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV97TFPrvNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV97TFPrvNom_Sel, GXv_char5) ;
         listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV96TFPrvNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV96TFPrvNom, GXv_char5) ;
            listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.ListadodeProductos_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("StocksQuimicos.ListadodeProductos_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV106GXV5 = 1 ;
      while ( AV106GXV5 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV106GXV5));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV106GXV5 = (int)(AV106GXV5+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = AV34TFPrdNum ;
      AV110Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = AV36TFPrdNom ;
      AV112Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV113Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = AV42TFPrdExiAlm ;
      AV114Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = AV43TFPrdExiAlm_To ;
      AV115Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = AV44TFPrdCanRes ;
      AV116Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = AV45TFPrdCanRes_To ;
      AV117Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = AV98TFPrdDisponible ;
      AV118Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = AV99TFPrdDisponible_To ;
      AV119Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = AV46TFPrdCanPen ;
      AV120Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = AV47TFPrdCanPen_To ;
      AV121Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = AV48TFPrdPreAct ;
      AV122Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = AV49TFPrdPreAct_To ;
      AV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = AV50TFTipPrdDsc ;
      AV124Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = AV51TFTipPrdDsc_Sel ;
      AV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = AV52TFValDsc ;
      AV126Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = AV53TFValDsc_Sel ;
      AV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = AV54TFPrdRec ;
      AV128Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = AV55TFPrdRec_Sel ;
      AV129Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = AV56TFPrdAox ;
      AV130Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = AV57TFPrdAox_To ;
      AV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = AV58TFPrdGots ;
      AV132Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = AV59TFPrdGots_Sel ;
      AV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = AV60TFPrdReach ;
      AV134Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = AV61TFPrdReach_Sel ;
      AV135Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = AV63TFPrdOkotex_Sels ;
      AV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = AV65TFPrdHm ;
      AV137Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = AV66TFPrdHm_Sel ;
      AV138Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = AV68TFPrdZDHC_Sels ;
      AV139Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = AV71TFPrdList_Sels ;
      AV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = AV73TFPrdTHELIST ;
      AV141Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = AV74TFPrdTHELIST_Sel ;
      AV142Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = AV76TFPrdGRS_Sels ;
      AV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = AV78TFPrdHS ;
      AV144Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = AV79TFPrdHS_Sel ;
      AV145Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = AV80TFPrdFHS ;
      AV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = AV82TFPrdNum2 ;
      AV147Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = AV83TFPrdNum2_Sel ;
      AV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = AV84TFPrdNom2 ;
      AV149Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = AV85TFPrdNom2_Sel ;
      AV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = AV86TFPrdRefPrv ;
      AV151Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = AV87TFPrdRefPrv_Sel ;
      AV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = AV88TFPrdFuncion ;
      AV153Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = AV89TFPrdFuncion_Sel ;
      AV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = AV90TFPrdEINECS ;
      AV155Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = AV91TFPrdEINECS_Sel ;
      AV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = AV92TFPrdNCAS ;
      AV157Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = AV93TFPrdNCAS_Sel ;
      AV158Stocksquimicos_listadodeproductos_wcds_51_tfprvnum = AV94TFPrvNum ;
      AV159Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to = AV95TFPrvNum_To ;
      AV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = AV96TFPrvNom ;
      AV161Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = AV97TFPrvNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV135Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV138Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV139Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ,
                                           A13974PrdGRS ,
                                           AV142Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ,
                                           AV110Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ,
                                           AV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ,
                                           AV112Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ,
                                           AV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ,
                                           AV113Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ,
                                           AV114Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ,
                                           AV115Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ,
                                           AV116Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ,
                                           AV117Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ,
                                           AV118Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ,
                                           AV119Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ,
                                           AV120Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ,
                                           AV121Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ,
                                           AV122Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ,
                                           AV124Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ,
                                           AV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ,
                                           AV126Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ,
                                           AV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ,
                                           AV128Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ,
                                           AV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ,
                                           AV129Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ,
                                           AV130Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ,
                                           AV132Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ,
                                           AV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ,
                                           AV134Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ,
                                           AV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ,
                                           Integer.valueOf(AV135Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels.size()) ,
                                           AV137Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ,
                                           AV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ,
                                           Integer.valueOf(AV138Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV139Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels.size()) ,
                                           AV141Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ,
                                           AV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ,
                                           Integer.valueOf(AV142Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels.size()) ,
                                           AV144Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ,
                                           AV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ,
                                           AV145Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ,
                                           AV147Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ,
                                           AV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ,
                                           AV149Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ,
                                           AV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ,
                                           AV151Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ,
                                           AV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ,
                                           AV153Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ,
                                           AV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ,
                                           AV155Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ,
                                           AV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ,
                                           AV157Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ,
                                           AV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ,
                                           Integer.valueOf(AV158Stocksquimicos_listadodeproductos_wcds_51_tfprvnum) ,
                                           Integer.valueOf(AV159Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to) ,
                                           AV161Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ,
                                           AV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ,
                                           AV40PrdNumfrom ,
                                           AV41PrdnumTo ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A6302TipPrdDsc ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 ,
                                           A4692PrdNom2 ,
                                           A728PrdRefPrv ,
                                           A11615PrdFuncion ,
                                           A11614PrdEINECS ,
                                           A9734PrdNCAS ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ,
                                           A13831PrdDisponi ,
                                           AV39emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum), 6, "%") ;
      lV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom), 26, "%") ;
      lV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = GXutil.padr( GXutil.rtrim( AV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc), 40, "%") ;
      lV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = GXutil.padr( GXutil.rtrim( AV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc), 16, "%") ;
      lV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = GXutil.padr( GXutil.rtrim( AV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec), 1, "%") ;
      lV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = GXutil.padr( GXutil.rtrim( AV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots), 1, "%") ;
      lV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = GXutil.padr( GXutil.rtrim( AV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach), 1, "%") ;
      lV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = GXutil.padr( GXutil.rtrim( AV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm), 1, "%") ;
      lV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = GXutil.padr( GXutil.rtrim( AV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist), 4, "%") ;
      lV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = GXutil.padr( GXutil.rtrim( AV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs), 1, "%") ;
      lV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2), 16, "%") ;
      lV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = GXutil.padr( GXutil.rtrim( AV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2), 40, "%") ;
      lV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv), 30, "%") ;
      lV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = GXutil.padr( GXutil.rtrim( AV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion), 50, "%") ;
      lV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = GXutil.padr( GXutil.rtrim( AV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs), 40, "%") ;
      lV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = GXutil.padr( GXutil.rtrim( AV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas), 30, "%") ;
      lV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = GXutil.padr( GXutil.rtrim( AV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom), 30, "%") ;
      /* Using cursor P09DU2 */
      pr_default.execute(0, new Object[] {AV39emprcod, lV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum, AV110Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel, lV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom, AV112Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel, AV113Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm, AV114Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to, AV115Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres, AV116Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to, AV117Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible, AV118Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to, AV119Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen, AV120Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to, AV121Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact, AV122Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to, lV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc, AV124Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel, lV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc, AV126Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel, lV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec, AV128Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel, AV129Stocksquimicos_listadodeproductos_wcds_22_tfprdaox, AV130Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to, lV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots, AV132Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel, lV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach, AV134Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel, lV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm, AV137Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel, lV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist, AV141Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel, lV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs, AV144Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel, AV145Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs, lV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2, AV147Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel, lV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2, AV149Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel, lV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv, AV151Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel, lV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion, AV153Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel, lV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs, AV155Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel, lV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas, AV157Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel, Integer.valueOf(AV158Stocksquimicos_listadodeproductos_wcds_51_tfprvnum), Integer.valueOf(AV159Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to), lV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom, AV161Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel, AV40PrdNumfrom, AV41PrdnumTo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09DU2_A856ValCod[0] ;
         A6301TipPrdCod = P09DU2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P09DU2_n6301TipPrdCod[0] ;
         A396EmprCod = P09DU2_A396EmprCod[0] ;
         A794PrvNom = P09DU2_A794PrvNom[0] ;
         n794PrvNom = P09DU2_n794PrvNom[0] ;
         A795PrvNum = P09DU2_A795PrvNum[0] ;
         A9734PrdNCAS = P09DU2_A9734PrdNCAS[0] ;
         A11614PrdEINECS = P09DU2_A11614PrdEINECS[0] ;
         A11615PrdFuncion = P09DU2_A11615PrdFuncion[0] ;
         A728PrdRefPrv = P09DU2_A728PrdRefPrv[0] ;
         A4692PrdNom2 = P09DU2_A4692PrdNom2[0] ;
         A4693PrdNum2 = P09DU2_A4693PrdNum2[0] ;
         A9742PrdFHS = P09DU2_A9742PrdFHS[0] ;
         A9741PrdHS = P09DU2_A9741PrdHS[0] ;
         A13302PrdTHELIST = P09DU2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P09DU2_n13302PrdTHELIST[0] ;
         A11364PrdHm = P09DU2_A11364PrdHm[0] ;
         A5887PrdReach = P09DU2_A5887PrdReach[0] ;
         A11363PrdGots = P09DU2_A11363PrdGots[0] ;
         A9733PrdAox = P09DU2_A9733PrdAox[0] ;
         A727PrdRec = P09DU2_A727PrdRec[0] ;
         A857ValDsc = P09DU2_A857ValDsc[0] ;
         n857ValDsc = P09DU2_n857ValDsc[0] ;
         A6302TipPrdDsc = P09DU2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09DU2_n6302TipPrdDsc[0] ;
         A724PrdPreAct = P09DU2_A724PrdPreAct[0] ;
         A684PrdCanPen = P09DU2_A684PrdCanPen[0] ;
         A13831PrdDisponi = P09DU2_A13831PrdDisponi[0] ;
         A718PrdNom = P09DU2_A718PrdNom[0] ;
         A719PrdNum = P09DU2_A719PrdNum[0] ;
         A13974PrdGRS = P09DU2_A13974PrdGRS[0] ;
         n13974PrdGRS = P09DU2_n13974PrdGRS[0] ;
         A11687PrdList = P09DU2_A11687PrdList[0] ;
         A13301PrdZDHC = P09DU2_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P09DU2_A5888PrdOkotex[0] ;
         A704PrdExiAlm = P09DU2_A704PrdExiAlm[0] ;
         A685PrdCanRes = P09DU2_A685PrdCanRes[0] ;
         A857ValDsc = P09DU2_A857ValDsc[0] ;
         n857ValDsc = P09DU2_n857ValDsc[0] ;
         A6302TipPrdDsc = P09DU2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09DU2_n6302TipPrdDsc[0] ;
         A794PrvNom = P09DU2_A794PrvNom[0] ;
         n794PrvNom = P09DU2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13831PrdDisponi, 12, 4) , GXutil.padr( "%" + AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A684PrdCanPen, 12, 4) , GXutil.padr( "%" + AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A727PrdRec) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4692PrdNom2) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9734PrdNCAS) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A704PrdExiAlm)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A685PrdCanRes)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13831PrdDisponi)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A684PrdCanPen)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A724PrdPreAct)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6302TipPrdDsc, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A857ValDsc, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A727PrdRec, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9733PrdAox)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11363PrdGots, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5887PrdReach, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), httpContext.getMessage( "S", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "S", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11364PrdHm, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "1") == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Nivel 1", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "2") == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Nivel 2", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "3") == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Nivel 3", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A11687PrdList), httpContext.getMessage( "S", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "S", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A11687PrdList), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13302PrdTHELIST, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A13974PrdGRS), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A13974PrdGRS), httpContext.getMessage( "S", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "S", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9741PrdHS, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A9742PrdFHS );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4693PrdNum2, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4692PrdNom2, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A728PrdRefPrv, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11615PrdFuncion, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11614PrdEINECS, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9734PrdNCAS, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A795PrvNum );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A794PrvNom, GXv_char5) ;
               listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNom", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdCanRes", "", "Cantidad Reservada", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdDisponible", "", "Disponible", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdCanPen", "", "Pdte. Recibir", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipPrdDsc", "", "Tipo Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ValDsc", "", "Validez", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdRec", "", "R?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdAox", "", "AOX", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdGots", "", "GOTS", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdReach", "", "REACH", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdOkotex", "", "Oeko Tex", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdHm", "", "HM", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdZDHC", "", "ZDHC", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdList", "", "List by Inditex ", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdTHELIST", "", "THELIST", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdGRS", "", "GRS", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdHS", "Seguridad", "Hoja?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdFHS", "Seguridad", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNum2", "Auxiliar", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNom2", "Auxiliar", "NOmbre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdRefPrv", "", "Referencia Proveedor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdFuncion", "", "Funcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdEINECS", "", "N EINECS", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdNCAS", "", "Nº CAS", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrvNum", "", "Proveedor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrvNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadodeProductos_WCColumnsSelector", GXv_char5) ;
      listadodeproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.ListadodeProductos_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.ListadodeProductos_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("StocksQuimicos.ListadodeProductos_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV162GXV6 = 1 ;
      while ( AV162GXV6 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV162GXV6));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV34TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV35TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV36TFPrdNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV37TFPrdNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV42TFPrdExiAlm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFPrdExiAlm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV44TFPrdCanRes = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFPrdCanRes_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV98TFPrdDisponible = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV99TFPrdDisponible_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV46TFPrdCanPen = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFPrdCanPen_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV48TFPrdPreAct = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFPrdPreAct_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV50TFTipPrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV51TFTipPrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV52TFValDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV53TFValDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV54TFPrdRec = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV55TFPrdRec_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV56TFPrdAox = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFPrdAox_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV58TFPrdGots = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV59TFPrdGots_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV60TFPrdReach = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV61TFPrdReach_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV62TFPrdOkotex_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV63TFPrdOkotex_Sels.fromJSonString(AV62TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV65TFPrdHm = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV66TFPrdHm_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV67TFPrdZDHC_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV68TFPrdZDHC_Sels.fromJSonString(AV67TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV70TFPrdList_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV71TFPrdList_Sels.fromJSonString(AV70TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV73TFPrdTHELIST = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV74TFPrdTHELIST_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGRS_SEL") == 0 )
         {
            AV75TFPrdGRS_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV76TFPrdGRS_Sels.fromJSonString(AV75TFPrdGRS_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV78TFPrdHS = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV79TFPrdHS_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV80TFPrdFHS = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2") == 0 )
         {
            AV82TFPrdNum2 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2_SEL") == 0 )
         {
            AV83TFPrdNum2_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM2") == 0 )
         {
            AV84TFPrdNom2 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM2_SEL") == 0 )
         {
            AV85TFPrdNom2_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV86TFPrdRefPrv = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV87TFPrdRefPrv_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFUNCION") == 0 )
         {
            AV88TFPrdFuncion = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFUNCION_SEL") == 0 )
         {
            AV89TFPrdFuncion_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEINECS") == 0 )
         {
            AV90TFPrdEINECS = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEINECS_SEL") == 0 )
         {
            AV91TFPrdEINECS_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCAS") == 0 )
         {
            AV92TFPrdNCAS = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCAS_SEL") == 0 )
         {
            AV93TFPrdNCAS_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV94TFPrvNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV95TFPrvNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV96TFPrvNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV97TFPrvNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV39emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMFROM") == 0 )
         {
            AV40PrdNumfrom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMTO") == 0 )
         {
            AV41PrdnumTo = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV162GXV6 = (int)(AV162GXV6+1) ;
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
      this.aP0[0] = listadodeproductos_wcexport.this.AV11Filename;
      this.aP1[0] = listadodeproductos_wcexport.this.AV12ErrorMessage;
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
      AV35TFPrdNum_Sel = "" ;
      AV34TFPrdNum = "" ;
      AV37TFPrdNom_Sel = "" ;
      AV36TFPrdNom = "" ;
      AV42TFPrdExiAlm = DecimalUtil.ZERO ;
      AV43TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV44TFPrdCanRes = DecimalUtil.ZERO ;
      AV45TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV98TFPrdDisponible = DecimalUtil.ZERO ;
      AV99TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV46TFPrdCanPen = DecimalUtil.ZERO ;
      AV47TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV48TFPrdPreAct = DecimalUtil.ZERO ;
      AV49TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV51TFTipPrdDsc_Sel = "" ;
      AV50TFTipPrdDsc = "" ;
      AV53TFValDsc_Sel = "" ;
      AV52TFValDsc = "" ;
      AV55TFPrdRec_Sel = "" ;
      AV54TFPrdRec = "" ;
      AV56TFPrdAox = DecimalUtil.ZERO ;
      AV57TFPrdAox_To = DecimalUtil.ZERO ;
      AV59TFPrdGots_Sel = "" ;
      AV58TFPrdGots = "" ;
      AV61TFPrdReach_Sel = "" ;
      AV60TFPrdReach = "" ;
      AV63TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64TFPrdOkotex_Sel = "" ;
      AV66TFPrdHm_Sel = "" ;
      AV65TFPrdHm = "" ;
      AV68TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV69TFPrdZDHC_Sel = "" ;
      AV71TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV72TFPrdList_Sel = "" ;
      AV74TFPrdTHELIST_Sel = "" ;
      AV73TFPrdTHELIST = "" ;
      AV76TFPrdGRS_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV77TFPrdGRS_Sel = "" ;
      AV79TFPrdHS_Sel = "" ;
      AV78TFPrdHS = "" ;
      AV80TFPrdFHS = GXutil.nullDate() ;
      AV83TFPrdNum2_Sel = "" ;
      AV82TFPrdNum2 = "" ;
      AV85TFPrdNom2_Sel = "" ;
      AV84TFPrdNom2 = "" ;
      AV87TFPrdRefPrv_Sel = "" ;
      AV86TFPrdRefPrv = "" ;
      AV89TFPrdFuncion_Sel = "" ;
      AV88TFPrdFuncion = "" ;
      AV91TFPrdEINECS_Sel = "" ;
      AV90TFPrdEINECS = "" ;
      AV93TFPrdNCAS_Sel = "" ;
      AV92TFPrdNCAS = "" ;
      AV97TFPrvNom_Sel = "" ;
      AV96TFPrvNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A6302TipPrdDsc = "" ;
      A857ValDsc = "" ;
      A727PrdRec = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11364PrdHm = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A13302PrdTHELIST = "" ;
      A13974PrdGRS = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A4693PrdNum2 = "" ;
      A4692PrdNom2 = "" ;
      A728PrdRefPrv = "" ;
      A11615PrdFuncion = "" ;
      A11614PrdEINECS = "" ;
      A9734PrdNCAS = "" ;
      A794PrvNom = "" ;
      AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = "" ;
      AV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = "" ;
      AV110Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = "" ;
      AV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = "" ;
      AV112Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = "" ;
      AV113Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = DecimalUtil.ZERO ;
      AV114Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = DecimalUtil.ZERO ;
      AV115Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = DecimalUtil.ZERO ;
      AV116Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = DecimalUtil.ZERO ;
      AV117Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = DecimalUtil.ZERO ;
      AV118Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = DecimalUtil.ZERO ;
      AV119Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = DecimalUtil.ZERO ;
      AV120Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV121Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = DecimalUtil.ZERO ;
      AV122Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = DecimalUtil.ZERO ;
      AV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = "" ;
      AV124Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = "" ;
      AV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = "" ;
      AV126Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = "" ;
      AV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = "" ;
      AV128Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = "" ;
      AV129Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = DecimalUtil.ZERO ;
      AV130Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = DecimalUtil.ZERO ;
      AV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = "" ;
      AV132Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = "" ;
      AV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = "" ;
      AV134Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = "" ;
      AV135Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = "" ;
      AV137Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = "" ;
      AV138Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV139Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = "" ;
      AV141Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = "" ;
      AV142Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = "" ;
      AV144Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = "" ;
      AV145Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = GXutil.nullDate() ;
      AV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = "" ;
      AV147Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = "" ;
      AV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = "" ;
      AV149Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = "" ;
      AV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = "" ;
      AV151Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = "" ;
      AV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = "" ;
      AV153Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = "" ;
      AV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = "" ;
      AV155Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = "" ;
      AV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = "" ;
      AV157Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = "" ;
      AV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = "" ;
      AV161Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = "" ;
      lV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = "" ;
      lV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = "" ;
      lV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = "" ;
      lV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = "" ;
      lV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = "" ;
      lV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = "" ;
      lV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = "" ;
      lV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = "" ;
      lV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = "" ;
      lV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = "" ;
      lV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = "" ;
      lV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = "" ;
      lV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = "" ;
      lV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = "" ;
      lV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = "" ;
      lV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = "" ;
      lV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = "" ;
      AV40PrdNumfrom = "" ;
      AV41PrdnumTo = "" ;
      AV39emprcod = "" ;
      A396EmprCod = "" ;
      P09DU2_A856ValCod = new byte[1] ;
      P09DU2_A6301TipPrdCod = new short[1] ;
      P09DU2_n6301TipPrdCod = new boolean[] {false} ;
      P09DU2_A396EmprCod = new String[] {""} ;
      P09DU2_A794PrvNom = new String[] {""} ;
      P09DU2_n794PrvNom = new boolean[] {false} ;
      P09DU2_A795PrvNum = new int[1] ;
      P09DU2_A9734PrdNCAS = new String[] {""} ;
      P09DU2_A11614PrdEINECS = new String[] {""} ;
      P09DU2_A11615PrdFuncion = new String[] {""} ;
      P09DU2_A728PrdRefPrv = new String[] {""} ;
      P09DU2_A4692PrdNom2 = new String[] {""} ;
      P09DU2_A4693PrdNum2 = new String[] {""} ;
      P09DU2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P09DU2_A9741PrdHS = new String[] {""} ;
      P09DU2_A13302PrdTHELIST = new String[] {""} ;
      P09DU2_n13302PrdTHELIST = new boolean[] {false} ;
      P09DU2_A11364PrdHm = new String[] {""} ;
      P09DU2_A5887PrdReach = new String[] {""} ;
      P09DU2_A11363PrdGots = new String[] {""} ;
      P09DU2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DU2_A727PrdRec = new String[] {""} ;
      P09DU2_A857ValDsc = new String[] {""} ;
      P09DU2_n857ValDsc = new boolean[] {false} ;
      P09DU2_A6302TipPrdDsc = new String[] {""} ;
      P09DU2_n6302TipPrdDsc = new boolean[] {false} ;
      P09DU2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DU2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DU2_A13831PrdDisponi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DU2_A718PrdNom = new String[] {""} ;
      P09DU2_A719PrdNum = new String[] {""} ;
      P09DU2_A13974PrdGRS = new String[] {""} ;
      P09DU2_n13974PrdGRS = new boolean[] {false} ;
      P09DU2_A11687PrdList = new String[] {""} ;
      P09DU2_A13301PrdZDHC = new String[] {""} ;
      P09DU2_A5888PrdOkotex = new String[] {""} ;
      P09DU2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DU2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV62TFPrdOkotex_SelsJson = "" ;
      AV67TFPrdZDHC_SelsJson = "" ;
      AV70TFPrdList_SelsJson = "" ;
      AV75TFPrdGRS_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodeproductos_wcexport__default(),
         new Object[] {
             new Object[] {
            P09DU2_A856ValCod, P09DU2_A6301TipPrdCod, P09DU2_n6301TipPrdCod, P09DU2_A396EmprCod, P09DU2_A794PrvNom, P09DU2_n794PrvNom, P09DU2_A795PrvNum, P09DU2_A9734PrdNCAS, P09DU2_A11614PrdEINECS, P09DU2_A11615PrdFuncion,
            P09DU2_A728PrdRefPrv, P09DU2_A4692PrdNom2, P09DU2_A4693PrdNum2, P09DU2_A9742PrdFHS, P09DU2_A9741PrdHS, P09DU2_A13302PrdTHELIST, P09DU2_n13302PrdTHELIST, P09DU2_A11364PrdHm, P09DU2_A5887PrdReach, P09DU2_A11363PrdGots,
            P09DU2_A9733PrdAox, P09DU2_A727PrdRec, P09DU2_A857ValDsc, P09DU2_n857ValDsc, P09DU2_A6302TipPrdDsc, P09DU2_n6302TipPrdDsc, P09DU2_A724PrdPreAct, P09DU2_A684PrdCanPen, P09DU2_A13831PrdDisponi, P09DU2_A718PrdNom,
            P09DU2_A719PrdNum, P09DU2_A13974PrdGRS, P09DU2_n13974PrdGRS, P09DU2_A11687PrdList, P09DU2_A13301PrdZDHC, P09DU2_A5888PrdOkotex, P09DU2_A704PrdExiAlm, P09DU2_A685PrdCanRes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV102GXV1 ;
   private int AV103GXV2 ;
   private int AV104GXV3 ;
   private int AV105GXV4 ;
   private int AV94TFPrvNum ;
   private int AV95TFPrvNum_To ;
   private int AV106GXV5 ;
   private int A795PrvNum ;
   private int AV158Stocksquimicos_listadodeproductos_wcds_51_tfprvnum ;
   private int AV159Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to ;
   private int AV135Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size ;
   private int AV138Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size ;
   private int AV139Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size ;
   private int AV142Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size ;
   private int AV162GXV6 ;
   private long AV38i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV42TFPrdExiAlm ;
   private java.math.BigDecimal AV43TFPrdExiAlm_To ;
   private java.math.BigDecimal AV44TFPrdCanRes ;
   private java.math.BigDecimal AV45TFPrdCanRes_To ;
   private java.math.BigDecimal AV98TFPrdDisponible ;
   private java.math.BigDecimal AV99TFPrdDisponible_To ;
   private java.math.BigDecimal AV46TFPrdCanPen ;
   private java.math.BigDecimal AV47TFPrdCanPen_To ;
   private java.math.BigDecimal AV48TFPrdPreAct ;
   private java.math.BigDecimal AV49TFPrdPreAct_To ;
   private java.math.BigDecimal AV56TFPrdAox ;
   private java.math.BigDecimal AV57TFPrdAox_To ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV113Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ;
   private java.math.BigDecimal AV114Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ;
   private java.math.BigDecimal AV115Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ;
   private java.math.BigDecimal AV116Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ;
   private java.math.BigDecimal AV117Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ;
   private java.math.BigDecimal AV118Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ;
   private java.math.BigDecimal AV119Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ;
   private java.math.BigDecimal AV120Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ;
   private java.math.BigDecimal AV121Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ;
   private java.math.BigDecimal AV122Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ;
   private java.math.BigDecimal AV129Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ;
   private java.math.BigDecimal AV130Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ;
   private String AV35TFPrdNum_Sel ;
   private String AV34TFPrdNum ;
   private String AV37TFPrdNom_Sel ;
   private String AV36TFPrdNom ;
   private String AV51TFTipPrdDsc_Sel ;
   private String AV50TFTipPrdDsc ;
   private String AV53TFValDsc_Sel ;
   private String AV52TFValDsc ;
   private String AV55TFPrdRec_Sel ;
   private String AV54TFPrdRec ;
   private String AV59TFPrdGots_Sel ;
   private String AV58TFPrdGots ;
   private String AV61TFPrdReach_Sel ;
   private String AV60TFPrdReach ;
   private String AV64TFPrdOkotex_Sel ;
   private String AV66TFPrdHm_Sel ;
   private String AV65TFPrdHm ;
   private String AV69TFPrdZDHC_Sel ;
   private String AV72TFPrdList_Sel ;
   private String AV74TFPrdTHELIST_Sel ;
   private String AV73TFPrdTHELIST ;
   private String AV77TFPrdGRS_Sel ;
   private String AV79TFPrdHS_Sel ;
   private String AV78TFPrdHS ;
   private String AV83TFPrdNum2_Sel ;
   private String AV82TFPrdNum2 ;
   private String AV85TFPrdNom2_Sel ;
   private String AV84TFPrdNom2 ;
   private String AV87TFPrdRefPrv_Sel ;
   private String AV86TFPrdRefPrv ;
   private String AV89TFPrdFuncion_Sel ;
   private String AV88TFPrdFuncion ;
   private String AV91TFPrdEINECS_Sel ;
   private String AV90TFPrdEINECS ;
   private String AV93TFPrdNCAS_Sel ;
   private String AV92TFPrdNCAS ;
   private String AV97TFPrvNom_Sel ;
   private String AV96TFPrvNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A6302TipPrdDsc ;
   private String A857ValDsc ;
   private String A727PrdRec ;
   private String A11363PrdGots ;
   private String A5887PrdReach ;
   private String A5888PrdOkotex ;
   private String A11364PrdHm ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A13302PrdTHELIST ;
   private String A13974PrdGRS ;
   private String A9741PrdHS ;
   private String A4693PrdNum2 ;
   private String A4692PrdNom2 ;
   private String A728PrdRefPrv ;
   private String A11615PrdFuncion ;
   private String A11614PrdEINECS ;
   private String A9734PrdNCAS ;
   private String A794PrvNom ;
   private String AV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ;
   private String AV110Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ;
   private String AV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ;
   private String AV112Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ;
   private String AV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ;
   private String AV124Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ;
   private String AV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ;
   private String AV126Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ;
   private String AV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ;
   private String AV128Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ;
   private String AV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ;
   private String AV132Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ;
   private String AV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ;
   private String AV134Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ;
   private String AV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ;
   private String AV137Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ;
   private String AV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ;
   private String AV141Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ;
   private String AV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ;
   private String AV144Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ;
   private String AV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ;
   private String AV147Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ;
   private String AV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ;
   private String AV149Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ;
   private String AV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ;
   private String AV151Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ;
   private String AV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ;
   private String AV153Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ;
   private String AV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ;
   private String AV155Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ;
   private String AV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ;
   private String AV157Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ;
   private String AV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ;
   private String AV161Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ;
   private String lV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ;
   private String lV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ;
   private String lV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ;
   private String lV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ;
   private String lV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ;
   private String lV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ;
   private String lV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ;
   private String lV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ;
   private String lV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ;
   private String lV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ;
   private String lV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ;
   private String lV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ;
   private String lV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ;
   private String lV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ;
   private String lV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ;
   private String lV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ;
   private String AV40PrdNumfrom ;
   private String AV41PrdnumTo ;
   private String AV39emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV80TFPrdFHS ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV145Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n794PrvNom ;
   private boolean n13302PrdTHELIST ;
   private boolean n857ValDsc ;
   private boolean n6302TipPrdDsc ;
   private boolean n13974PrdGRS ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV62TFPrdOkotex_SelsJson ;
   private String AV67TFPrdZDHC_SelsJson ;
   private String AV70TFPrdList_SelsJson ;
   private String AV75TFPrdGRS_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ;
   private String lV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV63TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV68TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV71TFPrdList_Sels ;
   private GXSimpleCollection<String> AV76TFPrdGRS_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09DU2_A856ValCod ;
   private short[] P09DU2_A6301TipPrdCod ;
   private boolean[] P09DU2_n6301TipPrdCod ;
   private String[] P09DU2_A396EmprCod ;
   private String[] P09DU2_A794PrvNom ;
   private boolean[] P09DU2_n794PrvNom ;
   private int[] P09DU2_A795PrvNum ;
   private String[] P09DU2_A9734PrdNCAS ;
   private String[] P09DU2_A11614PrdEINECS ;
   private String[] P09DU2_A11615PrdFuncion ;
   private String[] P09DU2_A728PrdRefPrv ;
   private String[] P09DU2_A4692PrdNom2 ;
   private String[] P09DU2_A4693PrdNum2 ;
   private java.util.Date[] P09DU2_A9742PrdFHS ;
   private String[] P09DU2_A9741PrdHS ;
   private String[] P09DU2_A13302PrdTHELIST ;
   private boolean[] P09DU2_n13302PrdTHELIST ;
   private String[] P09DU2_A11364PrdHm ;
   private String[] P09DU2_A5887PrdReach ;
   private String[] P09DU2_A11363PrdGots ;
   private java.math.BigDecimal[] P09DU2_A9733PrdAox ;
   private String[] P09DU2_A727PrdRec ;
   private String[] P09DU2_A857ValDsc ;
   private boolean[] P09DU2_n857ValDsc ;
   private String[] P09DU2_A6302TipPrdDsc ;
   private boolean[] P09DU2_n6302TipPrdDsc ;
   private java.math.BigDecimal[] P09DU2_A724PrdPreAct ;
   private java.math.BigDecimal[] P09DU2_A684PrdCanPen ;
   private java.math.BigDecimal[] P09DU2_A13831PrdDisponi ;
   private String[] P09DU2_A718PrdNom ;
   private String[] P09DU2_A719PrdNum ;
   private String[] P09DU2_A13974PrdGRS ;
   private boolean[] P09DU2_n13974PrdGRS ;
   private String[] P09DU2_A11687PrdList ;
   private String[] P09DU2_A13301PrdZDHC ;
   private String[] P09DU2_A5888PrdOkotex ;
   private java.math.BigDecimal[] P09DU2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09DU2_A685PrdCanRes ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV135Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV138Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV139Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ;
   private GXSimpleCollection<String> AV142Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodeproductos_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09DU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV135Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV138Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV139Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ,
                                          String A13974PrdGRS ,
                                          GXSimpleCollection<String> AV142Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ,
                                          String AV110Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ,
                                          String AV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ,
                                          String AV112Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ,
                                          String AV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV113Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ,
                                          java.math.BigDecimal AV114Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV115Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ,
                                          java.math.BigDecimal AV116Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV117Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ,
                                          java.math.BigDecimal AV118Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ,
                                          java.math.BigDecimal AV119Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ,
                                          java.math.BigDecimal AV120Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ,
                                          java.math.BigDecimal AV121Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ,
                                          java.math.BigDecimal AV122Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ,
                                          String AV124Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ,
                                          String AV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ,
                                          String AV126Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ,
                                          String AV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ,
                                          String AV128Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ,
                                          String AV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ,
                                          java.math.BigDecimal AV129Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ,
                                          java.math.BigDecimal AV130Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ,
                                          String AV132Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ,
                                          String AV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ,
                                          String AV134Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ,
                                          String AV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ,
                                          int AV135Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size ,
                                          String AV137Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ,
                                          String AV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ,
                                          int AV138Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size ,
                                          int AV139Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size ,
                                          String AV141Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ,
                                          String AV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ,
                                          int AV142Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size ,
                                          String AV144Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ,
                                          String AV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ,
                                          java.util.Date AV145Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ,
                                          String AV147Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ,
                                          String AV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ,
                                          String AV149Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ,
                                          String AV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ,
                                          String AV151Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ,
                                          String AV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ,
                                          String AV153Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ,
                                          String AV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ,
                                          String AV155Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ,
                                          String AV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ,
                                          String AV157Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ,
                                          String AV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ,
                                          int AV158Stocksquimicos_listadodeproductos_wcds_51_tfprvnum ,
                                          int AV159Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to ,
                                          String AV161Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ,
                                          String AV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ,
                                          String AV40PrdNumfrom ,
                                          String AV41PrdnumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A6302TipPrdDsc ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 ,
                                          String A4692PrdNom2 ,
                                          String A728PrdRefPrv ,
                                          String A11615PrdFuncion ,
                                          String A11614PrdEINECS ,
                                          String A9734PrdNCAS ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV108Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A13831PrdDisponi ,
                                          String AV39emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[52];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.TipPrdCod, T1.EmprCod, T4.PrvNom, T1.PrvNum, T1.PrdNCAS, T1.PrdEINECS, T1.PrdFuncion, T1.PrdRefPrv, T1.PrdNom2, T1.PrdNum2, T1.PrdFHS, T1.PrdHS," ;
      scmdbuf += " T1.PrdTHELIST, T1.PrdHm, T1.PrdReach, T1.PrdGots, T1.PrdAox, T1.PrdRec, T2.ValDsc, T3.TipPrdDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdExiAlm - T1.PrdCanRes AS PrdDisponi," ;
      scmdbuf += " T1.PrdNom, T1.PrdNum, T1.PrdGRS, T1.PrdList, T1.PrdZDHC, T1.PrdOkotex, T1.PrdExiAlm, T1.PrdCanRes FROM (((TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproductos_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV111Stocksquimicos_listadodeproductos_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV123Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV127Stocksquimicos_listadodeproductos_wcds_20_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Stocksquimicos_listadodeproductos_wcds_22_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV131Stocksquimicos_listadodeproductos_wcds_24_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV133Stocksquimicos_listadodeproductos_wcds_26_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( AV135Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV135Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV137Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV136Stocksquimicos_listadodeproductos_wcds_29_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( AV138Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV138Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV139Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV139Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV141Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV140Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( AV142Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV142Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels, "T1.PrdGRS IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV144Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV143Stocksquimicos_listadodeproductos_wcds_36_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV146Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel)==0) && ( ! (GXutil.strcmp("", AV148Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom2 = ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV150Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel)==0) && ( ! (GXutil.strcmp("", AV152Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdFuncion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdFuncion = ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel)==0) && ( ! (GXutil.strcmp("", AV154Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdEINECS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdEINECS = ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel)==0) && ( ! (GXutil.strcmp("", AV156Stocksquimicos_listadodeproductos_wcds_49_tfprdncas)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNCAS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNCAS = ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (0==AV158Stocksquimicos_listadodeproductos_wcds_51_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! (0==AV159Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV160Stocksquimicos_listadodeproductos_wcds_53_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40PrdNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41PrdnumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipPrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ValDsc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ValDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRec" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRec DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGRS" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGRS DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom2" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PrvNom DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P09DU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , ((Number) dynConstraints[85]).intValue() , (String)dynConstraints[86] , ((Number) dynConstraints[87]).shortValue() , ((Boolean) dynConstraints[88]).booleanValue() , (String)dynConstraints[89] , (java.math.BigDecimal)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((String[]) buf[8])[0] = rslt.getString(7, 40);
               ((String[]) buf[9])[0] = rslt.getString(8, 50);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 40);
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((String[]) buf[18])[0] = rslt.getString(16, 1);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(24,4);
               ((String[]) buf[29])[0] = rslt.getString(25, 26);
               ((String[]) buf[30])[0] = rslt.getString(26, 6);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(28, 1);
               ((String[]) buf[34])[0] = rslt.getString(29, 1);
               ((String[]) buf[35])[0] = rslt.getString(30, 1);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(31,4);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(32,4);
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
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[85]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 50);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 40);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 30);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               return;
      }
   }

}

