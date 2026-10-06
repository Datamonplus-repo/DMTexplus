package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodehdrs_wcexport extends GXProcedure
{
   public listadodehdrs_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodehdrs_wcexport.class ), "" );
   }

   public listadodehdrs_wcexport( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      listadodehdrs_wcexport.this.aP1 = new String[] {""};
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
      listadodehdrs_wcexport.this.aP0 = aP0;
      listadodehdrs_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeHDRs_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFCliCod) && (0==AV35TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFCliNom_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFCliNom, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV91TFPedidoCliente_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV91TFPedidoCliente_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV90TFPedidoCliente)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pedido Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90TFPedidoCliente, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV81TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFBarNHdr_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV80TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFBarNHdr, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFBarSer_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFBarSer, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFBarSerDsc_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFBarSerDsc, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV42TFBarTipArt) && (0==AV43TFBarTipArt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tip. Art.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFBarTipArt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFBarTipArt_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFBarTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFBarTipArtDsc_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFBarTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFBarTipArtDsc, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFBarColNom_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFBarColNom, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV48TFBarColNum) && (0==AV49TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFBarColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV55TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFBarNomCli_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFBarNomCli, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TFBarKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFBarKgm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFBarMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFBarMtr_To)) );
      }
      if ( ! ( (0==AV60TFBarPie) && (0==AV61TFBarPie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFBarPie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFBarPie_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62TFBarFecGen)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Generacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV62TFBarFecGen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFBarFecCli)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV64TFBarFecCli );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66TFBarFecFpr)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Entrega Prevista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV66TFBarFecFpr );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV69TFBarFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFBarFasCod_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFBarFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFBarFasCod, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV83TFBarMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV83TFBarMaqCod_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV82TFBarMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFBarMaqCod, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV84TFBarSit) && (0==AV85TFBarSit_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Situacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV84TFBarSit );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV85TFBarSit_To );
      }
      if ( ! ( (0==AV92TFBarAlbUltimo) && (0==AV93TFBarAlbUltimo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Albaran", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV92TFBarAlbUltimo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV93TFBarAlbUltimo_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94TFBarAlbMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95TFBarAlbMts_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mts Sal.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV94TFBarAlbMts)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV95TFBarAlbMts_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96TFBarAlbKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFBarAlbKgs_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs Sal.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV96TFBarAlbKgs)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV97TFBarAlbKgs_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV99TFBarCuaderno_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cuaderno", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV99TFBarCuaderno_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV98TFBarCuaderno)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cuaderno", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV98TFBarCuaderno, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV101TFBarNormas_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Normas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV101TFBarNormas_Sel, GXv_char5) ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV100TFBarNormas)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Normas", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV100TFBarNormas, GXv_char5) ;
            listadodehdrs_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV102TFBarAlbFact) && (0==AV103TFBarAlbFact_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Factura", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV102TFBarAlbFact );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodehdrs_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV103TFBarAlbFact_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("ListadodeHDRs_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("ListadodeHDRs_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV106GXV1 = 1 ;
      while ( AV106GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV106GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV106GXV1 = (int)(AV106GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV108Listadodehdrs_wcds_1_filterfulltext = AV18FilterFullText ;
      AV109Listadodehdrs_wcds_2_tfclicod = AV34TFCliCod ;
      AV110Listadodehdrs_wcds_3_tfclicod_to = AV35TFCliCod_To ;
      AV111Listadodehdrs_wcds_4_tfclinom = AV36TFCliNom ;
      AV112Listadodehdrs_wcds_5_tfclinom_sel = AV37TFCliNom_Sel ;
      AV113Listadodehdrs_wcds_6_tfpedidocliente = AV90TFPedidoCliente ;
      AV114Listadodehdrs_wcds_7_tfpedidocliente_sel = AV91TFPedidoCliente_Sel ;
      AV115Listadodehdrs_wcds_8_tfbarnhdr = AV80TFBarNHdr ;
      AV116Listadodehdrs_wcds_9_tfbarnhdr_sel = AV81TFBarNHdr_Sel ;
      AV117Listadodehdrs_wcds_10_tfbarser = AV38TFBarSer ;
      AV118Listadodehdrs_wcds_11_tfbarser_sel = AV39TFBarSer_Sel ;
      AV119Listadodehdrs_wcds_12_tfbarserdsc = AV40TFBarSerDsc ;
      AV120Listadodehdrs_wcds_13_tfbarserdsc_sel = AV41TFBarSerDsc_Sel ;
      AV121Listadodehdrs_wcds_14_tfbartipart = AV42TFBarTipArt ;
      AV122Listadodehdrs_wcds_15_tfbartipart_to = AV43TFBarTipArt_To ;
      AV123Listadodehdrs_wcds_16_tfbartipartdsc = AV44TFBarTipArtDsc ;
      AV124Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV45TFBarTipArtDsc_Sel ;
      AV125Listadodehdrs_wcds_18_tfbarcolnom = AV46TFBarColNom ;
      AV126Listadodehdrs_wcds_19_tfbarcolnom_sel = AV47TFBarColNom_Sel ;
      AV127Listadodehdrs_wcds_20_tfbarcolnum = AV48TFBarColNum ;
      AV128Listadodehdrs_wcds_21_tfbarcolnum_to = AV49TFBarColNum_To ;
      AV129Listadodehdrs_wcds_22_tfbarnomcli = AV54TFBarNomCli ;
      AV130Listadodehdrs_wcds_23_tfbarnomcli_sel = AV55TFBarNomCli_Sel ;
      AV131Listadodehdrs_wcds_24_tfbarkgm = AV56TFBarKgm ;
      AV132Listadodehdrs_wcds_25_tfbarkgm_to = AV57TFBarKgm_To ;
      AV133Listadodehdrs_wcds_26_tfbarmtr = AV58TFBarMtr ;
      AV134Listadodehdrs_wcds_27_tfbarmtr_to = AV59TFBarMtr_To ;
      AV135Listadodehdrs_wcds_28_tfbarpie = AV60TFBarPie ;
      AV136Listadodehdrs_wcds_29_tfbarpie_to = AV61TFBarPie_To ;
      AV137Listadodehdrs_wcds_30_tfbarfecgen = AV62TFBarFecGen ;
      AV138Listadodehdrs_wcds_31_tfbarfeccli = AV64TFBarFecCli ;
      AV139Listadodehdrs_wcds_32_tfbarfecfpr = AV66TFBarFecFpr ;
      AV140Listadodehdrs_wcds_33_tfbarfascod = AV68TFBarFasCod ;
      AV141Listadodehdrs_wcds_34_tfbarfascod_sel = AV69TFBarFasCod_Sel ;
      AV142Listadodehdrs_wcds_35_tfbarmaqcod = AV82TFBarMaqCod ;
      AV143Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV83TFBarMaqCod_Sel ;
      AV144Listadodehdrs_wcds_37_tfbarsit = AV84TFBarSit ;
      AV145Listadodehdrs_wcds_38_tfbarsit_to = AV85TFBarSit_To ;
      AV146Listadodehdrs_wcds_39_tfbaralbultimo = AV92TFBarAlbUltimo ;
      AV147Listadodehdrs_wcds_40_tfbaralbultimo_to = AV93TFBarAlbUltimo_To ;
      AV148Listadodehdrs_wcds_41_tfbaralbmts = AV94TFBarAlbMts ;
      AV149Listadodehdrs_wcds_42_tfbaralbmts_to = AV95TFBarAlbMts_To ;
      AV150Listadodehdrs_wcds_43_tfbaralbkgs = AV96TFBarAlbKgs ;
      AV151Listadodehdrs_wcds_44_tfbaralbkgs_to = AV97TFBarAlbKgs_To ;
      AV152Listadodehdrs_wcds_45_tfbarcuaderno = AV98TFBarCuaderno ;
      AV153Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV99TFBarCuaderno_Sel ;
      AV154Listadodehdrs_wcds_47_tfbarnormas = AV100TFBarNormas ;
      AV155Listadodehdrs_wcds_48_tfbarnormas_sel = AV101TFBarNormas_Sel ;
      AV156Listadodehdrs_wcds_49_tfbaralbfact = AV102TFBarAlbFact ;
      AV157Listadodehdrs_wcds_50_tfbaralbfact_to = AV103TFBarAlbFact_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV109Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV110Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV112Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV111Listadodehdrs_wcds_4_tfclinom ,
                                           AV116Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV115Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV118Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV117Listadodehdrs_wcds_10_tfbarser ,
                                           AV120Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV119Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV121Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV122Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV124Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV123Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV126Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV125Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV127Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV128Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV130Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV129Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV131Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV132Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV133Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV134Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV137Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV138Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV139Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV143Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV142Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV144Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV145Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV148Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV149Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV150Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV151Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV108Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV114Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV113Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV135Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV136Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV141Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV140Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV146Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV147Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV153Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV152Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV155Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV154Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV156Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV157Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV74BarFecGen ,
                                           AV75BarFecGen_to ,
                                           AV78BarFecCli ,
                                           AV79BarFecCli_to ,
                                           Integer.valueOf(AV76Clicod) ,
                                           Integer.valueOf(AV77Clicod_to) ,
                                           Byte.valueOf(AV72BarSit) ,
                                           Byte.valueOf(AV73BarSit_to) ,
                                           AV71Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV140Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV140Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV152Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV152Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV111Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV115Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV115Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV117Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV119Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV123Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV125Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV125Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV129Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV129Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV142Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV142Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097S6 */
      pr_default.execute(0, new Object[] {AV71Emprcod, AV141Listadodehdrs_wcds_34_tfbarfascod_sel, AV140Listadodehdrs_wcds_33_tfbarfascod, lV140Listadodehdrs_wcds_33_tfbarfascod, AV141Listadodehdrs_wcds_34_tfbarfascod_sel, AV141Listadodehdrs_wcds_34_tfbarfascod_sel, AV153Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV152Listadodehdrs_wcds_45_tfbarcuaderno, lV152Listadodehdrs_wcds_45_tfbarcuaderno, AV153Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV153Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV74BarFecGen, AV75BarFecGen_to, AV78BarFecCli, AV79BarFecCli_to, AV79BarFecCli_to, Integer.valueOf(AV76Clicod), Integer.valueOf(AV77Clicod_to), Byte.valueOf(AV72BarSit), Byte.valueOf(AV73BarSit_to), Integer.valueOf(AV109Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV110Listadodehdrs_wcds_3_tfclicod_to), lV111Listadodehdrs_wcds_4_tfclinom, AV112Listadodehdrs_wcds_5_tfclinom_sel, lV115Listadodehdrs_wcds_8_tfbarnhdr, AV116Listadodehdrs_wcds_9_tfbarnhdr_sel, lV117Listadodehdrs_wcds_10_tfbarser, AV118Listadodehdrs_wcds_11_tfbarser_sel, lV119Listadodehdrs_wcds_12_tfbarserdsc, AV120Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV121Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV122Listadodehdrs_wcds_15_tfbartipart_to), lV123Listadodehdrs_wcds_16_tfbartipartdsc, AV124Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV125Listadodehdrs_wcds_18_tfbarcolnom, AV126Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV127Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV128Listadodehdrs_wcds_21_tfbarcolnum_to), lV129Listadodehdrs_wcds_22_tfbarnomcli, AV130Listadodehdrs_wcds_23_tfbarnomcli_sel, AV131Listadodehdrs_wcds_24_tfbarkgm, AV132Listadodehdrs_wcds_25_tfbarkgm_to, AV133Listadodehdrs_wcds_26_tfbarmtr, AV134Listadodehdrs_wcds_27_tfbarmtr_to, AV137Listadodehdrs_wcds_30_tfbarfecgen, AV138Listadodehdrs_wcds_31_tfbarfeccli, AV139Listadodehdrs_wcds_32_tfbarfecfpr, lV142Listadodehdrs_wcds_35_tfbarmaqcod, AV143Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV144Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV145Listadodehdrs_wcds_38_tfbarsit_to), AV148Listadodehdrs_wcds_41_tfbaralbmts, AV149Listadodehdrs_wcds_42_tfbaralbmts_to, AV150Listadodehdrs_wcds_43_tfbaralbkgs, AV151Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4466BarAcaAnh = P097S6_A4466BarAcaAnh[0] ;
         A213BarSit = P097S6_A213BarSit[0] ;
         A180BarMaqCod = P097S6_A180BarMaqCod[0] ;
         A158BarFecFpr = P097S6_A158BarFecFpr[0] ;
         A155BarFecCli = P097S6_A155BarFecCli[0] ;
         A159BarFecGen = P097S6_A159BarFecGen[0] ;
         A1234BarNomCli = P097S6_A1234BarNomCli[0] ;
         A136BarColNum = P097S6_A136BarColNum[0] ;
         A135BarColNom = P097S6_A135BarColNom[0] ;
         A13711BarTipArtD = P097S6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097S6_n13711BarTipArtD[0] ;
         A217BarTipArt = P097S6_A217BarTipArt[0] ;
         n217BarTipArt = P097S6_n217BarTipArt[0] ;
         A1652BarSerDsc = P097S6_A1652BarSerDsc[0] ;
         A212BarSer = P097S6_A212BarSer[0] ;
         A13696BarNHdr = P097S6_A13696BarNHdr[0] ;
         A279CliNom = P097S6_A279CliNom[0] ;
         A252CliCod = P097S6_A252CliCod[0] ;
         n252CliCod = P097S6_n252CliCod[0] ;
         A13933BarCuadern = P097S6_A13933BarCuadern[0] ;
         n13933BarCuadern = P097S6_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097S6_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097S6_A13931BarAlbMts[0] ;
         A151BarFasCod = P097S6_A151BarFasCod[0] ;
         n151BarFasCod = P097S6_n151BarFasCod[0] ;
         A184BarMtr = P097S6_A184BarMtr[0] ;
         A166BarKgm = P097S6_A166BarKgm[0] ;
         A143BarDisNum = P097S6_A143BarDisNum[0] ;
         A4812BarEncCli = P097S6_A4812BarEncCli[0] ;
         A199BarPie1 = P097S6_A199BarPie1[0] ;
         A365DisDes = P097S6_A365DisDes[0] ;
         A898BarPieNDes = P097S6_A898BarPieNDes[0] ;
         A361DisCod = P097S6_A361DisCod[0] ;
         A130BarCodPar = P097S6_A130BarCodPar[0] ;
         A132BarCodReo = P097S6_A132BarCodReo[0] ;
         A129BarCod = P097S6_A129BarCod[0] ;
         A396EmprCod = P097S6_A396EmprCod[0] ;
         A13711BarTipArtD = P097S6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097S6_n13711BarTipArtD[0] ;
         A279CliNom = P097S6_A279CliNom[0] ;
         A13933BarCuadern = P097S6_A13933BarCuadern[0] ;
         n13933BarCuadern = P097S6_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097S6_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097S6_A13931BarAlbMts[0] ;
         A151BarFasCod = P097S6_A151BarFasCod[0] ;
         n151BarFasCod = P097S6_n151BarFasCod[0] ;
         A184BarMtr = P097S6_A184BarMtr[0] ;
         A166BarKgm = P097S6_A166BarKgm[0] ;
         A199BarPie1 = P097S6_A199BarPie1[0] ;
         A898BarPieNDes = P097S6_A898BarPieNDes[0] ;
         GXt_char4 = A13878PedidoClie ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char7[0] = A4812BarEncCli ;
         GXv_char8[0] = A143BarDisNum ;
         GXv_char9[0] = GXt_char4 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char7, GXv_char8, GXv_char9) ;
         listadodehdrs_wcexport.this.A396EmprCod = GXv_char5[0] ;
         listadodehdrs_wcexport.this.A4812BarEncCli = GXv_char7[0] ;
         listadodehdrs_wcexport.this.A143BarDisNum = GXv_char8[0] ;
         listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
         A13878PedidoClie = GXt_char4 ;
         if ( ! ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV113Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV114Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int10 = A13930BarAlbUlti ;
               GXv_int11[0] = GXt_int10 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int11) ;
               listadodehdrs_wcexport.this.GXt_int10 = GXv_int11[0] ;
               A13930BarAlbUlti = GXt_int10 ;
               if ( (0==AV146Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV146Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV147Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV147Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char4 = A13934BarNormas ;
                     GXv_char9[0] = GXt_char4 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char9) ;
                     listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                     A13934BarNormas = GXt_char4 ;
                     if ( ! ( (GXutil.strcmp("", AV155Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV154Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV154Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV155Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV155Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int12 = A13935BarAlbFact ;
                           GXv_int13[0] = GXt_int12 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int13) ;
                           listadodehdrs_wcexport.this.GXt_int12 = GXv_int13[0] ;
                           A13935BarAlbFact = GXt_int12 ;
                           if ( (0==AV156Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV156Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV157Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV157Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV108Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV108Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV135Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV135Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV136Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV136Listadodehdrs_wcds_29_tfbarpie_to ) ) )
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
                                             pr_default.close(0);
                                             pr_default.close(0);
                                             pr_default.close(0);
                                             returnInSub = true;
                                             if (true) return;
                                          }
                                          AV31VisibleColumnCount = 0 ;
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13878PedidoClie, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A217BarTipArt );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13711BarTipArtD, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A184BarMtr)) );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A198BarPie );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_dtime6 = GXutil.resetTime( A159BarFecGen );
                                             AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_dtime6 = GXutil.resetTime( A155BarFecCli );
                                             AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_dtime6 = GXutil.resetTime( A158BarFecFpr );
                                             AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A151BarFasCod, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A180BarMaqCod, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A213BarSit );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13930BarAlbUlti );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13931BarAlbMts)) );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13932BarAlbKgs)) );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13933BarCuadern, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             GXt_char4 = "" ;
                                             GXv_char9[0] = GXt_char4 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13934BarNormas, GXv_char9) ;
                                             listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                             AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A13935BarAlbFact );
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
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliCod", "", "Codigo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliNom", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNHdr", "", "N° Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSer", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSerDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipArt", "", "Tip. Art.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipArtDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNomCli", "", "Color Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarKgm", "Entradas", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarMtr", "Entradas", "Metros", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarPie", "Entradas", "Piezas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecGen", "Fecha", "Generacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecCli", "Fecha", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFecFpr", "Fecha", "Entrega Prevista", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarFasCod", "", "Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarMaqCod", "", "Maquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSit", "", "Situacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAlbUltimo", "", "Albaran", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAlbMts", "", "Mts Sal.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAlbKgs", "", "Kgs Sal.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarCuaderno", "", "Cuaderno", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNormas", "", "Normas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAlbFact", "", "Factura", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char9[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ListadodeHDRs_WCColumnsSelector", GXv_char9) ;
      listadodehdrs_wcexport.this.GXt_char4 = GXv_char9[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ListadodeHDRs_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListadodeHDRs_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ListadodeHDRs_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV158GXV2 = 1 ;
      while ( AV158GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV158GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
            AV90TFPedidoCliente = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV91TFPedidoCliente_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV80TFBarNHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV81TFBarNHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV38TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV39TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV40TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV41TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV42TFBarTipArt = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFBarTipArt_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
            AV46TFBarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV47TFBarColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV48TFBarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFBarColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV54TFBarNomCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV55TFBarNomCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV56TFBarKgm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFBarKgm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV58TFBarMtr = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFBarMtr_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV60TFBarPie = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFBarPie_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV62TFBarFecGen = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV64TFBarFecCli = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV66TFBarFecFpr = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV68TFBarFasCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV69TFBarFasCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV82TFBarMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV83TFBarMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV84TFBarSit = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV85TFBarSit_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBULTIMO") == 0 )
         {
            AV92TFBarAlbUltimo = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV93TFBarAlbUltimo_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTS") == 0 )
         {
            AV94TFBarAlbMts = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV95TFBarAlbMts_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGS") == 0 )
         {
            AV96TFBarAlbKgs = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV97TFBarAlbKgs_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCUADERNO") == 0 )
         {
            AV98TFBarCuaderno = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCUADERNO_SEL") == 0 )
         {
            AV99TFBarCuaderno_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS") == 0 )
         {
            AV100TFBarNormas = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS_SEL") == 0 )
         {
            AV101TFBarNormas_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBFACT") == 0 )
         {
            AV102TFBarAlbFact = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV103TFBarAlbFact_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV71Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV72BarSit = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV73BarSit_to = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV74BarFecGen = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV75BarFecGen_to = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV76Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV77Clicod_to = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLI") == 0 )
         {
            AV78BarFecCli = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLI_TO") == 0 )
         {
            AV79BarFecCli_to = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV158GXV2 = (int)(AV158GXV2+1) ;
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
      this.aP0[0] = listadodehdrs_wcexport.this.AV11Filename;
      this.aP1[0] = listadodehdrs_wcexport.this.AV12ErrorMessage;
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
      AV37TFCliNom_Sel = "" ;
      AV36TFCliNom = "" ;
      AV91TFPedidoCliente_Sel = "" ;
      AV90TFPedidoCliente = "" ;
      AV81TFBarNHdr_Sel = "" ;
      AV80TFBarNHdr = "" ;
      AV39TFBarSer_Sel = "" ;
      AV38TFBarSer = "" ;
      AV41TFBarSerDsc_Sel = "" ;
      AV40TFBarSerDsc = "" ;
      AV45TFBarTipArtDsc_Sel = "" ;
      AV44TFBarTipArtDsc = "" ;
      AV47TFBarColNom_Sel = "" ;
      AV46TFBarColNom = "" ;
      AV55TFBarNomCli_Sel = "" ;
      AV54TFBarNomCli = "" ;
      AV56TFBarKgm = DecimalUtil.ZERO ;
      AV57TFBarKgm_To = DecimalUtil.ZERO ;
      AV58TFBarMtr = DecimalUtil.ZERO ;
      AV59TFBarMtr_To = DecimalUtil.ZERO ;
      AV62TFBarFecGen = GXutil.nullDate() ;
      AV64TFBarFecCli = GXutil.nullDate() ;
      AV66TFBarFecFpr = GXutil.nullDate() ;
      AV69TFBarFasCod_Sel = "" ;
      AV68TFBarFasCod = "" ;
      AV83TFBarMaqCod_Sel = "" ;
      AV82TFBarMaqCod = "" ;
      AV94TFBarAlbMts = DecimalUtil.ZERO ;
      AV95TFBarAlbMts_To = DecimalUtil.ZERO ;
      AV96TFBarAlbKgs = DecimalUtil.ZERO ;
      AV97TFBarAlbKgs_To = DecimalUtil.ZERO ;
      AV99TFBarCuaderno_Sel = "" ;
      AV98TFBarCuaderno = "" ;
      AV101TFBarNormas_Sel = "" ;
      AV100TFBarNormas = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A151BarFasCod = "" ;
      A180BarMaqCod = "" ;
      A13931BarAlbMts = DecimalUtil.ZERO ;
      A13932BarAlbKgs = DecimalUtil.ZERO ;
      A13933BarCuadern = "" ;
      A13934BarNormas = "" ;
      AV108Listadodehdrs_wcds_1_filterfulltext = "" ;
      AV111Listadodehdrs_wcds_4_tfclinom = "" ;
      AV112Listadodehdrs_wcds_5_tfclinom_sel = "" ;
      AV113Listadodehdrs_wcds_6_tfpedidocliente = "" ;
      AV114Listadodehdrs_wcds_7_tfpedidocliente_sel = "" ;
      AV115Listadodehdrs_wcds_8_tfbarnhdr = "" ;
      AV116Listadodehdrs_wcds_9_tfbarnhdr_sel = "" ;
      AV117Listadodehdrs_wcds_10_tfbarser = "" ;
      AV118Listadodehdrs_wcds_11_tfbarser_sel = "" ;
      AV119Listadodehdrs_wcds_12_tfbarserdsc = "" ;
      AV120Listadodehdrs_wcds_13_tfbarserdsc_sel = "" ;
      AV123Listadodehdrs_wcds_16_tfbartipartdsc = "" ;
      AV124Listadodehdrs_wcds_17_tfbartipartdsc_sel = "" ;
      AV125Listadodehdrs_wcds_18_tfbarcolnom = "" ;
      AV126Listadodehdrs_wcds_19_tfbarcolnom_sel = "" ;
      AV129Listadodehdrs_wcds_22_tfbarnomcli = "" ;
      AV130Listadodehdrs_wcds_23_tfbarnomcli_sel = "" ;
      AV131Listadodehdrs_wcds_24_tfbarkgm = DecimalUtil.ZERO ;
      AV132Listadodehdrs_wcds_25_tfbarkgm_to = DecimalUtil.ZERO ;
      AV133Listadodehdrs_wcds_26_tfbarmtr = DecimalUtil.ZERO ;
      AV134Listadodehdrs_wcds_27_tfbarmtr_to = DecimalUtil.ZERO ;
      AV137Listadodehdrs_wcds_30_tfbarfecgen = GXutil.nullDate() ;
      AV138Listadodehdrs_wcds_31_tfbarfeccli = GXutil.nullDate() ;
      AV139Listadodehdrs_wcds_32_tfbarfecfpr = GXutil.nullDate() ;
      AV140Listadodehdrs_wcds_33_tfbarfascod = "" ;
      AV141Listadodehdrs_wcds_34_tfbarfascod_sel = "" ;
      AV142Listadodehdrs_wcds_35_tfbarmaqcod = "" ;
      AV143Listadodehdrs_wcds_36_tfbarmaqcod_sel = "" ;
      AV148Listadodehdrs_wcds_41_tfbaralbmts = DecimalUtil.ZERO ;
      AV149Listadodehdrs_wcds_42_tfbaralbmts_to = DecimalUtil.ZERO ;
      AV150Listadodehdrs_wcds_43_tfbaralbkgs = DecimalUtil.ZERO ;
      AV151Listadodehdrs_wcds_44_tfbaralbkgs_to = DecimalUtil.ZERO ;
      AV152Listadodehdrs_wcds_45_tfbarcuaderno = "" ;
      AV153Listadodehdrs_wcds_46_tfbarcuaderno_sel = "" ;
      AV154Listadodehdrs_wcds_47_tfbarnormas = "" ;
      AV155Listadodehdrs_wcds_48_tfbarnormas_sel = "" ;
      scmdbuf = "" ;
      lV140Listadodehdrs_wcds_33_tfbarfascod = "" ;
      lV152Listadodehdrs_wcds_45_tfbarcuaderno = "" ;
      lV111Listadodehdrs_wcds_4_tfclinom = "" ;
      lV115Listadodehdrs_wcds_8_tfbarnhdr = "" ;
      lV117Listadodehdrs_wcds_10_tfbarser = "" ;
      lV119Listadodehdrs_wcds_12_tfbarserdsc = "" ;
      lV123Listadodehdrs_wcds_16_tfbartipartdsc = "" ;
      lV125Listadodehdrs_wcds_18_tfbarcolnom = "" ;
      lV129Listadodehdrs_wcds_22_tfbarnomcli = "" ;
      lV142Listadodehdrs_wcds_35_tfbarmaqcod = "" ;
      A130BarCodPar = "" ;
      AV74BarFecGen = GXutil.nullDate() ;
      AV75BarFecGen_to = GXutil.nullDate() ;
      AV78BarFecCli = GXutil.nullDate() ;
      AV79BarFecCli_to = GXutil.nullDate() ;
      AV71Emprcod = "" ;
      A396EmprCod = "" ;
      P097S6_A9713Tb1_Cod = new short[1] ;
      P097S6_A4466BarAcaAnh = new short[1] ;
      P097S6_A213BarSit = new byte[1] ;
      P097S6_A180BarMaqCod = new String[] {""} ;
      P097S6_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097S6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097S6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097S6_A1234BarNomCli = new String[] {""} ;
      P097S6_A136BarColNum = new int[1] ;
      P097S6_A135BarColNom = new String[] {""} ;
      P097S6_A13711BarTipArtD = new String[] {""} ;
      P097S6_n13711BarTipArtD = new boolean[] {false} ;
      P097S6_A217BarTipArt = new short[1] ;
      P097S6_n217BarTipArt = new boolean[] {false} ;
      P097S6_A1652BarSerDsc = new String[] {""} ;
      P097S6_A212BarSer = new String[] {""} ;
      P097S6_A13696BarNHdr = new String[] {""} ;
      P097S6_A279CliNom = new String[] {""} ;
      P097S6_A252CliCod = new int[1] ;
      P097S6_n252CliCod = new boolean[] {false} ;
      P097S6_A13933BarCuadern = new String[] {""} ;
      P097S6_n13933BarCuadern = new boolean[] {false} ;
      P097S6_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097S6_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097S6_A151BarFasCod = new String[] {""} ;
      P097S6_n151BarFasCod = new boolean[] {false} ;
      P097S6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097S6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097S6_A143BarDisNum = new String[] {""} ;
      P097S6_A4812BarEncCli = new String[] {""} ;
      P097S6_A199BarPie1 = new short[1] ;
      P097S6_A365DisDes = new String[] {""} ;
      P097S6_A898BarPieNDes = new int[1] ;
      P097S6_A361DisCod = new int[1] ;
      P097S6_A130BarCodPar = new String[] {""} ;
      P097S6_A132BarCodReo = new byte[1] ;
      P097S6_A129BarCod = new int[1] ;
      P097S6_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A365DisDes = "" ;
      GXv_char5 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int11 = new long[1] ;
      GXv_int13 = new int[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char9 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listadodehdrs_wcexport__default(),
         new Object[] {
             new Object[] {
            P097S6_A9713Tb1_Cod, P097S6_A4466BarAcaAnh, P097S6_A213BarSit, P097S6_A180BarMaqCod, P097S6_A158BarFecFpr, P097S6_A155BarFecCli, P097S6_A159BarFecGen, P097S6_A1234BarNomCli, P097S6_A136BarColNum, P097S6_A135BarColNom,
            P097S6_A13711BarTipArtD, P097S6_n13711BarTipArtD, P097S6_A217BarTipArt, P097S6_n217BarTipArt, P097S6_A1652BarSerDsc, P097S6_A212BarSer, P097S6_A13696BarNHdr, P097S6_A279CliNom, P097S6_A252CliCod, P097S6_n252CliCod,
            P097S6_A13933BarCuadern, P097S6_n13933BarCuadern, P097S6_A13932BarAlbKgs, P097S6_A13931BarAlbMts, P097S6_A151BarFasCod, P097S6_n151BarFasCod, P097S6_A184BarMtr, P097S6_A166BarKgm, P097S6_A143BarDisNum, P097S6_A4812BarEncCli,
            P097S6_A199BarPie1, P097S6_A365DisDes, P097S6_A898BarPieNDes, P097S6_A361DisCod, P097S6_A130BarCodPar, P097S6_A132BarCodReo, P097S6_A129BarCod, P097S6_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV84TFBarSit ;
   private byte AV85TFBarSit_To ;
   private byte A213BarSit ;
   private byte AV144Listadodehdrs_wcds_37_tfbarsit ;
   private byte AV145Listadodehdrs_wcds_38_tfbarsit_to ;
   private byte A132BarCodReo ;
   private byte AV72BarSit ;
   private byte AV73BarSit_to ;
   private short AV42TFBarTipArt ;
   private short AV43TFBarTipArt_To ;
   private short GXv_int3[] ;
   private short A217BarTipArt ;
   private short AV121Listadodehdrs_wcds_14_tfbartipart ;
   private short AV122Listadodehdrs_wcds_15_tfbartipart_to ;
   private short AV16OrderedBy ;
   private short A4466BarAcaAnh ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFCliCod ;
   private int AV35TFCliCod_To ;
   private int AV48TFBarColNum ;
   private int AV49TFBarColNum_To ;
   private int AV60TFBarPie ;
   private int AV61TFBarPie_To ;
   private int AV102TFBarAlbFact ;
   private int AV103TFBarAlbFact_To ;
   private int AV106GXV1 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int A13935BarAlbFact ;
   private int AV109Listadodehdrs_wcds_2_tfclicod ;
   private int AV110Listadodehdrs_wcds_3_tfclicod_to ;
   private int AV127Listadodehdrs_wcds_20_tfbarcolnum ;
   private int AV128Listadodehdrs_wcds_21_tfbarcolnum_to ;
   private int AV135Listadodehdrs_wcds_28_tfbarpie ;
   private int AV136Listadodehdrs_wcds_29_tfbarpie_to ;
   private int AV156Listadodehdrs_wcds_49_tfbaralbfact ;
   private int AV157Listadodehdrs_wcds_50_tfbaralbfact_to ;
   private int A129BarCod ;
   private int AV76Clicod ;
   private int AV77Clicod_to ;
   private int A898BarPieNDes ;
   private int A361DisCod ;
   private int GXt_int12 ;
   private int GXv_int13[] ;
   private int AV158GXV2 ;
   private long AV92TFBarAlbUltimo ;
   private long AV93TFBarAlbUltimo_To ;
   private long AV31VisibleColumnCount ;
   private long A13930BarAlbUlti ;
   private long AV146Listadodehdrs_wcds_39_tfbaralbultimo ;
   private long AV147Listadodehdrs_wcds_40_tfbaralbultimo_to ;
   private long GXt_int10 ;
   private long GXv_int11[] ;
   private java.math.BigDecimal AV56TFBarKgm ;
   private java.math.BigDecimal AV57TFBarKgm_To ;
   private java.math.BigDecimal AV58TFBarMtr ;
   private java.math.BigDecimal AV59TFBarMtr_To ;
   private java.math.BigDecimal AV94TFBarAlbMts ;
   private java.math.BigDecimal AV95TFBarAlbMts_To ;
   private java.math.BigDecimal AV96TFBarAlbKgs ;
   private java.math.BigDecimal AV97TFBarAlbKgs_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A13931BarAlbMts ;
   private java.math.BigDecimal A13932BarAlbKgs ;
   private java.math.BigDecimal AV131Listadodehdrs_wcds_24_tfbarkgm ;
   private java.math.BigDecimal AV132Listadodehdrs_wcds_25_tfbarkgm_to ;
   private java.math.BigDecimal AV133Listadodehdrs_wcds_26_tfbarmtr ;
   private java.math.BigDecimal AV134Listadodehdrs_wcds_27_tfbarmtr_to ;
   private java.math.BigDecimal AV148Listadodehdrs_wcds_41_tfbaralbmts ;
   private java.math.BigDecimal AV149Listadodehdrs_wcds_42_tfbaralbmts_to ;
   private java.math.BigDecimal AV150Listadodehdrs_wcds_43_tfbaralbkgs ;
   private java.math.BigDecimal AV151Listadodehdrs_wcds_44_tfbaralbkgs_to ;
   private String AV37TFCliNom_Sel ;
   private String AV36TFCliNom ;
   private String AV91TFPedidoCliente_Sel ;
   private String AV90TFPedidoCliente ;
   private String AV81TFBarNHdr_Sel ;
   private String AV80TFBarNHdr ;
   private String AV39TFBarSer_Sel ;
   private String AV38TFBarSer ;
   private String AV41TFBarSerDsc_Sel ;
   private String AV40TFBarSerDsc ;
   private String AV45TFBarTipArtDsc_Sel ;
   private String AV44TFBarTipArtDsc ;
   private String AV47TFBarColNom_Sel ;
   private String AV46TFBarColNom ;
   private String AV55TFBarNomCli_Sel ;
   private String AV54TFBarNomCli ;
   private String AV69TFBarFasCod_Sel ;
   private String AV68TFBarFasCod ;
   private String AV83TFBarMaqCod_Sel ;
   private String AV82TFBarMaqCod ;
   private String AV99TFBarCuaderno_Sel ;
   private String AV98TFBarCuaderno ;
   private String A279CliNom ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A151BarFasCod ;
   private String A180BarMaqCod ;
   private String A13933BarCuadern ;
   private String AV111Listadodehdrs_wcds_4_tfclinom ;
   private String AV112Listadodehdrs_wcds_5_tfclinom_sel ;
   private String AV113Listadodehdrs_wcds_6_tfpedidocliente ;
   private String AV114Listadodehdrs_wcds_7_tfpedidocliente_sel ;
   private String AV115Listadodehdrs_wcds_8_tfbarnhdr ;
   private String AV116Listadodehdrs_wcds_9_tfbarnhdr_sel ;
   private String AV117Listadodehdrs_wcds_10_tfbarser ;
   private String AV118Listadodehdrs_wcds_11_tfbarser_sel ;
   private String AV119Listadodehdrs_wcds_12_tfbarserdsc ;
   private String AV120Listadodehdrs_wcds_13_tfbarserdsc_sel ;
   private String AV123Listadodehdrs_wcds_16_tfbartipartdsc ;
   private String AV124Listadodehdrs_wcds_17_tfbartipartdsc_sel ;
   private String AV125Listadodehdrs_wcds_18_tfbarcolnom ;
   private String AV126Listadodehdrs_wcds_19_tfbarcolnom_sel ;
   private String AV129Listadodehdrs_wcds_22_tfbarnomcli ;
   private String AV130Listadodehdrs_wcds_23_tfbarnomcli_sel ;
   private String AV140Listadodehdrs_wcds_33_tfbarfascod ;
   private String AV141Listadodehdrs_wcds_34_tfbarfascod_sel ;
   private String AV142Listadodehdrs_wcds_35_tfbarmaqcod ;
   private String AV143Listadodehdrs_wcds_36_tfbarmaqcod_sel ;
   private String AV152Listadodehdrs_wcds_45_tfbarcuaderno ;
   private String AV153Listadodehdrs_wcds_46_tfbarcuaderno_sel ;
   private String scmdbuf ;
   private String lV140Listadodehdrs_wcds_33_tfbarfascod ;
   private String lV152Listadodehdrs_wcds_45_tfbarcuaderno ;
   private String lV111Listadodehdrs_wcds_4_tfclinom ;
   private String lV115Listadodehdrs_wcds_8_tfbarnhdr ;
   private String lV117Listadodehdrs_wcds_10_tfbarser ;
   private String lV119Listadodehdrs_wcds_12_tfbarserdsc ;
   private String lV123Listadodehdrs_wcds_16_tfbartipartdsc ;
   private String lV125Listadodehdrs_wcds_18_tfbarcolnom ;
   private String lV129Listadodehdrs_wcds_22_tfbarnomcli ;
   private String lV142Listadodehdrs_wcds_35_tfbarmaqcod ;
   private String A130BarCodPar ;
   private String AV71Emprcod ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A365DisDes ;
   private String GXv_char5[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXt_char4 ;
   private String GXv_char9[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV62TFBarFecGen ;
   private java.util.Date AV64TFBarFecCli ;
   private java.util.Date AV66TFBarFecFpr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV137Listadodehdrs_wcds_30_tfbarfecgen ;
   private java.util.Date AV138Listadodehdrs_wcds_31_tfbarfeccli ;
   private java.util.Date AV139Listadodehdrs_wcds_32_tfbarfecfpr ;
   private java.util.Date AV74BarFecGen ;
   private java.util.Date AV75BarFecGen_to ;
   private java.util.Date AV78BarFecCli ;
   private java.util.Date AV79BarFecCli_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13711BarTipArtD ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13933BarCuadern ;
   private boolean n151BarFasCod ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV101TFBarNormas_Sel ;
   private String AV100TFBarNormas ;
   private String A13934BarNormas ;
   private String AV108Listadodehdrs_wcds_1_filterfulltext ;
   private String AV154Listadodehdrs_wcds_47_tfbarnormas ;
   private String AV155Listadodehdrs_wcds_48_tfbarnormas_sel ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P097S6_A9713Tb1_Cod ;
   private short[] P097S6_A4466BarAcaAnh ;
   private byte[] P097S6_A213BarSit ;
   private String[] P097S6_A180BarMaqCod ;
   private java.util.Date[] P097S6_A158BarFecFpr ;
   private java.util.Date[] P097S6_A155BarFecCli ;
   private java.util.Date[] P097S6_A159BarFecGen ;
   private String[] P097S6_A1234BarNomCli ;
   private int[] P097S6_A136BarColNum ;
   private String[] P097S6_A135BarColNom ;
   private String[] P097S6_A13711BarTipArtD ;
   private boolean[] P097S6_n13711BarTipArtD ;
   private short[] P097S6_A217BarTipArt ;
   private boolean[] P097S6_n217BarTipArt ;
   private String[] P097S6_A1652BarSerDsc ;
   private String[] P097S6_A212BarSer ;
   private String[] P097S6_A13696BarNHdr ;
   private String[] P097S6_A279CliNom ;
   private int[] P097S6_A252CliCod ;
   private boolean[] P097S6_n252CliCod ;
   private String[] P097S6_A13933BarCuadern ;
   private boolean[] P097S6_n13933BarCuadern ;
   private java.math.BigDecimal[] P097S6_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097S6_A13931BarAlbMts ;
   private String[] P097S6_A151BarFasCod ;
   private boolean[] P097S6_n151BarFasCod ;
   private java.math.BigDecimal[] P097S6_A184BarMtr ;
   private java.math.BigDecimal[] P097S6_A166BarKgm ;
   private String[] P097S6_A143BarDisNum ;
   private String[] P097S6_A4812BarEncCli ;
   private short[] P097S6_A199BarPie1 ;
   private String[] P097S6_A365DisDes ;
   private int[] P097S6_A898BarPieNDes ;
   private int[] P097S6_A361DisCod ;
   private String[] P097S6_A130BarCodPar ;
   private byte[] P097S6_A132BarCodReo ;
   private int[] P097S6_A129BarCod ;
   private String[] P097S6_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodehdrs_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097S6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV109Listadodehdrs_wcds_2_tfclicod ,
                                          int AV110Listadodehdrs_wcds_3_tfclicod_to ,
                                          String AV112Listadodehdrs_wcds_5_tfclinom_sel ,
                                          String AV111Listadodehdrs_wcds_4_tfclinom ,
                                          String AV116Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                          String AV115Listadodehdrs_wcds_8_tfbarnhdr ,
                                          String AV118Listadodehdrs_wcds_11_tfbarser_sel ,
                                          String AV117Listadodehdrs_wcds_10_tfbarser ,
                                          String AV120Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                          String AV119Listadodehdrs_wcds_12_tfbarserdsc ,
                                          short AV121Listadodehdrs_wcds_14_tfbartipart ,
                                          short AV122Listadodehdrs_wcds_15_tfbartipart_to ,
                                          String AV124Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                          String AV123Listadodehdrs_wcds_16_tfbartipartdsc ,
                                          String AV126Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                          String AV125Listadodehdrs_wcds_18_tfbarcolnom ,
                                          int AV127Listadodehdrs_wcds_20_tfbarcolnum ,
                                          int AV128Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                          String AV130Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                          String AV129Listadodehdrs_wcds_22_tfbarnomcli ,
                                          java.math.BigDecimal AV131Listadodehdrs_wcds_24_tfbarkgm ,
                                          java.math.BigDecimal AV132Listadodehdrs_wcds_25_tfbarkgm_to ,
                                          java.math.BigDecimal AV133Listadodehdrs_wcds_26_tfbarmtr ,
                                          java.math.BigDecimal AV134Listadodehdrs_wcds_27_tfbarmtr_to ,
                                          java.util.Date AV137Listadodehdrs_wcds_30_tfbarfecgen ,
                                          java.util.Date AV138Listadodehdrs_wcds_31_tfbarfeccli ,
                                          java.util.Date AV139Listadodehdrs_wcds_32_tfbarfecfpr ,
                                          String AV143Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                          String AV142Listadodehdrs_wcds_35_tfbarmaqcod ,
                                          byte AV144Listadodehdrs_wcds_37_tfbarsit ,
                                          byte AV145Listadodehdrs_wcds_38_tfbarsit_to ,
                                          java.math.BigDecimal AV148Listadodehdrs_wcds_41_tfbaralbmts ,
                                          java.math.BigDecimal AV149Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                          java.math.BigDecimal AV150Listadodehdrs_wcds_43_tfbaralbkgs ,
                                          java.math.BigDecimal AV151Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A217BarTipArt ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          String A180BarMaqCod ,
                                          byte A213BarSit ,
                                          java.math.BigDecimal A13931BarAlbMts ,
                                          java.math.BigDecimal A13932BarAlbKgs ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV108Listadodehdrs_wcds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String A151BarFasCod ,
                                          long A13930BarAlbUlti ,
                                          String A13933BarCuadern ,
                                          String A13934BarNormas ,
                                          int A13935BarAlbFact ,
                                          String AV114Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV113Listadodehdrs_wcds_6_tfpedidocliente ,
                                          int AV135Listadodehdrs_wcds_28_tfbarpie ,
                                          int AV136Listadodehdrs_wcds_29_tfbarpie_to ,
                                          String AV141Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                          String AV140Listadodehdrs_wcds_33_tfbarfascod ,
                                          long AV146Listadodehdrs_wcds_39_tfbaralbultimo ,
                                          long AV147Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                          String AV153Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                          String AV152Listadodehdrs_wcds_45_tfbarcuaderno ,
                                          String AV155Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                          String AV154Listadodehdrs_wcds_47_tfbarnormas ,
                                          int AV156Listadodehdrs_wcds_49_tfbaralbfact ,
                                          int AV157Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                          java.util.Date AV74BarFecGen ,
                                          java.util.Date AV75BarFecGen_to ,
                                          java.util.Date AV78BarFecCli ,
                                          java.util.Date AV79BarFecCli_to ,
                                          int AV76Clicod ,
                                          int AV77Clicod_to ,
                                          byte AV72BarSit ,
                                          byte AV73BarSit_to ,
                                          String AV71Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[55];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV109Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (0==AV110Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV115Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV125Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (0==AV127Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (0==AV128Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV129Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV137Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV138Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV139Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV142Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int16[48] = (byte)(1) ;
      }
      if ( ! (0==AV144Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int16[49] = (byte)(1) ;
      }
      if ( ! (0==AV145Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int16[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int16[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int16[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV150Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int16[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int16[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P097S6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Boolean) dynConstraints[57]).booleanValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , (String)dynConstraints[62] , ((Number) dynConstraints[63]).longValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).intValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , ((Number) dynConstraints[74]).longValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).intValue() , ((Number) dynConstraints[80]).intValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , ((Number) dynConstraints[85]).intValue() , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).byteValue() , ((Number) dynConstraints[88]).byteValue() , (String)dynConstraints[89] , (String)dynConstraints[90] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097S6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
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
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
      }
   }

}

