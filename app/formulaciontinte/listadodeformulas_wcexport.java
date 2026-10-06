package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeformulas_wcexport extends GXProcedure
{
   public listadodeformulas_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeformulas_wcexport.class ), "" );
   }

   public listadodeformulas_wcexport( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      listadodeformulas_wcexport.this.aP1 = new String[] {""};
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
      listadodeformulas_wcexport.this.aP0 = aP0;
      listadodeformulas_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeFormulas_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV38TFCliCod) && (0==AV39TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFCliNom_Sel, GXv_char5) ;
         listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFCliNom, GXv_char5) ;
            listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFForSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFForSer_Sel, GXv_char5) ;
         listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFForSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFForSer, GXv_char5) ;
            listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFForSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFForSerDsc_Sel, GXv_char5) ;
         listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFForSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFForSerDsc, GXv_char5) ;
            listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV114TFForTipArt) && (0==AV115TFForTipArt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV114TFForTipArt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV115TFForTipArt_To );
      }
      if ( ! ( (GXutil.strcmp("", AV171TFForTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV171TFForTipArtDsc_Sel, GXv_char5) ;
         listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV170TFForTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV170TFForTipArtDsc, GXv_char5) ;
            listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFForColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFForColNom_Sel, GXv_char5) ;
         listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFForColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFForColNom, GXv_char5) ;
            listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV48TFForColNum) && (0==AV49TFForColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFForColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFForColNum_To );
      }
      if ( ! ( (0==AV50TFTipColCod) && (0==AV51TFTipColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFTipColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFTipColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV53TFTipColDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFTipColDsc_Sel, GXv_char5) ;
         listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFTipColDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFTipColDsc, GXv_char5) ;
            listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV54TFIntCod) && (0==AV55TFIntCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFIntCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFIntCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV57TFIntDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFIntDsc_Sel, GXv_char5) ;
         listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFIntDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFIntDsc, GXv_char5) ;
            listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV66TFIntCodF) && (0==AV67TFIntCodF_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod. Int. Fact.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV66TFIntCodF );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV67TFIntCodF_To );
      }
      if ( ! ( (GXutil.strcmp("", AV69TFIntDscF_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad Fact.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFIntDscF_Sel, GXv_char5) ;
         listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFIntDscF)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad Fact.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFIntDscF, GXv_char5) ;
            listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV96TFForNumCol) && (0==AV97TFForNumCol_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Interno F.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV96TFForNumCol );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV97TFForNumCol_To );
      }
      if ( ! ( ( AV175TFForBlo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Bloqueo Color?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV158i = 1 ;
         AV178GXV1 = 1 ;
         while ( AV178GXV1 <= AV175TFForBlo_Sels.size() )
         {
            AV95TFForBlo_Sel = (String)AV175TFForBlo_Sels.elementAt(-1+AV178GXV1) ;
            if ( AV158i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV95TFForBlo_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV95TFForBlo_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "S", "") );
            }
            AV158i = (long)(AV158i+1) ;
            AV178GXV1 = (int)(AV178GXV1+1) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140TFForCosForm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV141TFForCosForm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coste Formula", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV140TFForCosForm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV141TFForCosForm_To)) );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98TFForFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Formula", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV98TFForFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104TFForUltMod)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ultima Modificacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeformulas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV104TFForUltMod );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ListadodeFormulas_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ListadodeFormulas_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV179GXV2 = 1 ;
      while ( AV179GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV179GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV179GXV2 = (int)(AV179GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV18FilterFullText ;
      AV182Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV38TFCliCod ;
      AV183Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV39TFCliCod_To ;
      AV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV40TFCliNom ;
      AV185Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV41TFCliNom_Sel ;
      AV186Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV42TFForSer ;
      AV187Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV43TFForSer_Sel ;
      AV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV44TFForSerDsc ;
      AV189Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV45TFForSerDsc_Sel ;
      AV190Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV114TFForTipArt ;
      AV191Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV115TFForTipArt_To ;
      AV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV170TFForTipArtDsc ;
      AV193Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV171TFForTipArtDsc_Sel ;
      AV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV46TFForColNom ;
      AV195Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV47TFForColNom_Sel ;
      AV196Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV48TFForColNum ;
      AV197Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV49TFForColNum_To ;
      AV198Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV50TFTipColCod ;
      AV199Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV51TFTipColCod_To ;
      AV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV52TFTipColDsc ;
      AV201Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV53TFTipColDsc_Sel ;
      AV202Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV54TFIntCod ;
      AV203Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV55TFIntCod_To ;
      AV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV56TFIntDsc ;
      AV205Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV57TFIntDsc_Sel ;
      AV206Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV66TFIntCodF ;
      AV207Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV67TFIntCodF_To ;
      AV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV68TFIntDscF ;
      AV209Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV69TFIntDscF_Sel ;
      AV210Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV96TFForNumCol ;
      AV211Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV97TFForNumCol_To ;
      AV212Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV175TFForBlo_Sels ;
      AV213Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV140TFForCosForm ;
      AV214Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV141TFForCosForm_To ;
      AV215Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV98TFForFec ;
      AV216Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV104TFForUltMod ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV212Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV182Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV185Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV187Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV186Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV189Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV195Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV197Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV198Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV201Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV202Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV205Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV206Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV207Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV209Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV210Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV211Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV212Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV213Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV214Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV215Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV216Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV160Clicod) ,
                                           Integer.valueOf(AV161Clicod_to) ,
                                           AV162Forser ,
                                           AV163Forser_to ,
                                           AV166Forcolnom ,
                                           AV167Forcolnom_to ,
                                           Integer.valueOf(AV164Forcolnum) ,
                                           Integer.valueOf(AV165Forcolnum_to) ,
                                           Byte.valueOf(AV168Tipcolcod) ,
                                           Short.valueOf(AV169Tipcolcod_to) ,
                                           Integer.valueOf(AV172ForNumColfrom) ,
                                           Integer.valueOf(AV173ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A10045CliAct ,
                                           AV159Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV186Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV186Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DH2 */
      pr_default.execute(0, new Object[] {AV159Emprcod, AV193Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV193Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV193Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, Integer.valueOf(AV182Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV183Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV185Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV186Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV187Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV189Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV190Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV191Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV195Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV197Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV198Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV199Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV201Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV202Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV203Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV205Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV206Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV207Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV209Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV210Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV211Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV213Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV214Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV215Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV216Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV160Clicod), Integer.valueOf(AV161Clicod_to), AV162Forser, AV163Forser_to, AV166Forcolnom, AV167Forcolnom_to, Integer.valueOf(AV164Forcolnum), Integer.valueOf(AV165Forcolnum_to), Byte.valueOf(AV168Tipcolcod), Short.valueOf(AV169Tipcolcod_to), Integer.valueOf(AV172ForNumColfrom), Integer.valueOf(AV173ForNumColto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = P09DH2_A10045CliAct[0] ;
         A396EmprCod = P09DH2_A396EmprCod[0] ;
         A495ForUltMod = P09DH2_A495ForUltMod[0] ;
         n495ForUltMod = P09DH2_n495ForUltMod[0] ;
         A485ForFec = P09DH2_A485ForFec[0] ;
         n485ForFec = P09DH2_n485ForFec[0] ;
         A4380ForCosForm = P09DH2_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DH2_n4380ForCosForm[0] ;
         A486ForNumCol = P09DH2_A486ForNumCol[0] ;
         A5363IntDscF = P09DH2_A5363IntDscF[0] ;
         n5363IntDscF = P09DH2_n5363IntDscF[0] ;
         A5362IntCodF = P09DH2_A5362IntCodF[0] ;
         n5362IntCodF = P09DH2_n5362IntCodF[0] ;
         A584IntDsc = P09DH2_A584IntDsc[0] ;
         n584IntDsc = P09DH2_n584IntDsc[0] ;
         A583IntCod = P09DH2_A583IntCod[0] ;
         A832TipColDsc = P09DH2_A832TipColDsc[0] ;
         n832TipColDsc = P09DH2_n832TipColDsc[0] ;
         A831TipColCod = P09DH2_A831TipColCod[0] ;
         A483ForColNum = P09DH2_A483ForColNum[0] ;
         A482ForColNom = P09DH2_A482ForColNom[0] ;
         A4384ForTipArt = P09DH2_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DH2_n4384ForTipArt[0] ;
         A5742ForSerDsc = P09DH2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DH2_n5742ForSerDsc[0] ;
         A494ForSer = P09DH2_A494ForSer[0] ;
         A279CliNom = P09DH2_A279CliNom[0] ;
         A252CliCod = P09DH2_A252CliCod[0] ;
         A7781ForBlo = P09DH2_A7781ForBlo[0] ;
         n7781ForBlo = P09DH2_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DH2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DH2_n13929ForTipArtD[0] ;
         A5363IntDscF = P09DH2_A5363IntDscF[0] ;
         n5363IntDscF = P09DH2_n5363IntDscF[0] ;
         A584IntDsc = P09DH2_A584IntDsc[0] ;
         n584IntDsc = P09DH2_n584IntDsc[0] ;
         A832TipColDsc = P09DH2_A832TipColDsc[0] ;
         n832TipColDsc = P09DH2_n832TipColDsc[0] ;
         A13929ForTipArtD = P09DH2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DH2_n13929ForTipArtD[0] ;
         A10045CliAct = P09DH2_A10045CliAct[0] ;
         A279CliNom = P09DH2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A494ForSer, GXv_char5) ;
               listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5742ForSerDsc, GXv_char5) ;
               listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A4384ForTipArt );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13929ForTipArtD, GXv_char5) ;
               listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A482ForColNom, GXv_char5) ;
               listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A483ForColNum );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A831TipColCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A832TipColDsc, GXv_char5) ;
               listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A583IntCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A584IntDsc, GXv_char5) ;
               listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5362IntCodF );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5363IntDscF, GXv_char5) ;
               listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A486ForNumCol );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A7781ForBlo), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A7781ForBlo), httpContext.getMessage( "S", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "S", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4380ForCosForm)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A485ForFec );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A495ForUltMod );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForSer", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForSerDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForTipArt", "", "Tipo Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForTipArtDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipColCod", "", "TC", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipColDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "IntCod", "", "Intensidad", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "IntDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "IntCodF", "", "Cod. Int. Fact.", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "IntDscF", "", "Intensidad Fact.", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForNumCol", "", "Nº Interno F.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForBlo", "", "Bloqueo Color?", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForCosForm", "", "Coste Formula", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForFec", "", "Fecha Formula", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForUltMod", "", "Ultima Modificacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ListadodeFormulas_WCColumnsSelector", GXv_char5) ;
      listadodeformulas_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ListadodeFormulas_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ListadodeFormulas_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.ListadodeFormulas_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV217GXV3 = 1 ;
      while ( AV217GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV217GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV42TFForSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV43TFForSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV44TFForSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV45TFForSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPART") == 0 )
         {
            AV114TFForTipArt = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV115TFForTipArt_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC") == 0 )
         {
            AV170TFForTipArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC_SEL") == 0 )
         {
            AV171TFForTipArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV46TFForColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV47TFForColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV48TFForColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFForColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV50TFTipColCod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFTipColCod_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV52TFTipColDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV53TFTipColDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV54TFIntCod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFIntCod_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV56TFIntDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV57TFIntDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCODF") == 0 )
         {
            AV66TFIntCodF = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFIntCodF_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF") == 0 )
         {
            AV68TFIntDscF = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF_SEL") == 0 )
         {
            AV69TFIntDscF_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV96TFForNumCol = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV97TFForNumCol_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV174TFForBlo_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV175TFForBlo_Sels.fromJSonString(AV174TFForBlo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOSFORM") == 0 )
         {
            AV140TFForCosForm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV141TFForCosForm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV98TFForFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTMOD") == 0 )
         {
            AV104TFForUltMod = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV159Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV160Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV161Clicod_to = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV162Forser = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV163Forser_to = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV164Forcolnum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV165Forcolnum_to = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV166Forcolnom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV167Forcolnom_to = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV168Tipcolcod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV169Tipcolcod_to = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOLFROM") == 0 )
         {
            AV172ForNumColfrom = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOLTO") == 0 )
         {
            AV173ForNumColto = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV217GXV3 = (int)(AV217GXV3+1) ;
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
      this.aP0[0] = listadodeformulas_wcexport.this.AV11Filename;
      this.aP1[0] = listadodeformulas_wcexport.this.AV12ErrorMessage;
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
      AV41TFCliNom_Sel = "" ;
      AV40TFCliNom = "" ;
      AV43TFForSer_Sel = "" ;
      AV42TFForSer = "" ;
      AV45TFForSerDsc_Sel = "" ;
      AV44TFForSerDsc = "" ;
      AV171TFForTipArtDsc_Sel = "" ;
      AV170TFForTipArtDsc = "" ;
      AV47TFForColNom_Sel = "" ;
      AV46TFForColNom = "" ;
      AV53TFTipColDsc_Sel = "" ;
      AV52TFTipColDsc = "" ;
      AV57TFIntDsc_Sel = "" ;
      AV56TFIntDsc = "" ;
      AV69TFIntDscF_Sel = "" ;
      AV68TFIntDscF = "" ;
      AV175TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV95TFForBlo_Sel = "" ;
      AV140TFForCosForm = DecimalUtil.ZERO ;
      AV141TFForCosForm_To = DecimalUtil.ZERO ;
      AV98TFForFec = GXutil.nullDate() ;
      AV104TFForUltMod = GXutil.nullDate() ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A13929ForTipArtD = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A584IntDsc = "" ;
      A5363IntDscF = "" ;
      A7781ForBlo = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A485ForFec = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = "" ;
      AV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom = "" ;
      AV185Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = "" ;
      AV186Formulaciontinte_listadodeformulas_wcds_6_tfforser = "" ;
      AV187Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = "" ;
      AV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = "" ;
      AV189Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = "" ;
      AV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = "" ;
      AV193Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = "" ;
      AV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = "" ;
      AV195Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = "" ;
      AV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = "" ;
      AV201Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = "" ;
      AV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = "" ;
      AV205Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = "" ;
      AV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = "" ;
      AV209Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = "" ;
      AV212Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV213Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = DecimalUtil.ZERO ;
      AV214Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = DecimalUtil.ZERO ;
      AV215Formulaciontinte_listadodeformulas_wcds_35_tfforfec = GXutil.nullDate() ;
      AV216Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = GXutil.nullDate() ;
      lV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = "" ;
      lV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom = "" ;
      lV186Formulaciontinte_listadodeformulas_wcds_6_tfforser = "" ;
      lV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = "" ;
      lV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = "" ;
      lV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = "" ;
      lV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = "" ;
      lV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = "" ;
      AV162Forser = "" ;
      AV163Forser_to = "" ;
      AV166Forcolnom = "" ;
      AV167Forcolnom_to = "" ;
      A10045CliAct = "" ;
      AV159Emprcod = "" ;
      A396EmprCod = "" ;
      P09DH2_A829TipArtCod = new short[1] ;
      P09DH2_A10045CliAct = new String[] {""} ;
      P09DH2_A396EmprCod = new String[] {""} ;
      P09DH2_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DH2_n495ForUltMod = new boolean[] {false} ;
      P09DH2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DH2_n485ForFec = new boolean[] {false} ;
      P09DH2_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DH2_n4380ForCosForm = new boolean[] {false} ;
      P09DH2_A486ForNumCol = new int[1] ;
      P09DH2_A5363IntDscF = new String[] {""} ;
      P09DH2_n5363IntDscF = new boolean[] {false} ;
      P09DH2_A5362IntCodF = new byte[1] ;
      P09DH2_n5362IntCodF = new boolean[] {false} ;
      P09DH2_A584IntDsc = new String[] {""} ;
      P09DH2_n584IntDsc = new boolean[] {false} ;
      P09DH2_A583IntCod = new byte[1] ;
      P09DH2_A832TipColDsc = new String[] {""} ;
      P09DH2_n832TipColDsc = new boolean[] {false} ;
      P09DH2_A831TipColCod = new byte[1] ;
      P09DH2_A483ForColNum = new int[1] ;
      P09DH2_A482ForColNom = new String[] {""} ;
      P09DH2_A4384ForTipArt = new short[1] ;
      P09DH2_n4384ForTipArt = new boolean[] {false} ;
      P09DH2_A5742ForSerDsc = new String[] {""} ;
      P09DH2_n5742ForSerDsc = new boolean[] {false} ;
      P09DH2_A494ForSer = new String[] {""} ;
      P09DH2_A279CliNom = new String[] {""} ;
      P09DH2_A252CliCod = new int[1] ;
      P09DH2_A7781ForBlo = new String[] {""} ;
      P09DH2_n7781ForBlo = new boolean[] {false} ;
      P09DH2_A13929ForTipArtD = new String[] {""} ;
      P09DH2_n13929ForTipArtD = new boolean[] {false} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV174TFForBlo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.listadodeformulas_wcexport__default(),
         new Object[] {
             new Object[] {
            P09DH2_A829TipArtCod, P09DH2_A10045CliAct, P09DH2_A396EmprCod, P09DH2_A495ForUltMod, P09DH2_n495ForUltMod, P09DH2_A485ForFec, P09DH2_n485ForFec, P09DH2_A4380ForCosForm, P09DH2_n4380ForCosForm, P09DH2_A486ForNumCol,
            P09DH2_A5363IntDscF, P09DH2_n5363IntDscF, P09DH2_A5362IntCodF, P09DH2_n5362IntCodF, P09DH2_A584IntDsc, P09DH2_n584IntDsc, P09DH2_A583IntCod, P09DH2_A832TipColDsc, P09DH2_n832TipColDsc, P09DH2_A831TipColCod,
            P09DH2_A483ForColNum, P09DH2_A482ForColNom, P09DH2_A4384ForTipArt, P09DH2_n4384ForTipArt, P09DH2_A5742ForSerDsc, P09DH2_n5742ForSerDsc, P09DH2_A494ForSer, P09DH2_A279CliNom, P09DH2_A252CliCod, P09DH2_A7781ForBlo,
            P09DH2_n7781ForBlo, P09DH2_A13929ForTipArtD, P09DH2_n13929ForTipArtD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV50TFTipColCod ;
   private byte AV51TFTipColCod_To ;
   private byte AV54TFIntCod ;
   private byte AV55TFIntCod_To ;
   private byte AV66TFIntCodF ;
   private byte AV67TFIntCodF_To ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A5362IntCodF ;
   private byte AV198Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ;
   private byte AV199Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ;
   private byte AV202Formulaciontinte_listadodeformulas_wcds_22_tfintcod ;
   private byte AV203Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ;
   private byte AV206Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ;
   private byte AV207Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ;
   private byte AV168Tipcolcod ;
   private short AV114TFForTipArt ;
   private short AV115TFForTipArt_To ;
   private short GXv_int3[] ;
   private short A4384ForTipArt ;
   private short AV190Formulaciontinte_listadodeformulas_wcds_10_tffortipart ;
   private short AV191Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ;
   private short AV169Tipcolcod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV38TFCliCod ;
   private int AV39TFCliCod_To ;
   private int AV48TFForColNum ;
   private int AV49TFForColNum_To ;
   private int AV96TFForNumCol ;
   private int AV97TFForNumCol_To ;
   private int AV178GXV1 ;
   private int AV179GXV2 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV182Formulaciontinte_listadodeformulas_wcds_2_tfclicod ;
   private int AV183Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ;
   private int AV196Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ;
   private int AV197Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ;
   private int AV210Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ;
   private int AV211Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ;
   private int AV212Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ;
   private int AV160Clicod ;
   private int AV161Clicod_to ;
   private int AV164Forcolnum ;
   private int AV165Forcolnum_to ;
   private int AV172ForNumColfrom ;
   private int AV173ForNumColto ;
   private int AV217GXV3 ;
   private long AV158i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV140TFForCosForm ;
   private java.math.BigDecimal AV141TFForCosForm_To ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal AV213Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ;
   private java.math.BigDecimal AV214Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ;
   private String AV41TFCliNom_Sel ;
   private String AV40TFCliNom ;
   private String AV43TFForSer_Sel ;
   private String AV42TFForSer ;
   private String AV45TFForSerDsc_Sel ;
   private String AV44TFForSerDsc ;
   private String AV171TFForTipArtDsc_Sel ;
   private String AV170TFForTipArtDsc ;
   private String AV47TFForColNom_Sel ;
   private String AV46TFForColNom ;
   private String AV53TFTipColDsc_Sel ;
   private String AV52TFTipColDsc ;
   private String AV57TFIntDsc_Sel ;
   private String AV56TFIntDsc ;
   private String AV69TFIntDscF_Sel ;
   private String AV68TFIntDscF ;
   private String AV95TFForBlo_Sel ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A13929ForTipArtD ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String A584IntDsc ;
   private String A5363IntDscF ;
   private String A7781ForBlo ;
   private String AV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom ;
   private String AV185Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ;
   private String AV186Formulaciontinte_listadodeformulas_wcds_6_tfforser ;
   private String AV187Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ;
   private String AV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ;
   private String AV189Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ;
   private String AV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ;
   private String AV193Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ;
   private String AV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ;
   private String AV195Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ;
   private String AV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ;
   private String AV201Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ;
   private String AV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ;
   private String AV205Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ;
   private String AV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ;
   private String AV209Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ;
   private String lV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ;
   private String scmdbuf ;
   private String lV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom ;
   private String lV186Formulaciontinte_listadodeformulas_wcds_6_tfforser ;
   private String lV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ;
   private String lV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ;
   private String lV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ;
   private String lV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ;
   private String lV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ;
   private String AV162Forser ;
   private String AV163Forser_to ;
   private String AV166Forcolnom ;
   private String AV167Forcolnom_to ;
   private String A10045CliAct ;
   private String AV159Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV98TFForFec ;
   private java.util.Date AV104TFForUltMod ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date AV215Formulaciontinte_listadodeformulas_wcds_35_tfforfec ;
   private java.util.Date AV216Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n495ForUltMod ;
   private boolean n485ForFec ;
   private boolean n4380ForCosForm ;
   private boolean n5363IntDscF ;
   private boolean n5362IntCodF ;
   private boolean n584IntDsc ;
   private boolean n832TipColDsc ;
   private boolean n4384ForTipArt ;
   private boolean n5742ForSerDsc ;
   private boolean n7781ForBlo ;
   private boolean n13929ForTipArtD ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV174TFForBlo_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ;
   private String lV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV175TFForBlo_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P09DH2_A829TipArtCod ;
   private String[] P09DH2_A10045CliAct ;
   private String[] P09DH2_A396EmprCod ;
   private java.util.Date[] P09DH2_A495ForUltMod ;
   private boolean[] P09DH2_n495ForUltMod ;
   private java.util.Date[] P09DH2_A485ForFec ;
   private boolean[] P09DH2_n485ForFec ;
   private java.math.BigDecimal[] P09DH2_A4380ForCosForm ;
   private boolean[] P09DH2_n4380ForCosForm ;
   private int[] P09DH2_A486ForNumCol ;
   private String[] P09DH2_A5363IntDscF ;
   private boolean[] P09DH2_n5363IntDscF ;
   private byte[] P09DH2_A5362IntCodF ;
   private boolean[] P09DH2_n5362IntCodF ;
   private String[] P09DH2_A584IntDsc ;
   private boolean[] P09DH2_n584IntDsc ;
   private byte[] P09DH2_A583IntCod ;
   private String[] P09DH2_A832TipColDsc ;
   private boolean[] P09DH2_n832TipColDsc ;
   private byte[] P09DH2_A831TipColCod ;
   private int[] P09DH2_A483ForColNum ;
   private String[] P09DH2_A482ForColNom ;
   private short[] P09DH2_A4384ForTipArt ;
   private boolean[] P09DH2_n4384ForTipArt ;
   private String[] P09DH2_A5742ForSerDsc ;
   private boolean[] P09DH2_n5742ForSerDsc ;
   private String[] P09DH2_A494ForSer ;
   private String[] P09DH2_A279CliNom ;
   private int[] P09DH2_A252CliCod ;
   private String[] P09DH2_A7781ForBlo ;
   private boolean[] P09DH2_n7781ForBlo ;
   private String[] P09DH2_A13929ForTipArtD ;
   private boolean[] P09DH2_n13929ForTipArtD ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV212Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ;
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

final  class listadodeformulas_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09DH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV212Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV182Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV183Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV185Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV187Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV186Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV189Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV190Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV191Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV195Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV196Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV197Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV198Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV199Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV201Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV202Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV203Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV205Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV206Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV207Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV209Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV210Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV211Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV212Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV213Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV214Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV215Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV216Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV160Clicod ,
                                          int AV161Clicod_to ,
                                          String AV162Forser ,
                                          String AV163Forser_to ,
                                          String AV166Forcolnom ,
                                          String AV167Forcolnom_to ,
                                          int AV164Forcolnum ,
                                          int AV165Forcolnum_to ,
                                          byte AV168Tipcolcod ,
                                          short AV169Tipcolcod_to ,
                                          int AV172ForNumColfrom ,
                                          int AV173ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV181Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV192Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String AV159Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[50];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T6.CliAct, T1.EmprCod, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T2.IntDscF, T1.IntCodF, T3.IntDsc, T1.IntCod, T4.TipColDsc, T1.TipColCod," ;
      scmdbuf += " T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T6.CliNom, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV182Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV185Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV184Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV185Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV186Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV189Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV188Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV189Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV191Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV195Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV194Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV195Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV196Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV197Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV198Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV199Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV200Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV202Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV203Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV205Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV204Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV205Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV206Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV207Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV209Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV208Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV209Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV210Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV211Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( AV212Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV212Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV213Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV214Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV215Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV216Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (0==AV160Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (0==AV161Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (0==AV164Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (0==AV165Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (0==AV168Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! (0==AV169Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (0==AV172ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (0==AV173ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T6.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForTipArt" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForTipArt DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IntCod" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IntCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.IntDsc" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.IntDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IntCodF" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IntCodF DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IntDscF" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IntDscF DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForBlo DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForCosForm" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForCosForm DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltMod" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltMod DESC" ;
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
                  return conditional_P09DH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 13);
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 16);
               ((String[]) buf[27])[0] = rslt.getString(19, 30);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
      }
   }

}

