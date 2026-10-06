package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientodehdrs_wcexport extends GXProcedure
{
   public mantenimientodehdrs_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientodehdrs_wcexport.class ), "" );
   }

   public mantenimientodehdrs_wcexport( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      mantenimientodehdrs_wcexport.this.aP1 = new String[] {""};
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
      mantenimientodehdrs_wcexport.this.aP0 = aP0;
      mantenimientodehdrs_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "MantenimientodeHDRs_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFBarNHdr_Sel, GXv_char5) ;
         mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
            mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFBarNHdr, GXv_char5) ;
            mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFCliNom_Sel, GXv_char5) ;
         mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFCliNom, GXv_char5) ;
            mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV72TFPedidoCliente_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFPedidoCliente_Sel, GXv_char5) ;
         mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFPedidoCliente)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFPedidoCliente, GXv_char5) ;
            mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFBarSer_Sel, GXv_char5) ;
         mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFBarSer, GXv_char5) ;
            mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFBarSerDsc_Sel, GXv_char5) ;
         mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFBarSerDsc, GXv_char5) ;
            mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFBarTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Tipo Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFBarTipArtDsc_Sel, GXv_char5) ;
         mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFBarTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Tipo Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFBarTipArtDsc, GXv_char5) ;
            mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarColNom_Sel, GXv_char5) ;
         mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarColNom, GXv_char5) ;
            mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV50TFBarColNum) && (0==AV51TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero del Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFBarColNum_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFBarFecGen)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Generacion Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV52TFBarFecGen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFBarFecCli)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Disposicion Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV54TFBarFecCli );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFBarFecSal)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Salida en Albaran", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV56TFBarFecSal );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV58TFBarSit) && (0==AV59TFBarSit_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "St", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV58TFBarSit );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV59TFBarSit_To );
      }
      if ( ! ( (0==AV60TFHayRec_Sel) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Receta?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         if ( AV60TFHayRec_Sel == 1 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( AV60TFHayRec_Sel == 2 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      if ( ! ( (0==AV76TFBarPart) && (0==AV77TFBarPart_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Partida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV76TFBarPart );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV77TFBarPart_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientodeHDRs_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("MantenimientodeHDRs_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV80GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV82Mantenimientodehdrs_wcds_1_filterfulltext = AV18FilterFullText ;
      AV83Mantenimientodehdrs_wcds_2_tfbarnhdr = AV34TFBarNHdr ;
      AV84Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV85Mantenimientodehdrs_wcds_4_tfclinom = AV36TFCliNom ;
      AV86Mantenimientodehdrs_wcds_5_tfclinom_sel = AV37TFCliNom_Sel ;
      AV87Mantenimientodehdrs_wcds_6_tfpedidocliente = AV71TFPedidoCliente ;
      AV88Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV72TFPedidoCliente_Sel ;
      AV89Mantenimientodehdrs_wcds_8_tfbarser = AV40TFBarSer ;
      AV90Mantenimientodehdrs_wcds_9_tfbarser_sel = AV41TFBarSer_Sel ;
      AV91Mantenimientodehdrs_wcds_10_tfbarserdsc = AV42TFBarSerDsc ;
      AV92Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV43TFBarSerDsc_Sel ;
      AV93Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV44TFBarTipArtDsc ;
      AV94Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV45TFBarTipArtDsc_Sel ;
      AV95Mantenimientodehdrs_wcds_14_tfbarcolnom = AV48TFBarColNom ;
      AV96Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV49TFBarColNom_Sel ;
      AV97Mantenimientodehdrs_wcds_16_tfbarcolnum = AV50TFBarColNum ;
      AV98Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV51TFBarColNum_To ;
      AV99Mantenimientodehdrs_wcds_18_tfbarfecgen = AV52TFBarFecGen ;
      AV100Mantenimientodehdrs_wcds_19_tfbarfeccli = AV54TFBarFecCli ;
      AV101Mantenimientodehdrs_wcds_20_tfbarfecsal = AV56TFBarFecSal ;
      AV102Mantenimientodehdrs_wcds_21_tfbarsit = AV58TFBarSit ;
      AV103Mantenimientodehdrs_wcds_22_tfbarsit_to = AV59TFBarSit_To ;
      AV104Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV60TFHayRec_Sel ;
      AV105Mantenimientodehdrs_wcds_24_tfbarpart = AV76TFBarPart ;
      AV106Mantenimientodehdrs_wcds_25_tfbarpart_to = AV77TFBarPart_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV84Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                           AV83Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                           AV86Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                           AV85Mantenimientodehdrs_wcds_4_tfclinom ,
                                           AV90Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                           AV89Mantenimientodehdrs_wcds_8_tfbarser ,
                                           AV92Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                           AV91Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                           AV94Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                           AV93Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                           AV96Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                           AV95Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                           Integer.valueOf(AV97Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                           Integer.valueOf(AV98Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                           AV99Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                           AV100Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                           AV101Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                           Byte.valueOf(AV102Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                           Byte.valueOf(AV103Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                           Short.valueOf(AV105Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                           Short.valueOf(AV106Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(A1503BarPart) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV82Mantenimientodehdrs_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           AV88Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV87Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                           Byte.valueOf(AV104Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV63Clicod) ,
                                           AV64Barfecgen ,
                                           AV65BarFecGen_to ,
                                           Byte.valueOf(AV66Barsit) ,
                                           Short.valueOf(AV67BarSit_to) ,
                                           A4812BarEncCli ,
                                           AV68BarEnccli ,
                                           Short.valueOf(AV70Enc20c) ,
                                           A143BarDisNum ,
                                           AV69BarDisnum ,
                                           Integer.valueOf(AV73Barcod) ,
                                           Byte.valueOf(AV74BarCodReo) ,
                                           AV75BarCodPar ,
                                           AV62Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV83Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV83Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
      lV85Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV85Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV89Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV89Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
      lV91Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV91Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
      lV93Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV93Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
      lV95Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV95Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
      /* Using cursor P097B2 */
      pr_default.execute(0, new Object[] {AV62Emprcod, Integer.valueOf(AV63Clicod), Integer.valueOf(AV63Clicod), AV64Barfecgen, AV65BarFecGen_to, Byte.valueOf(AV66Barsit), Short.valueOf(AV67BarSit_to), AV68BarEnccli, Short.valueOf(AV70Enc20c), AV68BarEnccli, AV69BarDisnum, Short.valueOf(AV70Enc20c), AV69BarDisnum, Integer.valueOf(AV73Barcod), Integer.valueOf(AV73Barcod), Byte.valueOf(AV74BarCodReo), Byte.valueOf(AV74BarCodReo), AV75BarCodPar, AV75BarCodPar, lV83Mantenimientodehdrs_wcds_2_tfbarnhdr, AV84Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV85Mantenimientodehdrs_wcds_4_tfclinom, AV86Mantenimientodehdrs_wcds_5_tfclinom_sel, lV89Mantenimientodehdrs_wcds_8_tfbarser, AV90Mantenimientodehdrs_wcds_9_tfbarser_sel, lV91Mantenimientodehdrs_wcds_10_tfbarserdsc, AV92Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV93Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV94Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV95Mantenimientodehdrs_wcds_14_tfbarcolnom, AV96Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV97Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV98Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV99Mantenimientodehdrs_wcds_18_tfbarfecgen, AV100Mantenimientodehdrs_wcds_19_tfbarfeccli, AV101Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV102Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV103Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV105Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV106Mantenimientodehdrs_wcds_25_tfbarpart_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P097B2_A217BarTipArt[0] ;
         n217BarTipArt = P097B2_n217BarTipArt[0] ;
         A252CliCod = P097B2_A252CliCod[0] ;
         n252CliCod = P097B2_n252CliCod[0] ;
         A1503BarPart = P097B2_A1503BarPart[0] ;
         A213BarSit = P097B2_A213BarSit[0] ;
         A161BarFecSal = P097B2_A161BarFecSal[0] ;
         A155BarFecCli = P097B2_A155BarFecCli[0] ;
         A159BarFecGen = P097B2_A159BarFecGen[0] ;
         A136BarColNum = P097B2_A136BarColNum[0] ;
         A135BarColNom = P097B2_A135BarColNom[0] ;
         A13711BarTipArtD = P097B2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097B2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P097B2_A1652BarSerDsc[0] ;
         A212BarSer = P097B2_A212BarSer[0] ;
         A279CliNom = P097B2_A279CliNom[0] ;
         A13696BarNHdr = P097B2_A13696BarNHdr[0] ;
         A143BarDisNum = P097B2_A143BarDisNum[0] ;
         A4812BarEncCli = P097B2_A4812BarEncCli[0] ;
         A130BarCodPar = P097B2_A130BarCodPar[0] ;
         A132BarCodReo = P097B2_A132BarCodReo[0] ;
         A129BarCod = P097B2_A129BarCod[0] ;
         A396EmprCod = P097B2_A396EmprCod[0] ;
         A13711BarTipArtD = P097B2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097B2_n13711BarTipArtD[0] ;
         A279CliNom = P097B2_A279CliNom[0] ;
         GXt_char4 = A13878PedidoClie ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char7[0] = A4812BarEncCli ;
         GXv_char8[0] = A143BarDisNum ;
         GXv_char9[0] = GXt_char4 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char7, GXv_char8, GXv_char9) ;
         mantenimientodehdrs_wcexport.this.A396EmprCod = GXv_char5[0] ;
         mantenimientodehdrs_wcexport.this.A4812BarEncCli = GXv_char7[0] ;
         mantenimientodehdrs_wcexport.this.A143BarDisNum = GXv_char8[0] ;
         mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
         A13878PedidoClie = GXt_char4 ;
         if ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV82Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV82Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV82Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV82Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV82Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV82Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV82Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV82Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV82Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV87Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV88Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int10 = A13710HayRec ;
                  GXv_int11[0] = GXt_int10 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int11) ;
                  mantenimientodehdrs_wcexport.this.GXt_int10 = GXv_int11[0] ;
                  A13710HayRec = GXt_int10 ;
                  if ( ( AV104Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV104Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
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
                        AV31VisibleColumnCount = 0 ;
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char9[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char9) ;
                           mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char9[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char9) ;
                           mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char9[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13878PedidoClie, GXv_char9) ;
                           mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char9[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char9) ;
                           mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char9[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char9) ;
                           mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char9[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13711BarTipArtD, GXv_char9) ;
                           mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char9[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char9) ;
                           mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_dtime6 = GXutil.resetTime( A159BarFecGen );
                           AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_dtime6 = GXutil.resetTime( A155BarFecCli );
                           AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_dtime6 = GXutil.resetTime( A161BarFecSal );
                           AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A213BarSit );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13710HayRec );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1503BarPart );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
                     }
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarNHdr", "", "N° Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "CliNom", "", "Nombre Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSer", "", "Serie", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarTipArtDsc", "", "Descripcion Tipo Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarColNom", "", "Nombre Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarColNum", "", "Numero del Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarFecGen", "", "Fecha Generacion Barcada", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarFecCli", "", "Fecha Disposicion Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSit", "", "St", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HayRec", "", "Receta?", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarPart", "", "Nº Partida", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char9[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientodeHDRs_WCColumnsSelector", GXv_char9) ;
      mantenimientodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientodeHDRs_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientodeHDRs_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("MantenimientodeHDRs_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV107GXV2 = 1 ;
      while ( AV107GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV2));
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
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV36TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV37TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV71TFPedidoCliente = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV72TFPedidoCliente_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV40TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV41TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV42TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV43TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV44TFBarTipArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV45TFBarTipArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV48TFBarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV49TFBarColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV50TFBarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFBarColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV52TFBarFecGen = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV54TFBarFecCli = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV56TFBarFecSal = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV58TFBarSit = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFBarSit_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHAYREC_SEL") == 0 )
         {
            AV60TFHayRec_Sel = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPART") == 0 )
         {
            AV76TFBarPart = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV77TFBarPart_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV62Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV63Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV64Barfecgen = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV65BarFecGen_to = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV66Barsit = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV67BarSit_to = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARENCCLI") == 0 )
         {
            AV68BarEnccli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUM") == 0 )
         {
            AV69BarDisnum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV73Barcod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV74BarCodReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV75BarCodPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV107GXV2 = (int)(AV107GXV2+1) ;
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
      this.aP0[0] = mantenimientodehdrs_wcexport.this.AV11Filename;
      this.aP1[0] = mantenimientodehdrs_wcexport.this.AV12ErrorMessage;
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
      AV37TFCliNom_Sel = "" ;
      AV36TFCliNom = "" ;
      AV72TFPedidoCliente_Sel = "" ;
      AV71TFPedidoCliente = "" ;
      AV41TFBarSer_Sel = "" ;
      AV40TFBarSer = "" ;
      AV43TFBarSerDsc_Sel = "" ;
      AV42TFBarSerDsc = "" ;
      AV45TFBarTipArtDsc_Sel = "" ;
      AV44TFBarTipArtDsc = "" ;
      AV49TFBarColNom_Sel = "" ;
      AV48TFBarColNom = "" ;
      AV52TFBarFecGen = GXutil.nullDate() ;
      AV54TFBarFecCli = GXutil.nullDate() ;
      AV56TFBarFecSal = GXutil.nullDate() ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      AV82Mantenimientodehdrs_wcds_1_filterfulltext = "" ;
      AV83Mantenimientodehdrs_wcds_2_tfbarnhdr = "" ;
      AV84Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = "" ;
      AV85Mantenimientodehdrs_wcds_4_tfclinom = "" ;
      AV86Mantenimientodehdrs_wcds_5_tfclinom_sel = "" ;
      AV87Mantenimientodehdrs_wcds_6_tfpedidocliente = "" ;
      AV88Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = "" ;
      AV89Mantenimientodehdrs_wcds_8_tfbarser = "" ;
      AV90Mantenimientodehdrs_wcds_9_tfbarser_sel = "" ;
      AV91Mantenimientodehdrs_wcds_10_tfbarserdsc = "" ;
      AV92Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = "" ;
      AV93Mantenimientodehdrs_wcds_12_tfbartipartdsc = "" ;
      AV94Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = "" ;
      AV95Mantenimientodehdrs_wcds_14_tfbarcolnom = "" ;
      AV96Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = "" ;
      AV99Mantenimientodehdrs_wcds_18_tfbarfecgen = GXutil.nullDate() ;
      AV100Mantenimientodehdrs_wcds_19_tfbarfeccli = GXutil.nullDate() ;
      AV101Mantenimientodehdrs_wcds_20_tfbarfecsal = GXutil.nullDate() ;
      lV82Mantenimientodehdrs_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV83Mantenimientodehdrs_wcds_2_tfbarnhdr = "" ;
      lV85Mantenimientodehdrs_wcds_4_tfclinom = "" ;
      lV89Mantenimientodehdrs_wcds_8_tfbarser = "" ;
      lV91Mantenimientodehdrs_wcds_10_tfbarserdsc = "" ;
      lV93Mantenimientodehdrs_wcds_12_tfbartipartdsc = "" ;
      lV95Mantenimientodehdrs_wcds_14_tfbarcolnom = "" ;
      A130BarCodPar = "" ;
      AV64Barfecgen = GXutil.nullDate() ;
      AV65BarFecGen_to = GXutil.nullDate() ;
      A4812BarEncCli = "" ;
      AV68BarEnccli = "" ;
      A143BarDisNum = "" ;
      AV69BarDisnum = "" ;
      AV75BarCodPar = "" ;
      AV62Emprcod = "" ;
      A396EmprCod = "" ;
      P097B2_A217BarTipArt = new short[1] ;
      P097B2_n217BarTipArt = new boolean[] {false} ;
      P097B2_A252CliCod = new int[1] ;
      P097B2_n252CliCod = new boolean[] {false} ;
      P097B2_A1503BarPart = new short[1] ;
      P097B2_A213BarSit = new byte[1] ;
      P097B2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P097B2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097B2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097B2_A136BarColNum = new int[1] ;
      P097B2_A135BarColNom = new String[] {""} ;
      P097B2_A13711BarTipArtD = new String[] {""} ;
      P097B2_n13711BarTipArtD = new boolean[] {false} ;
      P097B2_A1652BarSerDsc = new String[] {""} ;
      P097B2_A212BarSer = new String[] {""} ;
      P097B2_A279CliNom = new String[] {""} ;
      P097B2_A13696BarNHdr = new String[] {""} ;
      P097B2_A143BarDisNum = new String[] {""} ;
      P097B2_A4812BarEncCli = new String[] {""} ;
      P097B2_A130BarCodPar = new String[] {""} ;
      P097B2_A132BarCodReo = new byte[1] ;
      P097B2_A129BarCod = new int[1] ;
      P097B2_A396EmprCod = new String[] {""} ;
      GXv_char5 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int11 = new byte[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char9 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientodehdrs_wcexport__default(),
         new Object[] {
             new Object[] {
            P097B2_A217BarTipArt, P097B2_n217BarTipArt, P097B2_A252CliCod, P097B2_n252CliCod, P097B2_A1503BarPart, P097B2_A213BarSit, P097B2_A161BarFecSal, P097B2_A155BarFecCli, P097B2_A159BarFecGen, P097B2_A136BarColNum,
            P097B2_A135BarColNom, P097B2_A13711BarTipArtD, P097B2_n13711BarTipArtD, P097B2_A1652BarSerDsc, P097B2_A212BarSer, P097B2_A279CliNom, P097B2_A13696BarNHdr, P097B2_A143BarDisNum, P097B2_A4812BarEncCli, P097B2_A130BarCodPar,
            P097B2_A132BarCodReo, P097B2_A129BarCod, P097B2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV58TFBarSit ;
   private byte AV59TFBarSit_To ;
   private byte AV60TFHayRec_Sel ;
   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte AV102Mantenimientodehdrs_wcds_21_tfbarsit ;
   private byte AV103Mantenimientodehdrs_wcds_22_tfbarsit_to ;
   private byte AV104Mantenimientodehdrs_wcds_23_tfhayrec_sel ;
   private byte A132BarCodReo ;
   private byte AV66Barsit ;
   private byte AV74BarCodReo ;
   private byte GXt_int10 ;
   private byte GXv_int11[] ;
   private short AV76TFBarPart ;
   private short AV77TFBarPart_To ;
   private short GXv_int3[] ;
   private short A1503BarPart ;
   private short AV105Mantenimientodehdrs_wcds_24_tfbarpart ;
   private short AV106Mantenimientodehdrs_wcds_25_tfbarpart_to ;
   private short AV16OrderedBy ;
   private short AV67BarSit_to ;
   private short AV70Enc20c ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV50TFBarColNum ;
   private int AV51TFBarColNum_To ;
   private int AV80GXV1 ;
   private int A136BarColNum ;
   private int AV97Mantenimientodehdrs_wcds_16_tfbarcolnum ;
   private int AV98Mantenimientodehdrs_wcds_17_tfbarcolnum_to ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV63Clicod ;
   private int AV73Barcod ;
   private int AV107GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV35TFBarNHdr_Sel ;
   private String AV34TFBarNHdr ;
   private String AV37TFCliNom_Sel ;
   private String AV36TFCliNom ;
   private String AV72TFPedidoCliente_Sel ;
   private String AV71TFPedidoCliente ;
   private String AV41TFBarSer_Sel ;
   private String AV40TFBarSer ;
   private String AV43TFBarSerDsc_Sel ;
   private String AV42TFBarSerDsc ;
   private String AV45TFBarTipArtDsc_Sel ;
   private String AV44TFBarTipArtDsc ;
   private String AV49TFBarColNom_Sel ;
   private String AV48TFBarColNom ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A13878PedidoClie ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String AV83Mantenimientodehdrs_wcds_2_tfbarnhdr ;
   private String AV84Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ;
   private String AV85Mantenimientodehdrs_wcds_4_tfclinom ;
   private String AV86Mantenimientodehdrs_wcds_5_tfclinom_sel ;
   private String AV87Mantenimientodehdrs_wcds_6_tfpedidocliente ;
   private String AV88Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ;
   private String AV89Mantenimientodehdrs_wcds_8_tfbarser ;
   private String AV90Mantenimientodehdrs_wcds_9_tfbarser_sel ;
   private String AV91Mantenimientodehdrs_wcds_10_tfbarserdsc ;
   private String AV92Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ;
   private String AV93Mantenimientodehdrs_wcds_12_tfbartipartdsc ;
   private String AV94Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ;
   private String AV95Mantenimientodehdrs_wcds_14_tfbarcolnom ;
   private String AV96Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ;
   private String scmdbuf ;
   private String lV83Mantenimientodehdrs_wcds_2_tfbarnhdr ;
   private String lV85Mantenimientodehdrs_wcds_4_tfclinom ;
   private String lV89Mantenimientodehdrs_wcds_8_tfbarser ;
   private String lV91Mantenimientodehdrs_wcds_10_tfbarserdsc ;
   private String lV93Mantenimientodehdrs_wcds_12_tfbartipartdsc ;
   private String lV95Mantenimientodehdrs_wcds_14_tfbarcolnom ;
   private String A130BarCodPar ;
   private String A4812BarEncCli ;
   private String AV68BarEnccli ;
   private String A143BarDisNum ;
   private String AV69BarDisnum ;
   private String AV75BarCodPar ;
   private String AV62Emprcod ;
   private String A396EmprCod ;
   private String GXv_char5[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXt_char4 ;
   private String GXv_char9[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV52TFBarFecGen ;
   private java.util.Date AV54TFBarFecCli ;
   private java.util.Date AV56TFBarFecSal ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV99Mantenimientodehdrs_wcds_18_tfbarfecgen ;
   private java.util.Date AV100Mantenimientodehdrs_wcds_19_tfbarfeccli ;
   private java.util.Date AV101Mantenimientodehdrs_wcds_20_tfbarfecsal ;
   private java.util.Date AV64Barfecgen ;
   private java.util.Date AV65BarFecGen_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13711BarTipArtD ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV82Mantenimientodehdrs_wcds_1_filterfulltext ;
   private String lV82Mantenimientodehdrs_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P097B2_A217BarTipArt ;
   private boolean[] P097B2_n217BarTipArt ;
   private int[] P097B2_A252CliCod ;
   private boolean[] P097B2_n252CliCod ;
   private short[] P097B2_A1503BarPart ;
   private byte[] P097B2_A213BarSit ;
   private java.util.Date[] P097B2_A161BarFecSal ;
   private java.util.Date[] P097B2_A155BarFecCli ;
   private java.util.Date[] P097B2_A159BarFecGen ;
   private int[] P097B2_A136BarColNum ;
   private String[] P097B2_A135BarColNom ;
   private String[] P097B2_A13711BarTipArtD ;
   private boolean[] P097B2_n13711BarTipArtD ;
   private String[] P097B2_A1652BarSerDsc ;
   private String[] P097B2_A212BarSer ;
   private String[] P097B2_A279CliNom ;
   private String[] P097B2_A13696BarNHdr ;
   private String[] P097B2_A143BarDisNum ;
   private String[] P097B2_A4812BarEncCli ;
   private String[] P097B2_A130BarCodPar ;
   private byte[] P097B2_A132BarCodReo ;
   private int[] P097B2_A129BarCod ;
   private String[] P097B2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class mantenimientodehdrs_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV84Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV83Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV86Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV85Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV90Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV89Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV92Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV91Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV94Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV93Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV96Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV95Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV97Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV98Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV99Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV100Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV101Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV102Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV103Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV105Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV106Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV82Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV88Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV87Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV104Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV63Clicod ,
                                          java.util.Date AV64Barfecgen ,
                                          java.util.Date AV65BarFecGen_to ,
                                          byte AV66Barsit ,
                                          short AV67BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV68BarEnccli ,
                                          short AV70Enc20c ,
                                          String A143BarDisNum ,
                                          String AV69BarDisnum ,
                                          int AV73Barcod ,
                                          byte AV74BarCodReo ,
                                          String AV75BarCodPar ,
                                          String AV62Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[40];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.CliCod, T1.BarPart, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarSerDsc, T1.BarSer, T3.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV83Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV93Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV95Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV98Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (0==AV102Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV103Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV105Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (0==AV106Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPart" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPart DESC" ;
      }
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P097B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).byteValue() , ((Number) dynConstraints[49]).shortValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 11);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
      }
   }

}

